package typings.winrtDashUwp.WindowsNs.MediaNs

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
  sealed trait full extends SoundLevel
  
  /** The sound level is low. */
  @js.native
  sealed trait low extends SoundLevel
  
  /** The sound level is muted. */
  @js.native
  sealed trait muted extends SoundLevel
  
  /* 2 */ val full: typings.winrtDashUwp.WindowsNs.MediaNs.SoundLevel.full with Double = js.native
  /* 1 */ val low: typings.winrtDashUwp.WindowsNs.MediaNs.SoundLevel.low with Double = js.native
  /* 0 */ val muted: typings.winrtDashUwp.WindowsNs.MediaNs.SoundLevel.muted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SoundLevel with Double] = js.native
}

