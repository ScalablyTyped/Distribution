package typings.uikit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: String
  var ok: String
}

object AnonCancel {
  @scala.inline
  def apply(cancel: String, ok: String): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

