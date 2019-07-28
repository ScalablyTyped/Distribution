package typings.winrt.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameSortOptions extends js.Object

@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends js.Object {
  @js.native
  sealed trait none extends HostNameSortOptions
  
  @js.native
  sealed trait optimizeForLongConnections extends HostNameSortOptions
  
  /* 0 */ val none: typings.winrt.WindowsNs.NetworkingNs.HostNameSortOptions.none with Double = js.native
  /* 1 */ val optimizeForLongConnections: typings.winrt.WindowsNs.NetworkingNs.HostNameSortOptions.optimizeForLongConnections with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameSortOptions with Double] = js.native
}

