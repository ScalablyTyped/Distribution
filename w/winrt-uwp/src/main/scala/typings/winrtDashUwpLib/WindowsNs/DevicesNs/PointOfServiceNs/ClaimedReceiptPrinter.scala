package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a receipt printer station that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedReceiptPrinter")
@js.native
abstract class ClaimedReceiptPrinter () extends js.Object {
  /** Gets or sets the number of characters the receipt printer station can print per line of text. */
  var charactersPerLine: scala.Double = js.native
  /** Gets or sets the color cartridge that the receipt printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge = js.native
  /** Gets whether the cartridge of the receipt printer station is currently out of ink or toner. */
  var isCartridgeEmpty: scala.Boolean = js.native
  /** Gets whether the cartridge of the receipt printer station is currently removed. */
  var isCartridgeRemoved: scala.Boolean = js.native
  /** Gets whether the cover of the receipt printer station is currently open. */
  var isCoverOpen: scala.Boolean = js.native
  /** Gets whether the receipt printer station is currently cleaning its print head. */
  var isHeadCleaning: scala.Boolean = js.native
  /** Gets or sets whether the receipt printer station prints with high quality or high speed. */
  var isLetterQuality: scala.Boolean = js.native
  /** Gets whether the receipt printer station needs paper. */
  var isPaperEmpty: scala.Boolean = js.native
  /** Gets whether the receipt printer station is almost out of paper. */
  var isPaperNearEnd: scala.Boolean = js.native
  /** Gets whether the receipt printer station is on and accepting print jobs. */
  var isReadyToPrint: scala.Boolean = js.native
  /** Gets or sets the current height of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: scala.Double = js.native
  /** Gets or sets the spacing of each single-high print line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: scala.Double = js.native
  /** Gets the current width of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: scala.Double = js.native
  /** Gets the number of lines that must be advanced before cutting the receipt paper. */
  var linesToPaperCut: scala.Double = js.native
  /** Gets the size of paper that the claimed receipt printer station currently uses. */
  var pageSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the print area for the receipt printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets the maximum number of characters that the receipt printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: scala.Double = js.native
  /** Gets the maximum number of lines that the receipt printer station can print in sideways mode. */
  var sidewaysMaxLines: scala.Double = js.native
  /**
    * Creates a new print job for the receipt printer station.
    * @return The new print job for the receipt printer station.
    */
  def createJob(): ReceiptPrintJob = js.native
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the receipt printer station, before you use that data sequence when you call the ReceiptPrintJob.Print and ReceiptPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the ReceiptPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: java.lang.String): scala.Boolean = js.native
}

