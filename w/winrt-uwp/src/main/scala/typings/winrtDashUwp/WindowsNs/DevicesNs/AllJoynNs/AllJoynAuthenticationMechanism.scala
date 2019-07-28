package typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs

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
  
  /* 5 */ val ecdheEcdsa: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.ecdheEcdsa with Double = js.native
  /* 3 */ val ecdheNull: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.ecdheNull with Double = js.native
  /* 4 */ val ecdhePsk: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.ecdhePsk with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.none with Double = js.native
  /* 1 */ val srpAnonymous: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.srpAnonymous with Double = js.native
  /* 2 */ val srpLogon: typings.winrtDashUwp.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism.srpLogon with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AllJoynAuthenticationMechanism with Double] = js.native
}

