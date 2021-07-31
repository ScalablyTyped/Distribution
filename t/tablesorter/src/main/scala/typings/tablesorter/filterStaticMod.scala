package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.parsedOptionMod.ParsedOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterStaticMod {
  
  @js.native
  trait FilterStatic[TElement] extends StObject {
    
    def bindSearch(table: TElement, controls: JQuery[HTMLElement], forceStart: Boolean): Unit = js.native
    /**
      * Adds new controls to the tablesorter as external search-filters.
      *
      * @param table
      * The table to add the external search to.
      * @param controls
      * The controls to bind as external search-controls.
      *
      * @param forceStart
      * A value indicating whether a new search should be performed after adding the controls.
      */
    def bindSearch(table: JQuery[TElement], controls: JQuery[HTMLElement], forceStart: Boolean): Unit = js.native
    
    def buildSelect(table: TElement, column: Double, options: String, replace: Boolean): Unit = js.native
    def buildSelect(table: TElement, column: Double, options: String, replace: Boolean, visibleOnly: Boolean): Unit = js.native
    def buildSelect(table: TElement, column: Double, options: js.Array[js.Any], replace: Boolean): Unit = js.native
    def buildSelect(table: TElement, column: Double, options: js.Array[js.Any], replace: Boolean, visibleOnly: Boolean): Unit = js.native
    def buildSelect(table: TElement, column: Double, options: JQuery[HTMLElement], replace: Boolean): Unit = js.native
    def buildSelect(
      table: TElement,
      column: Double,
      options: JQuery[HTMLElement],
      replace: Boolean,
      visibleOnly: Boolean
    ): Unit = js.native
    def buildSelect(table: JQuery[TElement], column: Double, options: String, replace: Boolean): Unit = js.native
    def buildSelect(table: JQuery[TElement], column: Double, options: String, replace: Boolean, visibleOnly: Boolean): Unit = js.native
    /**
      * Updates a select-control.
      *
      * @param table
      * The table to build the selec-control for.
      *
      * @param column
      * The index of the column to build the select-control for.
      *
      * @param options
      * The options to display in the select-control.
      *
      * @param replace
      * A value indicating whether to replace the current options with the new options.
      *
      * @param visibleOnly
      * A value indicating whether the new options should only include visible row-values if no `options` are defined.
      */
    def buildSelect(table: JQuery[TElement], column: Double, options: js.Array[js.Any], replace: Boolean): Unit = js.native
    def buildSelect(
      table: JQuery[TElement],
      column: Double,
      options: js.Array[js.Any],
      replace: Boolean,
      visibleOnly: Boolean
    ): Unit = js.native
    def buildSelect(table: JQuery[TElement], column: Double, options: JQuery[HTMLElement], replace: Boolean): Unit = js.native
    def buildSelect(
      table: JQuery[TElement],
      column: Double,
      options: JQuery[HTMLElement],
      replace: Boolean,
      visibleOnly: Boolean
    ): Unit = js.native
    
    def getOptionSource(table: TElement, column: Double): js.Array[ParsedOption] = js.native
    def getOptionSource(table: TElement, column: Double, visibleOnly: Boolean): js.Array[ParsedOption] = js.native
    /**
      * Gets all available column-values of a column.
      *
      * @param table
      * The table to get the options from.
      *
      * @param column
      * The index of the column to get the options from.
      *
      * @param visibleOnly
      * A value indicating whether only visible column-values should be included.
      *
      * @return
      * The values which appear in the column.
      */
    def getOptionSource(table: JQuery[TElement], column: Double): js.Array[ParsedOption] = js.native
    def getOptionSource(table: JQuery[TElement], column: Double, visibleOnly: Boolean): js.Array[ParsedOption] = js.native
    
    def getOptions(table: TElement, column: Double): js.Array[String] = js.native
    def getOptions(table: TElement, column: Double, visibleOnly: Boolean): js.Array[String] = js.native
    /**
      * Gets all available column-values of a column.
      *
      * @param table
      * The table to get the options from.
      *
      * @param column
      * The index of the column to get the options from.
      *
      * @param visibleOnly
      * A value indicating whether only visible column-values should be included.
      *
      * @return
      * The values which appear in the column.
      */
    def getOptions(table: JQuery[TElement], column: Double): js.Array[String] = js.native
    def getOptions(table: JQuery[TElement], column: Double, visibleOnly: Boolean): js.Array[String] = js.native
    
    def processOptions(table: TElement, column: Double, options: js.Array[js.Any]): js.Array[String] = js.native
    def processOptions(table: TElement, column: Null, options: js.Array[js.Any]): js.Array[String] = js.native
    def processOptions(table: TElement, column: Unit, options: js.Array[js.Any]): js.Array[String] = js.native
    /**
      * Processes and sorts the options according to the options of the specified `column`.
      *
      * @param table
      * The table to process the options for.
      *
      * @param column
      * The column to add the options to.
      *
      * @param options
      * The options to add.
      */
    def processOptions(table: JQuery[TElement], column: Double, options: js.Array[js.Any]): js.Array[String] = js.native
    def processOptions(table: JQuery[TElement], column: Null, options: js.Array[js.Any]): js.Array[String] = js.native
    def processOptions(table: JQuery[TElement], column: Unit, options: js.Array[js.Any]): js.Array[String] = js.native
  }
}
