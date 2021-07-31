package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAny extends StObject {
  
  var element: js.Any
}
object ElementAny {
  
  @scala.inline
  def apply(element: js.Any): ElementAny = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAny]
  }
  
  @scala.inline
  implicit class ElementAnyMutableBuilder[Self <: ElementAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
