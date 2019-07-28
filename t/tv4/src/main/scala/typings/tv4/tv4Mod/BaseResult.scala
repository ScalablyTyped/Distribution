package typings.tv4.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  var missing: js.Array[String]
  var valid: Boolean
}

object BaseResult {
  @scala.inline
  def apply(missing: js.Array[String], valid: Boolean): BaseResult = {
    val __obj = js.Dynamic.literal(missing = missing, valid = valid)
  
    __obj.asInstanceOf[BaseResult]
  }
}

