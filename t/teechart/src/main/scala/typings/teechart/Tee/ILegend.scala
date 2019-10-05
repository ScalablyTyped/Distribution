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
    val __obj = js.Dynamic.literal(align = align, availRows = js.Any.fromFunction0(availRows), bounds = bounds, chart = chart, dividing = dividing, fontColor = fontColor, format = format, innerOff = innerOff, inverted = inverted, isVertical = js.Any.fromFunction0(isVertical), itemHeight = itemHeight, itemText = js.Any.fromFunction2(itemText), itemsCount = js.Any.fromFunction0(itemsCount), legendStyle = legendStyle, over = over, padding = padding, position = position, showValues = js.Any.fromFunction0(showValues), symbol = symbol, textStyle = textStyle, title = title, totalWidth = js.Any.fromFunction0(totalWidth), transparent = transparent, visible = visible)
  
    __obj.asInstanceOf[ILegend]
  }
}

