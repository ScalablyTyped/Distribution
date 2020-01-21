package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cImageCapture.w3cImageCaptureStrings.none
  - typings.w3cImageCapture.w3cImageCaptureStrings.manual
  - typings.w3cImageCapture.w3cImageCaptureStrings.`single-shot`
  - typings.w3cImageCapture.w3cImageCaptureStrings.continuous
*/
trait MeteringMode extends js.Object

object MeteringMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def continuous: typings.w3cImageCapture.w3cImageCaptureStrings.continuous = this.cast("continuous")
  @scala.inline
  def manual: typings.w3cImageCapture.w3cImageCaptureStrings.manual = this.cast("manual")
  @scala.inline
  def none: typings.w3cImageCapture.w3cImageCaptureStrings.none = this.cast("none")
  @scala.inline
  def `single-shot`: typings.w3cImageCapture.w3cImageCaptureStrings.`single-shot` = this.cast("single-shot")
}

