package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxRectElementProps
  extends StObject
     with JsxSvgCoreProps
     with JsxSvgStyleProps
     with JsxSvgConditionalProcessingProps
     with JsxSvgPresentationProps {
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var pathLength: js.UndefOr[Double] = js.undefined
  
  var rx: js.UndefOr[String | Double] = js.undefined
  
  var ry: js.UndefOr[String | Double] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
  
  var x: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[String | Double] = js.undefined
}
object JsxRectElementProps {
  
  inline def apply(): JsxRectElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxRectElementProps]
  }
  
  extension [Self <: JsxRectElementProps](x: Self) {
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    inline def setRx(value: String | Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: String | Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
