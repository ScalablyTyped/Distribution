package typings
package xrmLib.XrmNs.ProcessFlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /**
    * Returns the logical name of the attribute associated to the step.
    * @returns The attribute.
    * @remarks Some steps don’t contain an attribute value.
    */
  def getAttribute(): java.lang.String
  /**
    * Returns the name of the step.
    * @returns The name.
    */
  def getName(): java.lang.String
  /**
    * Returns whether the step is required in the business process flow.
    * @returns true if required, false if not.
    * @remarks     Returns true if the step is marked as required in the Business Process Flow editor; otherwise, false.
    *              There is no connection between this value and the values you can change in the formContext.data.entity
    *              attribute RequiredLevel methods.
    */
  def isRequired(): scala.Boolean
}

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

