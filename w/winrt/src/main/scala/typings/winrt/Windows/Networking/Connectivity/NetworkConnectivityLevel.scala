package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkConnectivityLevel extends StObject
@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends StObject {
  
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  @js.native
  sealed trait none extends NetworkConnectivityLevel
}
