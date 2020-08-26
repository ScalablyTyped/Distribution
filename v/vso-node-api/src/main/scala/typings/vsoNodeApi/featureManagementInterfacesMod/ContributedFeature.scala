package typings.vsoNodeApi.featureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributedFeature extends js.Object {
  /**
    * Named links describing the feature
    */
  var _links: js.Any = js.native
  /**
    * If true, the feature is enabled unless overridden at some scope
    */
  var defaultState: Boolean = js.native
  /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
  var defaultValueRules: js.Array[ContributedFeatureValueRule] = js.native
  /**
    * The description of the feature
    */
  var description: String = js.native
  /**
    * The full contribution id of the feature
    */
  var id: String = js.native
  /**
    * The friendly name of the feature
    */
  var name: String = js.native
  /**
    * Rules for overriding a feature value. These rules are run before explicit user/host state values are checked. They are evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
  var overrideRules: js.Array[ContributedFeatureValueRule] = js.native
  /**
    * The scopes/levels at which settings can set the enabled/disabled state of this feature
    */
  var scopes: js.Array[ContributedFeatureSettingScope] = js.native
  /**
    * The service instance id of the service that owns this feature
    */
  var serviceInstanceType: String = js.native
}

object ContributedFeature {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultState: Boolean,
    defaultValueRules: js.Array[ContributedFeatureValueRule],
    description: String,
    id: String,
    name: String,
    overrideRules: js.Array[ContributedFeatureValueRule],
    scopes: js.Array[ContributedFeatureSettingScope],
    serviceInstanceType: String
  ): ContributedFeature = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultState = defaultState.asInstanceOf[js.Any], defaultValueRules = defaultValueRules.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overrideRules = overrideRules.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeature]
  }
  @scala.inline
  implicit class ContributedFeatureOps[Self <: ContributedFeature] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultState(value: Boolean): Self = this.set("defaultState", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValueRulesVarargs(value: ContributedFeatureValueRule*): Self = this.set("defaultValueRules", js.Array(value :_*))
    @scala.inline
    def setDefaultValueRules(value: js.Array[ContributedFeatureValueRule]): Self = this.set("defaultValueRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideRulesVarargs(value: ContributedFeatureValueRule*): Self = this.set("overrideRules", js.Array(value :_*))
    @scala.inline
    def setOverrideRules(value: js.Array[ContributedFeatureValueRule]): Self = this.set("overrideRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: ContributedFeatureSettingScope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[ContributedFeatureSettingScope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceInstanceType(value: String): Self = this.set("serviceInstanceType", value.asInstanceOf[js.Any])
  }
  
}

