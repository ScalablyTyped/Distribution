package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  borderWidth :number | undefined,   style :{  data :react.react.CSSProperties | undefined,   labels :react.react.CSSProperties | undefined} | undefined} & victory.victory.ThemeBaseProps */
trait borderWidthnumberundefine extends StObject {
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colorScale: js.Array[String]
  
  var height: Double
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Data] = js.undefined
  
  var width: Double
}
object borderWidthnumberundefine {
  
  inline def apply(colorScale: js.Array[String], height: Double, width: Double): borderWidthnumberundefine = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[borderWidthnumberundefine]
  }
  
  extension [Self <: borderWidthnumberundefine](x: Self) {
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColorScale(value: js.Array[String]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStyle(value: Data): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
