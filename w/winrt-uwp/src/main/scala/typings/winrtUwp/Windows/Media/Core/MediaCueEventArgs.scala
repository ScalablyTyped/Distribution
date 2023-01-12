package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
trait MediaCueEventArgs extends StObject {
  
  /** Gets the cue that triggered the event. */
  var cue: IMediaCue
}
object MediaCueEventArgs {
  
  inline def apply(cue: IMediaCue): MediaCueEventArgs = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCueEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaCueEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCue(value: IMediaCue): Self = StObject.set(x, "cue", value.asInstanceOf[js.Any])
  }
}
