package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsUidatecompareoptionsMod.UIDateCompareOptions
import typings.tablesorter.filteringFormatterOptionsUidaterangeoptionsMod.UIDateRangeOptions
import typings.tablesorter.filteringFormatterOptionsUirangeoptionsMod.UIRangeOptions
import typings.tablesorter.filteringFormatterOptionsUislideroptionsMod.UISliderOptions
import typings.tablesorter.filteringFormatterOptionsUispinneroptionsMod.UISpinnerOptions
import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterUiformatterMod {
  
  @js.native
  trait UIFormatter extends StObject {
    
    /**
      * Creates a jQueryUI date-comparsion control.
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
    def uiDateCompare(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def uiDateCompare(cell: JQuery[HTMLElement], index: Double, options: UIDateCompareOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates a jQueryUI datepicker-control.
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
    def uiDatepicker(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def uiDatepicker(cell: JQuery[HTMLElement], index: Double, options: UIDateRangeOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates a jQueryUI range-control.
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
    def uiRange(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def uiRange(cell: JQuery[HTMLElement], index: Double, options: UIRangeOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates a jQueryUI slider-control.
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
    def uiSlider(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def uiSlider(cell: JQuery[HTMLElement], index: Double, options: UISliderOptions): JQuery[HTMLElement] = js.native
    
    /**
      * Creates a jQueryUI spinner-control.
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
    def uiSpinner(cell: JQuery[HTMLElement], index: Double): JQuery[HTMLElement] = js.native
    def uiSpinner(cell: JQuery[HTMLElement], index: Double, options: UISpinnerOptions): JQuery[HTMLElement] = js.native
  }
}
