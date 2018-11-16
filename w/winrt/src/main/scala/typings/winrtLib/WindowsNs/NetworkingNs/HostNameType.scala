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
  
  val bluetooth: bluetooth with java.lang.String = js.native
  val domainName: domainName with java.lang.String = js.native
  val ipv4: ipv4 with java.lang.String = js.native
  val ipv6: ipv6 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.HostNameType with java.lang.String] = js.native
}

