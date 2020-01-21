package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: Boolean
  var confirm: Boolean
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Boolean, confirm: Boolean): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

