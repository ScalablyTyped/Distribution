package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

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
  sealed trait authenticated
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DomainConnectivityLevel
  
  /** No domain controller detected on this network. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DomainConnectivityLevel
  
  /** A domain controller has been detected, but the current user or local machine have not been authenticated on the domain. */
  @js.native
  sealed trait unauthenticated
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DomainConnectivityLevel
  
  /* 2 */ val authenticated: authenticated with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val unauthenticated: unauthenticated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.DomainConnectivityLevel with scala.Double
  ] = js.native
}

