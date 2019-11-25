package typings.tv4.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleResult extends BaseResult {
  var error: ValidationError
}

object SingleResult {
  @scala.inline
  def apply(error: ValidationError, missing: js.Array[String], valid: Boolean): SingleResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleResult]
  }
}

