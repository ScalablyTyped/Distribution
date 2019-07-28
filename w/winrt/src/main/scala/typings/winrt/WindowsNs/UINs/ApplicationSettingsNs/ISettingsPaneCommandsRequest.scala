package typings.winrt.WindowsNs.UINs.ApplicationSettingsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneCommandsRequest extends js.Object {
  var applicationCommands: IVector[SettingsCommand]
}

object ISettingsPaneCommandsRequest {
  @scala.inline
  def apply(applicationCommands: IVector[SettingsCommand]): ISettingsPaneCommandsRequest = {
    val __obj = js.Dynamic.literal(applicationCommands = applicationCommands)
  
    __obj.asInstanceOf[ISettingsPaneCommandsRequest]
  }
}

