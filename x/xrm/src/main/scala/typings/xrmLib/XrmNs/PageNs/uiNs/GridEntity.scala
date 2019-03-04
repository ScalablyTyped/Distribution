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
    getEntityName: js.Function0[java.lang.String],
    getEntityReference: js.Function0[xrmLib.XrmNs.LookupValue],
    getId: js.Function0[java.lang.String],
    getPrimaryAttributeValue: js.Function0[java.lang.String]
  ): GridEntity = {
    val __obj = js.Dynamic.literal(getEntityName = getEntityName, getEntityReference = getEntityReference, getId = getId, getPrimaryAttributeValue = getPrimaryAttributeValue)
  
    __obj.asInstanceOf[GridEntity]
  }
}

