package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserstate extends js.Object {
  var login: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var `target-msg-id`: js.UndefOr[java.lang.String] = js.undefined
}

object DeleteUserstate {
  @scala.inline
  def apply(
    login: java.lang.String = null,
    message: java.lang.String = null,
    `target-msg-id`: java.lang.String = null
  ): DeleteUserstate = {
    val __obj = js.Dynamic.literal()
    if (login != null) __obj.updateDynamic("login")(login)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`target-msg-id` != null) __obj.updateDynamic("target-msg-id")(`target-msg-id`)
    __obj.asInstanceOf[DeleteUserstate]
  }
}

