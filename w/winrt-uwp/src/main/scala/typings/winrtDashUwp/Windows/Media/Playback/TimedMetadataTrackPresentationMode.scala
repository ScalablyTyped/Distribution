package typings.winrtDashUwp.Windows.Media.Playback

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
  sealed trait applicationPresented extends TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is not displayed and does not generate events. */
  @js.native
  sealed trait disabled extends TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is hidden, but continues to generate events. */
  @js.native
  sealed trait hidden extends TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is presented by the platform. */
  @js.native
  sealed trait platformPresented extends TimedMetadataTrackPresentationMode
  
  /* 2 */ val applicationPresented: typings.winrtDashUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.applicationPresented with Double = js.native
  /* 0 */ val disabled: typings.winrtDashUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.disabled with Double = js.native
  /* 1 */ val hidden: typings.winrtDashUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.hidden with Double = js.native
  /* 3 */ val platformPresented: typings.winrtDashUwp.Windows.Media.Playback.TimedMetadataTrackPresentationMode.platformPresented with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataTrackPresentationMode with Double] = js.native
}

