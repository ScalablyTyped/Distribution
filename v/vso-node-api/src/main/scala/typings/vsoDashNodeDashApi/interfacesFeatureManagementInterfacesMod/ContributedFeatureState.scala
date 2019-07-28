package typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureState extends js.Object {
  /**
    * The full contribution id of the feature
    */
  var featureId: String
  /**
    * True if the effective state was set by an override rule (indicating that the state cannot be managed by the end user)
    */
  var overridden: Boolean
  /**
    * Reason that the state was set (by a plugin/rule).
    */
  var reason: String
  /**
    * The scope at which this state applies
    */
  var scope: ContributedFeatureSettingScope
  /**
    * The current state of this feature
    */
  var state: ContributedFeatureEnabledValue
}

object ContributedFeatureState {
  @scala.inline
  def apply(
    featureId: String,
    overridden: Boolean,
    reason: String,
    scope: ContributedFeatureSettingScope,
    state: ContributedFeatureEnabledValue
  ): ContributedFeatureState = {
    val __obj = js.Dynamic.literal(featureId = featureId, overridden = overridden, reason = reason, scope = scope, state = state)
  
    __obj.asInstanceOf[ContributedFeatureState]
  }
}

