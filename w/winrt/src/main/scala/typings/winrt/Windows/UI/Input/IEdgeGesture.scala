package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEdgeGesture extends StObject {
  
  var oncanceled: js.Any = js.native
  
  var oncompleted: js.Any = js.native
  
  var onstarting: js.Any = js.native
}
object IEdgeGesture {
  
  @scala.inline
  def apply(oncanceled: js.Any, oncompleted: js.Any, onstarting: js.Any): IEdgeGesture = {
    val __obj = js.Dynamic.literal(oncanceled = oncanceled.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onstarting = onstarting.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEdgeGesture]
  }
  
  @scala.inline
  implicit class IEdgeGestureMutableBuilder[Self <: IEdgeGesture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOncanceled(value: js.Any): Self = StObject.set(x, "oncanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncompleted(value: js.Any): Self = StObject.set(x, "oncompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstarting(value: js.Any): Self = StObject.set(x, "onstarting", value.asInstanceOf[js.Any])
  }
}
