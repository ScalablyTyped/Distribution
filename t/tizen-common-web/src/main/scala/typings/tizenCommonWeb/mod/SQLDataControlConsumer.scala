package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQLDataControlConsumer
  extends StObject
     with DataControlConsumerObject {
  
  /**
    * Inserts new rows into a table owned by an SQL-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param insertionData The data on columns and values to insert.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type IOError, if a DB operation has failed.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def insert(reqId: Double, insertionData: RowData): Unit = js.native
  def insert(
    reqId: Double,
    insertionData: RowData,
    successCallback: Null,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def insert(
    reqId: Double,
    insertionData: RowData,
    successCallback: Unit,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def insert(reqId: Double, insertionData: RowData, successCallback: DataControlInsertSuccessCallback): Unit = js.native
  def insert(
    reqId: Double,
    insertionData: RowData,
    successCallback: DataControlInsertSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  
  /**
    * Delete rows from a table that is owned by an SQL-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param where A filter to select desired rows to remove.
    * It is an SQL WHERE clause excluding the WHERE itself such as column1 = 'stringValue' AND column2 = numericValue.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type IOError, if a DB operation has failed.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def remove(reqId: Double, where: String): Unit = js.native
  def remove(reqId: Double, where: String, successCallback: Null, errorCallback: DataControlErrorCallback): Unit = js.native
  def remove(reqId: Double, where: String, successCallback: Unit, errorCallback: DataControlErrorCallback): Unit = js.native
  def remove(reqId: Double, where: String, successCallback: DataControlSuccessCallback): Unit = js.native
  def remove(
    reqId: Double,
    where: String,
    successCallback: DataControlSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  
  /**
    * Selects the specified columns to be queried. The result set of the specified columns is retrieved from a table owned by an SQL-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @remark _order_ is supported since Tizen 3.0
    * @remark If _page_ and _maxNumberPerPage_ parameters are not specified and result set contains more than 20 rows, only first 20 rows are included in the result.
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param columns The columns to select.
    * @param where A filter to select desired rows.
    * It is an SQL WHERE clause excluding the WHERE itself such as column1 = 'stringValue' AND column2 = numericValue.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    * @param page The page number of the result set.
    * It starts from 1. If the number is out of page, DataControlSelectSuccessCallback is invoked with no result data.
    * @param maxNumberPerPage The maximum number of rows on a page. The maximum allowed value is equal to 1024.
    * @param order The sorting order of the selected rows.
    * It is an SQL ORDER BY clause excluding the ORDER BY itself such as column1, column2 ASC. If it is set to null, the order in which the rows are returned is undefined.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type IOError, if a DB operation has failed.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def select(
    reqId: Double,
    columns: js.Array[String],
    where: String,
    successCallback: DataControlSelectSuccessCallback,
    errorCallback: js.UndefOr[DataControlErrorCallback | Null],
    page: js.UndefOr[Double | Null],
    maxNumberPerPage: js.UndefOr[Double | Null],
    order: js.UndefOr[String | Null]
  ): Unit = js.native
  
  /**
    * Updates values of a table owned by an SQL-type data control provider.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/datacontrol.consumer
    *
    * @param reqId A unique identifier for the current operation.
    * So a developer should increase the _reqId_ value to ensure it is unique for each method.
    * @param updateData The data on columns and values to update.
    * @param where A filter to select desired rows to update.
    * It is an SQL WHERE clause excluding the WHERE itself such as column1 = 'stringValue' AND column2 = numericValue.
    * @param successCallback The method to invoke when the asynchronous call completes successfully.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throws WebAPIException with error type TypeMismatchError, if the parameter type is not compatible with the expected type for that parameter.
    * @throws WebAPIException with error type IOError, if a DB operation has failed.
    * @throws WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throws WebAPIException with error type UnknownError, if any other error occurs.
    */
  def update(reqId: Double, updateData: RowData, where: String): Unit = js.native
  def update(
    reqId: Double,
    updateData: RowData,
    where: String,
    successCallback: Null,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def update(
    reqId: Double,
    updateData: RowData,
    where: String,
    successCallback: Unit,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
  def update(reqId: Double, updateData: RowData, where: String, successCallback: DataControlSuccessCallback): Unit = js.native
  def update(
    reqId: Double,
    updateData: RowData,
    where: String,
    successCallback: DataControlSuccessCallback,
    errorCallback: DataControlErrorCallback
  ): Unit = js.native
}
