package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a mobile broadband device service. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation")
@js.native
abstract class MobileBroadbandDeviceServiceInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation {
  
  /** Gets the unique device service identifier for the mobile broadband device. */
  /* CompleteClass */
  var deviceServiceId: String = js.native
  
  /** Determines if the mobile broadband device service is able to read data. */
  /* CompleteClass */
  var isDataReadSupported: Boolean = js.native
  
  /** Determines if the mobile broadband device service is able to write data. */
  /* CompleteClass */
  var isDataWriteSupported: Boolean = js.native
}
