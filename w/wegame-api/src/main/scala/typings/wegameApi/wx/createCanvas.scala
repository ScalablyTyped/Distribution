package typings.wegameApi.wx

import typings.wegameApi.Canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.createCanvas")
@js.native
object createCanvas extends js.Object {
  /**
    * 创建一个画布对象。首次调用创建的是显示在屏幕上的画布，之后调用创建的都是离屏画布。
    */
  def apply(): Canvas = js.native
}

