package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContributedFeatureState extends js.Object {
  /**
       * The full contribution id of the feature
       */
  var featureId: java.lang.String
  /**
       * True if the effective state was set by an override rule (indicating that the state cannot be managed by the end user)
       */
  var overridden: scala.Boolean
  /**
       * Reason that the state was set (by a plugin/rule).
       */
  var reason: java.lang.String
  /**
       * The scope at which this state applies
       */
  var scope: ContributedFeatureSettingScope
  /**
       * The current state of this feature
       */
  var state: ContributedFeatureEnabledValue
}

