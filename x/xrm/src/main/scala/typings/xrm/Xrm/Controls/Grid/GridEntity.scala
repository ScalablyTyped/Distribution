package typings.xrm.Xrm.Controls.Grid

import typings.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
  * GridEntity is returned by the GridRowData.getEntity method.
  *
  * @deprecated Use GridRow.data.entity instead.
  */
trait GridEntity extends js.Object {
  /**
    * Returns the logical name for the record in the row.
    *
    * @returns The entity name.
    * @deprecated Use GridRow.data.entity.getEntityName() instead.
    */
  def getEntityName(): String
  /**
    * Returns a LookupValue that references this record.
    *
    * @returns The entity reference.
    * @deprecated Use GridRow.data.entity.getEntityReference() instead.
    */
  def getEntityReference(): LookupValue
  /**
    * Returns the id for the record in the row.
    *
    * @returns The identifier of the GridEntity, in GUID format.
    * @example Example return: "{00000000-0000-0000-0000-000000000000}"
    * @deprecated Use GridRow.data.entity.getId() instead.
    */
  def getId(): String
  /**
    * Returns the primary attribute value for the record in the row.  (Commonly the name.)
    *
    * @returns The primary attribute value.
    * @deprecated Use GridRow.data.entity.getPrimaryAttributeValue() instead.
    */
  def getPrimaryAttributeValue(): String
}

object GridEntity {
  @scala.inline
  def apply(
    getEntityName: () => String,
    getEntityReference: () => LookupValue,
    getId: () => String,
    getPrimaryAttributeValue: () => String
  ): GridEntity = {
    val __obj = js.Dynamic.literal(getEntityName = js.Any.fromFunction0(getEntityName), getEntityReference = js.Any.fromFunction0(getEntityReference), getId = js.Any.fromFunction0(getId), getPrimaryAttributeValue = js.Any.fromFunction0(getPrimaryAttributeValue))
  
    __obj.asInstanceOf[GridEntity]
  }
}

