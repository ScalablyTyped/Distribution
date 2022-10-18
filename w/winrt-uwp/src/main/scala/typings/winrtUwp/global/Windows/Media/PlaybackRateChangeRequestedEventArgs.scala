package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackRateChangeRequested event. */
/* note: abstract class */ @JSGlobal("Windows.Media.PlaybackRateChangeRequestedEventArgs")
@js.native
open class PlaybackRateChangeRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.PlaybackRateChangeRequestedEventArgs {
  
  /** Gets the requested playback rate. */
  /* CompleteClass */
  var requestedPlaybackRate: Double = js.native
}
