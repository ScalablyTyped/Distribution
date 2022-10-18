package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxDataElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var value: js.UndefOr[String] = js.undefined
}
object JsxDataElementProps {
  
  inline def apply(): JsxDataElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxDataElementProps]
  }
  
  extension [Self <: JsxDataElementProps](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
