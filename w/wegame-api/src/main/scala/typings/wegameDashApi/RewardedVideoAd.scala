package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RewardedVideoAd")
@js.native
class RewardedVideoAd () extends BannerAd {
  /**
    * 加载视频广告
    */
  def load(): js.Promise[Unit] = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def offClose(callback: js.Function1[/* res */ Anon_IsEnded, Unit]): Unit = js.native
  /**
    * 监听用户点击 关闭广告 按钮的事件
    */
  def onClose(callback: js.Function1[/* res */ Anon_IsEnded, Unit]): Unit = js.native
}

