package typings.winrtDashUwp.Windows.Networking

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
  sealed trait bluetooth extends HostNameType
  
  /** A domain name. */
  @js.native
  sealed trait domainName extends HostNameType
  
  /** An IPv4 address. */
  @js.native
  sealed trait ipv4 extends HostNameType
  
  /** An IPv6 address. */
  @js.native
  sealed trait ipv6 extends HostNameType
  
  /* 3 */ val bluetooth: typings.winrtDashUwp.Windows.Networking.HostNameType.bluetooth with Double = js.native
  /* 0 */ val domainName: typings.winrtDashUwp.Windows.Networking.HostNameType.domainName with Double = js.native
  /* 1 */ val ipv4: typings.winrtDashUwp.Windows.Networking.HostNameType.ipv4 with Double = js.native
  /* 2 */ val ipv6: typings.winrtDashUwp.Windows.Networking.HostNameType.ipv6 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameType with Double] = js.native
}

