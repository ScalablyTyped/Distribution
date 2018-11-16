package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.paginationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridPaginationApi extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_PaginationChanged
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

