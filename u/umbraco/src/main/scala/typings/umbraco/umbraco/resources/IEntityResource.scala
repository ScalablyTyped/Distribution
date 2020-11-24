package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.entityResource
  * @description Loads in basic data for all entities
  *
  * ##What is an entity?
  * An entity is a basic **read-only** representation of an Umbraco node. It contains only the most
  * basic properties used to display the item in trees, lists and navigation.
  *
  * ##What is the difference between entity and content/media/etc...?
  * the entity only contains the basic node data, name, id and guid, whereas content
  * nodes fetched through the content service also contains additional all of the content property data, etc..
  * This is the same principal for all entity types. Any user that is logged in to the back office will have access
  * to view the basic entity information for all entities since the basic entity information does not contain sensitive information.
  *
  * ##Entity object types?
  * You need to specify the type of object you want returned.
  *
  * The core object types are:
  *
  * - Document
  * - Media
  * - Member
  * - Template
  * - DocumentType
  * - MediaType
  * - MemberType
  * - Macro
  * - User
  * - Language
  * - Domain
  * - DataType
  **/
@js.native
trait IEntityResource extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getEntityById
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets an entity with a given id
    *
    * ##usage
    * <pre>
    *
    * //Only return media
    * entityResource.getAll("Media")
    *    .then(function(ent) {
    *        var myDoc = ent;
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {string} type Object type name
    * @param {string} postFilter optional filter expression which will execute a dynamic where clause on the server
    * @param {string} postFilterParams optional parameters for the postFilter expression
    * @returns {Promise} resourcePromise object containing the entity.
    *
    */
  def getAll(`type`: String, postFilter: String, postFilterParams: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getAncestors
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets ancestor entities for a given item
    *
    *
    * @param {string} type Object type name
    * @returns {Promise} resourcePromise object containing the entity.
    *
    */
  def getAncestors(id: Double, `type`: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getById
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets an entity with a given id
    *
    * ##usage
    * <pre>
    * //get media by id
    * entityResource.getEntityById(0, "Media")
    *    .then(function(ent) {
    *        var myDoc = ent;
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of entity to return
    * @param {string} type Object type name
    * @returns {Promise} resourcePromise object containing the entity.
    *
    */
  def getById(id: Double, `type`: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getByIds
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets an array of entities, given a collection of ids
    *
    * ##usage
    * <pre>
    * //Get templates for ids
    * entityResource.getEntitiesByIds( [1234,2526,28262], "Template")
    *    .then(function(templateArray) {
    *        var myDoc = contentArray;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {Array} ids ids of entities to return as an array
    * @param {string} type type name
    * @returns {Promise} resourcePromise object containing the entity array.
    *
    */
  def getByIds(ids: js.Array[Double], `type`: String): IPromise[IResourcePromise] = js.native
  
  def getByQuery(query: String, nodeContextId: String, `type`: String): IPromise[IResourcePromise] = js.native
  def getByQuery(query: String, nodeContextId: Double, `type`: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getAncestors
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets children entities for a given item
    *
    *
    * @param {string} type Object type name
    * @returns {Promise} resourcePromise object containing the entity.
    *
    */
  def getChildren(id: Double, `type`: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#getPath
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Returns a path, given a node ID and type
    *
    * ##usage
    * <pre>
    * entityResource.getPath(id)
    *    .then(function(pathArray) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id Id of node to return the public url to
    * @param {string} type Object type name
    * @returns {Promise} resourcePromise object containing the url.
    *
    */
  def getPath(id: Double, `type`: String): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#searchMedia
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets an array of entities, given a lucene query and a type
    *
    * ##usage
    * <pre>
    * entityResource.search("news", "Media")
    *    .then(function(mediaArray) {
    *        var myDoc = mediaArray;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {String} Query search query
    * @param {String} Type type of conten to search
    * @returns {Promise} resourcePromise object containing the entity array.
    *
    */
  def search(query: String, `type`: String, searchFrom: js.Any, canceler: js.Any): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.entityResource#searchAll
    * @methodOf umbraco.resources.entityResource
    *
    * @description
    * Gets an array of entities from all available search indexes, given a lucene query
    *
    * ##usage
    * <pre>
    * entityResource.searchAll("bob")
    *    .then(function(array) {
    *        var myDoc = array;
    *        alert('they are here!');
    *    });
    * </pre>
    *
    * @param {String} Query search query
    * @returns {Promise} resourcePromise object containing the entity array.
    *
    */
  def searchAll(query: String, canceler: js.Any): IPromise[IResourcePromise] = js.native
}
