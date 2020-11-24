package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the domain authentication status for a network connection. */
@JSGlobal("Windows.Networking.Connectivity.DomainConnectivityLevel")
@js.native
object DomainConnectivityLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel with Double
  ] = js.native
  
  /* 2 */ val authenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.authenticated with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.none with Double = js.native
  
  /* 1 */ val unauthenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.unauthenticated with Double = js.native
}
