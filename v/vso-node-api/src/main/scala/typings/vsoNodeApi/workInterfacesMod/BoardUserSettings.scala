package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardUserSettings extends js.Object {
  
  var autoRefreshState: Boolean = js.native
}
object BoardUserSettings {
  
  @scala.inline
  def apply(autoRefreshState: Boolean): BoardUserSettings = {
    val __obj = js.Dynamic.literal(autoRefreshState = autoRefreshState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardUserSettings]
  }
  
  @scala.inline
  implicit class BoardUserSettingsOps[Self <: BoardUserSettings] (val x: Self) extends AnyVal {
    
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
    def setAutoRefreshState(value: Boolean): Self = this.set("autoRefreshState", value.asInstanceOf[js.Any])
  }
}
