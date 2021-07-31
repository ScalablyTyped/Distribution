package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a slip printer station that has been claimed for use. */
@JSGlobal("Windows.Devices.PointOfService.ClaimedSlipPrinter")
@js.native
abstract class ClaimedSlipPrinter ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.ClaimedSlipPrinter {
  
  /**
    * Changes the side of the sheet on which the claimed slip printer station is currently printing.
    * @param printSide The side of the sheet on which the claimed slip printer station is currently printing.
    */
  /* CompleteClass */
  override def changePrintSide(printSide: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterPrintSide): Unit = js.native
  
  /** Gets or sets the number of characters the slip printer station can print per line of text. */
  /* CompleteClass */
  var charactersPerLine: Double = js.native
  
  /** Closes the mechanism that holds the slip in place while the slip printer station is printing, typically after the user inserts or removes the slip. */
  /* CompleteClass */
  override def closeJaws(): Unit = js.native
  
  /** Gets or sets the color cartridge that the slip printer station should use when it prints. */
  /* CompleteClass */
  var colorCartridge: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterColorCartridge = js.native
  
  /**
    * Creates a new print job for the slip printer stiation.
    * @return The new print job for the slip printer station.
    */
  /* CompleteClass */
  override def createJob(): typings.winrtUwp.Windows.Devices.PointOfService.SlipPrintJob = js.native
  
  /**
    * Waits for the user to insert a slip into the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to insert the slip before exiting.
    * @return An asynchronous operation that returns true if the user inserts the slip within the specified time span, and returns false otherwise.
    */
  /* CompleteClass */
  override def insertSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets whether the cartridge of the slip printer station is currently out of ink or toner. */
  /* CompleteClass */
  var isCartridgeEmpty: Boolean = js.native
  
  /** Gets whether the cartridge of the slip printer station is currently removed. */
  /* CompleteClass */
  var isCartridgeRemoved: Boolean = js.native
  
  /** Gets whether the cover of the slip printer station is currently open. */
  /* CompleteClass */
  var isCoverOpen: Boolean = js.native
  
  /** Gets whether the slip printer station is currently cleaning its print head. */
  /* CompleteClass */
  var isHeadCleaning: Boolean = js.native
  
  /** Gets or sets whether the slip printer station prints with high quality or high speed. */
  /* CompleteClass */
  var isLetterQuality: Boolean = js.native
  
  /** Gets whether the slip printer station needs paper. */
  /* CompleteClass */
  var isPaperEmpty: Boolean = js.native
  
  /** Gets whether the slip printer station is almost out of paper. */
  /* CompleteClass */
  var isPaperNearEnd: Boolean = js.native
  
  /** Gets whether the slip printer station is on and accepting print jobs. */
  /* CompleteClass */
  var isReadyToPrint: Boolean = js.native
  
  /** Gets or sets the current height of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  var lineHeight: Double = js.native
  
  /** Gets or sets the spacing of each single-high print line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  /* CompleteClass */
  var lineSpacing: Double = js.native
  
  /** Gets the current width of the printed line for the slip printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  var lineWidth: Double = js.native
  
  /** Gets the number of lines that the slip printer station can print after the ClaimedSlipPrinter.IsPaperNearEnd property is set to true but before the printer reaches the end of the slip. */
  /* CompleteClass */
  var linesNearEndToEnd: Double = js.native
  
  /** Gets the maximum number of lines that the slip printer station can print on a form. */
  /* CompleteClass */
  var maxLines: Double = js.native
  
  /** Opens the mechanism that holds the slip in place while the slip printer station is printing, typically before the user inserts or removes the slip. */
  /* CompleteClass */
  override def openJaws(): Unit = js.native
  
  /** Gets the size of paper that the claimed slip printer station currently uses, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  var pageSize: Size = js.native
  
  /** Gets the print area for the slip printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  /* CompleteClass */
  var printArea: Rect = js.native
  
  /** Gets the side of the sheet on which the claimed slip printer station is currently printing. */
  /* CompleteClass */
  var printSide: typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterPrintSide = js.native
  
  /**
    * Waits for the user to remove a slip from the slip printer station.
    * @param timeout The interval of time that the operation should wait for the user to remove the slip before exiting.
    * @return An asynchronous operation that returns true if the user removes the slip within the specified time span, and returns false otherwise.
    */
  /* CompleteClass */
  override def removeSlipAsync(timeout: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the maximum number of characters that the slip printer station can print on each line in sideways mode. */
  /* CompleteClass */
  var sidewaysMaxChars: Double = js.native
  
  /** Gets the maximum number of lines that the slip printer station can print in sideways mode. */
  /* CompleteClass */
  var sidewaysMaxLines: Double = js.native
  
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the slip printer station, before you use that data sequence when you call the SlipPrintJob.Print and SlipPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the SlipPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  /* CompleteClass */
  override def validateData(data: String): Boolean = js.native
}
