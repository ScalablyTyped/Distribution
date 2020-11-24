package typings.winrt.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostNameSortOptions extends js.Object
@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends js.Object {
  
  @js.native
  sealed trait none extends HostNameSortOptions
  
  @js.native
  sealed trait optimizeForLongConnections extends HostNameSortOptions
}
