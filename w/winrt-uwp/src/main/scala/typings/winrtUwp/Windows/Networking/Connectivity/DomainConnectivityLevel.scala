package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DomainConnectivityLevel with Double] = js.native
  /* 2 */ @js.native
  object authenticated extends TopLevel[authenticated with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object unauthenticated extends TopLevel[unauthenticated with Double]
  
}

