package typings.wordpressCustomizeBrowser.customizeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleSettingValiditiesArgs extends js.Object {
  
   // TODO
  var focusInvalidControl: js.UndefOr[Boolean] = js.native
  
  var settingValidities: Record[String, _] = js.native
}
object HandleSettingValiditiesArgs {
  
  @scala.inline
  def apply(settingValidities: Record[String, _]): HandleSettingValiditiesArgs = {
    val __obj = js.Dynamic.literal(settingValidities = settingValidities.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleSettingValiditiesArgs]
  }
  
  @scala.inline
  implicit class HandleSettingValiditiesArgsOps[Self <: HandleSettingValiditiesArgs] (val x: Self) extends AnyVal {
    
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
    def setSettingValidities(value: Record[String, _]): Self = this.set("settingValidities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusInvalidControl(value: Boolean): Self = this.set("focusInvalidControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusInvalidControl: Self = this.set("focusInvalidControl", js.undefined)
  }
}
