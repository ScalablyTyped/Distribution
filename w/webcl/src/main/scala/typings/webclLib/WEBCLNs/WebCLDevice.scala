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
    enableExtension: js.Function1[java.lang.String, scala.Boolean],
    getInfo: js.Function1[DeviceInfo, js.Any],
    getSupportedExtensions: js.Function0[js.Array[java.lang.String]]
  ): WebCLDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableExtension")(enableExtension)
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("getSupportedExtensions")(getSupportedExtensions)
    __obj.asInstanceOf[WebCLDevice]
  }
}

