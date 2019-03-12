package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
  * GridEntity is returned by the GridRowData.getEntity method.
  * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.v
  */
trait GridEntity
  extends xrmLib.XrmNs.ControlsNs.GridNs.GridEntity

object GridEntity {
  @scala.inline
  def apply(
    getEntityName: () => java.lang.String,
    getEntityReference: () => xrmLib.XrmNs.LookupValue,
    getId: () => java.lang.String,
    getPrimaryAttributeValue: () => java.lang.String
  ): GridEntity = {
    val __obj = js.Dynamic.literal(getEntityName = js.Any.fromFunction0(getEntityName), getEntityReference = js.Any.fromFunction0(getEntityReference), getId = js.Any.fromFunction0(getId), getPrimaryAttributeValue = js.Any.fromFunction0(getPrimaryAttributeValue))
  
    __obj.asInstanceOf[GridEntity]
  }
}

