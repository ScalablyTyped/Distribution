package typings
package vexflowLib.VexNs.FlowNs.VoiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("Vex.Flow.Voice.Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait FULL
    extends vexflowLib.VexNs.FlowNs.VoiceNs.Mode
  
  @js.native
  sealed trait SOFT
    extends vexflowLib.VexNs.FlowNs.VoiceNs.Mode
  
  @js.native
  sealed trait STRICT
    extends vexflowLib.VexNs.FlowNs.VoiceNs.Mode
  
  val FULL: FULL with scala.Double = js.native
  val SOFT: SOFT with scala.Double = js.native
  /* 1 */ val STRICT: STRICT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vexflowLib.VexNs.FlowNs.VoiceNs.Mode with scala.Double] = js.native
}

