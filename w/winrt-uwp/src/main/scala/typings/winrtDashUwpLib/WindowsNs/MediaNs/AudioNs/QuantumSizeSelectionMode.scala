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
  
  val closestToDesired: closestToDesired with java.lang.String = js.native
  val lowestLatency: lowestLatency with java.lang.String = js.native
  val systemDefault: systemDefault with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.AudioNs.QuantumSizeSelectionMode with java.lang.String
  ] = js.native
}

