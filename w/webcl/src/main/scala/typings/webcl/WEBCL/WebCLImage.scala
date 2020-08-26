package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.2
@js.native
trait WebCLImage extends WebCLMemoryObject {
  def getInfo(): WebCLImageDescriptor = js.native
}

object WebCLImage {
  @scala.inline
  def apply(getInfo: () => WebCLImageDescriptor, release: () => Unit): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLImage]
  }
  @scala.inline
  implicit class WebCLImageOps[Self <: WebCLImage] (val x: Self) extends AnyVal {
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
    def setGetInfo(value: () => WebCLImageDescriptor): Self = this.set("getInfo", js.Any.fromFunction0(value))
  }
  
}

