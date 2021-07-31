package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandDeviceType extends StObject
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends StObject {
  
  @js.native
  sealed trait embedded
    extends StObject
       with MobileBroadbandDeviceType
  
  @js.native
  sealed trait remote
    extends StObject
       with MobileBroadbandDeviceType
  
  @js.native
  sealed trait removable
    extends StObject
       with MobileBroadbandDeviceType
  
  @js.native
  sealed trait unknown
    extends StObject
       with MobileBroadbandDeviceType
}
