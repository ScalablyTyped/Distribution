package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  style :{  max :react.react.CSSProperties | undefined,   maxLabels :react.react.CSSProperties | undefined,   median :react.react.CSSProperties | undefined,   medianLabels :react.react.CSSProperties | undefined,   min :react.react.CSSProperties | undefined,   minLabels :react.react.CSSProperties | undefined,   q1 :react.react.CSSProperties | undefined,   q1Labels :react.react.CSSProperties | undefined,   q3 :react.react.CSSProperties | undefined,   q3Labels :react.react.CSSProperties | undefined} | undefined,   boxWidth :number | undefined} & victory.victory.ThemeBaseProps */
trait stylemaxCSSPropertiesunde extends StObject {
  
  var boxWidth: js.UndefOr[Double] = js.undefined
  
  var colorScale: js.Array[String]
  
  var height: Double
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Max] = js.undefined
  
  var width: Double
}
object stylemaxCSSPropertiesunde {
  
  @scala.inline
  def apply(colorScale: js.Array[String], height: Double, width: Double): stylemaxCSSPropertiesunde = {
    val __obj = js.Dynamic.literal(colorScale = colorScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[stylemaxCSSPropertiesunde]
  }
  
  @scala.inline
  implicit class stylemaxCSSPropertiesundeMutableBuilder[Self <: stylemaxCSSPropertiesunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
    
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
    def setStyle(value: Max): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
