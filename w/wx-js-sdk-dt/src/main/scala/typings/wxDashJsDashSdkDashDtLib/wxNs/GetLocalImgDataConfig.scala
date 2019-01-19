package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalImgDataConfig extends WxBaseRequestConfig {
  /**
    * 图片的 localID
    */
  var localId: java.lang.String
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: wxDashJsDashSdkDashDtLib.Anon_LocalData): scala.Unit
}

