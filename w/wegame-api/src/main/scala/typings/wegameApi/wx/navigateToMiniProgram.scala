package typings.wegameApi.wx

import typings.wegameApi.AnonAppId
import typings.wegameApi.wx.types.Callbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.navigateToMiniProgram")
@js.native
object navigateToMiniProgram extends js.Object {
  // --小程序跳转
  /**
    * 打开另一个小程序
    * @param param 跳转参数
    */
  def apply(param: AnonAppId with Callbacks): Unit = js.native
}

