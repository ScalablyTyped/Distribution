package typings.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  var invalid: String
  var valid: String
}

object AnonInvalid {
  @scala.inline
  def apply(invalid: String, valid: String): AnonInvalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvalid]
  }
}

