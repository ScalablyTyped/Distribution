package typings.winrt.Windows.System.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayRequest extends IDisplayRequest

object DisplayRequest {
  @scala.inline
  def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
    __obj.asInstanceOf[DisplayRequest]
  }
}

