package typings.uikit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: String
  var ok: String
}

object Cancel {
  @scala.inline
  def apply(cancel: String, ok: String): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

