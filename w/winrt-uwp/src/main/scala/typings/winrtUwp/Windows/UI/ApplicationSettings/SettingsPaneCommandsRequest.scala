package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that are only available during the CommandsRequested event. */
@js.native
trait SettingsPaneCommandsRequest extends js.Object {
  /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
  var applicationCommands: IVector[SettingsCommand] = js.native
}

object SettingsPaneCommandsRequest {
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequest]
  }
  @scala.inline
  implicit class SettingsPaneCommandsRequestOps[Self <: SettingsPaneCommandsRequest] (val x: Self) extends AnyVal {
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

