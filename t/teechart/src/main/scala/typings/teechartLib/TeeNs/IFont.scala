package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFont extends js.Object {
  var baseLine: java.lang.String
  var chart: IChart
  var fill: java.lang.String
  var gradient: IGradient
  var shadow: IShadow
  var stroke: IStroke
  var style: java.lang.String
  var textAlign: java.lang.String
  def getSize(): scala.Double
  def setSize(size: scala.Double): scala.Unit
}

