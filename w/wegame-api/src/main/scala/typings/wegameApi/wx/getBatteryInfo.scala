package typings.wegameApi.wx

import typings.wegameApi.wx.types.BatteryInfo
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getBatteryInfo")
@js.native
object getBatteryInfo extends js.Object {
  // --电量
  /**
    * 获取设备电量。同步 API wx.getBatteryInfoSync 在 iOS 上不可用。
    */
  def apply(cb: CallbacksWithType[BatteryInfo]): Unit = js.native
}

