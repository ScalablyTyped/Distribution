package typings.winrtUwp.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostNameType extends StObject
/** The type of a HostName object. */
@JSGlobal("Windows.Networking.HostNameType")
@js.native
object HostNameType extends StObject {
  
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
}
