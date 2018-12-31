package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait downloadVoiceConfig extends js.Object {
  /**
    * 默认为1，显示进度提示
    */
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
    * 需要下载的音频的服务器端 ID，由 uploadVoice 接口获得
    */
  var serverId: java.lang.String
  /**
    * 下载成功回调
    */
  def success(res: js.Any): scala.Unit
}

