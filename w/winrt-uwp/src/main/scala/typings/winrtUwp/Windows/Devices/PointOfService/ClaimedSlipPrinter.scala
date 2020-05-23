package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a slip printer station that has been claimed for use. */
trait ClaimedSlipPrinter extends js.Object {
  /** Gets or sets the number of characters the slip printer station can print per line of text. */
  var charactersPerLine: Double
  /** Gets or sets the color cartridge that the slip printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge
  /** Gets whether the cartridge of the slip printer station is currently out of ink or toner. */
  var isCartridgeEmpty: Boolean
  /** Gets whether the cartridge of the slip printer station is currently removed. */
  var isCartridgeRemoved: Boolean
  /** Gets whether the cover of the slip printer station is currently open. */
  var isCoverOpen: Boolean
  /** Gets whether the slip printer station is currently cleaning its print head. */
  var isHeadCleaning: Boolean
  /** Gets or sets whether the slip printer station prints with high quality or high speed. */
  var isLetterQuality: Boolean
  /** Gets whether the slip printer station needs paper. */
  var isPaperEmpty: Boolean
  /** Gets whether the slip printer station is almost out of paper. */
  var isPaperNearEnd: Boolean
  /** Gets whether the slip printer station is on and accepting print jobs. */
  var isReadyToPrint: Boolean
  /** Gets or sets the current height of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double
  /** Gets or sets the spacing of each single-high print line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double
  /** Gets the current width of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double
  /** Gets the number of lines that the slip printer station can print after the ClaimedSlipPrinter.IsPaperNearEnd property is set to true but before the printer reaches the end of the slip. */
  var linesNearEndToEnd: Double
  /** Gets the maximum number of lines that the slip printer station can print on a form. */
  var maxLines: Double
  /** Gets the size of paper that the claimed slip printer station currently uses, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var pageSize: Size
  /** Gets the print area for the slip printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: Rect
  /** Gets the side of the sheet on which the claimed slip printer station is currently printing. */
  var printSide: PosPrinterPrintSide
  /** Gets the maximum number of characters that the slip printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: Double
  /** Gets the maximum number of lines that the slip printer station can print in sideways mode. */
  var sidewaysMaxLines: Double
  /**
    * Changes the side of the sheet on which the claimed slip printer station is currently printing.
    * @param printSide The side of the sheet on which the claimed slip printer station is currently printing.
    */
  def changePrintSide(printSide: PosPrinterPrintSide): Unit
  /** Closes the mechanism that holds the slip in place while the slip printer station is printing, typically after the user inserts or removes the slip. */
  def closeJaws(): Unit
  /**
    * Creates a new print job for the slip printer stiation.
    * @return The new print job for the slip printer station.
    */
  def createJob(): SlipPrintJob
  /**
    * Waits for the user to insert a slip into the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to insert the slip before exiting.
    * @return An asynchronous operation that returns true if the user inserts the slip within the specified time span, and returns false otherwise.
    */
  def insertSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean]
  /** Opens the mechanism that holds the slip in place while the slip printer station is printing, typically before the user inserts or removes the slip. */
  def openJaws(): Unit
  /**
    * Waits for the user to remove a slip from the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to remove the slip before exiting.
    * @return An asynchronous operation that returns true if the user removes the slip within the specified time span, and returns false otherwise.
    */
  def removeSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the slip printer station, before you use that data sequence when you call the SlipPrintJob.Print and SlipPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the SlipPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean
}

object ClaimedSlipPrinter {
  @scala.inline
  def apply(
    changePrintSide: PosPrinterPrintSide => Unit,
    charactersPerLine: Double,
    closeJaws: () => Unit,
    colorCartridge: PosPrinterColorCartridge,
    createJob: () => SlipPrintJob,
    insertSlipAsync: Double => IPromiseWithIAsyncOperation[Boolean],
    isCartridgeEmpty: Boolean,
    isCartridgeRemoved: Boolean,
    isCoverOpen: Boolean,
    isHeadCleaning: Boolean,
    isLetterQuality: Boolean,
    isPaperEmpty: Boolean,
    isPaperNearEnd: Boolean,
    isReadyToPrint: Boolean,
    lineHeight: Double,
    lineSpacing: Double,
    lineWidth: Double,
    linesNearEndToEnd: Double,
    maxLines: Double,
    openJaws: () => Unit,
    pageSize: Size,
    printArea: Rect,
    printSide: PosPrinterPrintSide,
    removeSlipAsync: Double => IPromiseWithIAsyncOperation[Boolean],
    sidewaysMaxChars: Double,
    sidewaysMaxLines: Double,
    validateData: String => Boolean
  ): ClaimedSlipPrinter = {
    val __obj = js.Dynamic.literal(changePrintSide = js.Any.fromFunction1(changePrintSide), charactersPerLine = charactersPerLine.asInstanceOf[js.Any], closeJaws = js.Any.fromFunction0(closeJaws), colorCartridge = colorCartridge.asInstanceOf[js.Any], createJob = js.Any.fromFunction0(createJob), insertSlipAsync = js.Any.fromFunction1(insertSlipAsync), isCartridgeEmpty = isCartridgeEmpty.asInstanceOf[js.Any], isCartridgeRemoved = isCartridgeRemoved.asInstanceOf[js.Any], isCoverOpen = isCoverOpen.asInstanceOf[js.Any], isHeadCleaning = isHeadCleaning.asInstanceOf[js.Any], isLetterQuality = isLetterQuality.asInstanceOf[js.Any], isPaperEmpty = isPaperEmpty.asInstanceOf[js.Any], isPaperNearEnd = isPaperNearEnd.asInstanceOf[js.Any], isReadyToPrint = isReadyToPrint.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], linesNearEndToEnd = linesNearEndToEnd.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], openJaws = js.Any.fromFunction0(openJaws), pageSize = pageSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], printSide = printSide.asInstanceOf[js.Any], removeSlipAsync = js.Any.fromFunction1(removeSlipAsync), sidewaysMaxChars = sidewaysMaxChars.asInstanceOf[js.Any], sidewaysMaxLines = sidewaysMaxLines.asInstanceOf[js.Any], validateData = js.Any.fromFunction1(validateData))
    __obj.asInstanceOf[ClaimedSlipPrinter]
  }
}

