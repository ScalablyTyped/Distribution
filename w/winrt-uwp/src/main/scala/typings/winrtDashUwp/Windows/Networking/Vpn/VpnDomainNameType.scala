package typings.winrtDashUwp.Windows.Networking.Vpn

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
  sealed trait fullyQualified extends VpnDomainNameType
  
  /** Reserved */
  @js.native
  sealed trait reserved extends VpnDomainNameType
  
  /** Domain name suffix */
  @js.native
  sealed trait suffix extends VpnDomainNameType
  
  /* 1 */ val fullyQualified: typings.winrtDashUwp.Windows.Networking.Vpn.VpnDomainNameType.fullyQualified with Double = js.native
  /* 2 */ val reserved: typings.winrtDashUwp.Windows.Networking.Vpn.VpnDomainNameType.reserved with Double = js.native
  /* 0 */ val suffix: typings.winrtDashUwp.Windows.Networking.Vpn.VpnDomainNameType.suffix with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnDomainNameType with Double] = js.native
}

