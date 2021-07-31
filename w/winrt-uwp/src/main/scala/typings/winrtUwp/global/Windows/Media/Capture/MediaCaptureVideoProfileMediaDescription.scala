package typings.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a description of media that is supported by a video profile. */
@JSGlobal("Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription")
@js.native
abstract class MediaCaptureVideoProfileMediaDescription ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription {
  
  /** Gets the frame rate of the media description. */
  /* CompleteClass */
  var frameRate: Double = js.native
  
  /** Gets the height of the media description. */
  /* CompleteClass */
  var height: Double = js.native
  
  /** Gets a value indicating if the media description includes HDR video support. */
  /* CompleteClass */
  var isHdrVideoSupported: Boolean = js.native
  
  /** Gets a value indicating if the media description includes variable photo sequence support. */
  /* CompleteClass */
  var isVariablePhotoSequenceSupported: Boolean = js.native
  
  /** Gets the height of the media description. */
  /* CompleteClass */
  var width: Double = js.native
}
