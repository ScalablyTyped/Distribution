package typings.vscodeLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var args: js.UndefOr[js.Any] = js.undefined
  var command: String
  var result: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[Boolean] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    command: String,
    args: js.Any = null,
    result: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): Message = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

