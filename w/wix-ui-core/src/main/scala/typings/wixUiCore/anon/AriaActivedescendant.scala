package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaActivedescendant extends StObject {
  
  var ariaActivedescendant: js.Any
  
  var ariaExpanded: Boolean
}
object AriaActivedescendant {
  
  @scala.inline
  def apply(ariaActivedescendant: js.Any, ariaExpanded: Boolean): AriaActivedescendant = {
    val __obj = js.Dynamic.literal(ariaActivedescendant = ariaActivedescendant.asInstanceOf[js.Any], ariaExpanded = ariaExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaActivedescendant]
  }
  
  @scala.inline
  implicit class AriaActivedescendantMutableBuilder[Self <: AriaActivedescendant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaActivedescendant(value: js.Any): Self = StObject.set(x, "ariaActivedescendant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
  }
}
