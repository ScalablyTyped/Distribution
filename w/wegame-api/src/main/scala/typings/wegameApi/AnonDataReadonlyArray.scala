package typings.wegameApi

import typings.wegameApi.wx.types.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataReadonlyArray extends js.Object {
  var data: js.Array[UserInfo]
}

object AnonDataReadonlyArray {
  @scala.inline
  def apply(data: js.Array[UserInfo]): AnonDataReadonlyArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataReadonlyArray]
  }
}

