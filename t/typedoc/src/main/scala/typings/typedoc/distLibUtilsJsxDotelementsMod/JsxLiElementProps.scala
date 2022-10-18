package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxLiElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var value: js.UndefOr[Double] = js.undefined
}
object JsxLiElementProps {
  
  inline def apply(): JsxLiElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxLiElementProps]
  }
  
  extension [Self <: JsxLiElementProps](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
