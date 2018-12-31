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

