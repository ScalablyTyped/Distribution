package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.memberResource
  * @description Loads in data for members
  **/
trait IMemberResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.memberResource#deleteByKey
    * @methodOf umbraco.resources.memberResource
    *
    * @description
    * Deletes a member item with a given key
    *
    * ##usage
    * <pre>
    * memberResource.deleteByKey("0000-0000-000-00000-000")
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Guid} key id of member item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def deleteByKey(key: String): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.memberResource#getByKey
    * @methodOf umbraco.resources.memberResource
    *
    * @description
    * Gets a member item with a given key
    *
    * ##usage
    * <pre>
    * memberResource.getByKey("0000-0000-000-00000-000")
    *    .then(function(member) {
    *        var mymember = member;
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Guid} key key of member item to return
    * @returns {Promise} resourcePromise object containing the member item.
    *
    */
  def getByKey(key: String): IPromise[IResourcePromise]
  def getListNode(listName: String): js.Any
  def getPagedResults(memberTypeAlias: String, options: js.Any): js.Any
  /**
    * @ngdoc method
    * @name umbraco.resources.memberResource#getScaffold
    * @methodOf umbraco.resources.memberResource
    *
    * @description
    * Returns a scaffold of an empty member item, given the id of the member item to place it underneath and the member type alias.
    *
    * - Member Type alias must be provided so umbraco knows which properties to put on the member scaffold
    *
    * The scaffold is used to build editors for member that has not yet been populated with data.
    *
    * ##usage
    * <pre>
    * memberResource.getScaffold('client')
    *    .then(function(scaffold) {
    *        var myDoc = scaffold;
    *        myDoc.name = "My new member item";
    *
    *        memberResource.save(myDoc, true)
    *            .then(function(member){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @param {String} alias membertype alias to base the scaffold on
    * @returns {Promise} resourcePromise object containing the member scaffold.
    *
    */
  def getScaffold(alias: String): IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.memberResource#save
    * @methodOf umbraco.resources.memberResource
    *
    * @description
    * Saves changes made to a member, if the member is new, the isNew paramater must be passed to force creation
    * if the member needs to have files attached, they must be provided as the files param and passed seperately
    *
    *
    * ##usage
    * <pre>
    * memberResource.getBykey("23234-sd8djsd-3h8d3j-sdh8d")
    *    .then(function(member) {
    *          member.name = "Bob";
    *          memberResource.save(member, false)
    *            .then(function(member){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @param {Object} media The member item object with changes applied
    * @param {Bool} isNew set to true to create a new item or to update an existing
    * @param {Array} files collection of files for the media item
    * @returns {Promise} resourcePromise object containing the saved media item.
    *
    */
  def save(member: js.Object, isNew: Boolean, files: js.Array[_]): IPromise[IResourcePromise]
}

object IMemberResource {
  @scala.inline
  def apply(
    deleteByKey: String => IPromise[IResourcePromise],
    getByKey: String => IPromise[IResourcePromise],
    getListNode: String => js.Any,
    getPagedResults: (String, js.Any) => js.Any,
    getScaffold: String => IPromise[IResourcePromise],
    save: (js.Object, Boolean, js.Array[_]) => IPromise[IResourcePromise]
  ): IMemberResource = {
    val __obj = js.Dynamic.literal(deleteByKey = js.Any.fromFunction1(deleteByKey), getByKey = js.Any.fromFunction1(getByKey), getListNode = js.Any.fromFunction1(getListNode), getPagedResults = js.Any.fromFunction2(getPagedResults), getScaffold = js.Any.fromFunction1(getScaffold), save = js.Any.fromFunction3(save))
  
    __obj.asInstanceOf[IMemberResource]
  }
}

