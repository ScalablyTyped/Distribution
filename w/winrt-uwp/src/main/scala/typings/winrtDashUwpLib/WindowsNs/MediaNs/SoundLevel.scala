package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoundLevel extends js.Object

/** Specifies the sound level of the capture or render stream. */
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends js.Object {
  /** The sound level is at full volume. */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel
  
  /** The sound level is low. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel
  
  /** The sound level is muted. */
  @js.native
  sealed trait muted
    extends winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel
  
  /* 2 */ val full: full with scala.Double = js.native
  /* 1 */ val low: low with scala.Double = js.native
  /* 0 */ val muted: muted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel with scala.Double] = js.native
}

