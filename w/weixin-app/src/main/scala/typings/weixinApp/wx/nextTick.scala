package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.nextTick")
@js.native
object nextTick extends js.Object {
  /**
  	 * 用于延迟一部分操作到下一个时间片再执行（类似于 setTimeout）。
  	 * @param func
  	 * @version 2.2.3
  	 */
  def apply(func: js.Function0[_]): Unit = js.native
}

