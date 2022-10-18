package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxColgroupElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var span: js.UndefOr[Double] = js.undefined
}
object JsxColgroupElementProps {
  
  inline def apply(): JsxColgroupElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxColgroupElementProps]
  }
  
  extension [Self <: JsxColgroupElementProps](x: Self) {
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
  }
}
