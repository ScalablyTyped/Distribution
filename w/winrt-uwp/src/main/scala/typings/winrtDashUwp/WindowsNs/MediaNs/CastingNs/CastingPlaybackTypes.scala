package typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs

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
  sealed trait audio extends CastingPlaybackTypes
  
  /** The casting device does not support playback. */
  @js.native
  sealed trait none extends CastingPlaybackTypes
  
  /** The casting device supports image playback. */
  @js.native
  sealed trait picture extends CastingPlaybackTypes
  
  /** The casting device supports video playback. */
  @js.native
  sealed trait video extends CastingPlaybackTypes
  
  /* 1 */ val audio: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes.audio with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes.none with Double = js.native
  /* 3 */ val picture: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes.picture with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.CastingNs.CastingPlaybackTypes.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CastingPlaybackTypes with Double] = js.native
}

