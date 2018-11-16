package typings
package vexflowLib.VexNs.FlowNs.StaveHairpinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait `type` extends js.Object

@JSGlobal("Vex.Flow.StaveHairpin.type")
@js.native
object `type` extends js.Object {
  @js.native
  sealed trait CRESC
    extends vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`
  
  @js.native
  sealed trait DECRESC
    extends vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`
  
  /* 1 */ val CRESC: CRESC with scala.Double = js.native
  val DECRESC: DECRESC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type` with scala.Double] = js.native
}

