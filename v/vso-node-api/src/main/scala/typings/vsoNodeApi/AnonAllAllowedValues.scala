package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllAllowedValues extends js.Object {
  var all: Double
  var allowedValues: Double
  var dependentFields: Double
  var none: Double
}

object AnonAllAllowedValues {
  @scala.inline
  def apply(all: Double, allowedValues: Double, dependentFields: Double, none: Double): AnonAllAllowedValues = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], allowedValues = allowedValues.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllAllowedValues]
  }
}

