package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a slip printer station that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedSlipPrinter")
@js.native
abstract class ClaimedSlipPrinter () extends js.Object {
  /** Gets or sets the number of characters the slip printer station can print per line of text. */
  var charactersPerLine: scala.Double = js.native
  /** Gets or sets the color cartridge that the slip printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge = js.native
  /** Gets whether the cartridge of the slip printer station is currently out of ink or toner. */
  var isCartridgeEmpty: scala.Boolean = js.native
  /** Gets whether the cartridge of the slip printer station is currently removed. */
  var isCartridgeRemoved: scala.Boolean = js.native
  /** Gets whether the cover of the slip printer station is currently open. */
  var isCoverOpen: scala.Boolean = js.native
  /** Gets whether the slip printer station is currently cleaning its print head. */
  var isHeadCleaning: scala.Boolean = js.native
  /** Gets or sets whether the slip printer station prints with high quality or high speed. */
  var isLetterQuality: scala.Boolean = js.native
  /** Gets whether the slip printer station needs paper. */
  var isPaperEmpty: scala.Boolean = js.native
  /** Gets whether the slip printer station is almost out of paper. */
  var isPaperNearEnd: scala.Boolean = js.native
  /** Gets whether the slip printer station is on and accepting print jobs. */
  var isReadyToPrint: scala.Boolean = js.native
  /** Gets or sets the current height of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: scala.Double = js.native
  /** Gets or sets the spacing of each single-high print line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: scala.Double = js.native
  /** Gets the current width of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: scala.Double = js.native
  /** Gets the number of lines that the slip printer station can print after the ClaimedSlipPrinter.IsPaperNearEnd property is set to true but before the printer reaches the end of the slip. */
  var linesNearEndToEnd: scala.Double = js.native
  /** Gets the maximum number of lines that the slip printer station can print on a form. */
  var maxLines: scala.Double = js.native
  /** Gets the size of paper that the claimed slip printer station currently uses, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var pageSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the print area for the slip printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets the side of the sheet on which the claimed slip printer station is currently printing. */
  var printSide: PosPrinterPrintSide = js.native
  /** Gets the maximum number of characters that the slip printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: scala.Double = js.native
  /** Gets the maximum number of lines that the slip printer station can print in sideways mode. */
  var sidewaysMaxLines: scala.Double = js.native
  /**
    * Changes the side of the sheet on which the claimed slip printer station is currently printing.
    * @param printSide The side of the sheet on which the claimed slip printer station is currently printing.
    */
  def changePrintSide(printSide: PosPrinterPrintSide): scala.Unit = js.native
  /** Closes the mechanism that holds the slip in place while the slip printer station is printing, typically after the user inserts or removes the slip. */
  def closeJaws(): scala.Unit = js.native
  /**
    * Creates a new print job for the slip printer stiation.
    * @return The new print job for the slip printer station.
    */
  def createJob(): SlipPrintJob = js.native
  /**
    * Waits for the user to insert a slip into the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to insert the slip before exiting.
    * @return An asynchronous operation that returns true if the user inserts the slip within the specified time span, and returns false otherwise.
    */
  def insertSlipAsync(timeout: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /** Opens the mechanism that holds the slip in place while the slip printer station is printing, typically before the user inserts or removes the slip. */
  def openJaws(): scala.Unit = js.native
  /**
    * Waits for the user to remove a slip from the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to remove the slip before exiting.
    * @return An asynchronous operation that returns true if the user removes the slip within the specified time span, and returns false otherwise.
    */
  def removeSlipAsync(timeout: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the slip printer station, before you use that data sequence when you call the SlipPrintJob.Print and SlipPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the SlipPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: java.lang.String): scala.Boolean = js.native
}

