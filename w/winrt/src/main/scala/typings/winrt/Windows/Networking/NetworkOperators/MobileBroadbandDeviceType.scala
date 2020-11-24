package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandDeviceType extends js.Object
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends js.Object {
  
  @js.native
  sealed trait embedded extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait remote extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait removable extends MobileBroadbandDeviceType
  
  @js.native
  sealed trait unknown extends MobileBroadbandDeviceType
}
