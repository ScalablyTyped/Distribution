package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
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
@js.native
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
  implicit class IStylesheetResourceOps[Self <: IStylesheetResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAll(value: () => IPromise[IResourcePromise]): Self = this.set("getAll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRules(value: Double => IPromise[IResourcePromise]): Self = this.set("getRules", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRulesByName(value: String => IPromise[IResourcePromise]): Self = this.set("getRulesByName", js.Any.fromFunction1(value))
  }
  
}

