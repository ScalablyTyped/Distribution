package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFont extends js.Object {
  var baseLine: java.lang.String
  var chart: IChart
  var fill: java.lang.String
  var gradient: IGradient
  var shadow: IShadow
  var stroke: IStroke
  var style: java.lang.String
  var textAlign: java.lang.String
  def getSize(): scala.Double
  def setSize(size: scala.Double): scala.Unit
}

object IFont {
  @scala.inline
  def apply(
    baseLine: java.lang.String,
    chart: IChart,
    fill: java.lang.String,
    getSize: () => scala.Double,
    gradient: IGradient,
    setSize: scala.Double => scala.Unit,
    shadow: IShadow,
    stroke: IStroke,
    style: java.lang.String,
    textAlign: java.lang.String
  ): IFont = {
    val __obj = js.Dynamic.literal(baseLine = baseLine, chart = chart, fill = fill, getSize = js.Any.fromFunction0(getSize), gradient = gradient, setSize = js.Any.fromFunction1(setSize), shadow = shadow, stroke = stroke, style = style, textAlign = textAlign)
  
    __obj.asInstanceOf[IFont]
  }
}

