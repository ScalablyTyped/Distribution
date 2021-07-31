package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputPane extends StObject {
  
  var occludedRect: Rect
  
  var onhiding: js.Any
  
  var onshowing: js.Any
}
object IInputPane {
  
  @scala.inline
  def apply(occludedRect: Rect, onhiding: js.Any, onshowing: js.Any): IInputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputPane]
  }
  
  @scala.inline
  implicit class IInputPaneMutableBuilder[Self <: IInputPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccludedRect(value: Rect): Self = StObject.set(x, "occludedRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnhiding(value: js.Any): Self = StObject.set(x, "onhiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnshowing(value: js.Any): Self = StObject.set(x, "onshowing", value.asInstanceOf[js.Any])
  }
}
