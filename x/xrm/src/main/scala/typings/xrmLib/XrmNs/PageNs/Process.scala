package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a CRM Business Process Flow instance.
  * @deprecated Use {@link Xrm.ProcessFlow.Process} instead.
  */
trait Process
  extends xrmLib.XrmNs.ProcessFlowNs.Process

object Process {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getStages: js.Function0[xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ProcessFlowNs.Stage]],
    isRendered: js.Function0[scala.Boolean]
  ): Process = {
    val __obj = js.Dynamic.literal(getId = getId, getName = getName, getStages = getStages, isRendered = isRendered)
  
    __obj.asInstanceOf[Process]
  }
}

