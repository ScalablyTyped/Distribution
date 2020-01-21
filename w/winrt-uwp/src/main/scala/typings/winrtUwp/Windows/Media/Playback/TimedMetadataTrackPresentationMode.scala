package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataTrackPresentationMode with Double] = js.native
  /* 2 */ @js.native
  object applicationPresented extends TopLevel[applicationPresented with Double]
  
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 3 */ @js.native
  object platformPresented extends TopLevel[platformPresented with Double]
  
}

