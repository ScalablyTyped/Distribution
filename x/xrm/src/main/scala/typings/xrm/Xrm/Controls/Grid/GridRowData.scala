package typings.xrm.Xrm.Controls.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
  * returned by the GridRow.getData method.
  */
@js.native
trait GridRowData extends js.Object {
  /**
    * Returns the GridEntity for the GridRowData.
    * @returns The entity.
    * @deprecated Use GridRow.data.entity instead of using GridRow.getData().getEntity().
    */
  def getEntity(): GridEntity = js.native
}

object GridRowData {
  @scala.inline
  def apply(getEntity: () => GridEntity): GridRowData = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity))
    __obj.asInstanceOf[GridRowData]
  }
  @scala.inline
  implicit class GridRowDataOps[Self <: GridRowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetEntity(value: () => GridEntity): Self = this.set("getEntity", js.Any.fromFunction0(value))
  }
  
}

