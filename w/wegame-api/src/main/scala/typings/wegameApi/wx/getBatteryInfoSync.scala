package typings.wegameApi.wx

import typings.wegameApi.wx.types.BatteryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getBatteryInfoSync")
@js.native
object getBatteryInfoSync extends js.Object {
  /**
    * IOS上这个同步API无法使用
    */
  def apply(): BatteryInfo = js.native
}

