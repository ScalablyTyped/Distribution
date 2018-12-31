package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownLoadImageConfig extends js.Object {
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
    * serverId: 需要下载的图片的服务器端ID，由 uploadImage 接口获得
    */
  var serverId: java.lang.String
  /**
    * var localId = res.localId;  返回图片下载后的本地 ID
    */
  var success: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_LocalId, scala.Unit]] = js.undefined
}

