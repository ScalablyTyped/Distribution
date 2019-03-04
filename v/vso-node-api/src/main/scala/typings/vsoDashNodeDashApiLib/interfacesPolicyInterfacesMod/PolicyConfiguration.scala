package typings
package vsoDashNodeDashApiLib.interfacesPolicyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyConfiguration extends VersionedPolicyConfigurationRef {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any
  /**
    * A reference to the identity that created the policy.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The date and time when the policy was created.
    */
  var createdDate: stdLib.Date
  /**
    * Indicates whether the policy is blocking.
    */
  var isBlocking: scala.Boolean
  /**
    * Indicates whether the policy has been (soft) deleted.
    */
  var isDeleted: scala.Boolean
  /**
    * Indicates whether the policy is enabled.
    */
  var isEnabled: scala.Boolean
  /**
    * The policy configuration settings.
    */
  var settings: js.Any
}

object PolicyConfiguration {
  @scala.inline
  def apply(
    _links: js.Any,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdDate: stdLib.Date,
    id: scala.Double,
    isBlocking: scala.Boolean,
    isDeleted: scala.Boolean,
    isEnabled: scala.Boolean,
    revision: scala.Double,
    settings: js.Any,
    `type`: PolicyTypeRef,
    url: java.lang.String
  ): PolicyConfiguration = {
    val __obj = js.Dynamic.literal(_links = _links, createdBy = createdBy, createdDate = createdDate, id = id, isBlocking = isBlocking, isDeleted = isDeleted, isEnabled = isEnabled, revision = revision, settings = settings, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolicyConfiguration]
  }
}

