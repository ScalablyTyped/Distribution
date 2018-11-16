package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "PositionStats")
@js.native
class PositionStats protected () extends js.Object {
  def this(scale: scala.Double) = this()
  var A2: scala.Double = js.native
  var AB: scala.Double = js.native
  var AD: scala.Double = js.native
  var scale: scala.Double = js.native
  def addVariable(v: Variable): scala.Unit = js.native
  def getPosn(): scala.Double = js.native
}

