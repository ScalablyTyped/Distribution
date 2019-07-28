package typings.tv4.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResult extends BaseResult {
  var errors: js.Array[ValidationError]
}

object MultiResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], missing: js.Array[String], valid: Boolean): MultiResult = {
    val __obj = js.Dynamic.literal(errors = errors, missing = missing, valid = valid)
  
    __obj.asInstanceOf[MultiResult]
  }
}

