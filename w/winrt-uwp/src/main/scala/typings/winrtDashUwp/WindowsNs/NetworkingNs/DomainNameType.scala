package typings.winrtDashUwp.WindowsNs.NetworkingNs

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
  sealed trait fullyQualified extends DomainNameType
  
  /** The suffix of a domain name. */
  @js.native
  sealed trait suffix extends DomainNameType
  
  /* 1 */ val fullyQualified: typings.winrtDashUwp.WindowsNs.NetworkingNs.DomainNameType.fullyQualified with Double = js.native
  /* 0 */ val suffix: typings.winrtDashUwp.WindowsNs.NetworkingNs.DomainNameType.suffix with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DomainNameType with Double] = js.native
}

