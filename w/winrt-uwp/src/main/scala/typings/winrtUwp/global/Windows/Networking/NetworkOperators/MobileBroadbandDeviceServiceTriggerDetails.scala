package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network device service notification. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails")
@js.native
open class MobileBroadbandDeviceServiceTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceTriggerDetails {
  
  /** Gets the device ID of the device that triggered a broadband device service event. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets the device service identifier for the device service trigger event. */
  /* CompleteClass */
  var deviceServiceId: String = js.native
  
  /** Gets the received data associated with the triggered event. */
  /* CompleteClass */
  var receivedData: IBuffer = js.native
}
