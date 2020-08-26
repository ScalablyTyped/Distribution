package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedValues extends js.Object {
  var all: scala.Double = js.native
  var allowedValues: scala.Double = js.native
  var dependentFields: scala.Double = js.native
  var none: scala.Double = js.native
}

object AllowedValues {
  @scala.inline
  def apply(all: scala.Double, allowedValues: scala.Double, dependentFields: scala.Double, none: scala.Double): AllowedValues = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], allowedValues = allowedValues.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValues]
  }
  @scala.inline
  implicit class AllowedValuesOps[Self <: AllowedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedValues(value: scala.Double): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependentFields(value: scala.Double): Self = this.set("dependentFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

