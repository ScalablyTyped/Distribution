package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastingPlaybackTypes extends js.Object

/** Indicates the capabilities of a particular casting device. */
@JSGlobal("Windows.Media.Casting.CastingPlaybackTypes")
@js.native
object CastingPlaybackTypes extends js.Object {
  /** The casting device supports audio playback. */
  @js.native
  sealed trait audio
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes
  
  /** The casting device does not support playback. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes
  
  /** The casting device supports image playback. */
  @js.native
  sealed trait picture
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes
  
  /** The casting device supports video playback. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes
  
  val audio: audio with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val picture: picture with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes with java.lang.String
  ] = js.native
}

