package typings.tablesorter.widgetOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.tablesorter.columnWidgetOptionsMod.ColumnOptions
import typings.tablesorter.filterOptionsMod.FilterOptions
import typings.tablesorter.pagerOptionsMod.PagerOptions
import typings.tablesorter.resizingOptionsMod.ResizingOptions
import typings.tablesorter.saveSortOptionsMod.SaveSortOptions
import typings.tablesorter.stickyHeaderOptionsMod.StickyHeaderOptions
import typings.tablesorter.zebraOptionsMod.ZebraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetOptions[TElement]
  extends ColumnOptions
     with FilterOptions[TElement]
     with ResizingOptions
     with SaveSortOptions
     with StickyHeaderOptions
     with PagerOptions[TElement]
     with ZebraOptions
     with /* option */ StringDictionary[js.Any]
object WidgetOptions {
  
  @scala.inline
  def apply[TElement](): WidgetOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions[TElement]]
  }
}
