package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import typings.umbraco.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.mediaResource
  * @description Loads in data for media
  **/
@js.native
trait IMediaResource extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#addFolder
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Shorthand for adding a media item of the type "Folder" under a given parent ID
    *
    * ##usage
    * <pre>
    * mediaResource.addFolder("My gallery", 1234)
    *    .then(function(folder) {
    *        alert('New folder');
    *    });
    * </pre>
    *
    * @param {string} name Name of the folder to create
    * @param {int} parentId Id of the media item to create the folder underneath
    * @returns {Promise} resourcePromise object.
    *
    */
  def addFolder(name: String, parentId: Double): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#deleteById
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Deletes a media item with a given id
    *
    * ##usage
    * <pre>
    * mediaResource.deleteById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of media item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def deleteById(id: Double): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#emptyRecycleBin
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Empties the media recycle bin
    *
    * ##usage
    * <pre>
    * mediaResource.emptyRecycleBin()
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
    * @name umbraco.resources.mediaResource#getById
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Gets a media item with a given id
    *
    * ##usage
    * <pre>
    * mediaResource.getById(1234)
    *    .then(function(media) {
    *        var myMedia = media;
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of media item to return
    * @returns {Promise} resourcePromise object containing the media item.
    *
    */
  def getById(id: Double): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#getByIds
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Gets an array of media items, given a collection of ids
    *
    * ##usage
    * <pre>
    * mediaResource.getByIds( [1234,2526,28262])
    *    .then(function(mediaArray) {
    *        var myDoc = contentArray;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {Array} ids ids of media items to return as an array
    * @returns {Promise} resourcePromise object containing the media items array.
    *
    */
  def getByIds(ids: js.Array[Double]): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#getChildren
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Gets children of a media item with a given id
    *
    * ##usage
    * <pre>
    * mediaResource.getChildren(1234, {pageSize: 10, pageNumber: 2})
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
  def getChildren(parentId: Double, options: Filter): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#getScaffold
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Returns a scaffold of an empty media item, given the id of the media item to place it underneath and the media type alias.
    *
    * - Parent Id must be provided so umbraco knows where to store the media
    * - Media Type alias must be provided so umbraco knows which properties to put on the media scaffold
    *
    * The scaffold is used to build editors for media that has not yet been populated with data.
    *
    * ##usage
    * <pre>
    * mediaResource.getScaffold(1234, 'folder')
    *    .then(function(scaffold) {
    *        var myDoc = scaffold;
    *        myDoc.name = "My new media item";
    *
    *        mediaResource.save(myDoc, true)
    *            .then(function(media){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @param {Int} parentId id of media item to return
    * @param {String} alias mediatype alias to base the scaffold on
    * @returns {Promise} resourcePromise object containing the media scaffold.
    *
    */
  def getScaffold(parentId: Double, alias: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#move
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Moves a node underneath a new parentId
    *
    * ##usage
    * <pre>
    * mediaResource.move({ parentId: 1244, id: 123 })
    *    .then(function() {
    *        alert("node was moved");
    *    }, function(err){
    *      alert("node didnt move:" + err.data.Message);
    *    });
    * </pre>
    * @param {Object} args arguments object
    * @param {Int} args.idd the ID of the node to move
    * @param {Int} args.parentId the ID of the parent node to move to
    * @returns {Promise} resourcePromise object.
    *
    */
  def move(args: js.Any*): IPromise[IResourcePromise] = js.native
  
  def rootMedia(): js.Any = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#save
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Saves changes made to a media item, if the media item is new, the isNew paramater must be passed to force creation
    * if the media item needs to have files attached, they must be provided as the files param and passed seperately
    *
    *
    * ##usage
    * <pre>
    * mediaResource.getById(1234)
    *    .then(function(media) {
    *          media.name = "I want a new name!";
    *          mediaResource.save(media, false)
    *            .then(function(media){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @param {Object} media The media item object with changes applied
    * @param {Bool} isNew set to true to create a new item or to update an existing
    * @param {Array} files collection of files for the media item
    * @returns {Promise} resourcePromise object containing the saved media item.
    *
    */
  def save(media: js.Object, isNew: Boolean, files: js.Array[_]): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaResource#sort
    * @methodOf umbraco.resources.mediaResource
    *
    * @description
    * Sorts all children below a given parent node id, based on a collection of node-ids
    *
    * ##usage
    * <pre>
    * var ids = [123,34533,2334,23434];
    * mediaResource.sort({ sortedIds: ids })
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
}
