package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorMessageString extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
}

object AnonErrorMessageString {
  @scala.inline
  def apply(errorMessage: String = null): AnonErrorMessageString = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorMessageString]
  }
}

