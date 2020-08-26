package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  /**
    * The comparator to use when comparing the field's value with the constraint value.
    * Valid comparators are: 'equal', 'greater', and 'less'.
    * @type {string}
    */
  var comparator: String = js.native
  /**
    * The name of the field to be constrained.
    * @type {string}
    */
  var field: String = js.native
  /**
    * The name of the monitor containing the field to be constrained.
    * @type {string}
    */
  var monitor: String = js.native
  /**
    * true to negate the outcome of the comparison; false or omitted to use the comparison result.
    * @type {boolean}
    */
  var negate: js.UndefOr[Boolean] = js.native
  /**
    * The value against which the field should be compared.
    * @type {any}
    */
  var value: js.Any = js.native
}

object Constraint {
  @scala.inline
  def apply(comparator: String, field: String, monitor: String, value: js.Any): Constraint = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
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
    def setComparator(value: String): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitor(value: String): Self = this.set("monitor", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegate: Self = this.set("negate", js.undefined)
  }
  
}

