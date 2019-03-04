package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.logResource
  * @description Retrives log history from umbraco
  *
  *
  **/
trait ILogResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getEntityLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a give entity id
    *
    * ##usage
    * <pre>
    * logResource.getEntityLog(1234)
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {Int} id id of entity to return log history
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getEntityLog(id: scala.Double): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getLog(`type`: LogType, since: stdLib.Date): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.logResource#getUserLog
    * @methodOf umbraco.resources.logResource
    *
    * @description
    * Gets the current users' log history for a given type of log entry
    *
    * ##usage
    * <pre>
    * logResource.getUserLog("save", new Date())
    *    .then(function(log) {
    *        alert('its here!');
    *    });
    * </pre>
    *
    * @param {String} type logtype to query for
    * @param {DateTime} since query the log back to this date, by defalt 7 days ago
    * @returns {Promise} resourcePromise object containing the log.
    *
    */
  def getUserLog(`type`: LogType, since: stdLib.Date): angularLib.angularMod.angularNs.IPromise[IResourcePromise]
}

object ILogResource {
  @scala.inline
  def apply(
    getEntityLog: js.Function1[scala.Double, angularLib.angularMod.angularNs.IPromise[IResourcePromise]],
    getLog: js.Function2[LogType, stdLib.Date, angularLib.angularMod.angularNs.IPromise[IResourcePromise]],
    getUserLog: js.Function2[LogType, stdLib.Date, angularLib.angularMod.angularNs.IPromise[IResourcePromise]]
  ): ILogResource = {
    val __obj = js.Dynamic.literal(getEntityLog = getEntityLog, getLog = getLog, getUserLog = getUserLog)
  
    __obj.asInstanceOf[ILogResource]
  }
}

