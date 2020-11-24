package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a receipt printer station that has been claimed for use. */
@js.native
trait ClaimedReceiptPrinter extends js.Object {
  
  /** Gets or sets the number of characters the receipt printer station can print per line of text. */
  var charactersPerLine: Double = js.native
  
  /** Gets or sets the color cartridge that the receipt printer station should use when it prints. */
  var colorCartridge: PosPrinterColorCartridge = js.native
  
  /**
    * Creates a new print job for the receipt printer station.
    * @return The new print job for the receipt printer station.
    */
  def createJob(): ReceiptPrintJob = js.native
  
  /** Gets whether the cartridge of the receipt printer station is currently out of ink or toner. */
  var isCartridgeEmpty: Boolean = js.native
  
  /** Gets whether the cartridge of the receipt printer station is currently removed. */
  var isCartridgeRemoved: Boolean = js.native
  
  /** Gets whether the cover of the receipt printer station is currently open. */
  var isCoverOpen: Boolean = js.native
  
  /** Gets whether the receipt printer station is currently cleaning its print head. */
  var isHeadCleaning: Boolean = js.native
  
  /** Gets or sets whether the receipt printer station prints with high quality or high speed. */
  var isLetterQuality: Boolean = js.native
  
  /** Gets whether the receipt printer station needs paper. */
  var isPaperEmpty: Boolean = js.native
  
  /** Gets whether the receipt printer station is almost out of paper. */
  var isPaperNearEnd: Boolean = js.native
  
  /** Gets whether the receipt printer station is on and accepting print jobs. */
  var isReadyToPrint: Boolean = js.native
  
  /** Gets or sets the current height of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double = js.native
  
  /** Gets or sets the spacing of each single-high print line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double = js.native
  
  /** Gets the current width of the printed line for the receipt printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double = js.native
  
  /** Gets the number of lines that must be advanced before cutting the receipt paper. */
  var linesToPaperCut: Double = js.native
  
  /** Gets the size of paper that the claimed receipt printer station currently uses. */
  var pageSize: Size = js.native
  
  /** Gets the print area for the receipt printer station, expressed in the unit of measurement that the ClaimedPosPrinter.MapMode property specifies. */
  var printArea: Rect = js.native
  
  /** Gets the maximum number of characters that the receipt printer station can print on each line in sideways mode. */
  var sidewaysMaxChars: Double = js.native
  
  /** Gets the maximum number of lines that the receipt printer station can print in sideways mode. */
  var sidewaysMaxLines: Double = js.native
  
  /**
    * Determines whether a data sequence, possibly including one or more escape sequences, is valid for the receipt printer station, before you use that data sequence when you call the ReceiptPrintJob.Print and ReceiptPrintJob.ExecuteAsync methods.
    * @param data The data sequence that you want to validate before you use it with the ReceiptPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean = js.native
}
object ClaimedReceiptPrinter {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ClaimedReceiptPrinterOps[Self <: ClaimedReceiptPrinter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharactersPerLine(value: Double): Self = this.set("charactersPerLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCartridge(value: PosPrinterColorCartridge): Self = this.set("colorCartridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateJob(value: () => ReceiptPrintJob): Self = this.set("createJob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCartridgeEmpty(value: Boolean): Self = this.set("isCartridgeEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCartridgeRemoved(value: Boolean): Self = this.set("isCartridgeRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCoverOpen(value: Boolean): Self = this.set("isCoverOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeadCleaning(value: Boolean): Self = this.set("isHeadCleaning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLetterQuality(value: Boolean): Self = this.set("isLetterQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperEmpty(value: Boolean): Self = this.set("isPaperEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperNearEnd(value: Boolean): Self = this.set("isPaperNearEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadyToPrint(value: Boolean): Self = this.set("isReadyToPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesToPaperCut(value: Double): Self = this.set("linesToPaperCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintArea(value: Rect): Self = this.set("printArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidewaysMaxChars(value: Double): Self = this.set("sidewaysMaxChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidewaysMaxLines(value: Double): Self = this.set("sidewaysMaxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateData(value: String => Boolean): Self = this.set("validateData", js.Any.fromFunction1(value))
  }
}
