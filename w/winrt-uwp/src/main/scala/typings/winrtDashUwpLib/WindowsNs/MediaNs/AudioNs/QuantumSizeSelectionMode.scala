package typings
package winrtDashUwpLib.WindowsNs.MediaNs.AudioNs

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
  sealed trait closestToDesired
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode
  
  /** Use the value with the lowest latency. */
  @js.native
  sealed trait lowestLatency
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode
  
  /** Use the system default value. */
  @js.native
  sealed trait systemDefault
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode
  
  /* 2 */ val closestToDesired: closestToDesired with scala.Double = js.native
  /* 1 */ val lowestLatency: lowestLatency with scala.Double = js.native
  /* 0 */ val systemDefault: systemDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode with scala.Double
  ] = js.native
}

