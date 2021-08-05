package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowActivatedEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var windowActivationState: CoreWindowActivationState
}
object IWindowActivatedEventArgs {
  
  inline def apply(handled: Boolean, windowActivationState: CoreWindowActivationState): IWindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], windowActivationState = windowActivationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowActivatedEventArgs]
  }
  
  extension [Self <: IWindowActivatedEventArgs](x: Self) {
    
    inline def setWindowActivationState(value: CoreWindowActivationState): Self = StObject.set(x, "windowActivationState", value.asInstanceOf[js.Any])
  }
}
