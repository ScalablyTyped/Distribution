package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Capture.PhotoCaptureSource.auto
import typings.winrtDashUwp.Windows.Media.Capture.PhotoCaptureSource.photo
import typings.winrtDashUwp.Windows.Media.Capture.PhotoCaptureSource.videoPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoCaptureSource extends js.Object

/** Specifies which stream on a video camera is used to capture photos. */
@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  /** Automatically select the stream. */
  @js.native
  sealed trait auto extends PhotoCaptureSource
  
  /** Use the photo stream. */
  @js.native
  sealed trait photo extends PhotoCaptureSource
  
  /** Use the video stream. */
  @js.native
  sealed trait videoPreview extends PhotoCaptureSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoCaptureSource with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 2 */ @js.native
  object photo extends TopLevel[photo with Double]
  
  /* 1 */ @js.native
  object videoPreview extends TopLevel[videoPreview with Double]
  
}

