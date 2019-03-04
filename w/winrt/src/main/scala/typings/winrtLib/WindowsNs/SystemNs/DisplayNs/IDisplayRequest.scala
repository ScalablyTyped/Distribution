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
  def apply(requestActive: js.Function0[scala.Unit], requestRelease: js.Function0[scala.Unit]): IDisplayRequest = {
    val __obj = js.Dynamic.literal(requestActive = requestActive, requestRelease = requestRelease)
  
    __obj.asInstanceOf[IDisplayRequest]
  }
}

