package typings
package winrtLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameSortOptions extends js.Object

@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  
  @js.native
  sealed trait optimizeForLongConnections
    extends winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val optimizeForLongConnections: optimizeForLongConnections with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions with scala.Double] = js.native
}

