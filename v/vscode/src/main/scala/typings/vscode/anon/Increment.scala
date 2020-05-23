package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends js.Object {
  var increment: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Increment {
  @scala.inline
  def apply(increment: js.UndefOr[Double] = js.undefined, message: String = null): Increment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
}

