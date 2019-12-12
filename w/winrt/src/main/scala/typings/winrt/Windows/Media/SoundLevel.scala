package typings.winrt.Windows.Media

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.SoundLevel.full
import typings.winrt.Windows.Media.SoundLevel.low
import typings.winrt.Windows.Media.SoundLevel.muted
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SoundLevel with Double] = js.native
  /* 2 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 1 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 0 */ @js.native
  object muted extends TopLevel[muted with Double]
  
}

