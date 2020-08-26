package typings.tablesorter.widgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget[TElement] extends js.Object {
  /**
    * The identification of the widget.
    */
  var id: String = js.native
  /**
    * The default options of the widget.
    */
  var options: StringDictionary[js.Any] = js.native
  /**
    * The priority of the widget.
    */
  var priority: Double = js.native
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
  ): Unit = js.native
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
  ): Unit = js.native
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
  ): Unit = js.native
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
  @scala.inline
  implicit class WidgetOps[Self <: Widget[_], TElement] (val x: Self with Widget[TElement]) extends AnyVal {
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
    def setFormat(
      value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
    ): Self = this.set("format", js.Any.fromFunction4(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(
      value: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Unit
    ): Self = this.set("init", js.Any.fromFunction4(value))
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(
      value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
    ): Self = this.set("remove", js.Any.fromFunction4(value))
  }
  
}

