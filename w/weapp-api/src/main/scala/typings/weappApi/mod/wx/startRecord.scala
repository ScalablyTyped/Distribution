package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("weapp-api", "wx.startRecord")
@js.native
object startRecord extends js.Object {
  
  /**
    * 开始录音。当主动调用wx.stopRecord，
    * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
    * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
    * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
    */
  def apply(options: StartRecordOptions): Unit = js.native
}
