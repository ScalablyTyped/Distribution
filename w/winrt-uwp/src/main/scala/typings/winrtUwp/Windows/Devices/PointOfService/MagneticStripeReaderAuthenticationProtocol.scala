package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagneticStripeReaderAuthenticationProtocol extends StObject
/** Defines the constants that indicates the authentication protocol supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationProtocol")
@js.native
object MagneticStripeReaderAuthenticationProtocol extends StObject {
  
  /** The device supports challenge response protocol. */
  @js.native
  sealed trait challengeResponse
    extends StObject
       with MagneticStripeReaderAuthenticationProtocol
  
  /** The device does not support device authentication. */
  @js.native
  sealed trait none
    extends StObject
       with MagneticStripeReaderAuthenticationProtocol
}
