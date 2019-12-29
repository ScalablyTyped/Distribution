package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostNameSortOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object optimizeForLongConnections extends TopLevel[optimizeForLongConnections with Double]
  
}

