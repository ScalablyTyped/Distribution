package typings.winrt.WindowsNs.SystemNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayRequest extends js.Object {
  def requestActive(): Unit
  def requestRelease(): Unit
}

object IDisplayRequest {
  @scala.inline
  def apply(requestActive: () => Unit, requestRelease: () => Unit): IDisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
  
    __obj.asInstanceOf[IDisplayRequest]
  }
}

