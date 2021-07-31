package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the constants that indicates the device authentication status. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatus")
@js.native
object MagneticStripeReaderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus & Double
  ] = js.native
  
  /* 1 */ val authenticated: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.authenticated & Double = js.native
  
  /* 2 */ val extended: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.extended & Double = js.native
  
  /* 0 */ val unauthenticated: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.unauthenticated & Double = js.native
}
