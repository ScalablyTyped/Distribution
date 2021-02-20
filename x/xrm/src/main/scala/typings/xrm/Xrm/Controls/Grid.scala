package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Controls.Grid.GridRow
import typings.xrm.Xrm.Data
import typings.xrm.Xrm.LookupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
  * GridControl.getGrid method.
  */
@js.native
trait Grid extends StObject {
  
  /**
    * Returns a collection of every GridRow in the Grid.
    * @returns The rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getRows(): ItemCollection[GridRow] = js.native
  
  /**
    * Returns a collection of every selected GridRow in the Grid.
    * @returns The selected rows.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  def getSelectedRows(): ItemCollection[GridRow] = js.native
  
  /**
    * Returns the total number of records in the Grid.
    * @returns The total record count.
    */
  def getTotalRecordCount(): Double = js.native
}
object Grid {
  
  @scala.inline
  def apply(
    getRows: () => ItemCollection[GridRow],
    getSelectedRows: () => ItemCollection[GridRow],
    getTotalRecordCount: () => Double
  ): Grid = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction0(getRows), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getTotalRecordCount = js.Any.fromFunction0(getTotalRecordCount))
    __obj.asInstanceOf[Grid]
  }
  
  /**
    * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
    * GridEntity is returned by the GridRowData.getEntity method.
    *
    * @deprecated Use GridRow.data.entity instead.
    */
  @js.native
  trait GridEntity extends StObject {
    
    /**
      * Returns the logical name for the record in the row.
      *
      * @returns The entity name.
      * @deprecated Use GridRow.data.entity.getEntityName() instead.
      */
    def getEntityName(): String = js.native
    
    /**
      * Returns a LookupValue that references this record.
      *
      * @returns The entity reference.
      * @deprecated Use GridRow.data.entity.getEntityReference() instead.
      */
    def getEntityReference(): LookupValue = js.native
    
    /**
      * Returns the id for the record in the row.
      *
      * @returns The identifier of the GridEntity, in GUID format.
      * @example Example return: "{00000000-0000-0000-0000-000000000000}"
      * @deprecated Use GridRow.data.entity.getId() instead.
      */
    def getId(): String = js.native
    
    /**
      * Returns the primary attribute value for the record in the row.  (Commonly the name.)
      *
      * @returns The primary attribute value.
      * @deprecated Use GridRow.data.entity.getPrimaryAttributeValue() instead.
      */
    def getPrimaryAttributeValue(): String = js.native
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
    
    @scala.inline
    implicit class GridEntityMutableBuilder[Self <: GridEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEntityName(value: () => String): Self = StObject.set(x, "getEntityName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEntityReference(value: () => LookupValue): Self = StObject.set(x, "getEntityReference", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrimaryAttributeValue(value: () => String): Self = StObject.set(x, "getPrimaryAttributeValue", js.Any.fromFunction0(value))
    }
  }
  
  @scala.inline
  implicit class GridMutableBuilder[Self <: Grid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRows(value: () => ItemCollection[GridRow]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedRows(value: () => ItemCollection[GridRow]): Self = StObject.set(x, "getSelectedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalRecordCount(value: () => Double): Self = StObject.set(x, "getTotalRecordCount", js.Any.fromFunction0(value))
  }
  
  /**
    * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
    * returned by Grid.getRows and Grid.getSelectedRows methods.
    * In V9 - this is essentailly a form context
    */
  @js.native
  trait GridRow extends StObject {
    
    /**
      * Provides methods to work with the row data.
      */
    var data: Data = js.native
    
    /**
      * Returns the GridRowData for the GridRow.
      * @deprecated Deprecated in V9 - use data field instead
      * @returns The data.
      */
    def getData(): GridRowData = js.native
  }
  object GridRow {
    
    @scala.inline
    def apply(data: Data, getData: () => GridRowData): GridRow = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData))
      __obj.asInstanceOf[GridRow]
    }
    
    @scala.inline
    implicit class GridRowMutableBuilder[Self <: GridRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetData(value: () => GridRowData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
    * returned by the GridRow.getData method.
    */
  @js.native
  trait GridRowData extends StObject {
    
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
    implicit class GridRowDataMutableBuilder[Self <: GridRowData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetEntity(value: () => GridEntity): Self = StObject.set(x, "getEntity", js.Any.fromFunction0(value))
    }
  }
}
