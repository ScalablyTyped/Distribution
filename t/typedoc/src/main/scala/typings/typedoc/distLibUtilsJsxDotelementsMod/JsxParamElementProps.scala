package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxParamElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object JsxParamElementProps {
  
  inline def apply(): JsxParamElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxParamElementProps]
  }
  
  extension [Self <: JsxParamElementProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
