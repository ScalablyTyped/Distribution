package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner capabilities. */
trait BarcodeScannerCapabilities extends js.Object {
  /** Indicates whether the barcode scanner supports image preview. */
  var isImagePreviewSupported: Boolean
  /** Indicates whether the barcode scanner supports the software trigger functionality. */
  var isSoftwareTriggerSupported: Boolean
  /** Indicates whether the barcode scanner supports reporting of usage statistics. */
  var isStatisticsReportingSupported: Boolean
  /** Indicates whether the barcode scanner supports updating or resetting of usage statistics. */
  var isStatisticsUpdatingSupported: Boolean
  /** Gets the power reporting type for the barcode scanner. */
  var powerReportingType: UnifiedPosPowerReportingType
}

object BarcodeScannerCapabilities {
  @scala.inline
  def apply(
    isImagePreviewSupported: Boolean,
    isSoftwareTriggerSupported: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType
  ): BarcodeScannerCapabilities = {
    val __obj = js.Dynamic.literal(isImagePreviewSupported = isImagePreviewSupported.asInstanceOf[js.Any], isSoftwareTriggerSupported = isSoftwareTriggerSupported.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerCapabilities]
  }
}

