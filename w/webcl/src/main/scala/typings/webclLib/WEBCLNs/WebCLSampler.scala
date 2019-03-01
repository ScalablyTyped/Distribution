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
  def apply(getInfo: js.Function1[SamplerInfo, js.Any], release: js.Function0[scala.Unit]): WebCLSampler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[WebCLSampler]
  }
}

