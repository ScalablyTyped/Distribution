package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxQElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var cite: js.UndefOr[String] = js.undefined
}
object JsxQElementProps {
  
  inline def apply(): JsxQElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxQElementProps]
  }
  
  extension [Self <: JsxQElementProps](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
