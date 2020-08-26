package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteUserInfo extends js.Object {
  var userId: String = js.native
}

object RemoteUserInfo {
  @scala.inline
  def apply(userId: String): RemoteUserInfo = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteUserInfo]
  }
  @scala.inline
  implicit class RemoteUserInfoOps[Self <: RemoteUserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

