package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsCommandFactory extends js.Object {
  def create(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler): SettingsCommand
}

object ISettingsCommandFactory {
  @scala.inline
  def apply(create: (js.Any, String, UICommandInvokedHandler) => SettingsCommand): ISettingsCommandFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create))
    __obj.asInstanceOf[ISettingsCommandFactory]
  }
}

