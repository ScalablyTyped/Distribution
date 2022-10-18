package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxTdElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
}
object JsxTdElementProps {
  
  inline def apply(): JsxTdElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxTdElementProps]
  }
  
  extension [Self <: JsxTdElementProps](x: Self) {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
