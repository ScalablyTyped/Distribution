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
    getAttribute: () => java.lang.String,
    getName: () => java.lang.String,
    isRequired: () => scala.Boolean
  ): Step = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction0(getAttribute), getName = js.Any.fromFunction0(getName), isRequired = js.Any.fromFunction0(isRequired))
  
    __obj.asInstanceOf[Step]
  }
}

