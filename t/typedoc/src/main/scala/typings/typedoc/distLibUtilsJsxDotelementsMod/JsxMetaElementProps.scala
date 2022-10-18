package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings.`content-security-policy`
import typings.typedoc.typedocStrings.`content-type`
import typings.typedoc.typedocStrings.`default-style`
import typings.typedoc.typedocStrings.`utf-8`
import typings.typedoc.typedocStrings.`x-ua-compatible`
import typings.typedoc.typedocStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxMetaElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var charSet: js.UndefOr[`utf-8`] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var `http-equiv`: js.UndefOr[
    `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object JsxMetaElementProps {
  
  inline def apply(): JsxMetaElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxMetaElementProps]
  }
  
  extension [Self <: JsxMetaElementProps](x: Self) {
    
    inline def setCharSet(value: `utf-8`): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def `setHttp-equiv`(value: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh): Self = StObject.set(x, "http-equiv", value.asInstanceOf[js.Any])
    
    inline def `setHttp-equivUndefined`: Self = StObject.set(x, "http-equiv", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
