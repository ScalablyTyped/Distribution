package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an audio track. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.AudioTrack")
@js.native
open class AudioTrack ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.AudioTrack {
  
  /** Gets or sets the identifier for the audio track. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets or sets the label for the audio track. */
  /* CompleteClass */
  var label: String = js.native
  
  /** Gets or sets a string indicating the language of the audio track. */
  /* CompleteClass */
  var language: String = js.native
  
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  /* CompleteClass */
  var trackKind: typings.winrtUwp.Windows.Media.Core.MediaTrackKind = js.native
}
