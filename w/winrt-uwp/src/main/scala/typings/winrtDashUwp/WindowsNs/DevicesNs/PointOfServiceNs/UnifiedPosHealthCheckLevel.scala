package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnifiedPosHealthCheckLevel extends js.Object

/** Defines the constants that indicates the type of health check that can be performed on the devices. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel")
@js.native
object UnifiedPosHealthCheckLevel extends js.Object {
  /** Perform a more thorough test that may change the device. */
  @js.native
  sealed trait external extends UnifiedPosHealthCheckLevel
  
  /** Perform a interactive test of the device. The supporting service object will typically display a modal dialog box to present test options and results. */
  @js.native
  sealed trait interactive extends UnifiedPosHealthCheckLevel
  
  /** Perform internal tests to that do not physically change the device. */
  @js.native
  sealed trait posinternal extends UnifiedPosHealthCheckLevel
  
  /** Perform an unspecified test. */
  @js.native
  sealed trait unknownHealthCheckLevel extends UnifiedPosHealthCheckLevel
  
  /* 2 */ val external: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel.external with Double = js.native
  /* 3 */ val interactive: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel.interactive with Double = js.native
  /* 1 */ val posinternal: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel.posinternal with Double = js.native
  /* 0 */ val unknownHealthCheckLevel: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel.unknownHealthCheckLevel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosHealthCheckLevel with Double] = js.native
}

