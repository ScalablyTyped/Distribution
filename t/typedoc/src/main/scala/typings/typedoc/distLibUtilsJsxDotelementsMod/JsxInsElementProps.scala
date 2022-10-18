package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxInsElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var cite: js.UndefOr[String] = js.undefined
  
  var dateTime: js.UndefOr[String] = js.undefined
}
object JsxInsElementProps {
  
  inline def apply(): JsxInsElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxInsElementProps]
  }
  
  extension [Self <: JsxInsElementProps](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
