package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSStyleRule extends StObject {
  
  val styleMap: StylePropertyMap
}
object CSSStyleRule {
  
  inline def apply(styleMap: StylePropertyMap): CSSStyleRule = {
    val __obj = js.Dynamic.literal(styleMap = styleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSStyleRule] (val x: Self) extends AnyVal {
    
    inline def setStyleMap(value: StylePropertyMap): Self = StObject.set(x, "styleMap", value.asInstanceOf[js.Any])
  }
}
