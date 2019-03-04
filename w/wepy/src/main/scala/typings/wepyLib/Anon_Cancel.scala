package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: scala.Boolean
  var confirm: scala.Boolean
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: scala.Boolean, confirm: scala.Boolean): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel, confirm = confirm)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

