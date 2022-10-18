package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxFieldsetElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object JsxFieldsetElementProps {
  
  inline def apply(): JsxFieldsetElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxFieldsetElementProps]
  }
  
  extension [Self <: JsxFieldsetElementProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
