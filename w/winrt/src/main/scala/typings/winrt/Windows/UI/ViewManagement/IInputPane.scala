package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputPane extends StObject {
  
  var occludedRect: Rect
  
  var onhiding: Any
  
  var onshowing: Any
}
object IInputPane {
  
  inline def apply(occludedRect: Rect, onhiding: Any, onshowing: Any): IInputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPane]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInputPane] (val x: Self) extends AnyVal {
    
    inline def setOccludedRect(value: Rect): Self = StObject.set(x, "occludedRect", value.asInstanceOf[js.Any])
    
    inline def setOnhiding(value: Any): Self = StObject.set(x, "onhiding", value.asInstanceOf[js.Any])
    
    inline def setOnshowing(value: Any): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
  }
}
