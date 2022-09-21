package typings.typedoc.jsxElementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxDelElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var cite: js.UndefOr[String] = js.undefined
  
  var dateTime: js.UndefOr[String] = js.undefined
}
object JsxDelElementProps {
  
  inline def apply(): JsxDelElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxDelElementProps]
  }
  
  extension [Self <: JsxDelElementProps](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
