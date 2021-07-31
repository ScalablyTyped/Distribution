package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkDeviceStatus extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends StObject {
  
  @js.native
  sealed trait accountNotActivated
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait badSim
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait deviceBlocked
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait deviceHardwareFailure
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait deviceLocked
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait deviceNotReady
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait deviceReady
    extends StObject
       with NetworkDeviceStatus
  
  @js.native
  sealed trait simNotInserted
    extends StObject
       with NetworkDeviceStatus
}
