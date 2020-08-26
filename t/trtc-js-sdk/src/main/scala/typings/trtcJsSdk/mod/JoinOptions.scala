package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinOptions extends js.Object {
  /**
    * @deprecated 进房钥匙，若需要权限控制请携带该参数，因某些局限性目前已不建议使用该参数。
    */
  var privateMapKey: js.UndefOr[String] = js.native
  /** 用户角色 */
  var role: js.UndefOr[Role] = js.native
  /** 房间号 */
  var roomId: Double = js.native
}

object JoinOptions {
  @scala.inline
  def apply(roomId: Double): JoinOptions = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
  @scala.inline
  implicit class JoinOptionsOps[Self <: JoinOptions] (val x: Self) extends AnyVal {
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
    def setRoomId(value: Double): Self = this.set("roomId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateMapKey(value: String): Self = this.set("privateMapKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateMapKey: Self = this.set("privateMapKey", js.undefined)
    @scala.inline
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

