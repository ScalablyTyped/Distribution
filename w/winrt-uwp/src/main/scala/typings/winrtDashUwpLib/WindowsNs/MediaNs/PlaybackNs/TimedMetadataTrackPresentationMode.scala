package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedMetadataTrackPresentationMode extends js.Object

/** Specifies the presentation mode of a timed metadata track. */
@JSGlobal("Windows.Media.Playback.TimedMetadataTrackPresentationMode")
@js.native
object TimedMetadataTrackPresentationMode extends js.Object {
  /** The timed metadata track is presented by the app. */
  @js.native
  sealed trait applicationPresented
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is not displayed and does not generate events. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is hidden, but continues to generate events. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is presented by the platform. */
  @js.native
  sealed trait platformPresented
    extends winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.TimedMetadataTrackPresentationMode
  
  /* 2 */ val applicationPresented: applicationPresented with scala.Double = js.native
  /* 0 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 3 */ val platformPresented: platformPresented with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs.TimedMetadataTrackPresentationMode with scala.Double
  ] = js.native
}

