package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomationProviderRequestedEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var automationProvider: Any
}
object IAutomationProviderRequestedEventArgs {
  
  inline def apply(automationProvider: Any, handled: Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
  
  extension [Self <: IAutomationProviderRequestedEventArgs](x: Self) {
    
    inline def setAutomationProvider(value: Any): Self = StObject.set(x, "automationProvider", value.asInstanceOf[js.Any])
  }
}
