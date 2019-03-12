package typings
package winrtLib.WindowsNs.SystemNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayRequest extends js.Object {
  def requestActive(): scala.Unit
  def requestRelease(): scala.Unit
}

object IDisplayRequest {
  @scala.inline
  def apply(requestActive: () => scala.Unit, requestRelease: () => scala.Unit): IDisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
  
    __obj.asInstanceOf[IDisplayRequest]
  }
}

