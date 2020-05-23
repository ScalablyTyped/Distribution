package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a journal printer station that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedJournalPrinter")
@js.native
abstract class ClaimedJournalPrinter ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.ClaimedJournalPrinter {
  /** Gets or sets the number of characters per line for the journal printer station. */
  /* CompleteClass */
  override var charactersPerLine: Double = js.native
  /** Gets or sets the color cartridge that the journal printer station should use when it prints. This property must agree with what is available through ColorCartridgeCapabilities . */
  /* CompleteClass */
  override var colorCartridge: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCartridge = js.native
  /** Gets whether the printer cartridge for the journal printer station is empty. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  /* CompleteClass */
  override var isCartridgeEmpty: Boolean = js.native
  /** Gets whether the cartridge for journal printer station has been removed. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  /* CompleteClass */
  override var isCartridgeRemoved: Boolean = js.native
  /** Gets whether the printer cover for the journal printer station is open. */
  /* CompleteClass */
  override var isCoverOpen: Boolean = js.native
  /** Gets whether the head for the journal printer station is currently cleaning. */
  /* CompleteClass */
  override var isHeadCleaning: Boolean = js.native
  /** Gets or sets whether the journal printer station prints with high quality or high speed. Note, this may throw an exception if the corresponding sensor is not available on the printer. */
  /* CompleteClass */
  override var isLetterQuality: Boolean = js.native
  /** Gets whether the paper is empty for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  /* CompleteClass */
  override var isPaperEmpty: Boolean = js.native
  /** Gets whether the printer paper is near the end for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  /* CompleteClass */
  override var isPaperNearEnd: Boolean = js.native
  /** Gets whether the journal printer station is ready to print. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  /* CompleteClass */
  override var isReadyToPrint: Boolean = js.native
  /** Gets or sets the current height of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  override var lineHeight: Double = js.native
  /** Gets or sets the spacing of each single-high print line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  /* CompleteClass */
  override var lineSpacing: Double = js.native
  /** Gets the current width of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  override var lineWidth: Double = js.native
  /**
    * Creates a new print job for the journal printer station.
    * @return The new print job for the journal printer station.
    */
  /* CompleteClass */
  override def createJob(): typings.winrtUwp.Windows.Devices.PointOfService.JournalPrintJob = js.native
  /**
    * Determines if a JournalPrintJob can successfully execute a print instruction with the specified data.
    * @param data The data sequence that you want to validate before you use it with the JournalPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  /* CompleteClass */
  override def validateData(data: String): Boolean = js.native
}

