package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6
@js.native
trait WebCLMemoryObject extends js.Object {
  def getInfo(name: MemInfo): js.Any = js.native
  def release(): Unit = js.native
}

object WebCLMemoryObject {
  @scala.inline
  def apply(getInfo: MemInfo => js.Any, release: () => Unit): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLMemoryObject]
  }
  @scala.inline
  implicit class WebCLMemoryObjectOps[Self <: WebCLMemoryObject] (val x: Self) extends AnyVal {
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
    def setGetInfo(value: MemInfo => js.Any): Self = this.set("getInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
  }
  
}

