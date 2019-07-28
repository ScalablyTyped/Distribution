package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkEncryptionType extends js.Object

@JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
@js.native
object NetworkEncryptionType extends js.Object {
  @js.native
  sealed trait ccmp extends NetworkEncryptionType
  
  @js.native
  sealed trait ihv extends NetworkEncryptionType
  
  @js.native
  sealed trait none extends NetworkEncryptionType
  
  @js.native
  sealed trait rsnUseGroup extends NetworkEncryptionType
  
  @js.native
  sealed trait tkip extends NetworkEncryptionType
  
  @js.native
  sealed trait unknown extends NetworkEncryptionType
  
  @js.native
  sealed trait wep extends NetworkEncryptionType
  
  @js.native
  sealed trait wep104 extends NetworkEncryptionType
  
  @js.native
  sealed trait wep40 extends NetworkEncryptionType
  
  @js.native
  sealed trait wpaUseGroup extends NetworkEncryptionType
  
  /* 6 */ val ccmp: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.ccmp with Double = js.native
  /* 9 */ val ihv: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.ihv with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.none with Double = js.native
  /* 8 */ val rsnUseGroup: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.rsnUseGroup with Double = js.native
  /* 5 */ val tkip: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.tkip with Double = js.native
  /* 1 */ val unknown: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.unknown with Double = js.native
  /* 2 */ val wep: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep with Double = js.native
  /* 4 */ val wep104: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep104 with Double = js.native
  /* 3 */ val wep40: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wep40 with Double = js.native
  /* 7 */ val wpaUseGroup: typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs.NetworkEncryptionType.wpaUseGroup with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkEncryptionType with Double] = js.native
}

