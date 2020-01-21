package typings.tablesorter.pagerMemoryMod

import typings.tablesorter.sortDefinitionMod.SortDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerMemory extends js.Object {
  /**
    * The currently applied filters.
    */
  var currentFilters: js.Array[String]
  /**
    * The page-number.
    */
  var page: Double
  /**
    * The size of a page.
    */
  var size: Double
  /**
    * The sorting.
    */
  var sortList: js.Array[SortDefinition]
  /**
    * The total amount of rows.
    */
  var totalRows: Double
}

object PagerMemory {
  @scala.inline
  def apply(
    currentFilters: js.Array[String],
    page: Double,
    size: Double,
    sortList: js.Array[SortDefinition],
    totalRows: Double
  ): PagerMemory = {
    val __obj = js.Dynamic.literal(currentFilters = currentFilters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sortList = sortList.asInstanceOf[js.Any], totalRows = totalRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PagerMemory]
  }
}

