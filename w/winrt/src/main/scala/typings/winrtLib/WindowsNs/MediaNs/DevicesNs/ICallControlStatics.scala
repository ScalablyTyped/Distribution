package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControlStatics extends js.Object {
  def fromId(deviceInterfaceId: java.lang.String): CallControl
  def getDefault(): CallControl
}

object ICallControlStatics {
  @scala.inline
  def apply(fromId: js.Function1[java.lang.String, CallControl], getDefault: js.Function0[CallControl]): ICallControlStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(fromId)
    __obj.updateDynamic("getDefault")(getDefault)
    __obj.asInstanceOf[ICallControlStatics]
  }
}

