package typings
package tv4Lib.tv4Mod.tv4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiResult extends BaseResult {
  var errors: js.Array[ValidationError]
}

object MultiResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], missing: js.Array[java.lang.String], valid: scala.Boolean): MultiResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("missing")(missing)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[MultiResult]
  }
}

