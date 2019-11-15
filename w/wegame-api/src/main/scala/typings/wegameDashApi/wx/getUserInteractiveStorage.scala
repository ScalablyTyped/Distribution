package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_CloudID
import typings.wegameDashApi.Anon_ErrCode
import typings.wegameDashApi.Anon_KeyList
import typings.wegameDashApi.wx.types.CallbacksWithType2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getUserInteractiveStorage")
@js.native
object getUserInteractiveStorage extends js.Object {
  /**
    * 获取当前用户互动型托管数据对应 key 的数据
    */
  def apply(param: Anon_KeyList with (CallbacksWithType2[Anon_CloudID, Anon_ErrCode])): Unit = js.native
}

