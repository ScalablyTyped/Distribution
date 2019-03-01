package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureSettingScope extends js.Object {
  /**
    * The name of the settings scope to use when reading/writing the setting
    */
  var settingScope: java.lang.String
  /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
  var userScoped: scala.Boolean
}

object ContributedFeatureSettingScope {
  @scala.inline
  def apply(settingScope: java.lang.String, userScoped: scala.Boolean): ContributedFeatureSettingScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("settingScope")(settingScope)
    __obj.updateDynamic("userScoped")(userScoped)
    __obj.asInstanceOf[ContributedFeatureSettingScope]
  }
}

