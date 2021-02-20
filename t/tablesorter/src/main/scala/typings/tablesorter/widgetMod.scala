package typings.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @js.native
  trait Widget[TElement] extends StObject {
    
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
      * The identification of the widget.
      */
    var id: String = js.native
    
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
      * The default options of the widget.
      */
    var options: StringDictionary[js.Any] = js.native
    
    /**
      * The priority of the widget.
      */
    var priority: Double = js.native
    
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
    implicit class WidgetMutableBuilder[Self <: Widget[_], TElement] (val x: Self with Widget[TElement]) extends AnyVal {
      
      @scala.inline
      def setFormat(
        value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
      ): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(
        value: (TElement, Widget[TElement], TablesorterConfigurationStore[TElement], StringDictionary[js.Any]) => Unit
      ): Self = StObject.set(x, "init", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(
        value: (TElement, TablesorterConfigurationStore[TElement], StringDictionary[js.Any], Boolean) => Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction4(value))
    }
  }
}
