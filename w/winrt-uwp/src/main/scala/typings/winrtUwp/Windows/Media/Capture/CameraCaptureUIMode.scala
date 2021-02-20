package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMode extends StObject
/** Determines whether the user interface for capturing from the attached camera allows capture of photos, videos, or both photos and videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends StObject {
  
  /** The user can only capture a photo. */
  @js.native
  sealed trait photo extends CameraCaptureUIMode
  
  /** Either a photo or video can be captured. */
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  /** The user can only capture a video. */
  @js.native
  sealed trait video extends CameraCaptureUIMode
}
