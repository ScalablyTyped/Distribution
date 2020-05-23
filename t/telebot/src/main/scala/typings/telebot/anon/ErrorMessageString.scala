package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageString extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
}

object ErrorMessageString {
  @scala.inline
  def apply(errorMessage: String = null): ErrorMessageString = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageString]
  }
}

