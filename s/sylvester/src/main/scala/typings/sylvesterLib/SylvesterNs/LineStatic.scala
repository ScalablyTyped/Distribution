package typings
package sylvesterLib.SylvesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStatic extends js.Object {
  var X: sylvesterLib.Line = js.native
  var Y: sylvesterLib.Line = js.native
  var Z: sylvesterLib.Line = js.native
  /**
    * Constructor function.
    *
    * @param Array<number>|Vector anchor The anchor vector.
    * @param Array<number>|Vector direction The direction vector.
    */
  def create(anchor: js.Array[scala.Double], direction: js.Array[scala.Double]): sylvesterLib.Line = js.native
  def create(anchor: js.Array[scala.Double], direction: sylvesterLib.Vector): sylvesterLib.Line = js.native
  def create(anchor: sylvesterLib.Vector, direction: js.Array[scala.Double]): sylvesterLib.Line = js.native
  def create(anchor: sylvesterLib.Vector, direction: sylvesterLib.Vector): sylvesterLib.Line = js.native
}

