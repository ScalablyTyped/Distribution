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

