package typings.vhtml.mod.JSX

import typings.vhtml.vhtmlStrings.center
import typings.vhtml.vhtmlStrings.char
import typings.vhtml.vhtmlStrings.justify
import typings.vhtml.vhtmlStrings.left
import typings.vhtml.vhtmlStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var abbr: js.UndefOr[String] = js.undefined
  
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  
  var colspan: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var rowspan: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object ThHTMLAttributes {
  
  inline def apply(): ThHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThHTMLAttributes]
  }
  
  extension [Self <: ThHTMLAttributes](x: Self) {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
    inline def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
