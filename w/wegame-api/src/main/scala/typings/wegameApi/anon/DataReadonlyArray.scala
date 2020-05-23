package typings.wegameApi.anon

import typings.wegameApi.wx.types.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataReadonlyArray extends js.Object {
  var data: js.Array[UserInfo]
}

object DataReadonlyArray {
  @scala.inline
  def apply(data: js.Array[UserInfo]): DataReadonlyArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReadonlyArray]
  }
}

