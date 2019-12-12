package typings.winrtDashUwp.Windows.Networking

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.DomainNameType.fullyQualified
import typings.winrtDashUwp.Windows.Networking.DomainNameType.suffix
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DomainNameType with Double] = js.native
  /* 1 */ @js.native
  object fullyQualified extends TopLevel[fullyQualified with Double]
  
  /* 0 */ @js.native
  object suffix extends TopLevel[suffix with Double]
  
}

