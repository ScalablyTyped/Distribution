package typings
package xrmLib.XrmNs.ControlsNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
  * returned by the GridRow.getData method.
  */
trait GridRowData extends js.Object {
  /**
    * Returns the GridEntity for the GridRowData.
    * @returns The entity.
    * @deprecated Use GridRow.data.entity instead of using GridRow.getData().getEntity().
    */
  def getEntity(): GridEntity
}

object GridRowData {
  @scala.inline
  def apply(getEntity: js.Function0[GridEntity]): GridRowData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntity")(getEntity)
    __obj.asInstanceOf[GridRowData]
  }
}

