package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.`2g`
import typings.weappApi.weappApiStrings.`3g`
import typings.weappApi.weappApiStrings.`4g`
import typings.weappApi.weappApiStrings.wifi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkTypeData extends js.Object {
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: `2g` | `3g` | `4g` | wifi
}

object NetworkTypeData {
  @scala.inline
  def apply(networkType: `2g` | `3g` | `4g` | wifi): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
}

