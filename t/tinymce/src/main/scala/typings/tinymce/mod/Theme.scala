package typings.tinymce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  def renderUI(obj: js.Object): js.Object
}
object Theme {
  
  inline def apply(renderUI: js.Object => js.Object): Theme = {
    val __obj = js.Dynamic.literal(renderUI = js.Any.fromFunction1(renderUI))
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setRenderUI(value: js.Object => js.Object): Self = StObject.set(x, "renderUI", js.Any.fromFunction1(value))
  }
}
