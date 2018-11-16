package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RewardedVideoAd")
@js.native
class RewardedVideoAd () extends BannerAd {
  /**
       * 加载视频广告
       */
  def load(): stdLib.Promise[scala.Unit] = js.native
  /**
       * 监听用户点击 关闭广告 按钮的事件
       */
  def offClose(callback: js.Function1[/* res */ Anon_IsEnded, scala.Unit]): scala.Unit = js.native
  /**
       * 监听用户点击 关闭广告 按钮的事件
       */
  def onClose(callback: js.Function1[/* res */ Anon_IsEnded, scala.Unit]): scala.Unit = js.native
}

