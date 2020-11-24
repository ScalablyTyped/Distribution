package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of the point-of-service printer. */
@js.native
trait PosPrinterCapabilities extends js.Object {
  
  /** Gets whether the point-of-service printer can map the characters that the application sends (in the character set that the ClaimedPosPrinter.CharacterSet property defines) to the character sets that the PosPrinter.SupportedCharacterSets property defines. */
  var canMapCharacterSet: Boolean = js.native
  
  /** Gets the character set that the point-of-service printer uses by default. */
  var defaultCharacterSet: Double = js.native
  
  /** Gets whether the point-of-service printer has a sensor that detects if the printer cover is open. */
  var hasCoverSensor: Boolean = js.native
  
  /** Gets whether the point-of-service printer supports reporting statistics. */
  var isStatisticsReportingSupported: Boolean = js.native
  
  /** Gets whether the point-of-service printer supports updating statistics. */
  var isStatisticsUpdatingSupported: Boolean = js.native
  
  /** Gets whether the point-of-service printer supports printer transactions. */
  var isTransactionSupported: Boolean = js.native
  
  /** Gets the capabilities of the journal station for the point-of-service printer. */
  var journal: JournalPrinterCapabilities = js.native
  
  /** Gets the power reporting capabilities of the point-of-service printer. */
  var powerReportingType: UnifiedPosPowerReportingType = js.native
  
  /** Gets the capabilities of the receipt station for the point-of-service printer. */
  var receipt: ReceiptPrinterCapabilities = js.native
  
  /** Gets the capabilities of the slip station for the point-of-service printer. */
  var slip: SlipPrinterCapabilities = js.native
}
object PosPrinterCapabilities {
  
  @scala.inline
  def apply(
    canMapCharacterSet: Boolean,
    defaultCharacterSet: Double,
    hasCoverSensor: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isTransactionSupported: Boolean,
    journal: JournalPrinterCapabilities,
    powerReportingType: UnifiedPosPowerReportingType,
    receipt: ReceiptPrinterCapabilities,
    slip: SlipPrinterCapabilities
  ): PosPrinterCapabilities = {
    val __obj = js.Dynamic.literal(canMapCharacterSet = canMapCharacterSet.asInstanceOf[js.Any], defaultCharacterSet = defaultCharacterSet.asInstanceOf[js.Any], hasCoverSensor = hasCoverSensor.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isTransactionSupported = isTransactionSupported.asInstanceOf[js.Any], journal = journal.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any], receipt = receipt.asInstanceOf[js.Any], slip = slip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosPrinterCapabilities]
  }
  
  @scala.inline
  implicit class PosPrinterCapabilitiesOps[Self <: PosPrinterCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCanMapCharacterSet(value: Boolean): Self = this.set("canMapCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCharacterSet(value: Double): Self = this.set("defaultCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCoverSensor(value: Boolean): Self = this.set("hasCoverSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = this.set("isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = this.set("isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransactionSupported(value: Boolean): Self = this.set("isTransactionSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournal(value: JournalPrinterCapabilities): Self = this.set("journal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = this.set("powerReportingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt(value: ReceiptPrinterCapabilities): Self = this.set("receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlip(value: SlipPrinterCapabilities): Self = this.set("slip", value.asInstanceOf[js.Any])
  }
}
