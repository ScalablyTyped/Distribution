package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameType extends js.Object

@JSGlobal("Windows.Networking.HostNameType")
@js.native
object HostNameType extends js.Object {
  @js.native
  sealed trait bluetooth
    extends winrtLib.WindowsNs.NetworkingNs.HostNameType
  
  @js.native
  sealed trait domainName
    extends winrtLib.WindowsNs.NetworkingNs.HostNameType
  
  @js.native
  sealed trait ipv4
    extends winrtLib.WindowsNs.NetworkingNs.HostNameType
  
  @js.native
  sealed trait ipv6
    extends winrtLib.WindowsNs.NetworkingNs.HostNameType
  
  /* 3 */ val bluetooth: bluetooth with scala.Double = js.native
  /* 0 */ val domainName: domainName with scala.Double = js.native
  /* 1 */ val ipv4: ipv4 with scala.Double = js.native
  /* 2 */ val ipv6: ipv6 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.HostNameType with scala.Double] = js.native
}

