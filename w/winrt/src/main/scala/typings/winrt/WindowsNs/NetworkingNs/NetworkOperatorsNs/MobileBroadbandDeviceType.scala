package typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val embedded: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.embedded with Double = js.native
  /* 3 */ val remote: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.remote with Double = js.native
  /* 2 */ val removable: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.removable with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandDeviceType with Double] = js.native
}

