package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onCompassChange")
@js.native
object onCompassChange extends js.Object {
  /**
  	 * 监听罗盘数据，频率：5次/秒，接口调用后会自动开始监听，可使用wx.stopCompass停止监听。
  	 */
  def apply(callback: CompassChangeCallback): Unit = js.native
}

