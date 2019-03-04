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
    val __obj = js.Dynamic.literal(align = align, availRows = availRows, bounds = bounds, chart = chart, dividing = dividing, fontColor = fontColor, format = format, innerOff = innerOff, inverted = inverted, isVertical = isVertical, itemHeight = itemHeight, itemText = itemText, itemsCount = itemsCount, legendStyle = legendStyle, over = over, padding = padding, position = position, showValues = showValues, symbol = symbol, textStyle = textStyle, title = title, totalWidth = totalWidth, transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[ILegend]
  }
}

