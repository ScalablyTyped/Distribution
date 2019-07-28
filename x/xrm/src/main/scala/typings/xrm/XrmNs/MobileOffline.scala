package typings.xrm.XrmNs

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.XrmNs.AsyncNs.OfflineOperationSuccessCallbackObject
import typings.xrm.XrmNs.AsyncNs.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Mobile.offline methods to create and manage records in the mobile clients while working in the offline mode.
  * @deprecated Use {@link Xrm.WebApi.offline} instead.  Xrm.WebApi.offline is implemented differently than Xrm.Mobile.offline
  * @see {@link https://msdn.microsoft.com/en-us/library/mt787123.aspx External Link: Xrm.Mobile.offline (client-side reference)}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
  */
@js.native
trait MobileOffline extends js.Object {
  /**
    * Creates an entity record in mobile clients while working in the offline mode.
    * @param entityType The logical name of the entity.
    * @param data A dictionary object containing key : value pairs for the record to create.
    * @returns Returns an asynchronous promise.
    * @remarks  You cannot create intersect and activity party entities.<BR>
    *           Only the following attribute types are supported in offline mode:<BR>
    *             BigInt, Boolean, Customer, DateTime, Decimal, Double, EntityName<BR>
    *             Integer, Lookup, Memo, Money, Owner, Picklist, String, State<BR>
    *             Status, UniqueIdentifier
    * @deprecated Use {@link Xrm.WebApi.createRecord} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def createRecord(entityType: String, data: StringDictionary[js.Any]): PromiseLike[OfflineOperationSuccessCallbackObject] = js.native
  /**
    * Deletes an entity record in mobile clients while working in the offline mode.
    * @param entityType The logical name of the entity.
    * @param id GUID of the record to delete.
    * @returns Returns an asynchronous promise.
    * @remarks  You cannot delete intersect and activity party entities.
    * @deprecated Use {@link Xrm.WebApi.deleteRecord} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def deleteRecord(entityType: String, id: String): PromiseLike[OfflineOperationSuccessCallbackObject] = js.native
  /**
    * Returns whether an entity is offline enabled.
    * @param entityType The logical name of the entity.
    * @returns True if the entity is offline enabled; otherwise False.
    * @deprecated Use {@link Xrm.WebApi.isAvailableOffline} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def isOfflineEnabled(entityType: String): Boolean = js.native
  /**
    * Retrieves a collection of entity records in mobile clients while working in the offline mode.
    *
    * @param entityType The logical name of the entity.
    * @param options (Optional) The logical name of the entity
    * @param maxPageSize (Optional) A positive number to indicates the number of entity records to be returned per page.
    * * If you do not specify this parameter, the default value is passed as 5000.
    * * If the number of records being retrieved is more than maxPageSize, an @odata.nextLink property
    * will be returned, and you can use the value of the @odata.nextLink property with a new GET
    * request to return next set of records.
    * @returns Returns an asynchronous promise.
    * @remarks  A maximum of 5000 related records can be retrieved when using $expand.
    * * Only $select option can be specified within $expand.
    * * $skip query option is not supported.
    * * Only the following attribute types are supported in offline mode:<BR>
    *             BigInt, Boolean, Customer, DateTime, Decimal, Double, EntityName<BR>
    *             Integer, Lookup, Memo, Money, Owner, Picklist, String, State<BR>
    *             Status, UniqueIdentifier
    * @deprecated Use {@link Xrm.WebApi.retrieveMultipleRecords} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def retrieveMultipleRecords(entityType: String): PromiseLike[js.Array[StringDictionary[_]]] = js.native
  def retrieveMultipleRecords(entityType: String, options: String): PromiseLike[js.Array[StringDictionary[_]]] = js.native
  def retrieveMultipleRecords(entityType: String, options: String, maxPageSize: Double): PromiseLike[js.Array[StringDictionary[_]]] = js.native
  /**
    * Retrieves an entity record in mobile clients while working in the offline mode.
    *
    * @param entityType The logical name of the entity.
    * @param id GUID of the record to retrieve.
    * @param options (Optional) OData system query options to retrieve your data. Supports $select and $expand
    * @example <caption>Example options</caption>
    * options: ?$select=name&$expand=primarycontactid($select=contactid,fullname)
    * @returns Returns an asynchronous promise.
    * @remarks  Only $select option can be specified within $expand.<BR>
    *           Only the following attribute types are supported in offline mode:<BR>
    *             BigInt, Boolean, Customer, DateTime, Decimal, Double, EntityName<BR>
    *             Integer, Lookup, Memo, Money, Owner, Picklist, String, State<BR>
    *             Status, UniqueIdentifier
    * @deprecated Use {@link Xrm.WebApi.retrieveRecord} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def retrieveRecord(entityType: String, id: String): PromiseLike[OfflineOperationSuccessCallbackObject] = js.native
  def retrieveRecord(entityType: String, id: String, options: String): PromiseLike[OfflineOperationSuccessCallbackObject] = js.native
  /**
    * Updates an entity record in mobile clients while working in the offline mode.
    * @param entityType The logical name of the entity.
    * @param id GUID of the record to update.
    * @param data A dictionary object containing key : value pairs for the record to update.
    * @returns Returns an asynchronous promise.
    * @remarks  You cannot update intersect and activity party entities.<BR>
    *           Only the following attribute types are supported in offline mode:<BR>
    *             BigInt, Boolean, Customer, DateTime, Decimal, Double, EntityName<BR>
    *             Integer, Lookup, Memo, Money, Owner, Picklist, String, State<BR>
    *             Status, UniqueIdentifier
    * @deprecated Use {@link Xrm.WebApi.updateRecord} instead.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  def updateRecord(entityType: String, id: String, data: StringDictionary[js.Any]): PromiseLike[OfflineOperationSuccessCallbackObject] = js.native
}

