package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioProcessing extends js.Object

/** Defines the audio processing modes. */
@JSGlobal("Windows.Media.AudioProcessing")
@js.native
object AudioProcessing extends js.Object {
  /** Normal audio signal processing. */
  @js.native
  sealed trait default extends AudioProcessing
  
  /** Minimal audio signal processing. */
  @js.native
  sealed trait raw extends AudioProcessing
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.AudioProcessing.default with Double = js.native
  /* 1 */ val raw: typings.winrtDashUwp.WindowsNs.MediaNs.AudioProcessing.raw with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioProcessing with Double] = js.native
}

