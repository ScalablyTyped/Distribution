package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend extends js.Object {
  var align: Double
  var bounds: IRectangle
  var chart: IChart
  var dividing: IStroke
  var fontColor: Boolean
  var format: IFormat
  var innerOff: Double
  var inverted: Boolean
  var itemHeight: Double
  var legendStyle: String
  var over: Double
  var padding: Double
  var position: String
  var symbol: ISymbol
  var textStyle: String
  var title: IAnnotation
  var transparent: Boolean
  var visible: Boolean
  def availRows(): Double
  def isVertical(): Boolean
  def itemText(series: ISeries, index: Double): String
  def itemsCount(): Double
  def showValues(): Boolean
  def totalWidth(): Double
}

object ILegend {
  @scala.inline
  def apply(
    align: Double,
    availRows: () => Double,
    bounds: IRectangle,
    chart: IChart,
    dividing: IStroke,
    fontColor: Boolean,
    format: IFormat,
    innerOff: Double,
    inverted: Boolean,
    isVertical: () => Boolean,
    itemHeight: Double,
    itemText: (ISeries, Double) => String,
    itemsCount: () => Double,
    legendStyle: String,
    over: Double,
    padding: Double,
    position: String,
    showValues: () => Boolean,
    symbol: ISymbol,
    textStyle: String,
    title: IAnnotation,
    totalWidth: () => Double,
    transparent: Boolean,
    visible: Boolean
  ): ILegend = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], availRows = js.Any.fromFunction0(availRows), bounds = bounds.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dividing = dividing.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], innerOff = innerOff.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], isVertical = js.Any.fromFunction0(isVertical), itemHeight = itemHeight.asInstanceOf[js.Any], itemText = js.Any.fromFunction2(itemText), itemsCount = js.Any.fromFunction0(itemsCount), legendStyle = legendStyle.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], showValues = js.Any.fromFunction0(showValues), symbol = symbol.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalWidth = js.Any.fromFunction0(totalWidth), transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
}

