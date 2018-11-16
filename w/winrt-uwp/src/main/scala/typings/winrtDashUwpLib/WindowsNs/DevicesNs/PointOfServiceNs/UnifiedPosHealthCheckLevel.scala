package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait external
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel
  
  /** Perform a interactive test of the device. The supporting service object will typically display a modal dialog box to present test options and results. */
  @js.native
  sealed trait interactive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel
  
  /** Perform internal tests to that do not physically change the device. */
  @js.native
  sealed trait posinternal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel
  
  /** Perform an unspecified test. */
  @js.native
  sealed trait unknownHealthCheckLevel
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel
  
  val external: external with java.lang.String = js.native
  val interactive: interactive with java.lang.String = js.native
  val posinternal: posinternal with java.lang.String = js.native
  val unknownHealthCheckLevel: unknownHealthCheckLevel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosHealthCheckLevel with java.lang.String
  ] = js.native
}

