package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCSSInlineStyle extends StObject {
  
  val attributeStyleMap: StylePropertyMap
}
object ElementCSSInlineStyle {
  
  @scala.inline
  def apply(attributeStyleMap: StylePropertyMap): ElementCSSInlineStyle = {
    val __obj = js.Dynamic.literal(attributeStyleMap = attributeStyleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCSSInlineStyle]
  }
  
  @scala.inline
  implicit class ElementCSSInlineStyleMutableBuilder[Self <: ElementCSSInlineStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeStyleMap(value: StylePropertyMap): Self = StObject.set(x, "attributeStyleMap", value.asInstanceOf[js.Any])
  }
}
