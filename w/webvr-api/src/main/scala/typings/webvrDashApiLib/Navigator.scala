package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
}

object Navigator {
  @scala.inline
  def apply(
    activeVRDisplays: js.Array[VRDisplay],
    getVRDisplays: js.Function0[js.Promise[js.Array[VRDisplay]]]
  ): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeVRDisplays")(activeVRDisplays)
    __obj.updateDynamic("getVRDisplays")(getVRDisplays)
    __obj.asInstanceOf[Navigator]
  }
}

