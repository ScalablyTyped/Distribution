package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the capabilities of the point-of-service printer. */
trait PosPrinterCapabilities extends StObject {
  
  /** Gets whether the point-of-service printer can map the characters that the application sends (in the character set that the ClaimedPosPrinter.CharacterSet property defines) to the character sets that the PosPrinter.SupportedCharacterSets property defines. */
  var canMapCharacterSet: Boolean
  
  /** Gets the character set that the point-of-service printer uses by default. */
  var defaultCharacterSet: Double
  
  /** Gets whether the point-of-service printer has a sensor that detects if the printer cover is open. */
  var hasCoverSensor: Boolean
  
  /** Gets whether the point-of-service printer supports reporting statistics. */
  var isStatisticsReportingSupported: Boolean
  
  /** Gets whether the point-of-service printer supports updating statistics. */
  var isStatisticsUpdatingSupported: Boolean
  
  /** Gets whether the point-of-service printer supports printer transactions. */
  var isTransactionSupported: Boolean
  
  /** Gets the capabilities of the journal station for the point-of-service printer. */
  var journal: JournalPrinterCapabilities
  
  /** Gets the power reporting capabilities of the point-of-service printer. */
  var powerReportingType: UnifiedPosPowerReportingType
  
  /** Gets the capabilities of the receipt station for the point-of-service printer. */
  var receipt: ReceiptPrinterCapabilities
  
  /** Gets the capabilities of the slip station for the point-of-service printer. */
  var slip: SlipPrinterCapabilities
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
  implicit class PosPrinterCapabilitiesMutableBuilder[Self <: PosPrinterCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanMapCharacterSet(value: Boolean): Self = StObject.set(x, "canMapCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCharacterSet(value: Double): Self = StObject.set(x, "defaultCharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCoverSensor(value: Boolean): Self = StObject.set(x, "hasCoverSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsReportingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsReportingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatisticsUpdatingSupported(value: Boolean): Self = StObject.set(x, "isStatisticsUpdatingSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransactionSupported(value: Boolean): Self = StObject.set(x, "isTransactionSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournal(value: JournalPrinterCapabilities): Self = StObject.set(x, "journal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerReportingType(value: UnifiedPosPowerReportingType): Self = StObject.set(x, "powerReportingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt(value: ReceiptPrinterCapabilities): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlip(value: SlipPrinterCapabilities): Self = StObject.set(x, "slip", value.asInstanceOf[js.Any])
  }
}
