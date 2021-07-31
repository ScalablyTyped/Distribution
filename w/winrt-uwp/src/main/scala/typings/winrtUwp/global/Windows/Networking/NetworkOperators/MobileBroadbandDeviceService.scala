package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceService")
@js.native
abstract class MobileBroadbandDeviceService ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceService {
  
  /** Gets the unique device service identity for the mobile broadband device service. */
  /* CompleteClass */
  var deviceServiceId: String = js.native
  
  /**
    * Opens a new MobileBroadbandDeviceServiceCommandSession for the mobile broadband device service.
    * @return A new command session for the mobile broadband device service.
    */
  /* CompleteClass */
  override def openCommandSession(): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandSession = js.native
  
  /**
    * Opens a new MobileBroadbandDeviceServiceDataSession for the mobile broadband device service.
    * @return A new data session for the Mobile Broadband device service.
    */
  /* CompleteClass */
  override def openDataSession(): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataSession = js.native
  
  /** Gets a list of supported device service commands for the mobile broadband device service. */
  /* CompleteClass */
  var supportedCommands: IVectorView[Double] = js.native
}
