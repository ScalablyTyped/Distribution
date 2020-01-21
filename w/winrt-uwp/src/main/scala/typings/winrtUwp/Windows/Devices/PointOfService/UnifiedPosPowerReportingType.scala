package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosPowerReportingType with Double] = js.native
  /* 2 */ @js.native
  object advanced extends TopLevel[advanced with Double]
  
  /* 1 */ @js.native
  object standard extends TopLevel[standard with Double]
  
  /* 0 */ @js.native
  object unknownPowerReportingType extends TopLevel[unknownPowerReportingType with Double]
  
}

