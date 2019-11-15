package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onGyroscopeChange")
@js.native
object onGyroscopeChange extends js.Object {
  /**
    * 监听陀螺仪数据变化事件。频率根据 wx.startGyroscope() 的 interval 参数。可以使用 wx.stopGyroscope() 停止监听。
    * @param callback 监听函数
    */
  def apply(callback: js.Function1[/* res */ Anon_X, Unit]): Unit = js.native
}

