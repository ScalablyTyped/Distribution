package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoordSystem extends js.Object {
  def getDistance(point1: js.Array[scala.Double], point2: js.Array[scala.Double]): scala.Double = js.native
  def solveDirectProblem(startPoint: js.Array[scala.Double], direction: js.Array[scala.Double], distance: scala.Double): js.Object = js.native
  def solveInverseProblem(startPoint: js.Array[scala.Double], endPoint: js.Array[scala.Double]): js.Object = js.native
  def solveInverseProblem(
    startPoint: js.Array[scala.Double],
    endPoint: js.Array[scala.Double],
    reverseDirection: scala.Boolean
  ): js.Object = js.native
}

