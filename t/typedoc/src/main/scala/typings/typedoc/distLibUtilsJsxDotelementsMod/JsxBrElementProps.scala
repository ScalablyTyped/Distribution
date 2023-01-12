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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxBrElementProps] (val x: Self) extends AnyVal {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
  }
}
