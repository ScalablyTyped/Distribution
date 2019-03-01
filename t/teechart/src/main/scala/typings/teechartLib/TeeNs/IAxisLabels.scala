package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxisLabels extends js.Object {
  var alternate: scala.Boolean
  var chart: IChart
  var dateFormat: java.lang.String
  var decimals: scala.Double
  var format: IFormat
  var labelStyle: java.lang.String
  var maxWidth: scala.Double
  var padding: scala.Double
  var rotation: scala.Double
  var separation: scala.Double
   // %
  var visible: scala.Boolean
  def getLabel(value: scala.Double): java.lang.String
  def width(value: scala.Double): scala.Double
}

object IAxisLabels {
  @scala.inline
  def apply(
    alternate: scala.Boolean,
    chart: IChart,
    dateFormat: java.lang.String,
    decimals: scala.Double,
    format: IFormat,
    getLabel: js.Function1[scala.Double, java.lang.String],
    labelStyle: java.lang.String,
    maxWidth: scala.Double,
    padding: scala.Double,
    rotation: scala.Double,
    separation: scala.Double,
    visible: scala.Boolean,
    width: js.Function1[scala.Double, scala.Double]
  ): IAxisLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alternate")(alternate)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.updateDynamic("decimals")(decimals)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("labelStyle")(labelStyle)
    __obj.updateDynamic("maxWidth")(maxWidth)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("separation")(separation)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IAxisLabels]
  }
}

