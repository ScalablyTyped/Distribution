package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxHtmlElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var xmlns: js.UndefOr[String] = js.undefined
}
object JsxHtmlElementProps {
  
  inline def apply(): JsxHtmlElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxHtmlElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxHtmlElementProps] (val x: Self) extends AnyVal {
    
    inline def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
