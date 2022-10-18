package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of input and output VideoEncodingProperties for a video stream */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.VideoStreamConfiguration")
@js.native
open class VideoStreamConfiguration ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.VideoStreamConfiguration {
  
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  /* CompleteClass */
  var inputProperties: VideoEncodingProperties = js.native
  
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  /* CompleteClass */
  var outputProperties: VideoEncodingProperties = js.native
}
