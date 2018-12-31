package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocalImgDataConfig extends js.Object {
  /**
    * 图片的 localID
    */
  var localId: java.lang.String
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  def success(res: wxDashJsDashSdkDashDtLib.Anon_LocalData): scala.Unit
}

