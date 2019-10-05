package typings.winrt.Windows.Networking

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
  
  /* 0 */ val none: typings.winrt.Windows.Networking.HostNameSortOptions.none with Double = js.native
  /* 1 */ val optimizeForLongConnections: typings.winrt.Windows.Networking.HostNameSortOptions.optimizeForLongConnections with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameSortOptions with Double] = js.native
}

