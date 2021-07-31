package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostNameSortOptions extends StObject
@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with HostNameSortOptions
  
  @js.native
  sealed trait optimizeForLongConnections
    extends StObject
       with HostNameSortOptions
}
