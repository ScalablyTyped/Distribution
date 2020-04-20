package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneCommandsRequest extends js.Object {
  var applicationCommands: IVector[SettingsCommand]
}

object ISettingsPaneCommandsRequest {
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingsPaneCommandsRequest]
  }
}

