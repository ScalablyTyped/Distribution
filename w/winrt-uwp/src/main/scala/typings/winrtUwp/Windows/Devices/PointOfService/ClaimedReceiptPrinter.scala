package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a receipt printer station that has been claimed for use. */
trait ClaimedReceiptPrinter extends StObject {
  
  /** Gets or sets the number of characters the receipt printer station can print per line of text. */
  var charactersPerLine: Double
  
  /** Gets or sets the color cartridge that the receipt printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge
  
  /**
    * Creates a new print job for the receipt printer station.
    * @return The new print job for the receipt printer station.
    */
  def createJob(): ReceiptPrintJob
  
  /** Gets whether the cartridge of the receipt printer station is currently out of ink or toner. */
  var isCartridgeEmpty: Boolean
  
  /** Gets whether the cartridge of the receipt printer station is currently removed. */
  var isCartridgeRemoved: Boolean
  
  /** Gets whether the cover of the receipt printer station is currently open. */
  var isCoverOpen: Boolean
  
  /** Gets whether the receipt printer station is currently cleaning its print head. */
  var isHeadCleaning: Boolean
  
  /** Gets or sets whether the receipt printer station prints with high quality or high speed. */
  var isLetterQuality: Boolean
  
  /** Gets whether the receipt printer station needs paper. */
  var isPaperEmpty: Boolean
  
  /** Gets whether the receipt printer station is almost out of paper. */
  var isPaperNearEnd: Boolean
  
  /** Gets whether the receipt printer station is on and accepting print jobs. */
  var isReadyToPrint: Boolean
  
  /** Gets or sets the current height of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double
  
  /** Gets or sets the spacing of each single-high print line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double
  
  /** Gets the current width of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double
  
  /** Gets the number of lines that must be advanced before cutting the receipt paper. */
  var linesToPaperCut: Double
  
  /** Gets the size of paper that the claimed receipt printer station currently uses. */
  var pageSize: Size
  
  /** Gets the print area for the receipt printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: Rect
  
  /** Gets the maximum number of characters that the receipt printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: Double
  
  /** Gets the maximum number of lines that the receipt printer station can print in sideways mode. */
  var sidewaysMaxLines: Double
  
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the receipt printer station, before you use that data sequence when you call the ReceiptPrintJob.Print and ReceiptPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the ReceiptPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean
}
object ClaimedReceiptPrinter {
  
  inline def apply(
    charactersPerLine: Double,
    colorCartridge: PosPrinterColorCartridge,
    createJob: () => ReceiptPrintJob,
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
    linesToPaperCut: Double,
    pageSize: Size,
    printArea: Rect,
    sidewaysMaxChars: Double,
    sidewaysMaxLines: Double,
    validateData: String => Boolean
  ): ClaimedReceiptPrinter = {
    val __obj = js.Dynamic.literal(charactersPerLine = charactersPerLine.asInstanceOf[js.Any], colorCartridge = colorCartridge.asInstanceOf[js.Any], createJob = js.Any.fromFunction0(createJob), isCartridgeEmpty = isCartridgeEmpty.asInstanceOf[js.Any], isCartridgeRemoved = isCartridgeRemoved.asInstanceOf[js.Any], isCoverOpen = isCoverOpen.asInstanceOf[js.Any], isHeadCleaning = isHeadCleaning.asInstanceOf[js.Any], isLetterQuality = isLetterQuality.asInstanceOf[js.Any], isPaperEmpty = isPaperEmpty.asInstanceOf[js.Any], isPaperNearEnd = isPaperNearEnd.asInstanceOf[js.Any], isReadyToPrint = isReadyToPrint.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], linesToPaperCut = linesToPaperCut.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], printArea = printArea.asInstanceOf[js.Any], sidewaysMaxChars = sidewaysMaxChars.asInstanceOf[js.Any], sidewaysMaxLines = sidewaysMaxLines.asInstanceOf[js.Any], validateData = js.Any.fromFunction1(validateData))
    __obj.asInstanceOf[ClaimedReceiptPrinter]
  }
  
  extension [Self <: ClaimedReceiptPrinter](x: Self) {
    
    inline def setCharactersPerLine(value: Double): Self = StObject.set(x, "charactersPerLine", value.asInstanceOf[js.Any])
    
    inline def setColorCartridge(value: PosPrinterColorCartridge): Self = StObject.set(x, "colorCartridge", value.asInstanceOf[js.Any])
    
    inline def setCreateJob(value: () => ReceiptPrintJob): Self = StObject.set(x, "createJob", js.Any.fromFunction0(value))
    
    inline def setIsCartridgeEmpty(value: Boolean): Self = StObject.set(x, "isCartridgeEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsCartridgeRemoved(value: Boolean): Self = StObject.set(x, "isCartridgeRemoved", value.asInstanceOf[js.Any])
    
    inline def setIsCoverOpen(value: Boolean): Self = StObject.set(x, "isCoverOpen", value.asInstanceOf[js.Any])
    
    inline def setIsHeadCleaning(value: Boolean): Self = StObject.set(x, "isHeadCleaning", value.asInstanceOf[js.Any])
    
    inline def setIsLetterQuality(value: Boolean): Self = StObject.set(x, "isLetterQuality", value.asInstanceOf[js.Any])
    
    inline def setIsPaperEmpty(value: Boolean): Self = StObject.set(x, "isPaperEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsPaperNearEnd(value: Boolean): Self = StObject.set(x, "isPaperNearEnd", value.asInstanceOf[js.Any])
    
    inline def setIsReadyToPrint(value: Boolean): Self = StObject.set(x, "isReadyToPrint", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLinesToPaperCut(value: Double): Self = StObject.set(x, "linesToPaperCut", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPrintArea(value: Rect): Self = StObject.set(x, "printArea", value.asInstanceOf[js.Any])
    
    inline def setSidewaysMaxChars(value: Double): Self = StObject.set(x, "sidewaysMaxChars", value.asInstanceOf[js.Any])
    
    inline def setSidewaysMaxLines(value: Double): Self = StObject.set(x, "sidewaysMaxLines", value.asInstanceOf[js.Any])
    
    inline def setValidateData(value: String => Boolean): Self = StObject.set(x, "validateData", js.Any.fromFunction1(value))
  }
}
