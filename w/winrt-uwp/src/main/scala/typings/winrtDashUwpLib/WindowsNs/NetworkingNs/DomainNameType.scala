package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DomainNameType extends js.Object

/** The domain type of the HostName object when the HostNameType is a domain name. */
@JSGlobal("Windows.Networking.DomainNameType")
@js.native
object DomainNameType extends js.Object {
  /** A fully-qualified domain name. */
  @js.native
  sealed trait fullyQualified
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.DomainNameType
  
  /** The suffix of a domain name. */
  @js.native
  sealed trait suffix
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.DomainNameType
  
  /* 1 */ val fullyQualified: fullyQualified with scala.Double = js.native
  /* 0 */ val suffix: suffix with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.DomainNameType with scala.Double] = js.native
}

