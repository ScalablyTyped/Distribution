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
    getCategory: js.Function0[xrmLib.Anon_GetValue],
    getEntityName: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getStatus: js.Function0[xrmLib.XrmNs.ProcessFlowNs.StageStatus],
    getSteps: js.Function0[js.Array[xrmLib.XrmNs.ProcessFlowNs.Step]]
  ): Stage = {
    val __obj = js.Dynamic.literal(getCategory = getCategory, getEntityName = getEntityName, getId = getId, getName = getName, getStatus = getStatus, getSteps = getSteps)
  
    __obj.asInstanceOf[Stage]
  }
}

