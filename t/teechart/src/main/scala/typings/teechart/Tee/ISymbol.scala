package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymbol extends js.Object {
  var chart: IChart
  var format: IFormat
  var height: Double
  var padding: Double
  var visible: Boolean
  var width: Double
}

object ISymbol {
  @scala.inline
  def apply(chart: IChart, format: IFormat, height: Double, padding: Double, visible: Boolean, width: Double): ISymbol = {
    val __obj = js.Dynamic.literal(chart = chart, format = format, height = height, padding = padding, visible = visible, width = width)
  
    __obj.asInstanceOf[ISymbol]
  }
}

