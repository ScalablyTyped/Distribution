package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsHtml5ColorOptionsMod.Html5ColorOptions
import typings.tablesorter.filteringFormatterOptionsHtml5NumberOptionsMod.Html5NumberOptions
import typings.tablesorter.filteringFormatterOptionsHtml5RangeOptionsMod.Html5RangeOptions
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterHtml5FormatterMod {
  
  @js.native
  trait Html5Formatter extends StObject {
    
    /**
      * Creates an html5 color-control.
      *
      * @param cell
      * The jQuery-object of the cell the control is added to.
      *
      * @param index
      * The column-index of the cell the control is added to.
      *
      * @param options
      * The options for the control-creation.
      *
      * @return
      * The jQuery-object of the created control.
      */
    def html5Color(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def html5Color(cell: JQuery[HTMLElement], index: Double, options: Html5ColorOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates an html5 number-control.
      *
      * @param cell
      * The jQuery-object of the cell the control is added to.
      *
      * @param index
      * The column-index of the cell the control is added to.
      *
      * @param options
      * The options for the control-creation.
      *
      * @return
      * The jQuery-object of the created control.
      */
    def html5Number(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def html5Number(cell: JQuery[HTMLElement], index: Double, options: Html5NumberOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates an html5 range-control.
      *
      * @param cell
      * The jQuery-object of the cell the control is added to.
      *
      * @param index
      * The column-index of the cell the control is added to.
      *
      * @param options
      * The options for the control-creation.
      *
      * @return
      * The jQuery-object of the created control.
      */
    def html5Range(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def html5Range(cell: JQuery[HTMLElement], index: Double, options: Html5RangeOptions): JQuery[HTMLElement] = js.native
  }
}
