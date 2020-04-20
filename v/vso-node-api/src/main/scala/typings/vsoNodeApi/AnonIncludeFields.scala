package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeFields extends js.Object {
  var includeFields: Double
  var none: Double
}

object AnonIncludeFields {
  @scala.inline
  def apply(includeFields: Double, none: Double): AnonIncludeFields = {
    val __obj = js.Dynamic.literal(includeFields = includeFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeFields]
  }
}

