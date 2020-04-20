package typings.tablesorter.widgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget[TElement] extends js.Object {
  /**
    * The identification of the widget.
    */
  var id: String
  /**
    * The default options of the widget.
    */
  var options: StringDictionary[js.Any]
  /**
    * The priority of the widget.
    */
  var priority: Double
  /**
    * Pre-processes the table after applying a sort.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param initializing
    * A value indicating whether the widget is being initialized.
    */
  def format(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    initializing: Boolean
  ): Unit
  /**
    * Initializes the widget.
    *
    * @param table
    * The table which is being processed.
    *
    * @param thisWidget
    * This instance of the widget.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    */
  def init(
    table: TElement,
    thisWidget: this.type,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any]
  ): Unit
  /**
    * Removes the widget from the table.
    *
    * @param table
    * The table which is being processed.
    *
    * @param config
    * The configuration of the tablesorter.
    *
    * @param widgetOptions
    * The widget-options of the tablesorter.
    *
    * @param refreshing
    * A value indicating whether the widgets are being refreshed.
    */
  def remove(
    table: TElement,
    config: TablesorterConfigurationStore[TElement],
    widgetOptions: StringDictionary[js.Any],
    refreshing: Boolean
  ): Unit
}

object Widget {
  @scala.inline
  def apply[TElement](
    format: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit,
    id: String,
    init: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Unit,
    options: StringDictionary[js.Any],
    priority: Double,
    remove: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
  ): Widget[TElement] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction4(format), id = id.asInstanceOf[js.Any], init = js.Any.fromFunction4(init), options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], remove = js.Any.fromFunction4(remove))
    __obj.asInstanceOf[Widget[TElement]]
  }
}

