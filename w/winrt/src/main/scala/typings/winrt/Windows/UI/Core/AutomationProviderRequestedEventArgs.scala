package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationProviderRequestedEventArgs extends IAutomationProviderRequestedEventArgs

object AutomationProviderRequestedEventArgs {
  @scala.inline
  def apply(automationProvider: js.Any, handled: Boolean): AutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationProviderRequestedEventArgs]
  }
}

