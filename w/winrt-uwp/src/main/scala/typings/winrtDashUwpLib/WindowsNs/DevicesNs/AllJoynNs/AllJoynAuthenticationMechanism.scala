package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

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
  sealed trait ecdheEcdsa
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /** ECDHE_NULL key exchange. */
  @js.native
  sealed trait ecdheNull
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /** ECDHE_PSK key exchange. */
  @js.native
  sealed trait ecdhePsk
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /** No mechanism used. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) anonymous key exchange. */
  @js.native
  sealed trait srpAnonymous
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /** Secure Remote Password (SRP) logon (e.g. username and password). */
  @js.native
  sealed trait srpLogon
    extends winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism
  
  /* 5 */ val ecdheEcdsa: ecdheEcdsa with scala.Double = js.native
  /* 3 */ val ecdheNull: ecdheNull with scala.Double = js.native
  /* 4 */ val ecdhePsk: ecdhePsk with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val srpAnonymous: srpAnonymous with scala.Double = js.native
  /* 2 */ val srpLogon: srpLogon with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs.AllJoynAuthenticationMechanism with scala.Double
  ] = js.native
}

