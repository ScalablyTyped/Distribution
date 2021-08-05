package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.dataTypeResource
  * @description Loads in data for data types
  **/
trait IDataTypeResource extends StObject {
  
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
  def deleteById(id: Double): IPromise[IResourcePromise]
  
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
  def getById(id: Double): IPromise[IResourcePromise]
  
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
  def getPreValues(editorAlias: String, dataTypeId: Double): IPromise[IResourcePromise]
  
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
  def getScaffold(): IPromise[IResourcePromise]
  
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
  def save(dataType: js.Object, preValues: js.Array[js.Any], isNew: Boolean): IPromise[IResourcePromise]
}
object IDataTypeResource {
  
  inline def apply(
    deleteById: Double => IPromise[IResourcePromise],
    getAll: () => js.Any,
    getById: Double => IPromise[IResourcePromise],
    getPreValues: (String, Double) => IPromise[IResourcePromise],
    getScaffold: () => IPromise[IResourcePromise],
    save: (js.Object, js.Array[js.Any], Boolean) => IPromise[IResourcePromise]
  ): IDataTypeResource = {
    val __obj = js.Dynamic.literal(deleteById = js.Any.fromFunction1(deleteById), getAll = js.Any.fromFunction0(getAll), getById = js.Any.fromFunction1(getById), getPreValues = js.Any.fromFunction2(getPreValues), getScaffold = js.Any.fromFunction0(getScaffold), save = js.Any.fromFunction3(save))
    __obj.asInstanceOf[IDataTypeResource]
  }
  
  extension [Self <: IDataTypeResource](x: Self) {
    
    inline def setDeleteById(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "deleteById", js.Any.fromFunction1(value))
    
    inline def setGetAll(value: () => js.Any): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    
    inline def setGetById(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "getById", js.Any.fromFunction1(value))
    
    inline def setGetPreValues(value: (String, Double) => IPromise[IResourcePromise]): Self = StObject.set(x, "getPreValues", js.Any.fromFunction2(value))
    
    inline def setGetScaffold(value: () => IPromise[IResourcePromise]): Self = StObject.set(x, "getScaffold", js.Any.fromFunction0(value))
    
    inline def setSave(value: (js.Object, js.Array[js.Any], Boolean) => IPromise[IResourcePromise]): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
  }
}
