package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgeGesture extends StObject {
  
  var oncanceled: Any
  
  var oncompleted: Any
  
  var onstarting: Any
}
object IEdgeGesture {
  
  inline def apply(oncanceled: Any, oncompleted: Any, onstarting: Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onstarting = onstarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGesture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEdgeGesture] (val x: Self) extends AnyVal {
    
    inline def setOncanceled(value: Any): Self = StObject.set(x, "oncanceled", value.asInstanceOf[js.Any])
    
    inline def setOncompleted(value: Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    inline def setOnstarting(value: Any): Self = StObject.set(x, "onstarting", value.asInstanceOf[js.Any])
  }
}
