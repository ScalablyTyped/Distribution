package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  var $getSize: js.Array[js.Any]
  
  def render(): Unit
}
object FlexLayout {
  
  inline def apply($getSize: js.Array[js.Any], render: () => Unit): FlexLayout = {
    val __obj = js.Dynamic.literal($getSize = $getSize.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[FlexLayout]
  }
  
  extension [Self <: FlexLayout](x: Self) {
    
    inline def set$getSize(value: js.Array[js.Any]): Self = StObject.set(x, "$getSize", value.asInstanceOf[js.Any])
    
    inline def set$getSizeVarargs(value: js.Any*): Self = StObject.set(x, "$getSize", js.Array(value :_*))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
