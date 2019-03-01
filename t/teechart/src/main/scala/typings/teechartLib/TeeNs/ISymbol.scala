package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymbol extends js.Object {
  var chart: IChart
  var format: IFormat
  var height: scala.Double
  var padding: scala.Double
  var visible: scala.Boolean
  var width: scala.Double
}

object ISymbol {
  @scala.inline
  def apply(
    chart: IChart,
    format: IFormat,
    height: scala.Double,
    padding: scala.Double,
    visible: scala.Boolean,
    width: scala.Double
  ): ISymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ISymbol]
  }
}

