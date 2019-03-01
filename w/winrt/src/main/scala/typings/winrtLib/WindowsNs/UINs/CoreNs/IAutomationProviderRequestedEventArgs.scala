package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomationProviderRequestedEventArgs extends ICoreWindowEventArgs {
  var automationProvider: js.Any
}

object IAutomationProviderRequestedEventArgs {
  @scala.inline
  def apply(automationProvider: js.Any, handled: scala.Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automationProvider")(automationProvider)
    __obj.updateDynamic("handled")(handled)
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
}

