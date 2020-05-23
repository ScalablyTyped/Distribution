package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the cash drawer capabilities. */
trait CashDrawerCapabilities extends js.Object {
  /** Indicated whether cash drawer open sensor is available. */
  var isDrawerOpenSensorAvailable: Boolean
  /** Whether statistics reporting is supported by the cash drawer. */
  var isStatisticsReportingSupported: Boolean
  /** Whether statistics updating is supported by the cash drawer. */
  var isStatisticsUpdatingSupported: Boolean
  /** Whether the status from multiple drawers is supported. */
  var isStatusMultiDrawerDetectSupported: Boolean
  /** Whether status reporting is supported by the cash drawer. */
  var isStatusReportingSupported: Boolean
  /** Whether the cash drawer has standard or advanced power reporting. */
  var powerReportingType: UnifiedPosPowerReportingType
}

object CashDrawerCapabilities {
  @scala.inline
  def apply(
    isDrawerOpenSensorAvailable: Boolean,
    isStatisticsReportingSupported: Boolean,
    isStatisticsUpdatingSupported: Boolean,
    isStatusMultiDrawerDetectSupported: Boolean,
    isStatusReportingSupported: Boolean,
    powerReportingType: UnifiedPosPowerReportingType
  ): CashDrawerCapabilities = {
    val __obj = js.Dynamic.literal(isDrawerOpenSensorAvailable = isDrawerOpenSensorAvailable.asInstanceOf[js.Any], isStatisticsReportingSupported = isStatisticsReportingSupported.asInstanceOf[js.Any], isStatisticsUpdatingSupported = isStatisticsUpdatingSupported.asInstanceOf[js.Any], isStatusMultiDrawerDetectSupported = isStatusMultiDrawerDetectSupported.asInstanceOf[js.Any], isStatusReportingSupported = isStatusReportingSupported.asInstanceOf[js.Any], powerReportingType = powerReportingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerCapabilities]
  }
}

