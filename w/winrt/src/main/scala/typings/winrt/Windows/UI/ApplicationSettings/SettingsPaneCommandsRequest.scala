package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsPaneCommandsRequest extends ISettingsPaneCommandsRequest

object SettingsPaneCommandsRequest {
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): SettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsPaneCommandsRequest]
  }
}

