package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAxes extends js.Object {
  var bottom: IAxis
  var chart: IChart
  var items: js.Array[IAxis]
  var left: IAxis
  var right: IAxis
  var top: IAxis
  var visible: scala.Boolean
  def add(horizontal: scala.Boolean, otherSide: scala.Boolean): IAxis
}

