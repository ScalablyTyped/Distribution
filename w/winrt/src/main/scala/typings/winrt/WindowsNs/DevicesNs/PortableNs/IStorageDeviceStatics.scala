package typings.winrt.WindowsNs.DevicesNs.PortableNs

import typings.winrt.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageDeviceStatics extends js.Object {
  def fromId(interfaceId: String): StorageFolder
  def getDeviceSelector(): String
}

object IStorageDeviceStatics {
  @scala.inline
  def apply(fromId: String => StorageFolder, getDeviceSelector: () => String): IStorageDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
  
    __obj.asInstanceOf[IStorageDeviceStatics]
  }
}

