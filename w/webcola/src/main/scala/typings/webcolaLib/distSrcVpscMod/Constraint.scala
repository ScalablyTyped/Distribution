package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Constraint")
@js.native
class Constraint protected () extends js.Object {
  def this(left: Variable, right: Variable, gap: scala.Double) = this()
  def this(left: Variable, right: Variable, gap: scala.Double, equality: scala.Boolean) = this()
  var active: scala.Boolean = js.native
  var equality: scala.Boolean = js.native
  var gap: scala.Double = js.native
  var left: Variable = js.native
  var lm: scala.Double = js.native
  var right: Variable = js.native
  var unsatisfiable: scala.Boolean = js.native
  def slack(): scala.Double = js.native
}

