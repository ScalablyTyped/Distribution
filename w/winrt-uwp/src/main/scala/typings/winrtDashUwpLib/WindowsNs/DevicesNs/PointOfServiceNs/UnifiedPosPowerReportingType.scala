package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait advanced
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosPowerReportingType
  
  /** Can determine and report the two power states (online and off/offline) of the device. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosPowerReportingType
  
  /** Cannot determine the state of the device, therefore no power reporting is possible. */
  @js.native
  sealed trait unknownPowerReportingType
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosPowerReportingType
  
  val advanced: advanced with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  val unknownPowerReportingType: unknownPowerReportingType with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosPowerReportingType with java.lang.String
  ] = js.native
}

