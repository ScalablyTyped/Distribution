package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PowerlineFrequency extends js.Object

/** Specifies the local power line frequency. */
@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends js.Object {
  /** Power-line frequency control is disabled. */
  @js.native
  sealed trait disabled extends PowerlineFrequency
  
  /** The power-line frequency is 50 Hz. */
  @js.native
  sealed trait fiftyHertz extends PowerlineFrequency
  
  /** The power-line frequency is 60 Hz. */
  @js.native
  sealed trait sixtyHertz extends PowerlineFrequency
  
  /* 0 */ val disabled: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency.disabled with Double = js.native
  /* 1 */ val fiftyHertz: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency.fiftyHertz with Double = js.native
  /* 2 */ val sixtyHertz: typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency.sixtyHertz with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PowerlineFrequency with Double] = js.native
}

