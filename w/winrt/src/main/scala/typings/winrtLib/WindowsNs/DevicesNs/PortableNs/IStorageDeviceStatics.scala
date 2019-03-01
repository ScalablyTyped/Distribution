package typings
package winrtLib.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageDeviceStatics extends js.Object {
  def fromId(interfaceId: java.lang.String): winrtLib.WindowsNs.StorageNs.StorageFolder
  def getDeviceSelector(): java.lang.String
}

object IStorageDeviceStatics {
  @scala.inline
  def apply(
    fromId: js.Function1[java.lang.String, winrtLib.WindowsNs.StorageNs.StorageFolder],
    getDeviceSelector: js.Function0[java.lang.String]
  ): IStorageDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(fromId)
    __obj.updateDynamic("getDeviceSelector")(getDeviceSelector)
    __obj.asInstanceOf[IStorageDeviceStatics]
  }
}

