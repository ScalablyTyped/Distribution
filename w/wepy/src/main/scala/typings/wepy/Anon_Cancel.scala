package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: Boolean
  var confirm: Boolean
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: Boolean, confirm: Boolean): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel, confirm = confirm)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

