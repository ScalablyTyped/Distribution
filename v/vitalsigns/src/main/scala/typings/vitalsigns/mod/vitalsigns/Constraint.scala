package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /**
    * The comparator to use when comparing the field's value with the constraint value.
    * Valid comparators are: 'equal', 'greater', and 'less'.
    * @type {string}
    */
  var comparator: String
  /**
    * The name of the field to be constrained.
    * @type {string}
    */
  var field: String
  /**
    * The name of the monitor containing the field to be constrained.
    * @type {string}
    */
  var monitor: String
  /**
    * true to negate the outcome of the comparison; false or omitted to use the comparison result.
    * @type {boolean}
    */
  var negate: js.UndefOr[Boolean] = js.undefined
  /**
    * The value against which the field should be compared.
    * @type {any}
    */
  var value: js.Any
}

object Constraint {
  @scala.inline
  def apply(
    comparator: String,
    field: String,
    monitor: String,
    value: js.Any,
    negate: js.UndefOr[Boolean] = js.undefined
  ): Constraint = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(negate)) __obj.updateDynamic("negate")(negate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}

