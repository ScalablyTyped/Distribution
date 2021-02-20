package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkConnectivityLevel extends StObject
/** Defines the level of connectivity currently available. */
@JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
@js.native
object NetworkConnectivityLevel extends StObject {
  
  /** Limited internet access. */
  @js.native
  sealed trait constrainedInternetAccess extends NetworkConnectivityLevel
  
  /** Local and Internet access. */
  @js.native
  sealed trait internetAccess extends NetworkConnectivityLevel
  
  /** Local network access only. */
  @js.native
  sealed trait localAccess extends NetworkConnectivityLevel
  
  /** No connectivity. */
  @js.native
  sealed trait none extends NetworkConnectivityLevel
}
