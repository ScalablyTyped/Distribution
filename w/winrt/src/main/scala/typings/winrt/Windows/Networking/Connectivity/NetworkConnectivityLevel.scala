package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkConnectivityLevel extends js.Object
@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends js.Object {
  
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait none extends NetworkConnectivityLevel
}
