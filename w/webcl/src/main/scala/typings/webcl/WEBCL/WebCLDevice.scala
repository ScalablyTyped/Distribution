package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.3
@js.native
trait WebCLDevice extends js.Object {
  def enableExtension(extensionName: String): Boolean = js.native
  def getInfo(name: DeviceInfo): js.Any = js.native
  def getSupportedExtensions(): js.Array[String] = js.native
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
  @scala.inline
  implicit class WebCLDeviceOps[Self <: WebCLDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableExtension(value: String => Boolean): Self = this.set("enableExtension", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInfo(value: DeviceInfo => js.Any): Self = this.set("getInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSupportedExtensions(value: () => js.Array[String]): Self = this.set("getSupportedExtensions", js.Any.fromFunction0(value))
  }
  
}

