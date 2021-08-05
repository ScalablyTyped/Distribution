package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationProviderRequestedEventArgs
  extends StObject
     with IAutomationProviderRequestedEventArgs
object AutomationProviderRequestedEventArgs {
  
  inline def apply(automationProvider: js.Any, handled: Boolean): AutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationProviderRequestedEventArgs]
  }
}
