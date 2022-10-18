package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxTimeElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var dateTime: js.UndefOr[String] = js.undefined
}
object JsxTimeElementProps {
  
  inline def apply(): JsxTimeElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxTimeElementProps]
  }
  
  extension [Self <: JsxTimeElementProps](x: Self) {
    
    inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
