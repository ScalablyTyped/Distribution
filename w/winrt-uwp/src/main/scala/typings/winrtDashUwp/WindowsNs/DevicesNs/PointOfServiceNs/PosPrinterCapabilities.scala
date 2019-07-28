package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of the point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterCapabilities")
@js.native
abstract class PosPrinterCapabilities () extends js.Object {
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

