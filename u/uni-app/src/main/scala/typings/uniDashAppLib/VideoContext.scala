package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContext extends js.Object {
  /**
    * 退出全屏
    */
  def exitFullScreen(): scala.Unit
  /**
    * 暂停
    */
  def pause(): scala.Unit
  /**
    * 播放
    */
  def play(): scala.Unit
  /**
    * 设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(): scala.Unit
  /**
    * 进入全屏，可传入{direction}参数（1.7.0起支持），详见video组件文档
    */
  def requestFullScreen(): scala.Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): scala.Unit
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(): scala.Unit
}

object VideoContext {
  @scala.inline
  def apply(
    exitFullScreen: () => scala.Unit,
    pause: () => scala.Unit,
    play: () => scala.Unit,
    playbackRate: () => scala.Unit,
    requestFullScreen: () => scala.Unit,
    seek: () => scala.Unit,
    sendDanmu: () => scala.Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction0(playbackRate), requestFullScreen = js.Any.fromFunction0(requestFullScreen), seek = js.Any.fromFunction0(seek), sendDanmu = js.Any.fromFunction0(sendDanmu))
  
    __obj.asInstanceOf[VideoContext]
  }
}

