package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxEmbedElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object JsxEmbedElementProps {
  
  inline def apply(): JsxEmbedElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxEmbedElementProps]
  }
  
  extension [Self <: JsxEmbedElementProps](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
