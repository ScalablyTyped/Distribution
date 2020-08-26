package typings.vsoNodeApi.featureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributedFeatureState extends js.Object {
  /**
    * The full contribution id of the feature
    */
  var featureId: String = js.native
  /**
    * True if the effective state was set by an override rule (indicating that the state cannot be managed by the end user)
    */
  var overridden: Boolean = js.native
  /**
    * Reason that the state was set (by a plugin/rule).
    */
  var reason: String = js.native
  /**
    * The scope at which this state applies
    */
  var scope: ContributedFeatureSettingScope = js.native
  /**
    * The current state of this feature
    */
  var state: ContributedFeatureEnabledValue = js.native
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
    val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeatureState]
  }
  @scala.inline
  implicit class ContributedFeatureStateOps[Self <: ContributedFeatureState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeatureId(value: String): Self = this.set("featureId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverridden(value: Boolean): Self = this.set("overridden", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: ContributedFeatureSettingScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: ContributedFeatureEnabledValue): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

