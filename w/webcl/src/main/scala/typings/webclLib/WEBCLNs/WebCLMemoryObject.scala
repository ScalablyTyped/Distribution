package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6
trait WebCLMemoryObject extends js.Object {
  def getInfo(name: MemInfo): js.Any
  def release(): scala.Unit
}

object WebCLMemoryObject {
  @scala.inline
  def apply(getInfo: js.Function1[MemInfo, js.Any], release: js.Function0[scala.Unit]): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = getInfo, release = release)
  
    __obj.asInstanceOf[WebCLMemoryObject]
  }
}

