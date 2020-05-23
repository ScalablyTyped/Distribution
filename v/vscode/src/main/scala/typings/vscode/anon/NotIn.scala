package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotIn extends js.Object {
  var close: String
  var notIn: js.UndefOr[js.Array[String]] = js.undefined
  var open: String
}

object NotIn {
  @scala.inline
  def apply(close: String, open: String, notIn: js.Array[String] = null): NotIn = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    if (notIn != null) __obj.updateDynamic("notIn")(notIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotIn]
  }
}

