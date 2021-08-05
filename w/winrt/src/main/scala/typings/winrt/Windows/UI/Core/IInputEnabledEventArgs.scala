package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputEnabledEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var inputEnabled: Boolean
}
object IInputEnabledEventArgs {
  
  inline def apply(handled: Boolean, inputEnabled: Boolean): IInputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], inputEnabled = inputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputEnabledEventArgs]
  }
  
  extension [Self <: IInputEnabledEventArgs](x: Self) {
    
    inline def setInputEnabled(value: Boolean): Self = StObject.set(x, "inputEnabled", value.asInstanceOf[js.Any])
  }
}
