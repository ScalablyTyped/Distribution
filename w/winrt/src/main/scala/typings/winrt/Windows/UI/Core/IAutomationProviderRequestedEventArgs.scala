package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutomationProviderRequestedEventArgs extends ICoreWindowEventArgs {
  var automationProvider: js.Any = js.native
}

object IAutomationProviderRequestedEventArgs {
  @scala.inline
  def apply(automationProvider: js.Any, handled: Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
  @scala.inline
  implicit class IAutomationProviderRequestedEventArgsOps[Self <: IAutomationProviderRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setAutomationProvider(value: js.Any): Self = this.set("automationProvider", value.asInstanceOf[js.Any])
  }
  
}

