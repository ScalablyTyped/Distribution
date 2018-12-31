package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of events, methods and properties for advanced print tasks. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
abstract class PrintTaskOptionDetails () extends js.Object {
  /** Gets the list of print task options that are currently displayed. */
  var displayedOptions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  @JSName("onbeginvalidation")
  var onbeginvalidation_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, _] = js.native
  /** Raised when any one of the advanced print task options is changed. */
  @JSName("onoptionchanged")
  var onoptionchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs] = js.native
  /** Gets the list of options for the advanced print task. */
  var options: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IPrintOptionDetails] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beginvalidation(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.beginvalidation,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Creates a custom list of items that allow the user to choose the page format.
    * @param optionId The ID for the custom item.
    * @param displayName The display name for the custom item.
    * @return The list of custom items.
    */
  def createItemListOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomItemListOptionDetails = js.native
  /**
    * Creates a CustomPrintTaskOptionText object to handle the display name and other parameters of the advanced print task option item.
    * @param optionId The ID of the print task option.
    * @param displayName The display name of the print task option.
    * @return The CustomPrintTaskOptionText object.
    */
  def createTextOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomTextOptionDetails = js.native
  /**
    * Returns a PrintPageDescription object for the referenced page number.
    * @param jobPageNumber The page number.
    * @return The PrintPageDescription object.
    */
  def getPageDescription(jobPageNumber: scala.Double): winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintPageDescription = js.native
  /** Raised when the print system begins a validation pass on the current state of the print ticket. */
  def onbeginvalidation(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTaskOptionDetails]): scala.Unit = js.native
  /** Raised when any one of the advanced print task options is changed. */
  def onoptionchanged(
    ev: PrintTaskOptionChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTaskOptionDetails]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beginvalidation(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.beginvalidation,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskOptionDetails, PrintTaskOptionChangedEventArgs]
  ): scala.Unit = js.native
}

/** A collection of events, methods and properties for advanced print tasks. */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  /**
    * Used to retrieve the available options for a print task.
    * @param printTaskOptions Pointer to a PrintTaskOptions object.
    * @return Pointer to a PrintTaskOptionDetails object.
    */
  def getFromPrintTaskOptions(printTaskOptions: winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions): winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintTaskOptionDetails = js.native
}

