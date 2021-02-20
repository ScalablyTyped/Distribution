package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFont extends StObject {
  
  var baseLine: String = js.native
  
  var chart: IChart = js.native
  
  var fill: String = js.native
  
  def getSize(): Double = js.native
  
  var gradient: IGradient = js.native
  
  def setSize(size: Double): Unit = js.native
  
  var shadow: IShadow = js.native
  
  var stroke: IStroke = js.native
  
  var style: String = js.native
  
  var textAlign: String = js.native
}
object IFont {
  
  @scala.inline
  def apply(
    baseLine: String,
    chart: IChart,
    fill: String,
    getSize: () => Double,
    gradient: IGradient,
    setSize: Double => Unit,
    shadow: IShadow,
    stroke: IStroke,
    style: String,
    textAlign: String
  ): IFont = {
    val __obj = js.Dynamic.literal(baseLine = baseLine.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], getSize = js.Any.fromFunction0(getSize), gradient = gradient.asInstanceOf[js.Any], setSize = js.Any.fromFunction1(setSize), shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  
  @scala.inline
  implicit class IFontMutableBuilder[Self <: IFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLine(value: String): Self = StObject.set(x, "baseLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGradient(value: IGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSize(value: Double => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShadow(value: IShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: IStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
