package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.3
trait WebCLDevice extends js.Object {
  def enableExtension(extensionName: String): Boolean
  def getInfo(name: DeviceInfo): js.Any
  def getSupportedExtensions(): js.Array[String]
}

object WebCLDevice {
  @scala.inline
  def apply(
    enableExtension: String => Boolean,
    getInfo: DeviceInfo => js.Any,
    getSupportedExtensions: () => js.Array[String]
  ): WebCLDevice = {
    val __obj = js.Dynamic.literal(enableExtension = js.Any.fromFunction1(enableExtension), getInfo = js.Any.fromFunction1(getInfo), getSupportedExtensions = js.Any.fromFunction0(getSupportedExtensions))
    __obj.asInstanceOf[WebCLDevice]
  }
}

