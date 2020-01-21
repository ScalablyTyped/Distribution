package typings.wegameApi.wx

import typings.wegameApi.AnonCloudID
import typings.wegameApi.AnonErrCode
import typings.wegameApi.AnonKeyList
import typings.wegameApi.wx.types.CallbacksWithType2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getUserInteractiveStorage")
@js.native
object getUserInteractiveStorage extends js.Object {
  /**
    * 获取当前用户互动型托管数据对应 key 的数据
    */
  def apply(param: AnonKeyList with (CallbacksWithType2[AnonCloudID, AnonErrCode])): Unit = js.native
}

