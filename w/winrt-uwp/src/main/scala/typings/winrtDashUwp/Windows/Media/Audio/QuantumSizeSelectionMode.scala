package typings.winrtDashUwp.Windows.Media.Audio

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Audio.QuantumSizeSelectionMode.closestToDesired
import typings.winrtDashUwp.Windows.Media.Audio.QuantumSizeSelectionMode.lowestLatency
import typings.winrtDashUwp.Windows.Media.Audio.QuantumSizeSelectionMode.systemDefault
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuantumSizeSelectionMode with Double] = js.native
  /* 2 */ @js.native
  object closestToDesired extends TopLevel[closestToDesired with Double]
  
  /* 1 */ @js.native
  object lowestLatency extends TopLevel[lowestLatency with Double]
  
  /* 0 */ @js.native
  object systemDefault extends TopLevel[systemDefault with Double]
  
}

