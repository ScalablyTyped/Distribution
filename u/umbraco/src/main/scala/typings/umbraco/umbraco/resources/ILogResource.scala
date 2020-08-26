package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import typings.std.Date
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
@js.native
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
  def getEntityLog(id: Double): IPromise[IResourcePromise] = js.native
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
  def getLog(`type`: LogType, since: Date): IPromise[IResourcePromise] = js.native
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
  def getUserLog(`type`: LogType, since: Date): IPromise[IResourcePromise] = js.native
}

object ILogResource {
  @scala.inline
  def apply(
    getEntityLog: Double => IPromise[IResourcePromise],
    getLog: (LogType, Date) => IPromise[IResourcePromise],
    getUserLog: (LogType, Date) => IPromise[IResourcePromise]
  ): ILogResource = {
    val __obj = js.Dynamic.literal(getEntityLog = js.Any.fromFunction1(getEntityLog), getLog = js.Any.fromFunction2(getLog), getUserLog = js.Any.fromFunction2(getUserLog))
    __obj.asInstanceOf[ILogResource]
  }
  @scala.inline
  implicit class ILogResourceOps[Self <: ILogResource] (val x: Self) extends AnyVal {
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
    def setGetEntityLog(value: Double => IPromise[IResourcePromise]): Self = this.set("getEntityLog", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLog(value: (LogType, Date) => IPromise[IResourcePromise]): Self = this.set("getLog", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUserLog(value: (LogType, Date) => IPromise[IResourcePromise]): Self = this.set("getUserLog", js.Any.fromFunction2(value))
  }
  
}

