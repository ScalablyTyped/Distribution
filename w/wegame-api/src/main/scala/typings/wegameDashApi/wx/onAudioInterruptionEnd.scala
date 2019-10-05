package typings.wegameDashApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onAudioInterruptionEnd")
@js.native
object onAudioInterruptionEnd extends js.Object {
  /**
    * 监听音频中断结束，在收到 onAudioInterruptionBegin 事件之后，小程序内所有音频会暂停，收到此事件之后才可再次播放成功
    */
  def apply(cb: js.Function0[Unit]): Unit = js.native
}

