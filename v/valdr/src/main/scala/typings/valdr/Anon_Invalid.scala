package typings.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invalid extends js.Object {
  var invalid: String
  var valid: String
}

object Anon_Invalid {
  @scala.inline
  def apply(invalid: String, valid: String): Anon_Invalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Invalid]
  }
}

