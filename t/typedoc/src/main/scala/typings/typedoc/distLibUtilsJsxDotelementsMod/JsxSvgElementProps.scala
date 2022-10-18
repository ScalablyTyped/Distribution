package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSvgElementProps
  extends StObject
     with JsxSvgCoreProps
     with JsxSvgStyleProps
     with JsxSvgPresentationProps {
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var preserveAspectRatio: js.UndefOr[
    /* template literal string: ${none|xMinYMin|xMaxYMin|xMinYMid|xMaxYMid|xMinYMax|xMidYMax|xMaxYMax}${| meet| slice} */ String
  ] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
  
  var x: js.UndefOr[String | Double] = js.undefined
  
  var y: js.UndefOr[String | Double] = js.undefined
}
object JsxSvgElementProps {
  
  inline def apply(): JsxSvgElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSvgElementProps]
  }
  
  extension [Self <: JsxSvgElementProps](x: Self) {
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPreserveAspectRatio(
      value: /* template literal string: ${none|xMinYMin|xMaxYMin|xMinYMid|xMaxYMid|xMinYMax|xMidYMax|xMaxYMax}${| meet| slice} */ String
    ): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
