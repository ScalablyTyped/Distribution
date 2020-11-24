package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISettingsPaneCommandsRequest extends js.Object {
  
  var applicationCommands: IVector[SettingsCommand] = js.native
}
object ISettingsPaneCommandsRequest {
  
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingsPaneCommandsRequest]
  }
  
  @scala.inline
  implicit class ISettingsPaneCommandsRequestOps[Self <: ISettingsPaneCommandsRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationCommands(value: IVector[SettingsCommand]): Self = this.set("applicationCommands", value.asInstanceOf[js.Any])
  }
}
