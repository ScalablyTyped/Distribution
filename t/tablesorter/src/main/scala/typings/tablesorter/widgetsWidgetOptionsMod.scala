package typings.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typings.tablesorter.widgetsColumnWidgetOptionsMod.ColumnOptions
import typings.tablesorter.widgetsFilterOptionsMod.FilterOptions
import typings.tablesorter.widgetsPagerOptionsMod.PagerOptions
import typings.tablesorter.widgetsResizingOptionsMod.ResizingOptions
import typings.tablesorter.widgetsSaveSortOptionsMod.SaveSortOptions
import typings.tablesorter.widgetsStickyHeaderOptionsMod.StickyHeaderOptions
import typings.tablesorter.widgetsZebraOptionsMod.ZebraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsWidgetOptionsMod {
  
  trait WidgetOptions[TElement]
    extends StObject
       with ColumnOptions
       with FilterOptions[TElement]
       with ResizingOptions
       with SaveSortOptions
       with StickyHeaderOptions
       with PagerOptions[TElement]
       with ZebraOptions
       with /* option */ StringDictionary[Any]
  object WidgetOptions {
    
    inline def apply[TElement](): WidgetOptions[TElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetOptions[TElement]]
    }
  }
}
