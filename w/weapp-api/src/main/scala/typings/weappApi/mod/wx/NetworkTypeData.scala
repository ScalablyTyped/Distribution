package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.`2g`
import typings.weappApi.weappApiStrings.`3g`
import typings.weappApi.weappApiStrings.`4g`
import typings.weappApi.weappApiStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkTypeData extends js.Object {
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: `2g` | `3g` | `4g` | wifi = js.native
}

object NetworkTypeData {
  @scala.inline
  def apply(networkType: `2g` | `3g` | `4g` | wifi): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
  @scala.inline
  implicit class NetworkTypeDataOps[Self <: NetworkTypeData] (val x: Self) extends AnyVal {
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
    def setNetworkType(value: `2g` | `3g` | `4g` | wifi): Self = this.set("networkType", value.asInstanceOf[js.Any])
  }
  
}

