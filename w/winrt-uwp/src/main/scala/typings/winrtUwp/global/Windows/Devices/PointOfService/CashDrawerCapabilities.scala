package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the cash drawer capabilities. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerCapabilities")
@js.native
abstract class CashDrawerCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerCapabilities {
  /** Indicated whether cash drawer open sensor is available. */
  /* CompleteClass */
  override var isDrawerOpenSensorAvailable: Boolean = js.native
  /** Whether statistics reporting is supported by the cash drawer. */
  /* CompleteClass */
  override var isStatisticsReportingSupported: Boolean = js.native
  /** Whether statistics updating is supported by the cash drawer. */
  /* CompleteClass */
  override var isStatisticsUpdatingSupported: Boolean = js.native
  /** Whether the status from multiple drawers is supported. */
  /* CompleteClass */
  override var isStatusMultiDrawerDetectSupported: Boolean = js.native
  /** Whether status reporting is supported by the cash drawer. */
  /* CompleteClass */
  override var isStatusReportingSupported: Boolean = js.native
  /** Whether the cash drawer has standard or advanced power reporting. */
  /* CompleteClass */
  override var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
}

