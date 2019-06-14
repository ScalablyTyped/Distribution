package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing
  
  /** Minimal audio signal processing. */
  @js.native
  sealed trait raw
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val raw: raw with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing with scala.Double] = js.native
}

