package typings.wegameApi.wx

import typings.wegameApi.AnonAuthSetting
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getSetting")
@js.native
object getSetting extends js.Object {
  /**
    * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
    */
  def apply(p: CallbacksWithType[AnonAuthSetting]): Unit = js.native
}

