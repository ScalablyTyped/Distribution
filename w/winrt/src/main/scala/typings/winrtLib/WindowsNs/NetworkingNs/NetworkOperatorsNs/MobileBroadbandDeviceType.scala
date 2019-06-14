package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandDeviceType extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
@js.native
object MobileBroadbandDeviceType extends js.Object {
  @js.native
  sealed trait embedded
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  @js.native
  sealed trait remote
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  @js.native
  sealed trait removable
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType
  
  /* 1 */ val embedded: embedded with scala.Double = js.native
  /* 3 */ val remote: remote with scala.Double = js.native
  /* 2 */ val removable: removable with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType with scala.Double
  ] = js.native
}

