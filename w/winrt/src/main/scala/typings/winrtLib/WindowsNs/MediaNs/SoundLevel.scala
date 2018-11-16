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
  
  val full: full with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val muted: muted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.SoundLevel with java.lang.String] = js.native
}

