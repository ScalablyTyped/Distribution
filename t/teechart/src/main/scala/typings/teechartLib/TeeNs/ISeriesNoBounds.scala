package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeriesNoBounds extends js.Object {
  var colorEach: java.lang.String = js.native
  var cursor: ICursor = js.native
  var data: ISeriesData = js.native
  var decimals: scala.Double = js.native
  var format: IFormat = js.native
  var horizAxis: java.lang.String = js.native
  var hover: IFormat = js.native
  var marks: IMarks = js.native
  var over: scala.Double = js.native
  var palette: IPalette = js.native
  var title: java.lang.String = js.native
  var useAxes: scala.Boolean = js.native
  var vertAxis: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  var yMandatory: scala.Boolean = js.native
  def addRandom(count: scala.Double): ISeries = js.native
  def addRandom(count: scala.Double, range: scala.Double): ISeries = js.native
  def addRandom(count: scala.Double, range: scala.Double, x: scala.Boolean): ISeries = js.native
  def associatedToAxis(axis: IAxis): scala.Boolean = js.native
  def calc(index: scala.Double, position: IPoint): scala.Unit = js.native
  def clicked(position: IPoint): scala.Double = js.native
  def count(): scala.Double = js.native
  def markText(index: scala.Double): java.lang.String = js.native
  def maxXValue(): scala.Double = js.native
  def maxYValue(): scala.Double = js.native
  def minXValue(): scala.Double = js.native
  def minYValue(): scala.Double = js.native
  //refresh(failure: function): void;
  def toPercent(index: scala.Double): java.lang.String = js.native
  def valueText(index: scala.Double): java.lang.String = js.native
}

