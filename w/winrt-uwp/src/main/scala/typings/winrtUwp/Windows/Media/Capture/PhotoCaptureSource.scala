package typings.winrtUwp.Windows.Media.Capture

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
  
}

