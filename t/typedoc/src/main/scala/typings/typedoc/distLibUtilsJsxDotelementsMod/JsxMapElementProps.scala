package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxMapElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var name: js.UndefOr[String] = js.undefined
}
object JsxMapElementProps {
  
  inline def apply(): JsxMapElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxMapElementProps]
  }
  
  extension [Self <: JsxMapElementProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
