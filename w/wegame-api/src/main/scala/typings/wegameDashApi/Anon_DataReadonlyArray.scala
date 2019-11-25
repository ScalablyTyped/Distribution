package typings.wegameDashApi

import typings.wegameDashApi.wx.types.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataReadonlyArray extends js.Object {
  var data: js.Array[UserInfo]
}

object Anon_DataReadonlyArray {
  @scala.inline
  def apply(data: js.Array[UserInfo]): Anon_DataReadonlyArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataReadonlyArray]
  }
}

