package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPie extends ISeries {
  var concentric: Boolean = js.native
  var donut: Double = js.native
  var explode: js.Array[Double] = js.native
  var orderAscending: Boolean = js.native
  var rotation: Double = js.native
  var sort: String = js.native
  def calcPos(angle: Double, position: IPoint): Unit = js.native
}

