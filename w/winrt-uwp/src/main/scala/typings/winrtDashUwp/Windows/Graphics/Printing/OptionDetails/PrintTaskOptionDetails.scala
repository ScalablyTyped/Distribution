package typings.winrtDashUwp.Windows.Graphics.Printing.OptionDetails

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintPageDescription
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintTaskOptions
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.beginvalidation
import typings.winrtDashUwp.winrtDashUwpStrings.optionchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of events, methods and properties for advanced print tasks. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
abstract class PrintTaskOptionDetails () extends js.Object {
  /** Gets the list of print task options that are currently displayed. */
  var displayedOptions: IVector[String] = js.native
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  @JSName("onbeginvalidation")
  var onbeginvalidation_Original: TypedEventHandler[PrintTaskOptionDetails, _] = js.native
  /** Raised when any one of the advanced print task options is changed. */
  @JSName("onoptionchanged")
  var onoptionchanged_Original: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs] = js.native
  /** Gets the list of options for the advanced print task. */
  var options: IMapView[String, IPrintOptionDetails] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beginvalidation(`type`: beginvalidation, listener: TypedEventHandler[PrintTaskOptionDetails, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionchanged(
    `type`: optionchanged,
    listener: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): Unit = js.native
  /**
    * Creates a custom list of items that allow the user to choose the page format.
    * @param optionId The ID for the custom item.
    * @param displayName The display name for the custom item.
    * @return The list of custom items.
    */
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  /**
    * Creates a CustomPrintTaskOptionText object to handle the display name and other parameters of the advanced print task option item.
    * @param optionId The ID of the print task option.
    * @param displayName The display name of the print task option.
    * @return The CustomPrintTaskOptionText object.
    */
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  /**
    * Returns a PrintPageDescription object for the referenced page number.
    * @param jobPageNumber The page number.
    * @return The PrintPageDescription object.
    */
  def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  def onbeginvalidation(ev: js.Any with WinRTEvent[PrintTaskOptionDetails]): Unit = js.native
  /** Raised when any one of the advanced print task options is changed. */
  def onoptionchanged(ev: PrintTaskOptionChangedEventArgs with WinRTEvent[PrintTaskOptionDetails]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beginvalidation(`type`: beginvalidation, listener: TypedEventHandler[PrintTaskOptionDetails, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionchanged(
    `type`: optionchanged,
    listener: TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  /**
    * Used to retrieve the available options for a print task.
    * @param printTaskOptions Pointer to a PrintTaskOptions object.
    * @return Pointer to a PrintTaskOptionDetails object.
    */
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}

