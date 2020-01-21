package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cImageCapture.w3cImageCaptureStrings.never
  - typings.w3cImageCapture.w3cImageCaptureStrings.always
  - typings.w3cImageCapture.w3cImageCaptureStrings.controllable
*/
trait RedEyeReduction extends js.Object

object RedEyeReduction {
  @scala.inline
  def always: typings.w3cImageCapture.w3cImageCaptureStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controllable: typings.w3cImageCapture.w3cImageCaptureStrings.controllable = this.cast("controllable")
  @scala.inline
  def never: typings.w3cImageCapture.w3cImageCaptureStrings.never = this.cast("never")
}

