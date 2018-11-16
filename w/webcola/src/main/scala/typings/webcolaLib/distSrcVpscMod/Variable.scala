package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Variable")
@js.native
class Variable protected () extends js.Object {
  def this(desiredPosition: scala.Double) = this()
  def this(desiredPosition: scala.Double, weight: scala.Double) = this()
  def this(desiredPosition: scala.Double, weight: scala.Double, scale: scala.Double) = this()
  var block: Block = js.native
  var cIn: js.Array[Constraint] = js.native
  var cOut: js.Array[Constraint] = js.native
  var desiredPosition: scala.Double = js.native
  var offset: scala.Double = js.native
  var scale: scala.Double = js.native
  var weight: scala.Double = js.native
  def dfdv(): scala.Double = js.native
  def position(): scala.Double = js.native
  def visitNeighbours(prev: Variable, f: js.Function2[/* c */ Constraint, /* next */ this.type, scala.Unit]): scala.Unit = js.native
}

