package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.TimedMetadataTrackFailedEventArgs")
@js.native
open class TimedMetadataTrackFailedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackFailedEventArgs {
  
  /** Gets an object representing the error that occurred with the timed metadata track. */
  /* CompleteClass */
  var error: typings.winrtUwp.Windows.Media.Core.TimedMetadataTrackError = js.native
}
