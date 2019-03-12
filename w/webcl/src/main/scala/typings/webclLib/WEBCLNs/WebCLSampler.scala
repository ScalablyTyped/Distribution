package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.7
trait WebCLSampler extends js.Object {
  def getInfo(name: SamplerInfo): js.Any
  def release(): scala.Unit
}

object WebCLSampler {
  @scala.inline
  def apply(getInfo: SamplerInfo => js.Any, release: () => scala.Unit): WebCLSampler = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[WebCLSampler]
  }
}

