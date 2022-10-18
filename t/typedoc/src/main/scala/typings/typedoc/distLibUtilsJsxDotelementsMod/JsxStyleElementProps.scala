package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxStyleElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var media: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object JsxStyleElementProps {
  
  inline def apply(): JsxStyleElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxStyleElementProps]
  }
  
  extension [Self <: JsxStyleElementProps](x: Self) {
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
