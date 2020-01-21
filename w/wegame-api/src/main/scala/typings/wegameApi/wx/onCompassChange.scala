package typings.wegameApi.wx

import typings.wegameApi.AnonDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onCompassChange")
@js.native
object onCompassChange extends js.Object {
  // --罗盘
  /**
    * 监听罗盘数据，频率：5 次/秒，接口调用后会自动开始监听，可使用 wx.stopCompass 停止监听。
    * @param cb.res.direction 面对的方向度数
    */
  def apply(cb: js.Function1[/* res */ AnonDirection, Unit]): Unit = js.native
}

