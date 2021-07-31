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
  
  @scala.inline
  def apply(handled: Boolean, windowActivationState: CoreWindowActivationState): IWindowActivatedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], windowActivationState = windowActivationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindowActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IWindowActivatedEventArgsMutableBuilder[Self <: IWindowActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowActivationState(value: CoreWindowActivationState): Self = StObject.set(x, "windowActivationState", value.asInstanceOf[js.Any])
  }
}
