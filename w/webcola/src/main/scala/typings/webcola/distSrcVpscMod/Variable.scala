package typings.webcola.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Variable")
@js.native
class Variable protected () extends js.Object {
  def this(desiredPosition: Double) = this()
  def this(desiredPosition: Double, weight: Double) = this()
  def this(desiredPosition: Double, weight: Double, scale: Double) = this()
  var block: Block = js.native
  var cIn: js.Array[Constraint] = js.native
  var cOut: js.Array[Constraint] = js.native
  var desiredPosition: Double = js.native
  var offset: Double = js.native
  var scale: Double = js.native
  var weight: Double = js.native
  def dfdv(): Double = js.native
  def position(): Double = js.native
  def visitNeighbours(prev: Variable, f: js.Function2[/* c */ Constraint, /* next */ this.type, Unit]): Unit = js.native
}

