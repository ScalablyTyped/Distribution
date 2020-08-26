package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.navigationService
  *
  * @requires $rootScope
  * @requires $routeParams
  * @requires $log
  * @requires $location
  * @requires dialogService
  * @requires treeService
  * @requires sectionResource
  *
  * @description
  * Service to handle the main application navigation. Responsible for invoking the tree
  * Section navigation and search, and maintain their state for the entire application lifetime
  *
  */
@js.native
trait INotificationsService extends js.Object {
  /**
    * @ngdoc property
    * @name umbraco.services.notificationsService#current
    * @propertyOf umbraco.services.notificationsService
    *
    * @description
    * Returns an array of current notifications to display
    *
    * @returns {string} returns an array
    */
  var current: js.Array[String] = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#add
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Lower level api for adding notifcations, support more advanced options
    * @param {Object} item The notification item
    * @param {String} item.headline Short headline
    * @param {String} item.message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @param {String} item.type Notification type, can be: "success","warning","error" or "info"
    * @param {String} item.url url to open when notification is clicked
    * @param {String} item.view path to custom view to load into the notification box
    * @param {Array} item.actions Collection of button actions to append (label, func, cssClass)
    * @param {Boolean} item.sticky if set to true, the notification will not auto-close
    * @returns {Object} args notification object
    */
  def add(item: INotificationItem): INotification = js.native
  def addView(view: String, args: js.Any*): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#error
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a red error notication to the notications collection
    * This should be used when an operations *fails* and could not complete
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def error(headline: String, message: String): INotification = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#getCurrent
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Method to return all notifications from the notifcations collection
    */
  def getCurrent(): js.Array[INotification] = js.native
  def hasView(view: String): Boolean = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#warning
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a yellow warning notication to the notications collection
    * This should be used when an operations *completes* but something was not as expected
    *
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def info(headline: String, message: String): INotification = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#remove
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Removes a notification from the notifcations collection at a given index
    *
    * @param {Int} index index where the notication should be removed from
    */
  def remove(index: Double): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#removeAll
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Removes all notifications from the notifcations collection
    */
  def removeAll(): Unit = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#showNotification
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Shows a notification based on the object passed in, normally used to render notifications sent back from the server
    *
    * @returns {Object} args notification object
    */
  def showNotification(args: INotificationArgs): INotification = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#success
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a green success notication to the notications collection
    * This should be used when an operations *completes* without errors
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def success(headline: String, message: String): INotification = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.notificationsService#warning
    * @methodOf umbraco.services.notificationsService
    *
    * @description
    * Adds a yellow warning notication to the notications collection
    * This should be used when an operations *completes* but something was not as expected
    *
    *
    * @param {String} headline Headline of the notification
    * @param {String} message longer text for the notication, trimmed after 200 characters, which can then be exanded
    * @returns {Object} notification object
    */
  def warning(headline: String, message: String): INotification = js.native
}

object INotificationsService {
  @scala.inline
  def apply(
    add: INotificationItem => INotification,
    addView: (String, /* repeated */ js.Any) => Unit,
    current: js.Array[String],
    error: (String, String) => INotification,
    getCurrent: () => js.Array[INotification],
    hasView: String => Boolean,
    info: (String, String) => INotification,
    remove: Double => Unit,
    removeAll: () => Unit,
    showNotification: INotificationArgs => INotification,
    success: (String, String) => INotification,
    warning: (String, String) => INotification
  ): INotificationsService = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addView = js.Any.fromFunction2(addView), current = current.asInstanceOf[js.Any], error = js.Any.fromFunction2(error), getCurrent = js.Any.fromFunction0(getCurrent), hasView = js.Any.fromFunction1(hasView), info = js.Any.fromFunction2(info), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll), showNotification = js.Any.fromFunction1(showNotification), success = js.Any.fromFunction2(success), warning = js.Any.fromFunction2(warning))
    __obj.asInstanceOf[INotificationsService]
  }
  @scala.inline
  implicit class INotificationsServiceOps[Self <: INotificationsService] (val x: Self) extends AnyVal {
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
    def setAdd(value: INotificationItem => INotification): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddView(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("addView", js.Any.fromFunction2(value))
    @scala.inline
    def setCurrentVarargs(value: String*): Self = this.set("current", js.Array(value :_*))
    @scala.inline
    def setCurrent(value: js.Array[String]): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: (String, String) => INotification): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def setGetCurrent(value: () => js.Array[INotification]): Self = this.set("getCurrent", js.Any.fromFunction0(value))
    @scala.inline
    def setHasView(value: String => Boolean): Self = this.set("hasView", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: (String, String) => INotification): Self = this.set("info", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("removeAll", js.Any.fromFunction0(value))
    @scala.inline
    def setShowNotification(value: INotificationArgs => INotification): Self = this.set("showNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: (String, String) => INotification): Self = this.set("success", js.Any.fromFunction2(value))
    @scala.inline
    def setWarning(value: (String, String) => INotification): Self = this.set("warning", js.Any.fromFunction2(value))
  }
  
}

