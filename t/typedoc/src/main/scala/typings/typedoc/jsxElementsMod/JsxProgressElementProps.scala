package typings.typedoc.jsxElementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxProgressElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object JsxProgressElementProps {
  
  inline def apply(): JsxProgressElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxProgressElementProps]
  }
  
  extension [Self <: JsxProgressElementProps](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
