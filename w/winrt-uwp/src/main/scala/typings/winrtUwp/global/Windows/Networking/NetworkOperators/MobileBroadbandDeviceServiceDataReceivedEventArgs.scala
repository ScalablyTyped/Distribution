package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs")
@js.native
open class MobileBroadbandDeviceServiceDataReceivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs {
  
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  /* CompleteClass */
  var receivedData: IBuffer = js.native
}
