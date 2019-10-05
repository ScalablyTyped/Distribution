package typings.winrtDashUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DomainConnectivityLevel extends js.Object

/** Defines the domain authentication status for a network connection. */
@JSGlobal("Windows.Networking.Connectivity.DomainConnectivityLevel")
@js.native
object DomainConnectivityLevel extends js.Object {
  /** The machine or user is authenticated on the domain connection. */
  @js.native
  sealed trait authenticated extends DomainConnectivityLevel
  
  /** No domain controller detected on this network. */
  @js.native
  sealed trait none extends DomainConnectivityLevel
  
  /** A domain controller has been detected, but the current user or local machine have not been authenticated on the domain. */
  @js.native
  sealed trait unauthenticated extends DomainConnectivityLevel
  
  /* 2 */ val authenticated: typings.winrtDashUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.authenticated with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.none with Double = js.native
  /* 1 */ val unauthenticated: typings.winrtDashUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.unauthenticated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DomainConnectivityLevel with Double] = js.native
}

