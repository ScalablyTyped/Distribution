package typings.valdr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalid extends js.Object {
  var invalid: String
  var valid: String
}

object Invalid {
  @scala.inline
  def apply(invalid: String, valid: String): Invalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
}

