package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SoundLevel extends js.Object

@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends js.Object {
  @js.native
  sealed trait full
    extends winrtLib.WindowsNs.MediaNs.SoundLevel
  
  @js.native
  sealed trait low
    extends winrtLib.WindowsNs.MediaNs.SoundLevel
  
  @js.native
  sealed trait muted
    extends winrtLib.WindowsNs.MediaNs.SoundLevel
  
  /* 2 */ val full: full with scala.Double = js.native
  /* 1 */ val low: low with scala.Double = js.native
  /* 0 */ val muted: muted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.SoundLevel with scala.Double] = js.native
}

