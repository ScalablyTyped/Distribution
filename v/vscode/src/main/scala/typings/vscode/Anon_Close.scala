package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var lineStart: String
  var open: String
  var scope: String
}

object Anon_Close {
  @scala.inline
  def apply(lineStart: String, open: String, scope: String, close: String = null): Anon_Close = {
    val __obj = js.Dynamic.literal(lineStart = lineStart, open = open, scope = scope)
    if (close != null) __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[Anon_Close]
  }
}

