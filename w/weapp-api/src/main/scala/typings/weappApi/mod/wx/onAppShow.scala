package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx.onAppShow")
@js.native
object onAppShow extends js.Object {
  /**
    * 监听小程序切前台事件。该事件与 App.onShow 的回调参数一致。
    * @param callback
    */
  def apply(callback: onShowOptions): Unit = js.native
}

