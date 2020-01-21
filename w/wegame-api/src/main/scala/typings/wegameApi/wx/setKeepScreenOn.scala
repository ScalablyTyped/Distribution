package typings.wegameApi.wx

import typings.wegameApi.wx.types.SetKeepScreenOnParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.setKeepScreenOn")
@js.native
object setKeepScreenOn extends js.Object {
  /**
    * 设置是否保持常亮状态。仅在当前小程序生效，离开小程序后设置失效。
    */
  def apply(p: SetKeepScreenOnParams): Unit = js.native
}

