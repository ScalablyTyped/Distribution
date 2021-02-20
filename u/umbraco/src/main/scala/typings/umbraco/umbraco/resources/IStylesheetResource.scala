package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.stylesheetResource
  * @description service to retrieve available stylesheets
  *
  *
  **/
@js.native
trait IStylesheetResource extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getAll
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Gets all registered stylesheets
    *
    * ##usage
    * <pre>
    * stylesheetResource.getAll()
    *    .then(function(stylesheets) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the stylesheets.
    *
    */
  def getAll(): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getRules
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Returns all defined child rules for a stylesheet with a given ID
    *
    * ##usage
    * <pre>
    * stylesheetResource.getRules(2345)
    *    .then(function(rules) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the rules.
    *
    */
  def getRules(id: Double): IPromise[IResourcePromise] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.stylesheetResource#getRulesByName
    * @methodOf umbraco.resources.stylesheetResource
    *
    * @description
    * Returns all defined child rules for a stylesheet with a given name
    *
    * ##usage
    * <pre>
    * stylesheetResource.getRulesByName("ie7stylesheet")
    *    .then(function(rules) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @returns {Promise} resourcePromise object containing the rules.
    *
    */
  def getRulesByName(name: String): IPromise[IResourcePromise] = js.native
}
object IStylesheetResource {
  
  @scala.inline
  def apply(
    getAll: () => IPromise[IResourcePromise],
    getRules: Double => IPromise[IResourcePromise],
    getRulesByName: String => IPromise[IResourcePromise]
  ): IStylesheetResource = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll), getRules = js.Any.fromFunction1(getRules), getRulesByName = js.Any.fromFunction1(getRulesByName))
    __obj.asInstanceOf[IStylesheetResource]
  }
  
  @scala.inline
  implicit class IStylesheetResourceMutableBuilder[Self <: IStylesheetResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAll(value: () => IPromise[IResourcePromise]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRules(value: Double => IPromise[IResourcePromise]): Self = StObject.set(x, "getRules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRulesByName(value: String => IPromise[IResourcePromise]): Self = StObject.set(x, "getRulesByName", js.Any.fromFunction1(value))
  }
}
