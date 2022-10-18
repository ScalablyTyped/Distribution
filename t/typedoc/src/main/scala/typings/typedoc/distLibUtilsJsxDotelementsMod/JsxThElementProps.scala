package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings.col
import typings.typedoc.typedocStrings.colgroup
import typings.typedoc.typedocStrings.row
import typings.typedoc.typedocStrings.rowgroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxThElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var abbr: js.UndefOr[String] = js.undefined
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[row | col | rowgroup | colgroup] = js.undefined
}
object JsxThElementProps {
  
  inline def apply(): JsxThElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxThElementProps]
  }
  
  extension [Self <: JsxThElementProps](x: Self) {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: row | col | rowgroup | colgroup): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
