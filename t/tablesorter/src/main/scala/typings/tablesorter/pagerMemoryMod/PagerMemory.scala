package typings.tablesorter.pagerMemoryMod

import typings.tablesorter.sortDefinitionMod.SortDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagerMemory extends js.Object {
  
  /**
    * The currently applied filters.
    */
  var currentFilters: js.Array[String] = js.native
  
  /**
    * The page-number.
    */
  var page: Double = js.native
  
  /**
    * The size of a page.
    */
  var size: Double = js.native
  
  /**
    * The sorting.
    */
  var sortList: js.Array[SortDefinition] = js.native
  
  /**
    * The total amount of rows.
    */
  var totalRows: Double = js.native
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
  
  @scala.inline
  implicit class PagerMemoryOps[Self <: PagerMemory] (val x: Self) extends AnyVal {
    
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
    def setCurrentFiltersVarargs(value: String*): Self = this.set("currentFilters", js.Array(value :_*))
    
    @scala.inline
    def setCurrentFilters(value: js.Array[String]): Self = this.set("currentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortListVarargs(value: SortDefinition*): Self = this.set("sortList", js.Array(value :_*))
    
    @scala.inline
    def setSortList(value: js.Array[SortDefinition]): Self = this.set("sortList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRows(value: Double): Self = this.set("totalRows", value.asInstanceOf[js.Any])
  }
}
