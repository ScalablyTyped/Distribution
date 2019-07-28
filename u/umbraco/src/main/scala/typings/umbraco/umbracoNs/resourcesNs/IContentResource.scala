package typings.umbraco.umbracoNs.resourcesNs

import typings.angular.angularMod.IPromise
import typings.umbraco.Anon_Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.contentResource
  * @description Handles all transactions of content data
  * from the angular application to the Umbraco database, using the Content WebApi controller
  *
  * all methods returns a resource promise async, so all operations won't complete untill .then() is completed.
  *
  * @requires $q
  * @requires $http
  * @requires umbDataFormatter
  * @requires umbRequestHelper
  *
  * ##usage
  * To use, simply inject the contentResource into any controller or service that needs it, and make
  * sure the umbraco.resources module is accesible - which it should be by default.
  *
  * <pre>
  *    contentResource.getById(1234)
  *          .then(function(data) {
  *              $scope.content = data;
  *          });
  * </pre>
  **/
@js.native
trait IContentResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#hasPermission
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Returns true/false given a permission char to check against a nodeID
    * for the current user
    *
    * ##usage
    * <pre>
    * contentResource.hasPermission('p',1234)
    *    .then(function() {
    *        alert('You are allowed to publish this item');
    *    });
    * </pre>
    *
    * @param {String} permission char representing the permission to check
    * @param {Int} id id of content item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def checkPermission(permission: String, id: Double): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#copy
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Copies a node underneath a new parentId
    *
    * ##usage
    * <pre>
    * contentResource.copy({ parentId: 1244, id: 123 })
    *    .then(function() {
    *        alert("node was copied");
    *    }, function(err){
    *      alert("node wasnt copy:" + err.data.Message);
    *    });
    * </pre>
    * @param {Object} args arguments object
    * @param {Int} args.id the ID of the node to copy
    * @param {Int} args.parentId the ID of the parent node to copy to
    * @param {Boolean} args.relateToOriginal if true, relates the copy to the original through the relation api
    * @returns {Promise} resourcePromise object.
    *
    */
  def copy(args: js.Any*): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#deleteById
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Deletes a content item with a given id
    *
    * ##usage
    * <pre>
    * contentResource.deleteById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of content item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def deleteById(id: Double): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#emptyRecycleBin
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Empties the content recycle bin
    *
    * ##usage
    * <pre>
    * contentResource.emptyRecycleBin()
    *    .then(function() {
    *        alert('its empty!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object.
    *
    */
  def emptyRecycleBin(): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getById
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Gets a content item with a given id
    *
    * ##usage
    * <pre>
    * contentResource.getById(1234)
    *    .then(function(content) {
    *        var myDoc = content;
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of content item to return
    * @returns {Promise} resourcePromise object containing the content item.
    *
    */
  def getById(id: Double): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getByIds
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Gets an array of content items, given a collection of ids
    *
    * ##usage
    * <pre>
    * contentResource.getByIds( [1234,2526,28262])
    *    .then(function(contentArray) {
    *        var myDoc = contentArray;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {Array} ids ids of content items to return as an array
    * @returns {Promise} resourcePromise object containing the content items array.
    *
    */
  def getByIds(ids: js.Array[Double]): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getChildren
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Gets children of a content item with a given id
    *
    * ##usage
    * <pre>
    * contentResource.getChildren(1234, {pageSize: 10, pageNumber: 2})
    *    .then(function(contentArray) {
    *        var children = contentArray;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {Int} parentid id of content item to return children of
    * @param {Object} options optional options object
    * @param {Int} options.pageSize if paging data, number of nodes per page, default = 0
    * @param {Int} options.pageNumber if paging data, current page index, default = 0
    * @param {String} options.filter if provided, query will only return those with names matching the filter
    * @param {String} options.orderDirection can be `Ascending` or `Descending` - Default: `Ascending`
    * @param {String} options.orderBy property to order items by, default: `SortOrder`
    * @returns {Promise} resourcePromise object containing an array of content items.
    *
    */
  def getChildren(parentId: Double): IPromise[IResourcePromise] = js.native
  def getChildren(parentId: Double, options: Anon_Filter): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getNiceUrl
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Returns a url, given a node ID
    *
    * ##usage
    * <pre>
    * contentResource.getNiceUrl(id)
    *    .then(function(url) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id Id of node to return the public url to
    * @returns {Promise} resourcePromise object containing the url.
    *
    */
  def getNiceUrl(id: Double): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getScaffold
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Returns a scaffold of an empty content item, given the id of the content item to place it underneath and the content type alias.
    *
    * - Parent Id must be provided so umbraco knows where to store the content
    * - Content Type alias must be provided so umbraco knows which properties to put on the content scaffold
    *
    * The scaffold is used to build editors for content that has not yet been populated with data.
    *
    * ##usage
    * <pre>
    * contentResource.getScaffold(1234, 'homepage')
    *    .then(function(scaffold) {
    *        var myDoc = scaffold;
    *        myDoc.name = "My new document";
    *
    *        contentResource.publish(myDoc, true)
    *            .then(function(content){
    *                alert("Retrieved, updated and published again");
    *            });
    *    });
    * </pre>
    *
    * @param {Int} parentId id of content item to return
    * @param {String} alias contenttype alias to base the scaffold on
    * @returns {Promise} resourcePromise object containing the content scaffold.
    *
    */
  def getScaffold(parentId: Double, alias: String): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#move
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Moves a node underneath a new parentId
    *
    * ##usage
    * <pre>
    * contentResource.move({ parentId: 1244, id: 123 })
    *    .then(function() {
    *        alert("node was moved");
    *    }, function(err){
    *      alert("node didnt move:" + err.data.Message);
    *    });
    * </pre>
    * @param {Object} args arguments object
    * @param {Int} args.id the ID of the node to move
    * @param {Int} args.parentId the ID of the parent node to move to
    * @returns {Promise} resourcePromise object.
    *
    */
  def move(args: js.Any*): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#publish
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Saves and publishes changes made to a content item to a new version, if the content item is new, the isNew paramater must be passed to force creation
    * if the content item needs to have files attached, they must be provided as the files param and passed seperately
    *
    *
    * ##usage
    * <pre>
    * contentResource.getById(1234)
    *    .then(function(content) {
    *          content.name = "I want a new name, and be published!";
    *          contentResource.publish(content, false)
    *            .then(function(content){
    *                alert("Retrieved, updated and published again");
    *            });
    *    });
    * </pre>
    *
    * @param {Object} content The content item object with changes applied
    * @param {Bool} isNew set to true to create a new item or to update an existing
    * @param {Array} files collection of files for the document
    * @returns {Promise} resourcePromise object containing the saved content item.
    *
    */
  def publish(content: IContentResource, isNew: Boolean, files: js.Array[_]): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#publishByid
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Publishes a content item with a given ID
    *
    * ##usage
    * <pre>
    * contentResource.publishById(1234)
    *    .then(function(content) {
    *        alert("published");
    *    });
    * </pre>
    *
    * @param {Int} id The ID of the conten to publish
    * @returns {Promise} resourcePromise object containing the published content item.
    *
    */
  def publishById(id: Double): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#save
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Saves changes made to a content item to its current version, if the content item is new, the isNew paramater must be passed to force creation
    * if the content item needs to have files attached, they must be provided as the files param and passed seperately
    *
    *
    * ##usage
    * <pre>
    * contentResource.getById(1234)
    *    .then(function(content) {
    *          content.name = "I want a new name!";
    *          contentResource.save(content, false)
    *            .then(function(content){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @param {Object} content The content item object with changes applied
    * @param {Bool} isNew set to true to create a new item or to update an existing
    * @param {Array} files collection of files for the document
    * @returns {Promise} resourcePromise object containing the saved content item.
    *
    */
  def save(content: IContentResource, isNew: Boolean, files: js.Array[_]): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#sendToPublish
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Saves changes made to a content item, and notifies any subscribers about a pending publication
    *
    * ##usage
    * <pre>
    * contentResource.getById(1234)
    *    .then(function(content) {
    *          content.name = "I want a new name, and be published!";
    *          contentResource.sendToPublish(content, false)
    *            .then(function(content){
    *                alert("Retrieved, updated and notication send off");
    *            });
    *    });
    * </pre>
    *
    * @param {Object} content The content item object with changes applied
    * @param {Bool} isNew set to true to create a new item or to update an existing
    * @param {Array} files collection of files for the document
    * @returns {Promise} resourcePromise object containing the saved content item.
    *
    */
  def sendToPublish(content: IContentResource, isNew: Boolean, files: js.Array[_]): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#sort
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Sorts all children below a given parent node id, based on a collection of node-ids
    *
    * ##usage
    * <pre>
    * var ids = [123,34533,2334,23434];
    * contentResource.sort({ parentId: 1244, sortedIds: ids })
    *    .then(function() {
    *        $scope.complete = true;
    *    });
    * </pre>
    * @param {Object} args arguments object
    * @param {Int} args.parentId the ID of the parent node
    * @param {Array} options.sortedIds array of node IDs as they should be sorted
    * @returns {Promise} resourcePromise object.
    *
    */
  def sort(args: js.Any*): IPromise[IResourcePromise] = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#unPublish
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Unpublishes a content item with a given Id
    *
    * ##usage
    * <pre>
    * contentResource.unPublish(1234)
    *    .then(function() {
    *        alert("node was unpulished");
    *    }, function(err){
    *      alert("node wasnt unpublished:" + err.data.Message);
    *    });
    * </pre>
    * @param {Int} id the ID of the node to unpublish
    * @returns {Promise} resourcePromise object.
    *
    */
  def unPublish(id: Double): IPromise[IResourcePromise] = js.native
}

