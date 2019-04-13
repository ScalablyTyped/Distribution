package typings
package tv4Lib.tv4Mod

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
    val __obj = js.Dynamic.literal(missing = missing, valid = valid)
  
    __obj.asInstanceOf[BaseResult]
  }
}

