package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomationProviderRequestedEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var automationProvider: js.Any
}
object IAutomationProviderRequestedEventArgs {
  
  @scala.inline
  def apply(automationProvider: js.Any, handled: Boolean): IAutomationProviderRequestedEventArgs = {
    val __obj = js.Dynamic.literal(automationProvider = automationProvider.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutomationProviderRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IAutomationProviderRequestedEventArgsMutableBuilder[Self <: IAutomationProviderRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationProvider(value: js.Any): Self = StObject.set(x, "automationProvider", value.asInstanceOf[js.Any])
  }
}
