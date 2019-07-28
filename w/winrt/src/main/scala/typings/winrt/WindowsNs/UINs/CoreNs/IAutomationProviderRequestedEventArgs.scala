package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomationProviderRequestedEventArgs extends ICoreWindowEventArgs {
  var automationProvider: js.Any
}

object IAutomationProviderRequestedEventArgs {
  @scala.inline
  def apply(automationProvider: js.Any, handled: Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider, handled = handled)
  
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
}

