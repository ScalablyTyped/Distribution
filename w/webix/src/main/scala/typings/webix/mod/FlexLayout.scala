package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  var $getSize: js.Array[Any]
  
  def render(): Unit
}
object FlexLayout {
  
  @JSImport("webix", "FlexLayout")
  @js.native
  val ^ : FlexLayout = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexLayout] (val x: Self) extends AnyVal {
    
    inline def set$getSize(value: js.Array[Any]): Self = StObject.set(x, "$getSize", value.asInstanceOf[js.Any])
    
    inline def set$getSizeVarargs(value: Any*): Self = StObject.set(x, "$getSize", js.Array(value*))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
