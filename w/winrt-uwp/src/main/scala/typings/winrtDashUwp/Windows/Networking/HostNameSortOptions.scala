package typings.winrtDashUwp.Windows.Networking

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.HostNameSortOptions.none
import typings.winrtDashUwp.Windows.Networking.HostNameSortOptions.optimizeForLongConnections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameSortOptions extends js.Object

/** Options for how a list of EndpointPair objects is sorted. */
@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends js.Object {
  /** Sort a list of EndpointPair objects by the default criteria used the system which is to minimize connection delays. */
  @js.native
  sealed trait none extends HostNameSortOptions
  
  /** Sort a list of EndpointPair objects to optimize for long connections. */
  @js.native
  sealed trait optimizeForLongConnections extends HostNameSortOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameSortOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object optimizeForLongConnections extends TopLevel[optimizeForLongConnections with Double]
  
}

