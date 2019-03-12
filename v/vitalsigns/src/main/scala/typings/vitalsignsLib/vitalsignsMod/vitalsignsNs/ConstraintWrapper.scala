package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintWrapper extends js.Object {
  @JSName("equals")
  var equals_FConstraintWrapper: js.UndefOr[js.Function1[/* num */ scala.Double, ConstraintWrapper]] = js.undefined
  var greaterThan: js.UndefOr[js.Function1[/* num */ scala.Double, ConstraintWrapper]] = js.undefined
  var lessThan: js.UndefOr[js.Function1[/* num */ scala.Double, ConstraintWrapper]] = js.undefined
  var not: js.UndefOr[ConstraintWrapper] = js.undefined
}

object ConstraintWrapper {
  @scala.inline
  def apply(
    equals: /* num */ scala.Double => ConstraintWrapper = null,
    greaterThan: /* num */ scala.Double => ConstraintWrapper = null,
    lessThan: /* num */ scala.Double => ConstraintWrapper = null,
    not: ConstraintWrapper = null
  ): ConstraintWrapper = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1(equals))
    if (greaterThan != null) __obj.updateDynamic("greaterThan")(js.Any.fromFunction1(greaterThan))
    if (lessThan != null) __obj.updateDynamic("lessThan")(js.Any.fromFunction1(lessThan))
    if (not != null) __obj.updateDynamic("not")(not)
    __obj.asInstanceOf[ConstraintWrapper]
  }
}

