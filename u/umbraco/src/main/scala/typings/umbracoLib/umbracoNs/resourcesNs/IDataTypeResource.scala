package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.dataTypeResource
  * @description Loads in data for data types
  **/
trait IDataTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#deleteById
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Deletes a data type with a given id
    *
    * ##usage
    * <pre>
    * dataTypeResource.deleteById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of content item to delete
    * @returns {Promise} resourcePromise object.
    *
    */
  def deleteById(id: scala.Double): angularLib.angularMod.IPromise[IResourcePromise]
  def getAll(): js.Any
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#getById
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Gets a data type item with a given id
    *
    * ##usage
    * <pre>
    * dataTypeResource.getById(1234)
    *    .then(function() {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {Int} id id of data type to retrieve
    * @returns {Promise} resourcePromise object.
    *
    */
  def getById(id: scala.Double): angularLib.angularMod.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#getPreValues
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Retrieves available prevalues for a given data type + editor
    *
    * ##usage
    * <pre>
    * dataTypeResource.getPrevalyes("Umbraco.MediaPicker", 1234)
    *    .then(function(prevalues) {
    *        alert('its gone!');
    *    });
    * </pre>
    *
    * @param {String} editorAlias string alias of editor type to retrive prevalues configuration for
    * @param {Int} id id of datatype to retrieve prevalues for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getPreValues(editorAlias: java.lang.String, dataTypeId: scala.Double): angularLib.angularMod.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.contentResource#getScaffold
    * @methodOf umbraco.resources.contentResource
    *
    * @description
    * Returns a scaffold of an empty data type item
    *
    * The scaffold is used to build editors for data types that has not yet been populated with data.
    *
    * ##usage
    * <pre>
    * dataTypeResource.getScaffold()
    *    .then(function(scaffold) {
    *        var myType = scaffold;
    *        myType.name = "My new data type";
    *
    *        dataTypeResource.save(myType, myType.preValues, true)
    *            .then(function(type){
    *                alert("Retrieved, updated and saved again");
    *            });
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the data type scaffold.
    *
    */
  def getScaffold(): angularLib.angularMod.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.dataTypeResource#save
    * @methodOf umbraco.resources.dataTypeResource
    *
    * @description
    * Saves or update a data type
    *
    * @param {Object} dataType data type object to create/update
    * @param {Array} preValues collection of prevalues on the datatype
    * @param {Bool} isNew set to true if type should be create instead of updated
    * @returns {Promise} resourcePromise object.
    *
    */
  def save(dataType: js.Object, preValues: js.Array[_], isNew: scala.Boolean): angularLib.angularMod.IPromise[IResourcePromise]
}

object IDataTypeResource {
  @scala.inline
  def apply(
    deleteById: scala.Double => angularLib.angularMod.IPromise[IResourcePromise],
    getAll: () => js.Any,
    getById: scala.Double => angularLib.angularMod.IPromise[IResourcePromise],
    getPreValues: (java.lang.String, scala.Double) => angularLib.angularMod.IPromise[IResourcePromise],
    getScaffold: () => angularLib.angularMod.IPromise[IResourcePromise],
    save: (js.Object, js.Array[_], scala.Boolean) => angularLib.angularMod.IPromise[IResourcePromise]
  ): IDataTypeResource = {
    val __obj = js.Dynamic.literal(deleteById = js.Any.fromFunction1(deleteById), getAll = js.Any.fromFunction0(getAll), getById = js.Any.fromFunction1(getById), getPreValues = js.Any.fromFunction2(getPreValues), getScaffold = js.Any.fromFunction0(getScaffold), save = js.Any.fromFunction3(save))
  
    __obj.asInstanceOf[IDataTypeResource]
  }
}

