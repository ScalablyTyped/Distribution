package typings.uiGrid.mod.pagination

import typings.uiGrid.anon.PaginationChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridPaginationApi extends js.Object {
  // Events
  var on: PaginationChanged = js.native
  // Methods
  /**
    * Get the current page
    * @returns {number} the number of the current page
    */
  def getPage(): Double = js.native
  /**
    * Get the total number of pages
    * @returns {number} the total number of pages
    */
  def getTotalPages(): Double = js.native
  /**
    * Moves to the next page if possible
    */
  def nextPage(): Unit = js.native
  /**
    * Moves to the previous page if we're not on the first page.
    */
  def previousPage(): Unit = js.native
  /**
    * Moves to the requested page
    * @param {number} page The number of the page that should be displayed
    */
  def seek(page: Double): Unit = js.native
}

object IGridPaginationApi {
  @scala.inline
  def apply(
    getPage: () => Double,
    getTotalPages: () => Double,
    nextPage: () => Unit,
    on: PaginationChanged,
    previousPage: () => Unit,
    seek: Double => Unit
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction0(getPage), getTotalPages = js.Any.fromFunction0(getTotalPages), nextPage = js.Any.fromFunction0(nextPage), on = on.asInstanceOf[js.Any], previousPage = js.Any.fromFunction0(previousPage), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[IGridPaginationApi]
  }
  @scala.inline
  implicit class IGridPaginationApiOps[Self <: IGridPaginationApi] (val x: Self) extends AnyVal {
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
    def setGetPage(value: () => Double): Self = this.set("getPage", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTotalPages(value: () => Double): Self = this.set("getTotalPages", js.Any.fromFunction0(value))
    @scala.inline
    def setNextPage(value: () => Unit): Self = this.set("nextPage", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: PaginationChanged): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousPage(value: () => Unit): Self = this.set("previousPage", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
  }
  
}

