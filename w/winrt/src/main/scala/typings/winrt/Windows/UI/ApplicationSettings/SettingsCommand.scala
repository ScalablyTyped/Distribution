package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ApplicationSettings.SettingsCommand")
@js.native
class SettingsCommand protected () extends IUICommand {
  def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
}

