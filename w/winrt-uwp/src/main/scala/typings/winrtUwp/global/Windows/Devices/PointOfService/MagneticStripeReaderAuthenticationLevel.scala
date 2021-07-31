package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the constants that indicates the level of support for magnetic stripe reader authentication protocol: NotSupported, Optional, or Required. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel")
@js.native
object MagneticStripeReaderAuthenticationLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel & Double
  ] = js.native
  
  /* 0 */ val notSupported: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.notSupported & Double = js.native
  
  /* 1 */ val optional: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.optional & Double = js.native
  
  /* 2 */ val required: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.required & Double = js.native
}
