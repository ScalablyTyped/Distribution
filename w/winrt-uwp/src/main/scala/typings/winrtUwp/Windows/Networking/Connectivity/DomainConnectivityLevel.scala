package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DomainConnectivityLevel extends StObject
/** Defines the domain authentication status for a network connection. */
@JSGlobal("Windows.Networking.Connectivity.DomainConnectivityLevel")
@js.native
object DomainConnectivityLevel extends StObject {
  
  /** The machine or user is authenticated on the domain connection. */
  @js.native
  sealed trait authenticated
    extends StObject
       with DomainConnectivityLevel
  
  /** No domain controller detected on this network. */
  @js.native
  sealed trait none
    extends StObject
       with DomainConnectivityLevel
  
  /** A domain controller has been detected, but the current user or local machine have not been authenticated on the domain. */
  @js.native
  sealed trait unauthenticated
    extends StObject
       with DomainConnectivityLevel
}
