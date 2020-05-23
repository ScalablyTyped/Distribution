package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a receipt printer station that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedReceiptPrinter")
@js.native
abstract class ClaimedReceiptPrinter ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.ClaimedReceiptPrinter {
  /** Gets or sets the number of characters the receipt printer station can print per line of text. */
  /* CompleteClass */
  override var charactersPerLine: Double = js.native
  /** Gets or sets the color cartridge that the receipt printer station should use when it prints. */
  /* CompleteClass */
  override var colorCartridge: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCartridge = js.native
  /** Gets whether the cartridge of the receipt printer station is currently out of ink or toner. */
  /* CompleteClass */
  override var isCartridgeEmpty: Boolean = js.native
  /** Gets whether the cartridge of the receipt printer station is currently removed. */
  /* CompleteClass */
  override var isCartridgeRemoved: Boolean = js.native
  /** Gets whether the cover of the receipt printer station is currently open. */
  /* CompleteClass */
  override var isCoverOpen: Boolean = js.native
  /** Gets whether the receipt printer station is currently cleaning its print head. */
  /* CompleteClass */
  override var isHeadCleaning: Boolean = js.native
  /** Gets or sets whether the receipt printer station prints with high quality or high speed. */
  /* CompleteClass */
  override var isLetterQuality: Boolean = js.native
  /** Gets whether the receipt printer station needs paper. */
  /* CompleteClass */
  override var isPaperEmpty: Boolean = js.native
  /** Gets whether the receipt printer station is almost out of paper. */
  /* CompleteClass */
  override var isPaperNearEnd: Boolean = js.native
  /** Gets whether the receipt printer station is on and accepting print jobs. */
  /* CompleteClass */
  override var isReadyToPrint: Boolean = js.native
  /** Gets or sets the current height of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  override var lineHeight: Double = js.native
  /** Gets or sets the spacing of each single-high print line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  /* CompleteClass */
  override var lineSpacing: Double = js.native
  /** Gets the current width of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  override var lineWidth: Double = js.native
  /** Gets the number of lines that must be advanced before cutting the receipt paper. */
  /* CompleteClass */
  override var linesToPaperCut: Double = js.native
  /** Gets the size of paper that the claimed receipt printer station currently uses. */
  /* CompleteClass */
  override var pageSize: Size = js.native
  /** Gets the print area for the receipt printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  override var printArea: Rect = js.native
  /** Gets the maximum number of characters that the receipt printer station can print on each line in sideways mode. */
  /* CompleteClass */
  override var sidewaysMaxChars: Double = js.native
  /** Gets the maximum number of lines that the receipt printer station can print in sideways mode. */
  /* CompleteClass */
  override var sidewaysMaxLines: Double = js.native
  /**
    * Creates a new print job for the receipt printer station.
    * @return The new print job for the receipt printer station.
    */
  /* CompleteClass */
  override def createJob(): typings.winrtUwp.Windows.Devices.PointOfService.ReceiptPrintJob = js.native
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the receipt printer station, before you use that data sequence when you call the ReceiptPrintJob.Print and ReceiptPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the ReceiptPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  /* CompleteClass */
  override def validateData(data: String): Boolean = js.native
}

