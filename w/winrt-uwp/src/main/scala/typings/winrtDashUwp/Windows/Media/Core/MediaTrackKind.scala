package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaTrackKind extends js.Object

/** Specifies the type of a media track. */
@JSGlobal("Windows.Media.Core.MediaTrackKind")
@js.native
object MediaTrackKind extends js.Object {
  /** The track is an audio track. */
  @js.native
  sealed trait audio extends MediaTrackKind
  
  /** The track is a timed metadata track. */
  @js.native
  sealed trait timedMetadata extends MediaTrackKind
  
  /** The track is a video track. */
  @js.native
  sealed trait video extends MediaTrackKind
  
  /* 0 */ val audio: typings.winrtDashUwp.Windows.Media.Core.MediaTrackKind.audio with Double = js.native
  /* 2 */ val timedMetadata: typings.winrtDashUwp.Windows.Media.Core.MediaTrackKind.timedMetadata with Double = js.native
  /* 1 */ val video: typings.winrtDashUwp.Windows.Media.Core.MediaTrackKind.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaTrackKind with Double] = js.native
}

