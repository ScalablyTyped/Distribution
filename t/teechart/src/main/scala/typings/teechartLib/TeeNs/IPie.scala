package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPie extends ISeries {
  var concentric: scala.Boolean = js.native
  var donut: scala.Double = js.native
  var explode: js.Array[scala.Double] = js.native
  var orderAscending: scala.Boolean = js.native
  var rotation: scala.Double = js.native
  var sort: java.lang.String = js.native
  def calcPos(angle: scala.Double, position: IPoint): scala.Unit = js.native
}

