package typings.vsoDashNodeDashApi.interfacesPolicyInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
  var createdBy: IdentityRef
  /**
    * The date and time when the policy was created.
    */
  var createdDate: Date
  /**
    * Indicates whether the policy is blocking.
    */
  var isBlocking: Boolean
  /**
    * Indicates whether the policy has been (soft) deleted.
    */
  var isDeleted: Boolean
  /**
    * Indicates whether the policy is enabled.
    */
  var isEnabled: Boolean
  /**
    * The policy configuration settings.
    */
  var settings: js.Any
}

object PolicyConfiguration {
  @scala.inline
  def apply(
    _links: js.Any,
    createdBy: IdentityRef,
    createdDate: Date,
    id: Double,
    isBlocking: Boolean,
    isDeleted: Boolean,
    isEnabled: Boolean,
    revision: Double,
    settings: js.Any,
    `type`: PolicyTypeRef,
    url: String
  ): PolicyConfiguration = {
    val __obj = js.Dynamic.literal(_links = _links, createdBy = createdBy, createdDate = createdDate, id = id, isBlocking = isBlocking, isDeleted = isDeleted, isEnabled = isEnabled, revision = revision, settings = settings, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolicyConfiguration]
  }
}

