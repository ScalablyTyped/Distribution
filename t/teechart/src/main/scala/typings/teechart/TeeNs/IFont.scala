package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFont extends js.Object {
  var baseLine: String
  var chart: IChart
  var fill: String
  var gradient: IGradient
  var shadow: IShadow
  var stroke: IStroke
  var style: String
  var textAlign: String
  def getSize(): Double
  def setSize(size: Double): Unit
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
    val __obj = js.Dynamic.literal(baseLine = baseLine, chart = chart, fill = fill, getSize = js.Any.fromFunction0(getSize), gradient = gradient, setSize = js.Any.fromFunction1(setSize), shadow = shadow, stroke = stroke, style = style, textAlign = textAlign)
  
    __obj.asInstanceOf[IFont]
  }
}

