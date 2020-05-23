package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinOptions extends js.Object {
  /**
    * @deprecated 进房钥匙，若需要权限控制请携带该参数，因某些局限性目前已不建议使用该参数。
    */
  var privateMapKey: js.UndefOr[String] = js.undefined
  /** 用户角色 */
  var role: js.UndefOr[Role] = js.undefined
  /** 房间号 */
  var roomId: Double
}

object JoinOptions {
  @scala.inline
  def apply(roomId: Double, privateMapKey: String = null, role: Role = null): JoinOptions = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    if (privateMapKey != null) __obj.updateDynamic("privateMapKey")(privateMapKey.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinOptions]
  }
}

