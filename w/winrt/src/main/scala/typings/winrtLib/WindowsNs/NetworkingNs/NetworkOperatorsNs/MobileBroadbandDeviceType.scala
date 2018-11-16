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
  
  val embedded: embedded with java.lang.String = js.native
  val remote: remote with java.lang.String = js.native
  val removable: removable with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandDeviceType with java.lang.String
  ] = js.native
}

