package typings.uiGrid.mod.pagination

import typings.uiGrid.AnonPaginationChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridPaginationApi extends js.Object {
  // Events
  var on: AnonPaginationChanged
  // Methods
  /**
    * Get the current page
    * @returns {number} the number of the current page
    */
  def getPage(): Double
  /**
    * Get the total number of pages
    * @returns {number} the total number of pages
    */
  def getTotalPages(): Double
  /**
    * Moves to the next page if possible
    */
  def nextPage(): Unit
  /**
    * Moves to the previous page if we're not on the first page.
    */
  def previousPage(): Unit
  /**
    * Moves to the requested page
    * @param {number} page The number of the page that should be displayed
    */
  def seek(page: Double): Unit
}

object IGridPaginationApi {
  @scala.inline
  def apply(
    getPage: () => Double,
    getTotalPages: () => Double,
    nextPage: () => Unit,
    on: AnonPaginationChanged,
    previousPage: () => Unit,
    seek: Double => Unit
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getTotalPages = js.Any.fromFunction0(getTotalPages), nextPage = js.Any.fromFunction0(nextPage), on = on.asInstanceOf[js.Any], previousPage = js.Any.fromFunction0(previousPage), seek = js.Any.fromFunction1(seek))
  
    __obj.asInstanceOf[IGridPaginationApi]
  }
}

