package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner capabilities. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerCapabilities")
@js.native
abstract class BarcodeScannerCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerCapabilities {
  /** Indicates whether the barcode scanner supports image preview. */
  /* CompleteClass */
  override var isImagePreviewSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports the software trigger functionality. */
  /* CompleteClass */
  override var isSoftwareTriggerSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports reporting of usage statistics. */
  /* CompleteClass */
  override var isStatisticsReportingSupported: Boolean = js.native
  /** Indicates whether the barcode scanner supports updating or resetting of usage statistics. */
  /* CompleteClass */
  override var isStatisticsUpdatingSupported: Boolean = js.native
  /** Gets the power reporting type for the barcode scanner. */
  /* CompleteClass */
  override var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
}

