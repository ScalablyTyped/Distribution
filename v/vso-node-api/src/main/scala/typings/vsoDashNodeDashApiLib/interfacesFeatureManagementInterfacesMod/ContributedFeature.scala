package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

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
  var defaultState: scala.Boolean
  /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
  var defaultValueRules: js.Array[ContributedFeatureValueRule]
  /**
    * The description of the feature
    */
  var description: java.lang.String
  /**
    * The full contribution id of the feature
    */
  var id: java.lang.String
  /**
    * The friendly name of the feature
    */
  var name: java.lang.String
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
  var serviceInstanceType: java.lang.String
}

object ContributedFeature {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultState: scala.Boolean,
    defaultValueRules: js.Array[ContributedFeatureValueRule],
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    overrideRules: js.Array[ContributedFeatureValueRule],
    scopes: js.Array[ContributedFeatureSettingScope],
    serviceInstanceType: java.lang.String
  ): ContributedFeature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("defaultState")(defaultState)
    __obj.updateDynamic("defaultValueRules")(defaultValueRules)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("overrideRules")(overrideRules)
    __obj.updateDynamic("scopes")(scopes)
    __obj.updateDynamic("serviceInstanceType")(serviceInstanceType)
    __obj.asInstanceOf[ContributedFeature]
  }
}

