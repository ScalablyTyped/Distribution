package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowedValues extends js.Object {
  var all: scala.Double
  var allowedValues: scala.Double
  var dependentFields: scala.Double
  var none: scala.Double
}

object AllowedValues {
  @scala.inline
  def apply(all: scala.Double, allowedValues: scala.Double, dependentFields: scala.Double, none: scala.Double): AllowedValues = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], allowedValues = allowedValues.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValues]
  }
}

