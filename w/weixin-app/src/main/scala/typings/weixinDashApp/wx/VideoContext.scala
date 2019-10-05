package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_0
import typings.weixinDashApp.Anon_Color
import typings.weixinDashApp.weixinDashAppNumbers.`0DOT5`
import typings.weixinDashApp.weixinDashAppNumbers.`0DOT8`
import typings.weixinDashApp.weixinDashAppNumbers.`1DOT0`
import typings.weixinDashApp.weixinDashAppNumbers.`1DOT25`
import typings.weixinDashApp.weixinDashAppNumbers.`1DOT5`
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
  def exitFullScreen(): Unit = js.native
  /**
  		 * 暂停
  		 */
  def pause(): Unit = js.native
  /**
  		 * 播放
  		 */
  def play(): Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  @JSName("playbackRate")
  def playbackRate_05(rate: `0DOT5`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_08(rate: `0DOT8`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_10(rate: `1DOT0`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_125(rate: `1DOT25`): Unit = js.native
  @JSName("playbackRate")
  def playbackRate_15(rate: `1DOT5`): Unit = js.native
  /**
  		 *  进入全屏
  		 */
  def requestFullScreen(): Unit = js.native
  def requestFullScreen(options: Anon_0): Unit = js.native
  /**
  		 * 跳转到指定位置，单位 s
  		 */
  def seek(position: Double): Unit = js.native
  /**
  		 * 发送弹幕，danmu 包含两个属性 text, color。
  		 */
  def sendDanmu(danmu: Anon_Color): Unit = js.native
}

