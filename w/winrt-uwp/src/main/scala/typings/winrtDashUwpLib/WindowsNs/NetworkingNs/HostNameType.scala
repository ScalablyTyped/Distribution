package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameType extends js.Object

/** The type of a HostName object. */
@JSGlobal("Windows.Networking.HostNameType")
@js.native
object HostNameType extends js.Object {
  /** A Bluetooth address. This represents the hardware or media access control (MAC) address for a Bluetooth device. */
  @js.native
  sealed trait bluetooth
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameType
  
  /** A domain name. */
  @js.native
  sealed trait domainName
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameType
  
  /** An IPv4 address. */
  @js.native
  sealed trait ipv4
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameType
  
  /** An IPv6 address. */
  @js.native
  sealed trait ipv6
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameType
  
  val bluetooth: bluetooth with java.lang.String = js.native
  val domainName: domainName with java.lang.String = js.native
  val ipv4: ipv4 with java.lang.String = js.native
  val ipv6: ipv6 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameType with java.lang.String] = js.native
}

