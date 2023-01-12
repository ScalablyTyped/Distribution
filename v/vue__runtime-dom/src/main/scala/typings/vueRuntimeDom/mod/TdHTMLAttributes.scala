package typings.vueRuntimeDom.mod

import typings.vueRuntimeDom.vueRuntimeDomStrings.baseline
import typings.vueRuntimeDom.vueRuntimeDomStrings.bottom
import typings.vueRuntimeDom.vueRuntimeDomStrings.center
import typings.vueRuntimeDom.vueRuntimeDomStrings.char
import typings.vueRuntimeDom.vueRuntimeDomStrings.justify
import typings.vueRuntimeDom.vueRuntimeDomStrings.left
import typings.vueRuntimeDom.vueRuntimeDomStrings.middle
import typings.vueRuntimeDom.vueRuntimeDomStrings.right
import typings.vueRuntimeDom.vueRuntimeDomStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var align: js.UndefOr[left | center | right | justify | char] = js.undefined
  
  var colspan: js.UndefOr[Numberish] = js.undefined
  
  var headers: js.UndefOr[String] = js.undefined
  
  var rowspan: js.UndefOr[Numberish] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom | baseline] = js.undefined
}
object TdHTMLAttributes {
  
  inline def apply(): TdHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TdHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TdHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColspan(value: Numberish): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowspan(value: Numberish): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setValign(value: top | middle | bottom | baseline): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
  }
}
