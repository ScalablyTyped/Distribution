package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.2
trait WebCLImage extends WebCLMemoryObject {
  def getInfo(): WebCLImageDescriptor
}

object WebCLImage {
  @scala.inline
  def apply(getInfo: () => WebCLImageDescriptor, release: () => Unit): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLImage]
  }
}

