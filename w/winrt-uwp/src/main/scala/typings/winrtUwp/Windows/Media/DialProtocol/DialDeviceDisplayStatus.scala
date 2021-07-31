package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialDeviceDisplayStatus extends StObject
/** The possible statuses a DIAL device can have in the DIAL device picker. You can use these to adjust the sub-status and other visual attributes for a particular device in the picker. */
@JSGlobal("Windows.Media.DialProtocol.DialDeviceDisplayStatus")
@js.native
object DialDeviceDisplayStatus extends StObject {
  
  /** The device is connected. */
  @js.native
  sealed trait connected
    extends StObject
       with DialDeviceDisplayStatus
  
  /** The device is attempting to connect. */
  @js.native
  sealed trait connecting
    extends StObject
       with DialDeviceDisplayStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected
    extends StObject
       with DialDeviceDisplayStatus
  
  /** The device is attempting to disconnect. */
  @js.native
  sealed trait disconnecting
    extends StObject
       with DialDeviceDisplayStatus
  
  /** The device shows an error. */
  @js.native
  sealed trait error
    extends StObject
       with DialDeviceDisplayStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait none
    extends StObject
       with DialDeviceDisplayStatus
}
