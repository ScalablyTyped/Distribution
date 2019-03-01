package typings
package winrtLib.WindowsNs.SystemNs.RemoteDesktopNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInteractiveSessionStatics extends js.Object {
  var isRemote: scala.Boolean
}

object IInteractiveSessionStatics {
  @scala.inline
  def apply(isRemote: scala.Boolean): IInteractiveSessionStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRemote")(isRemote)
    __obj.asInstanceOf[IInteractiveSessionStatics]
  }
}

