package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.pauseVoice")
@js.native
object pauseVoice extends js.Object {
  /**
  	 * 暂停正在播放的语音。
  	 * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
  	 * 如果想从头开始播放，需要先调用 wx.stopVoice。
  	 * @deprecated 1.6.0
  	 */
  def apply(): Unit = js.native
}

