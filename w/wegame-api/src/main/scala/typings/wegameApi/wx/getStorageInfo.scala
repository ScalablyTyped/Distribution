package typings.wegameApi.wx

import typings.wegameApi.wx.types.CallbacksWithType
import typings.wegameApi.wx.types.StorageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getStorageInfo")
@js.native
object getStorageInfo extends js.Object {
  /**
    * 异步获取当前storage的相关信息
    */
  def apply(param: CallbacksWithType[StorageInfo]): Unit = js.native
}

