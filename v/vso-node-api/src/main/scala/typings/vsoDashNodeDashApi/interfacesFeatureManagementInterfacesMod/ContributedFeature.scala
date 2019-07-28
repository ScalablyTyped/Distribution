package typings.vsoDashNodeDashApi.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeature extends js.Object {
  /**
    * Named links describing the feature
    */
  var _links: js.Any
  /**
    * If true, the feature is enabled unless overridden at some scope
    */
  var defaultState: Boolean
  /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
  var defaultValueRules: js.Array[ContributedFeatureValueRule]
  /**
    * The description of the feature
    */
  var description: String
  /**
    * The full contribution id of the feature
    */
  var id: String
  /**
    * The friendly name of the feature
    */
  var name: String
  /**
    * Rules for overriding a feature value. These rules are run before explicit user/host state values are checked. They are evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
  var overrideRules: js.Array[ContributedFeatureValueRule]
  /**
    * The scopes/levels at which settings can set the enabled/disabled state of this feature
    */
  var scopes: js.Array[ContributedFeatureSettingScope]
  /**
    * The service instance id of the service that owns this feature
    */
  var serviceInstanceType: String
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
    val __obj = js.Dynamic.literal(_links = _links, defaultState = defaultState, defaultValueRules = defaultValueRules, description = description, id = id, name = name, overrideRules = overrideRules, scopes = scopes, serviceInstanceType = serviceInstanceType)
  
    __obj.asInstanceOf[ContributedFeature]
  }
}

