package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.uidatecompareoptionsMod.UIDateCompareOptions
import typings.tablesorter.uidaterangeoptionsMod.UIDateRangeOptions
import typings.tablesorter.uirangeoptionsMod.UIRangeOptions
import typings.tablesorter.uislideroptionsMod.UISliderOptions
import typings.tablesorter.uispinneroptionsMod.UISpinnerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/Formatter/UIFormatter", JSImport.Namespace)
@js.native
object uiformatterMod extends js.Object {
  
  @js.native
  trait UIFormatter extends js.Object {
    
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
