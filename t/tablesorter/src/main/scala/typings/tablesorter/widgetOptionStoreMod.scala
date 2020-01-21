package typings.tablesorter

import typings.tablesorter.mod._Global_.HTMLElement
import typings.tablesorter.mod._Global_.JQuery
import typings.tablesorter.widgetOptionsMod.WidgetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Widgets/WidgetOptionStore", JSImport.Namespace)
@js.native
object widgetOptionStoreMod extends js.Object {
  @js.native
  trait WidgetOptionStore[TElement] extends WidgetOptions[TElement] {
    /**
      * The jQuery-object containing the cloned table for the sticky headers.
      */
    @JSName("$sticky")
    var $sticky: JQuery[HTMLElement] = js.native
    /**
      * A jQuery-object containing all filters which are bound to all columns.
      */
    @JSName("filter_$anyMatch")
    var filter_$anyMatch: JQuery[HTMLElement] = js.native
    /**
      * A jQuery-object containing all external filters.
      */
    @JSName("filter_$externalFilters")
    var filter_$externalFilters: JQuery[HTMLElement] = js.native
    /**
      * A value indicating whether the filters have initialized.
      */
    var filter_initialized: Boolean = js.native
  }
  
}

