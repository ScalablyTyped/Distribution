package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxBrElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var clear: js.UndefOr[String] = js.undefined
}
object JsxBrElementProps {
  
  inline def apply(): JsxBrElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxBrElementProps]
  }
  
  extension [Self <: JsxBrElementProps](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
  }
}
