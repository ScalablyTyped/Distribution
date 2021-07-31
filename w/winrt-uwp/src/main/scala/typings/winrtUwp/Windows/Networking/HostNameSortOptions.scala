package typings.winrtUwp.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostNameSortOptions extends StObject
/** Options for how a list of EndpointPair objects is sorted. */
@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends StObject {
  
  /** Sort a list of EndpointPair objects by the default criteria used the system which is to minimize connection delays. */
  @js.native
  sealed trait none
    extends StObject
       with HostNameSortOptions
  
  /** Sort a list of EndpointPair objects to optimize for long connections. */
  @js.native
  sealed trait optimizeForLongConnections
    extends StObject
       with HostNameSortOptions
}
