package typings.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFilter extends js.Object {
  /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
  var conditions: js.Array[InputFilterCondition]
}

object InputFilter {
  @scala.inline
  def apply(conditions: js.Array[InputFilterCondition]): InputFilter = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilter]
  }
}

