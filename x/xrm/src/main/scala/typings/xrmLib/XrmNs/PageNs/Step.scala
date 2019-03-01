package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CRM Business Process Flow steps.
  * @deprecated Use {@link Xrm.ProcessFlow.Step} instead.
  */
trait Step
  extends xrmLib.XrmNs.ProcessFlowNs.Step

object Step {
  @scala.inline
  def apply(
    getAttribute: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    isRequired: js.Function0[scala.Boolean]
  ): Step = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(getAttribute)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("isRequired")(isRequired)
    __obj.asInstanceOf[Step]
  }
}

