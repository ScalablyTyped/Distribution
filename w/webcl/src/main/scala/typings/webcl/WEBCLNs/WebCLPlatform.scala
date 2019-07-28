package typings.webcl.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.2
@js.native
trait WebCLPlatform extends js.Object {
  def enableExtension(extensionName: String): Boolean = js.native
  def getDevices(): js.Array[WebCLDevice] = js.native
  def getDevices(deviceType: DeviceTypeBits): js.Array[WebCLDevice] = js.native
  def getInfo(name: PlatformInfo): js.Any = js.native
  def getSupportedExtensions(): js.Array[String] = js.native
}

