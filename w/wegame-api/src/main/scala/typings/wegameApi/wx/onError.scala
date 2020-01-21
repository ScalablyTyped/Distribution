package typings.wegameApi.wx

import typings.wegameApi.AnonMessageStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onError")
@js.native
object onError extends js.Object {
  /**
    * 监听全局错误事件
    */
  def apply(cb: js.Function1[/* res */ AnonMessageStack, Unit]): Unit = js.native
}

