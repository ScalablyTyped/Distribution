package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var lineStart: String
  var open: String
  var scope: String
}

object AnonClose {
  @scala.inline
  def apply(lineStart: String, open: String, scope: String, close: String = null): AnonClose = {
    val __obj = js.Dynamic.literal(lineStart = lineStart.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClose]
  }
}

