package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weapp-api", "wx.playVoice")
@js.native
object playVoice extends js.Object {
  
  /**
    * 开始播放语音，同时只允许一个语音文件正在播放，
    * 如果前一个语音文件还没播放完，将中断前一个语音播放。
    */
  def apply(options: PlayVoiceOptions): Unit = js.native
}
