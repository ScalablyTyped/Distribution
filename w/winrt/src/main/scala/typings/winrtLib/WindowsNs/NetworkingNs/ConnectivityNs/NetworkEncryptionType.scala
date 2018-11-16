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
  
  val ccmp: ccmp with java.lang.String = js.native
  val ihv: ihv with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val rsnUseGroup: rsnUseGroup with java.lang.String = js.native
  val tkip: tkip with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val wep: wep with java.lang.String = js.native
  val wep104: wep104 with java.lang.String = js.native
  val wep40: wep40 with java.lang.String = js.native
  val wpaUseGroup: wpaUseGroup with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType with java.lang.String
  ] = js.native
}

