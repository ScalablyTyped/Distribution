package typings.winrt.Windows.Devices.Portable

import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Portable.StorageDevice")
@js.native
class StorageDevice () extends js.Object

/* static members */
@JSGlobal("Windows.Devices.Portable.StorageDevice")
@js.native
object StorageDevice extends js.Object {
  def fromId(interfaceId: String): StorageFolder = js.native
  def getDeviceSelector(): String = js.native
}

