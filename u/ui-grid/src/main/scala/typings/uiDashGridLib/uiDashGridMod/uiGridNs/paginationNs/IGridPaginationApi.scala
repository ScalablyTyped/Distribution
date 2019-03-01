package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs

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
    getPage: js.Function0[scala.Double],
    getTotalPages: js.Function0[scala.Double],
    nextPage: js.Function0[scala.Unit],
    on: uiDashGridLib.Anon_HandlerPaginationChanged,
    previousPage: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit]
  ): IGridPaginationApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPage")(getPage)
    __obj.updateDynamic("getTotalPages")(getTotalPages)
    __obj.updateDynamic("nextPage")(nextPage)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("previousPage")(previousPage)
    __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[IGridPaginationApi]
  }
}

