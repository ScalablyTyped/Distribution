package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISeriesNoBounds extends js.Object {
  
  def addRandom(count: Double): ISeries = js.native
  def addRandom(count: Double, range: js.UndefOr[scala.Nothing], x: Boolean): ISeries = js.native
  def addRandom(count: Double, range: Double): ISeries = js.native
  def addRandom(count: Double, range: Double, x: Boolean): ISeries = js.native
  
  def associatedToAxis(axis: IAxis): Boolean = js.native
  
  def calc(index: Double, position: IPoint): Unit = js.native
  
  def clicked(position: IPoint): Double = js.native
  
  var colorEach: String = js.native
  
  def count(): Double = js.native
  
  var cursor: ICursor = js.native
  
  var data: ISeriesData = js.native
  
  var decimals: Double = js.native
  
  var format: IFormat = js.native
  
  var horizAxis: String = js.native
  
  var hover: IFormat = js.native
  
  def markText(index: Double): String = js.native
  
  var marks: IMarks = js.native
  
  def maxXValue(): Double = js.native
  
  def maxYValue(): Double = js.native
  
  def minXValue(): Double = js.native
  
  def minYValue(): Double = js.native
  
  var over: Double = js.native
  
  var palette: IPalette = js.native
  
  var title: String = js.native
  
  //refresh(failure: function): void;
  def toPercent(index: Double): String = js.native
  
  var useAxes: Boolean = js.native
  
  def valueText(index: Double): String = js.native
  
  var vertAxis: String = js.native
  
  var visible: Boolean = js.native
  
  var yMandatory: Boolean = js.native
}
