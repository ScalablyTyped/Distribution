package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVisibilityChangedEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var visible: Boolean
}
object IVisibilityChangedEventArgs {
  
  inline def apply(handled: Boolean, visible: Boolean): IVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVisibilityChangedEventArgs]
  }
  
  extension [Self <: IVisibilityChangedEventArgs](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
