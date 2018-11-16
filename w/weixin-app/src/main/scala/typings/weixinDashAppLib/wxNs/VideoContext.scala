package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频组件控制
@js.native
trait VideoContext extends js.Object {
   // 进入全屏
  /**
  		 * 退出全屏
  		 */
  def exitFullScreen(): scala.Unit = js.native
  /**
  		 * 暂停
  		 */
  def pause(): scala.Unit = js.native
  /**
  		 * 播放
  		 */
  def play(): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  def playbackRate(rate: weixinDashAppLib.weixinDashAppLibNumbers.`0DOT5`): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  def playbackRate(rate: weixinDashAppLib.weixinDashAppLibNumbers.`0DOT8`): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  def playbackRate(rate: weixinDashAppLib.weixinDashAppLibNumbers.`1DOT0`): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  def playbackRate(rate: weixinDashAppLib.weixinDashAppLibNumbers.`1DOT25`): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  def playbackRate(rate: weixinDashAppLib.weixinDashAppLibNumbers.`1DOT5`): scala.Unit = js.native
  /**
  		 *  进入全屏
  		 */
  def requestFullScreen(): scala.Unit = js.native
  /**
  		 *  进入全屏
  		 */
  def requestFullScreen(options: weixinDashAppLib.Anon_Direction): scala.Unit = js.native
  /**
  		 * 跳转到指定位置，单位 s
  		 */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
  		 * 发送弹幕，danmu 包含两个属性 text, color。
  		 */
  def sendDanmu(danmu: weixinDashAppLib.Anon_Text): scala.Unit = js.native
}

