package typings.webcola.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "PositionStats")
@js.native
class PositionStats protected () extends js.Object {
  def this(scale: Double) = this()
  var A2: Double = js.native
  var AB: Double = js.native
  var AD: Double = js.native
  var scale: Double = js.native
  def addVariable(v: Variable): Unit = js.native
  def getPosn(): Double = js.native
}

