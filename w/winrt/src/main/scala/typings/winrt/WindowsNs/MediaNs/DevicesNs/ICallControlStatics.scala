package typings.winrt.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControlStatics extends js.Object {
  def fromId(deviceInterfaceId: String): CallControl
  def getDefault(): CallControl
}

object ICallControlStatics {
  @scala.inline
  def apply(fromId: String => CallControl, getDefault: () => CallControl): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[ICallControlStatics]
  }
}

