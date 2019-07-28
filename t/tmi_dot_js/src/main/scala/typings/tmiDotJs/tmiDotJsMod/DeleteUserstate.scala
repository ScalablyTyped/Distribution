package typings.tmiDotJs.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserstate extends js.Object {
  var login: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `target-msg-id`: js.UndefOr[String] = js.undefined
}

object DeleteUserstate {
  @scala.inline
  def apply(login: String = null, message: String = null, `target-msg-id`: String = null): DeleteUserstate = {
    val __obj = js.Dynamic.literal()
    if (login != null) __obj.updateDynamic("login")(login)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`target-msg-id` != null) __obj.updateDynamic("target-msg-id")(`target-msg-id`)
    __obj.asInstanceOf[DeleteUserstate]
  }
}

