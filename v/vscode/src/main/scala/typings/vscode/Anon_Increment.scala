package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Increment extends js.Object {
  var increment: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Anon_Increment {
  @scala.inline
  def apply(increment: Int | Double = null, message: String = null): Anon_Increment = {
    val __obj = js.Dynamic.literal()
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Increment]
  }
}

