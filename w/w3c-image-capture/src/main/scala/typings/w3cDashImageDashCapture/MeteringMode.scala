package typings.w3cDashImageDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.none
  - typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.manual
  - typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.`single-shot`
  - typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.continuous
*/
trait MeteringMode extends js.Object

object MeteringMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def continuous: typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.continuous = this.cast("continuous")
  @scala.inline
  def manual: typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.manual = this.cast("manual")
  @scala.inline
  def none: typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.none = this.cast("none")
  @scala.inline
  def `single-shot`: typings.w3cDashImageDashCapture.w3cDashImageDashCaptureStrings.`single-shot` = this.cast("single-shot")
}

