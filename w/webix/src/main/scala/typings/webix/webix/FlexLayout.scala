package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  var $getSize: js.Array[Any]
  
  def render(): Unit
}
object FlexLayout {
  
  inline def apply($getSize: js.Array[Any], render: () => Unit): FlexLayout = {
    val __obj = js.Dynamic.literal($getSize = $getSize.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[FlexLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexLayout] (val x: Self) extends AnyVal {
    
    inline def set$getSize(value: js.Array[Any]): Self = StObject.set(x, "$getSize", value.asInstanceOf[js.Any])
    
    inline def set$getSizeVarargs(value: Any*): Self = StObject.set(x, "$getSize", js.Array(value*))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
