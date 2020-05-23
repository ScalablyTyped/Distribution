package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeFields extends js.Object {
  var includeFields: scala.Double
  var none: scala.Double
}

object IncludeFields {
  @scala.inline
  def apply(includeFields: scala.Double, none: scala.Double): IncludeFields = {
    val __obj = js.Dynamic.literal(includeFields = includeFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeFields]
  }
}

