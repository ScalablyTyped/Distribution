package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CRM Business Process Flow stages.
  * @deprecated Use {@link Xrm.ProcessFlow.Stage} instead.
  */
trait Stage
  extends xrmLib.XrmNs.ProcessFlowNs.Stage

object Stage {
  @scala.inline
  def apply(
    getCategory: () => xrmLib.Anon_GetValue,
    getEntityName: () => java.lang.String,
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    getStatus: () => xrmLib.XrmNs.ProcessFlowNs.StageStatus,
    getSteps: () => js.Array[xrmLib.XrmNs.ProcessFlowNs.Step]
  ): Stage = {
    val __obj = js.Dynamic.literal(getCategory = js.Any.fromFunction0(getCategory), getEntityName = js.Any.fromFunction0(getEntityName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus), getSteps = js.Any.fromFunction0(getSteps))
  
    __obj.asInstanceOf[Stage]
  }
}

