package typings.xrm.Xrm

import typings.xrm.Xrm.Async.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.WebApi.offline API
  */
@js.native
trait WebApiOffline extends js.Object {
  /**
    * Creates an entity record
    * @param entityLogicalName Logical name of the entity you want to create. For example: "account".
    * @param record A JSON object defining the attributes and values for the new entity record.
    * @returns On success, returns a promise object containing the attributes specified earlier in the description of the successCallback parameter.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/createrecord External Link: createRecord (Client API reference)}
    */
  def createRecord(entityLogicalName: String, record: js.Any): PromiseLike[CreateResponse] = js.native
  /**
    * Deletes an entity record.
    * @param entityLogicalName The entity logical name of the record you want to delete. For example: "account".
    * @param id GUID of the entity record you want to delete.
    * @returns On success, returns a promise object containing the attributes specified earlier in the description of the successCallback parameter.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/deleterecord External Link: deleteRecord (Client API reference)}
    */
  def deleteRecord(entityLogicalName: String, id: String): PromiseLike[String] = js.native
  /**
    * Retrieves a collection of entity records.
    * @param entityLogicalName The entity logical name of the records you want to retrieve. For example: "account".
    * @param options (Optional) OData system query options or FetchXML query to retrieve your data.
    * * Following system query options are supported: $select, $top, $filter, $expand, and $orderby.
    * * To specify a FetchXML query, use the fetchXml attribute to specify the query.
    * * NOTE: You must always use the $select system query option to limit the properties returned for an entity
    * record by including a comma-separated list of property names. This is an important performance best practice.
    * * If properties aren’t specified using $select, all properties will be returned.
    * * You can specify multiple system query options by using & to separate the query options.
    * @param maxPageSize (Optional) Specify a positive number that indicates the number of entity records to be returned per page.
    * * If you do not specify this parameter, the default value is passed as 5000. If the number of records being retrieved is more than the specified
    * maxPageSize value, nextLink attribute in the returned promise object will contain a link to retrieve the next set of entities.
    * @returns On success, returns a promise object containing the attributes specified earlier in the description of the successCallback parameter.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrievemultiplerecords External Link: retrieveMultipleRecords (Client API reference)}
    */
  def retrieveMultipleRecords(entityLogicalName: String): PromiseLike[RetrieveMultipleResult] = js.native
  def retrieveMultipleRecords(entityLogicalName: String, options: js.UndefOr[scala.Nothing], maxPageSize: Double): PromiseLike[RetrieveMultipleResult] = js.native
  def retrieveMultipleRecords(entityLogicalName: String, options: String): PromiseLike[RetrieveMultipleResult] = js.native
  def retrieveMultipleRecords(entityLogicalName: String, options: String, maxPageSize: Double): PromiseLike[RetrieveMultipleResult] = js.native
  /**
    * Retrieves an entity record.
    * @param entityLogicalName The entity logical name of the record you want to retrieve. For example: "account".
    * @param id GUID of the entity record you want to retrieve.
    * @param options (Optional) OData system query options, $select and $expand, to retrieve your data.
    * - Use the $select system query option to limit the properties returned by including a comma-separated
    *   list of property names. This is an important performance best practice. If properties aren’t
    *   specified using $select, all properties will be returned.
    * - Use the $expand system query option to control what data from related entities is returned. If you
    *   just include the name of the navigation property, you’ll receive all the properties for related
    *   records. You can limit the properties returned for related records using the $select system query
    *   option in parentheses after the navigation property name. Use this for both single-valued and
    *   collection-valued navigation properties.
    * - You can also specify multiple query options by using & to separate the query options.
    * @example <caption>options example:</caption>
    * options: $select=name&$expand=primarycontactid($select=contactid,fullname)
    * @returns On success, returns a promise containing a JSON object with the retrieved attributes and their values.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/retrieverecord External Link: retrieveRecord (Client API reference)}
    */
  def retrieveRecord(entityLogicalName: String, id: String): PromiseLike[_] = js.native
  def retrieveRecord(entityLogicalName: String, id: String, options: String): PromiseLike[_] = js.native
  /**
    * Updates an entity record.
    * @param entityLogicalName The entity logical name of the record you want to update. For example: "account".
    * @param id GUID of the entity record you want to update.
    * @param Data A JSON object containing key: value pairs, where key is the property of the entity and value is the value of the property you want update.
    * @returns On success, returns a promise object containing the attributes specified earlier in the description of the successCallback parameter.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi/updaterecord External Link: updateRecord (Client API reference)}
    */
  def updateRecord(entityLogicalName: String, id: String, data: js.Any): PromiseLike[_] = js.native
}

