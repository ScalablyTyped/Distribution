package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxCanvasElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object JsxCanvasElementProps {
  
  inline def apply(): JsxCanvasElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxCanvasElementProps]
  }
  
  extension [Self <: JsxCanvasElementProps](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
