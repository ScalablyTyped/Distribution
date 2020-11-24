package typings.vsoNodeApi.featureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributedFeatureSettingScope extends js.Object {
  
  /**
    * The name of the settings scope to use when reading/writing the setting
    */
  var settingScope: String = js.native
  
  /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
  var userScoped: Boolean = js.native
}
object ContributedFeatureSettingScope {
  
  @scala.inline
  def apply(settingScope: String, userScoped: Boolean): ContributedFeatureSettingScope = {
    val __obj = js.Dynamic.literal(settingScope = settingScope.asInstanceOf[js.Any], userScoped = userScoped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeatureSettingScope]
  }
  
  @scala.inline
  implicit class ContributedFeatureSettingScopeOps[Self <: ContributedFeatureSettingScope] (val x: Self) extends AnyVal {
    
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
    def setSettingScope(value: String): Self = this.set("settingScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserScoped(value: Boolean): Self = this.set("userScoped", value.asInstanceOf[js.Any])
  }
}
