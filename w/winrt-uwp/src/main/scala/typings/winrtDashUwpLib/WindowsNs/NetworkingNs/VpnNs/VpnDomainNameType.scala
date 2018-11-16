package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnDomainNameType extends js.Object

/** Describes whether a name is a domain name suffix or a fully qualified domain name. */
@JSGlobal("Windows.Networking.Vpn.VpnDomainNameType")
@js.native
object VpnDomainNameType extends js.Object {
  /** Fully qualified domain name (FQDN) */
  @js.native
  sealed trait fullyQualified
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDomainNameType
  
  /** Reserved */
  @js.native
  sealed trait reserved
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDomainNameType
  
  /** Domain name suffix */
  @js.native
  sealed trait suffix
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDomainNameType
  
  val fullyQualified: fullyQualified with java.lang.String = js.native
  val reserved: reserved with java.lang.String = js.native
  val suffix: suffix with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnDomainNameType with java.lang.String
  ] = js.native
}

