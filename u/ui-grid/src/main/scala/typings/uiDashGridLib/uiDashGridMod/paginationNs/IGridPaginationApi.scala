package typings
package uiDashGridLib.uiDashGridMod.paginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPaginationApi extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_HandlerPaginationChanged
  // Methods
  /**
    * Get the current page
    * @returns {number} the number of the current page
    */
  def getPage(): scala.Double
  /**
    * Get the total number of pages
    * @returns {number} the total number of pages
    */
  def getTotalPages(): scala.Double
  /**
    * Moves to the next page if possible
    */
  def nextPage(): scala.Unit
  /**
    * Moves to the previous page if we're not on the first page.
    */
  def previousPage(): scala.Unit
  /**
    * Moves to the requested page
    * @param {number} page The number of the page that should be displayed
    */
  def seek(page: scala.Double): scala.Unit
}

object IGridPaginationApi {
  @scala.inline
  def apply(
    getPage: () => scala.Double,
    getTotalPages: () => scala.Double,
    nextPage: () => scala.Unit,
    on: uiDashGridLib.Anon_HandlerPaginationChanged,
    previousPage: () => scala.Unit,
    seek: scala.Double => scala.Unit
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getTotalPages = js.Any.fromFunction0(getTotalPages), nextPage = js.Any.fromFunction0(nextPage), on = on, previousPage = js.Any.fromFunction0(previousPage), seek = js.Any.fromFunction1(seek))
  
    __obj.asInstanceOf[IGridPaginationApi]
  }
}

