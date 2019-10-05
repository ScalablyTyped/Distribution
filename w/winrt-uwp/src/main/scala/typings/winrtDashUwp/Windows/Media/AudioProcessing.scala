package typings.winrtDashUwp.Windows.Media

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
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.AudioProcessing.default with Double = js.native
  /* 1 */ val raw: typings.winrtDashUwp.Windows.Media.AudioProcessing.raw with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioProcessing with Double] = js.native
}

