package typings.winrt.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoundLevel extends js.Object

@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends js.Object {
  @js.native
  sealed trait full extends SoundLevel
  
  @js.native
  sealed trait low extends SoundLevel
  
  @js.native
  sealed trait muted extends SoundLevel
  
  /* 2 */ val full: typings.winrt.WindowsNs.MediaNs.SoundLevel.full with Double = js.native
  /* 1 */ val low: typings.winrt.WindowsNs.MediaNs.SoundLevel.low with Double = js.native
  /* 0 */ val muted: typings.winrt.WindowsNs.MediaNs.SoundLevel.muted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SoundLevel with Double] = js.native
}

