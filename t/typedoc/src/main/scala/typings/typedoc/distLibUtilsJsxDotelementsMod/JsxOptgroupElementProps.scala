package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxOptgroupElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: String
}
object JsxOptgroupElementProps {
  
  inline def apply(label: String): JsxOptgroupElementProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxOptgroupElementProps]
  }
  
  extension [Self <: JsxOptgroupElementProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
