package typings.webcola.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Constraint")
@js.native
class Constraint protected () extends js.Object {
  def this(left: Variable, right: Variable, gap: Double) = this()
  def this(left: Variable, right: Variable, gap: Double, equality: Boolean) = this()
  var active: Boolean = js.native
  var equality: Boolean = js.native
  var gap: Double = js.native
  var left: Variable = js.native
  var lm: Double = js.native
  var right: Variable = js.native
  var unsatisfiable: Boolean = js.native
  def slack(): Double = js.native
}

