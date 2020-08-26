package typings.winrt.Windows.UI.ApplicationSettings

import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettingsCommandFactory extends js.Object {
  def create(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler): SettingsCommand = js.native
}

object ISettingsCommandFactory {
  @scala.inline
  def apply(create: (js.Any, String, UICommandInvokedHandler) => SettingsCommand): ISettingsCommandFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create))
    __obj.asInstanceOf[ISettingsCommandFactory]
  }
  @scala.inline
  implicit class ISettingsCommandFactoryOps[Self <: ISettingsCommandFactory] (val x: Self) extends AnyVal {
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
    def setCreate(value: (js.Any, String, UICommandInvokedHandler) => SettingsCommand): Self = this.set("create", js.Any.fromFunction3(value))
  }
  
}

