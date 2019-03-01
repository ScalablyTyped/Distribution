package typings
package tv4Lib.tv4Mod.tv4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  var missing: js.Array[java.lang.String]
  var valid: scala.Boolean
}

object BaseResult {
  @scala.inline
  def apply(missing: js.Array[java.lang.String], valid: scala.Boolean): BaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("missing")(missing)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[BaseResult]
  }
}

