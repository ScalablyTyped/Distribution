package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  style :{  data :react.react.CSSProperties | undefined,   labels :react.react.CSSProperties | undefined} | undefined,   candleColors :{  positive :string | undefined,   negative :string | undefined} | undefined} & victory.victory.ThemeBaseProps */
trait styledataCSSPropertiesundCandleColors extends StObject {
  
  var candleColors: js.UndefOr[Negative] = js.undefined
  
  var colorScale: js.Array[String]
  
  var height: Double
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Data] = js.undefined
  
  var width: Double
}
object styledataCSSPropertiesundCandleColors {
  
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): styledataCSSPropertiesundCandleColors = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[styledataCSSPropertiesundCandleColors]
  }
  
  @scala.inline
  implicit class styledataCSSPropertiesundCandleColorsMutableBuilder[Self <: styledataCSSPropertiesundCandleColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandleColors(value: Negative): Self = StObject.set(x, "candleColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandleColorsUndefined: Self = StObject.set(x, "candleColors", js.undefined)
    
    @scala.inline
    def setColorScale(value: js.Array[String]): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setStyle(value: Data): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
