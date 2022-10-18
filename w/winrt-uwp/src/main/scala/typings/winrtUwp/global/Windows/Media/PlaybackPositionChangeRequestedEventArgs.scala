package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackPositionChangeRequested event. */
/* note: abstract class */ @JSGlobal("Windows.Media.PlaybackPositionChangeRequestedEventArgs")
@js.native
open class PlaybackPositionChangeRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.PlaybackPositionChangeRequestedEventArgs {
  
  /** Gets a value indicating the requested offset into the media item. */
  /* CompleteClass */
  var requestedPlaybackPosition: Double = js.native
}
