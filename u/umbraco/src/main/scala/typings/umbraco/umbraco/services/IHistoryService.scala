package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.historyService
  *
  * @requires $rootScope
  * @requires $timeout
  * @requires angularHelper
  *
  * @description
  * Service to handle the main application navigation history. Responsible for keeping track
  * of where a user navigates to, stores an icon, url and name in a collection, to make it easy
  * for the user to go back to a previous editor / action
  *
  * **Note:** only works with new angular-based editors, not legacy ones
  *
  * ##usage
  * To use, simply inject the historyService into any controller that needs it, and make
  * sure the umbraco.services module is accesible - which it should be by default.
  */
@js.native
trait IHistoryService extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#add
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Adds a given history item to the users history collection.
    *
    * @param {Object} item the history item
    * @param {String} item.icon icon css class for the list, ex: "icon-image", "icon-doc"
    * @param {String} item.link route to the editor, ex: "/content/edit/1234"
    * @param {String} item.name friendly name for the history listing
    * @returns {Object} history item object
    */
  def add(item: IHistoryItem): IHistoryItem = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#getCurrent
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Method to return the current history collection.
    */
  def getCurrent(): js.Array[IHistoryItem] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#remove
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Removes a history item from the users history collection, given an index to remove from.
    *
    * @param {Int} index index to remove item from
    */
  def remove(index: Double): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.historyService#removeAll
    * @methodOf umbraco.services.historyService
    *
    * @description
    * Removes all history items from the users history collection
    */
  def removeAll(): Unit = js.native
}
object IHistoryService {
  
  @scala.inline
  def apply(
    add: IHistoryItem => IHistoryItem,
    getCurrent: () => js.Array[IHistoryItem],
    remove: Double => Unit,
    removeAll: () => Unit
  ): IHistoryService = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getCurrent = js.Any.fromFunction0(getCurrent), remove = js.Any.fromFunction1(remove), removeAll = js.Any.fromFunction0(removeAll))
    __obj.asInstanceOf[IHistoryService]
  }
  
  @scala.inline
  implicit class IHistoryServiceOps[Self <: IHistoryService] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: IHistoryItem => IHistoryItem): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrent(value: () => js.Array[IHistoryItem]): Self = this.set("getCurrent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAll(value: () => Unit): Self = this.set("removeAll", js.Any.fromFunction0(value))
  }
}
