package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel.external
import typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel.interactive
import typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel.posinternal
import typings.winrtDashUwp.Windows.Devices.PointOfService.UnifiedPosHealthCheckLevel.unknownHealthCheckLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosHealthCheckLevel with Double] = js.native
  /* 2 */ @js.native
  object external extends TopLevel[external with Double]
  
  /* 3 */ @js.native
  object interactive extends TopLevel[interactive with Double]
  
  /* 1 */ @js.native
  object posinternal extends TopLevel[posinternal with Double]
  
  /* 0 */ @js.native
  object unknownHealthCheckLevel extends TopLevel[unknownHealthCheckLevel with Double]
  
}

