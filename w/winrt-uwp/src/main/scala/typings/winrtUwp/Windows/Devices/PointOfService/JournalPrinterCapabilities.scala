package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of journal station of a point-of-service printer. */
@js.native
trait JournalPrinterCapabilities extends js.Object {
  
  /** Gets information about the sensors that the journal printer station has available to report the status of the printer cartridge. */
  var cartridgeSensors: PosPrinterCartridgeSensors = js.native
  
  /** Gets the color cartridges that the journal printer station can use to print in color. */
  var colorCartridgeCapabilities: PosPrinterColorCapabilities = js.native
  
  /** Gets whether the journal printer station can print bold characters. */
  var isBoldSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print characters that are both double-high and double-wide. */
  var isDoubleHighDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print double-high characters. */
  var isDoubleHighPrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print double-wide characters. */
  var isDoubleWidePrintSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print a dark color plus an alternate color. */
  var isDualColorSupported: Boolean = js.native
  
  /** Gets whether the journal printer station can print italic characters. */
  var isItalicSupported: Boolean = js.native
  
  /** Gets whether the journal printer station has an out-of-paper sensor. */
  var isPaperEmptySensorSupported: Boolean = js.native
  
  /** Gets whether the journal printer station has a low-paper sensor. */
  var isPaperNearEndSensorSupported: Boolean = js.native
  
  /** Gets whether a point-of-service printer with a station that functions as a journal printer station is present. */
  var isPrinterPresent: Boolean = js.native
  
  /** Gets whether the journal printer station can underline characters. */
  var isUnderlineSupported: Boolean = js.native
  
  /** Gets a collection of the line widths in characters per line that the journal printer station supports. */
  var supportedCharactersPerLine: IVectorView[Double] = js.native
}
object JournalPrinterCapabilities {
  
  @scala.inline
  def apply(
    cartridgeSensors: PosPrinterCartridgeSensors,
    colorCartridgeCapabilities: PosPrinterColorCapabilities,
    isBoldSupported: Boolean,
    isDoubleHighDoubleWidePrintSupported: Boolean,
    isDoubleHighPrintSupported: Boolean,
    isDoubleWidePrintSupported: Boolean,
    isDualColorSupported: Boolean,
    isItalicSupported: Boolean,
    isPaperEmptySensorSupported: Boolean,
    isPaperNearEndSensorSupported: Boolean,
    isPrinterPresent: Boolean,
    isUnderlineSupported: Boolean,
    supportedCharactersPerLine: IVectorView[Double]
  ): JournalPrinterCapabilities = {
    val __obj = js.Dynamic.literal(cartridgeSensors = cartridgeSensors.asInstanceOf[js.Any], colorCartridgeCapabilities = colorCartridgeCapabilities.asInstanceOf[js.Any], isBoldSupported = isBoldSupported.asInstanceOf[js.Any], isDoubleHighDoubleWidePrintSupported = isDoubleHighDoubleWidePrintSupported.asInstanceOf[js.Any], isDoubleHighPrintSupported = isDoubleHighPrintSupported.asInstanceOf[js.Any], isDoubleWidePrintSupported = isDoubleWidePrintSupported.asInstanceOf[js.Any], isDualColorSupported = isDualColorSupported.asInstanceOf[js.Any], isItalicSupported = isItalicSupported.asInstanceOf[js.Any], isPaperEmptySensorSupported = isPaperEmptySensorSupported.asInstanceOf[js.Any], isPaperNearEndSensorSupported = isPaperNearEndSensorSupported.asInstanceOf[js.Any], isPrinterPresent = isPrinterPresent.asInstanceOf[js.Any], isUnderlineSupported = isUnderlineSupported.asInstanceOf[js.Any], supportedCharactersPerLine = supportedCharactersPerLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalPrinterCapabilities]
  }
  
  @scala.inline
  implicit class JournalPrinterCapabilitiesOps[Self <: JournalPrinterCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCartridgeSensors(value: PosPrinterCartridgeSensors): Self = this.set("cartridgeSensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCartridgeCapabilities(value: PosPrinterColorCapabilities): Self = this.set("colorCartridgeCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBoldSupported(value: Boolean): Self = this.set("isBoldSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleHighDoubleWidePrintSupported(value: Boolean): Self = this.set("isDoubleHighDoubleWidePrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleHighPrintSupported(value: Boolean): Self = this.set("isDoubleHighPrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoubleWidePrintSupported(value: Boolean): Self = this.set("isDoubleWidePrintSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDualColorSupported(value: Boolean): Self = this.set("isDualColorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsItalicSupported(value: Boolean): Self = this.set("isItalicSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperEmptySensorSupported(value: Boolean): Self = this.set("isPaperEmptySensorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaperNearEndSensorSupported(value: Boolean): Self = this.set("isPaperNearEndSensorSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrinterPresent(value: Boolean): Self = this.set("isPrinterPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnderlineSupported(value: Boolean): Self = this.set("isUnderlineSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCharactersPerLine(value: IVectorView[Double]): Self = this.set("supportedCharactersPerLine", value.asInstanceOf[js.Any])
  }
}
