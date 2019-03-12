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
    fromId: java.lang.String => winrtLib.WindowsNs.StorageNs.StorageFolder,
    getDeviceSelector: () => java.lang.String
  ): IStorageDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
  
    __obj.asInstanceOf[IStorageDeviceStatics]
  }
}

