package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
@js.native
trait MediaCueEventArgs extends StObject {
  
  /** Gets the cue that triggered the event. */
  var cue: IMediaCue = js.native
}
object MediaCueEventArgs {
  
  @scala.inline
  def apply(cue: IMediaCue): MediaCueEventArgs = {
    val __obj = js.Dynamic.literal(cue = cue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCueEventArgs]
  }
  
  @scala.inline
  implicit class MediaCueEventArgsMutableBuilder[Self <: MediaCueEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCue(value: IMediaCue): Self = StObject.set(x, "cue", value.asInstanceOf[js.Any])
  }
}
