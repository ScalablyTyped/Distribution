package typings.winrtUwp.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DomainNameType extends StObject
/** The domain type of the HostName object when the HostNameType is a domain name. */
@JSGlobal("Windows.Networking.DomainNameType")
@js.native
object DomainNameType extends StObject {
  
  /** A fully-qualified domain name. */
  @js.native
  sealed trait fullyQualified extends DomainNameType
  
  /** The suffix of a domain name. */
  @js.native
  sealed trait suffix extends DomainNameType
}
