package typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuantumSizeSelectionMode extends js.Object

/** Defines values used for quantum size selection. */
@JSGlobal("Windows.Media.Audio.QuantumSizeSelectionMode")
@js.native
object QuantumSizeSelectionMode extends js.Object {
  /** Use the value closest to the one desired. */
  @js.native
  sealed trait closestToDesired extends QuantumSizeSelectionMode
  
  /** Use the value with the lowest latency. */
  @js.native
  sealed trait lowestLatency extends QuantumSizeSelectionMode
  
  /** Use the system default value. */
  @js.native
  sealed trait systemDefault extends QuantumSizeSelectionMode
  
  /* 2 */ val closestToDesired: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode.closestToDesired with Double = js.native
  /* 1 */ val lowestLatency: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode.lowestLatency with Double = js.native
  /* 0 */ val systemDefault: typings.winrtDashUwp.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode.systemDefault with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuantumSizeSelectionMode with Double] = js.native
}

