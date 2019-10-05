package typings.wegameDashApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.offAudioInterruptionBegin")
@js.native
object offAudioInterruptionBegin extends js.Object {
  /**
    * 取消监听音频因为受到系统占用而被中断开始，以下场景会触发此事件：闹钟、电话、FaceTime 通话、微信语音聊天、微信视频聊天。此事件触发后，小程序内所有音频会暂停。
    */
  def apply(cb: js.Function0[Unit]): Unit = js.native
}

