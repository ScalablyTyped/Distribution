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
  
  val none: none with java.lang.String = js.native
  val optimizeForLongConnections: optimizeForLongConnections with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions with java.lang.String] = js.native
}

