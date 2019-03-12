package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.3
trait WebCLDevice extends js.Object {
  def enableExtension(extensionName: java.lang.String): scala.Boolean
  def getInfo(name: DeviceInfo): js.Any
  def getSupportedExtensions(): js.Array[java.lang.String]
}

object WebCLDevice {
  @scala.inline
  def apply(
    enableExtension: java.lang.String => scala.Boolean,
    getInfo: DeviceInfo => js.Any,
    getSupportedExtensions: () => js.Array[java.lang.String]
  ): WebCLDevice = {
    val __obj = js.Dynamic.literal(enableExtension = js.Any.fromFunction1(enableExtension), getInfo = js.Any.fromFunction1(getInfo), getSupportedExtensions = js.Any.fromFunction0(getSupportedExtensions))
  
    __obj.asInstanceOf[WebCLDevice]
  }
}

