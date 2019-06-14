package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  @js.native
  sealed trait ccmp
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait ihv
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait tkip
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait wep
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait wep104
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait wep40
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup
    extends winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType
  
  /* 6 */ val ccmp: ccmp with scala.Double = js.native
  /* 9 */ val ihv: ihv with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 8 */ val rsnUseGroup: rsnUseGroup with scala.Double = js.native
  /* 5 */ val tkip: tkip with scala.Double = js.native
  /* 1 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val wep: wep with scala.Double = js.native
  /* 4 */ val wep104: wep104 with scala.Double = js.native
  /* 3 */ val wep40: wep40 with scala.Double = js.native
  /* 7 */ val wpaUseGroup: wpaUseGroup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType with scala.Double
  ] = js.native
}

