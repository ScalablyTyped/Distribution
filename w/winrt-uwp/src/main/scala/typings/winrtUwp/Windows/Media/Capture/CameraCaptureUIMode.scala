package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMode extends js.Object

/** Determines whether the user interface for capturing from the attached camera allows capture of photos, videos, or both photos and videos. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  /** The user can only capture a photo. */
  @js.native
  sealed trait photo extends CameraCaptureUIMode
  
  /** Either a photo or video can be captured. */
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  /** The user can only capture a video. */
  @js.native
  sealed trait video extends CameraCaptureUIMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMode with Double] = js.native
  /* 1 */ @js.native
  object photo extends TopLevel[photo with Double]
  
  /* 0 */ @js.native
  object photoOrVideo extends TopLevel[photoOrVideo with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

