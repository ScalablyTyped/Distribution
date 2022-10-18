package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video track. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.VideoTrack")
@js.native
open class VideoTrack ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.VideoTrack {
  
  /** Gets or sets the identifier for the video track. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets or sets the label for the video track. */
  /* CompleteClass */
  var label: String = js.native
  
  /** Gets or sets a string indicating the language of the video track. */
  /* CompleteClass */
  var language: String = js.native
  
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  /* CompleteClass */
  var trackKind: typings.winrtUwp.Windows.Media.Core.MediaTrackKind = js.native
}
