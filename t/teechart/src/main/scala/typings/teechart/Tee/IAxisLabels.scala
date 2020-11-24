package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAxisLabels extends js.Object {
  
  var alternate: Boolean = js.native
  
  var chart: IChart = js.native
  
  var dateFormat: String = js.native
  
  var decimals: Double = js.native
  
  var format: IFormat = js.native
  
  def getLabel(value: Double): String = js.native
  
  var labelStyle: String = js.native
  
  var maxWidth: Double = js.native
  
  var padding: Double = js.native
  
  var rotation: Double = js.native
  
  var separation: Double = js.native
  
   // %
  var visible: Boolean = js.native
  
  def width(value: Double): Double = js.native
}
object IAxisLabels {
  
  @scala.inline
  def apply(
    alternate: Boolean,
    chart: IChart,
    dateFormat: String,
    decimals: Double,
    format: IFormat,
    getLabel: Double => String,
    labelStyle: String,
    maxWidth: Double,
    padding: Double,
    rotation: Double,
    separation: Double,
    visible: Boolean,
    width: Double => Double
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), labelStyle = labelStyle.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = js.Any.fromFunction1(width))
    __obj.asInstanceOf[IAxisLabels]
  }
  
  @scala.inline
  implicit class IAxisLabelsOps[Self <: IAxisLabels] (val x: Self) extends AnyVal {
    
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
    def setAlternate(value: Boolean): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: IChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabel(value: Double => String): Self = this.set("getLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelStyle(value: String): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = this.set("separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double => Double): Self = this.set("width", js.Any.fromFunction1(value))
  }
}
