package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend extends js.Object {
  var align: scala.Double
  var bounds: IRectangle
  var chart: IChart
  var dividing: IStroke
  var fontColor: scala.Boolean
  var format: IFormat
  var innerOff: scala.Double
  var inverted: scala.Boolean
  var itemHeight: scala.Double
  var legendStyle: java.lang.String
  var over: scala.Double
  var padding: scala.Double
  var position: java.lang.String
  var symbol: ISymbol
  var textStyle: java.lang.String
  var title: IAnnotation
  var transparent: scala.Boolean
  var visible: scala.Boolean
  def availRows(): scala.Double
  def isVertical(): scala.Boolean
  def itemText(series: ISeries, index: scala.Double): java.lang.String
  def itemsCount(): scala.Double
  def showValues(): scala.Boolean
  def totalWidth(): scala.Double
}

object ILegend {
  @scala.inline
  def apply(
    align: scala.Double,
    availRows: js.Function0[scala.Double],
    bounds: IRectangle,
    chart: IChart,
    dividing: IStroke,
    fontColor: scala.Boolean,
    format: IFormat,
    innerOff: scala.Double,
    inverted: scala.Boolean,
    isVertical: js.Function0[scala.Boolean],
    itemHeight: scala.Double,
    itemText: js.Function2[ISeries, scala.Double, java.lang.String],
    itemsCount: js.Function0[scala.Double],
    legendStyle: java.lang.String,
    over: scala.Double,
    padding: scala.Double,
    position: java.lang.String,
    showValues: js.Function0[scala.Boolean],
    symbol: ISymbol,
    textStyle: java.lang.String,
    title: IAnnotation,
    totalWidth: js.Function0[scala.Double],
    transparent: scala.Boolean,
    visible: scala.Boolean
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("availRows")(availRows)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("dividing")(dividing)
    __obj.updateDynamic("fontColor")(fontColor)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("innerOff")(innerOff)
    __obj.updateDynamic("inverted")(inverted)
    __obj.updateDynamic("isVertical")(isVertical)
    __obj.updateDynamic("itemHeight")(itemHeight)
    __obj.updateDynamic("itemText")(itemText)
    __obj.updateDynamic("itemsCount")(itemsCount)
    __obj.updateDynamic("legendStyle")(legendStyle)
    __obj.updateDynamic("over")(over)
    __obj.updateDynamic("padding")(padding)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("showValues")(showValues)
    __obj.updateDynamic("symbol")(symbol)
    __obj.updateDynamic("textStyle")(textStyle)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("totalWidth")(totalWidth)
    __obj.updateDynamic("transparent")(transparent)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ILegend]
  }
}

