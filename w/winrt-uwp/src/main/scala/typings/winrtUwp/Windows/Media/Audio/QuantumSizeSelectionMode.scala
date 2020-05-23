package typings.winrtUwp.Windows.Media.Audio

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
  
}

