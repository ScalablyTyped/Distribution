package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgeGesture extends StObject {
  
  var oncanceled: js.Any
  
  var oncompleted: js.Any
  
  var onstarting: js.Any
}
object IEdgeGesture {
  
  inline def apply(oncanceled: js.Any, oncompleted: js.Any, onstarting: js.Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onstarting = onstarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGesture]
  }
  
  extension [Self <: IEdgeGesture](x: Self) {
    
    inline def setOncanceled(value: js.Any): Self = StObject.set(x, "oncanceled", value.asInstanceOf[js.Any])
    
    inline def setOncompleted(value: js.Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    inline def setOnstarting(value: js.Any): Self = StObject.set(x, "onstarting", value.asInstanceOf[js.Any])
  }
}
