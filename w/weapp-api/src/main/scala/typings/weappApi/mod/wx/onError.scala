package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx.onError")
@js.native
object onError extends js.Object {
  /**
    * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 App.onError 的回调时机与参数一致。
    */
  def apply(): ErrorCallback = js.native
}

