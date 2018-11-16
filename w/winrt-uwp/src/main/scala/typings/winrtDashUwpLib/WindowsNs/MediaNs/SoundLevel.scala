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
  
  val full: full with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val muted: muted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.SoundLevel with java.lang.String] = js.native
}

