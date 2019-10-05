package typings.winrtDashUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnifiedPosPowerReportingType extends js.Object

/** Defines the constants that indicates power reporting capabilities of the Point of Service (POS) device. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosPowerReportingType")
@js.native
object UnifiedPosPowerReportingType extends js.Object {
  /** Can determine and report the three power states (off, offline, and online) of the device. */
  @js.native
  sealed trait advanced extends UnifiedPosPowerReportingType
  
  /** Can determine and report the two power states (online and off/offline) of the device. */
  @js.native
  sealed trait standard extends UnifiedPosPowerReportingType
  
  /** Cannot determine the state of the device, therefore no power reporting is possible. */
  @js.native
  sealed trait unknownPowerReportingType extends UnifiedPosPowerReportingType
  
  /* 2 */ val advanced: typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType.advanced with Double = js.native
  /* 1 */ val standard: typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType.standard with Double = js.native
  /* 0 */ val unknownPowerReportingType: typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType.unknownPowerReportingType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosPowerReportingType with Double] = js.native
}

