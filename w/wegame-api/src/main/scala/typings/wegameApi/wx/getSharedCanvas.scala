package typings.wegameApi.wx

import typings.wegameApi.Canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getSharedCanvas")
@js.native
object getSharedCanvas extends js.Object {
  /**
    * 只有开放数据域能调用，获取主域和开放数据域共享的 sharedCanvas
    */
  def apply(): Canvas = js.native
}

