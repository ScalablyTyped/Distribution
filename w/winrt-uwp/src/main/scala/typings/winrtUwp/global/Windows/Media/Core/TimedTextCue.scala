package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a text cue in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedTextCue")
@js.native
/** Initializes a new instance of the TimedTextCue class. */
class TimedTextCue ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedTextCue {
  
  /** Gets or sets the TimedTextRegion of the cue, which defines the style of the rendering area for the cue. */
  /* CompleteClass */
  var cueRegion: typings.winrtUwp.Windows.Media.Core.TimedTextRegion = js.native
  
  /** Gets or sets the TimedTextStyle of the cue, which defines the style of the rendered text. */
  /* CompleteClass */
  var cueStyle: typings.winrtUwp.Windows.Media.Core.TimedTextStyle = js.native
  
  /** Gets or sets the duration of the cue. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets or sets an identifier for the cue. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the collection of TimedTextLine objects that convey the text of the cue. */
  /* CompleteClass */
  var lines: IVector[typings.winrtUwp.Windows.Media.Core.TimedTextLine] = js.native
  
  /** Gets the start time of the cue. */
  /* CompleteClass */
  var startTime: Double = js.native
}
