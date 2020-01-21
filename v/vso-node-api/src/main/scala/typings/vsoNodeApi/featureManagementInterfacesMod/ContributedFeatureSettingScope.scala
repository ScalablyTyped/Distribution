package typings.vsoNodeApi.featureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureSettingScope extends js.Object {
  /**
    * The name of the settings scope to use when reading/writing the setting
    */
  var settingScope: String
  /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
  var userScoped: Boolean
}

object ContributedFeatureSettingScope {
  @scala.inline
  def apply(settingScope: String, userScoped: Boolean): ContributedFeatureSettingScope = {
    val __obj = js.Dynamic.literal(settingScope = settingScope.asInstanceOf[js.Any], userScoped = userScoped.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContributedFeatureSettingScope]
  }
}

