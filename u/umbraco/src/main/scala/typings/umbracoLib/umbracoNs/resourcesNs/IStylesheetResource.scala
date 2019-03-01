package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.stylesheetResource
  * @description service to retrieve available stylesheets
  *
  *
  **/
trait IStylesheetResource extends js.Object {
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
  def getAll(): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
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
  def getRules(id: scala.Double): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
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
  def getRulesByName(name: java.lang.String): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
}

object IStylesheetResource {
  @scala.inline
  def apply(
    getAll: js.Function0[angularLib.angularMod.angularNs.IPromise[IResourcePromise]],
    getRules: js.Function1[scala.Double, angularLib.angularMod.angularNs.IPromise[IResourcePromise]],
    getRulesByName: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[IResourcePromise]]
  ): IStylesheetResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAll")(getAll)
    __obj.updateDynamic("getRules")(getRules)
    __obj.updateDynamic("getRulesByName")(getRulesByName)
    __obj.asInstanceOf[IStylesheetResource]
  }
}

