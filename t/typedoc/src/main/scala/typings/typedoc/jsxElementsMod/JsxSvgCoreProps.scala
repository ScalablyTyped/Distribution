package typings.typedoc.jsxElementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSvgCoreProps extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var tabindex: js.UndefOr[String] = js.undefined
  
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.undefined
  
  var xmlns: js.UndefOr[String] = js.undefined
}
object JsxSvgCoreProps {
  
  inline def apply(): JsxSvgCoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSvgCoreProps]
  }
  
  extension [Self <: JsxSvgCoreProps](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    inline def setXmlColonbase(value: String): Self = StObject.set(x, "xml:base", value.asInstanceOf[js.Any])
    
    inline def setXmlColonbaseUndefined: Self = StObject.set(x, "xml:base", js.undefined)
    
    inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
