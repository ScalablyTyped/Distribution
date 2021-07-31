package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AllJoynAuthenticationMechanism extends StObject
/** Defines values used to indicate the mechanism used in authentication operations. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism")
@js.native
object AllJoynAuthenticationMechanism extends StObject {
  
  /** ECDHE_ECDSA key exchange. */
  @js.native
  sealed trait ecdheEcdsa
    extends StObject
       with AllJoynAuthenticationMechanism
  
  /** ECDHE_NULL key exchange. */
  @js.native
  sealed trait ecdheNull
    extends StObject
       with AllJoynAuthenticationMechanism
  
  /** ECDHE_PSK key exchange. */
  @js.native
  sealed trait ecdhePsk
    extends StObject
       with AllJoynAuthenticationMechanism
  
  /** No mechanism used. */
  @js.native
  sealed trait none
    extends StObject
       with AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) anonymous key exchange. */
  @js.native
  sealed trait srpAnonymous
    extends StObject
       with AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) logon (e.g. username and password). */
  @js.native
  sealed trait srpLogon
    extends StObject
       with AllJoynAuthenticationMechanism
}
