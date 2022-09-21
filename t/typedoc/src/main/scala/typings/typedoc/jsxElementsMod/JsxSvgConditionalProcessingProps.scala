package typings.typedoc.jsxElementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSvgConditionalProcessingProps extends StObject {
  
  var systemLanguage: js.UndefOr[String] = js.undefined
}
object JsxSvgConditionalProcessingProps {
  
  inline def apply(): JsxSvgConditionalProcessingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSvgConditionalProcessingProps]
  }
  
  extension [Self <: JsxSvgConditionalProcessingProps](x: Self) {
    
    inline def setSystemLanguage(value: String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
  }
}
