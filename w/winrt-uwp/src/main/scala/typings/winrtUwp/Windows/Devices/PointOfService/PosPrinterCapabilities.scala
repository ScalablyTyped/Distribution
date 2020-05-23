package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of the point-of-service printer. */
trait PosPrinterCapabilities extends js.Object {
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
}

