package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SoundLevel with Double] = js.native
  /* 2 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 1 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 0 */ @js.native
  object muted extends TopLevel[muted with Double]
  
}

