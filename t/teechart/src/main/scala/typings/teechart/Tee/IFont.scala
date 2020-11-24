package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFont extends js.Object {
  
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
  implicit class IFontOps[Self <: IFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseLine(value: String): Self = this.set("baseLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSize(value: () => Double): Self = this.set("getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGradient(value: IGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSize(value: Double => Unit): Self = this.set("setSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShadow(value: IShadow): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: IStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
  }
}
