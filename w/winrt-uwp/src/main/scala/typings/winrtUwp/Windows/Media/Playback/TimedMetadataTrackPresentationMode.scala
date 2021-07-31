package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedMetadataTrackPresentationMode extends StObject
/** Specifies the presentation mode of a timed metadata track. */
@JSGlobal("Windows.Media.Playback.TimedMetadataTrackPresentationMode")
@js.native
object TimedMetadataTrackPresentationMode extends StObject {
  
  /** The timed metadata track is presented by the app. */
  @js.native
  sealed trait applicationPresented
    extends StObject
       with TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is not displayed and does not generate events. */
  @js.native
  sealed trait disabled
    extends StObject
       with TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is hidden, but continues to generate events. */
  @js.native
  sealed trait hidden
    extends StObject
       with TimedMetadataTrackPresentationMode
  
  /** The timed metadata track is presented by the platform. */
  @js.native
  sealed trait platformPresented
    extends StObject
       with TimedMetadataTrackPresentationMode
}
