package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllAllowedValues extends js.Object {
  var all: scala.Double
  var allowedValues: scala.Double
  var dependentFields: scala.Double
  var none: scala.Double
}

object Anon_AllAllowedValues {
  @scala.inline
  def apply(all: scala.Double, allowedValues: scala.Double, dependentFields: scala.Double, none: scala.Double): Anon_AllAllowedValues = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("allowedValues")(allowedValues)
    __obj.updateDynamic("dependentFields")(dependentFields)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_AllAllowedValues]
  }
}

