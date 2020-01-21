package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AllJoynAuthenticationMechanism extends js.Object

/** Defines values used to indicate the mechanism used in authentication operations. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism")
@js.native
object AllJoynAuthenticationMechanism extends js.Object {
  /** ECDHE_ECDSA key exchange. */
  @js.native
  sealed trait ecdheEcdsa extends AllJoynAuthenticationMechanism
  
  /** ECDHE_NULL key exchange. */
  @js.native
  sealed trait ecdheNull extends AllJoynAuthenticationMechanism
  
  /** ECDHE_PSK key exchange. */
  @js.native
  sealed trait ecdhePsk extends AllJoynAuthenticationMechanism
  
  /** No mechanism used. */
  @js.native
  sealed trait none extends AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) anonymous key exchange. */
  @js.native
  sealed trait srpAnonymous extends AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) logon (e.g. username and password). */
  @js.native
  sealed trait srpLogon extends AllJoynAuthenticationMechanism
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynAuthenticationMechanism with Double] = js.native
  /* 5 */ @js.native
  object ecdheEcdsa extends TopLevel[ecdheEcdsa with Double]
  
  /* 3 */ @js.native
  object ecdheNull extends TopLevel[ecdheNull with Double]
  
  /* 4 */ @js.native
  object ecdhePsk extends TopLevel[ecdhePsk with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object srpAnonymous extends TopLevel[srpAnonymous with Double]
  
  /* 2 */ @js.native
  object srpLogon extends TopLevel[srpLogon with Double]
  
}

