package typings.winrt.WindowsNs.UINs.ApplicationSettingsNs

import typings.winrt.WindowsNs.UINs.PopupsNs.IUICommand
import typings.winrt.WindowsNs.UINs.PopupsNs.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
@js.native
class SettingsCommand protected () extends IUICommand {
  def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
}

