package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.2
trait WebCLImage extends WebCLMemoryObject {
  def getInfo(): WebCLImageDescriptor
}

object WebCLImage {
  @scala.inline
  def apply(getInfo: js.Function0[WebCLImageDescriptor], release: js.Function0[scala.Unit]): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = getInfo, release = release)
  
    __obj.asInstanceOf[WebCLImage]
  }
}

