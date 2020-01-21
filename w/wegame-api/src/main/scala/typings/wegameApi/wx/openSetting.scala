package typings.wegameApi.wx

import typings.wegameApi.AnonAuthSetting
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.openSetting")
@js.native
object openSetting extends js.Object {
  /**
    * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
    * @deprecated
    */
  def apply(p: CallbacksWithType[AnonAuthSetting]): Unit = js.native
}

