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
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    getStages: () => xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ProcessFlowNs.Stage],
    isRendered: () => scala.Boolean
  ): Process = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStages = js.Any.fromFunction0(getStages), isRendered = js.Any.fromFunction0(isRendered))
  
    __obj.asInstanceOf[Process]
  }
}

