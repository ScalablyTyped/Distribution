package typings.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoCaptureSource extends js.Object

@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  @js.native
  sealed trait auto extends PhotoCaptureSource
  
  @js.native
  sealed trait photo extends PhotoCaptureSource
  
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

