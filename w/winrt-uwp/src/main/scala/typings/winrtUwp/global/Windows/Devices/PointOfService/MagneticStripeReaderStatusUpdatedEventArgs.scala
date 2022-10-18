package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs")
@js.native
open class MagneticStripeReaderStatusUpdatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs {
  
  /** Gets the vendor specific error code. */
  /* CompleteClass */
  var extendedStatus: Double = js.native
  
  /** Gets the status change information. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus = js.native
}
