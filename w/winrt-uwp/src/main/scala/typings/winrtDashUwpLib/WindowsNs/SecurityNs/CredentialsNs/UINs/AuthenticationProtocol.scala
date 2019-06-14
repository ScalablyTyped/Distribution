package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthenticationProtocol extends js.Object

/** Identifies which authentication protocol to use. */
@JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
@js.native
object AuthenticationProtocol extends js.Object {
  /** The authentication protocol is basic. Credentials are returned to the caller as plaintext. */
  @js.native
  sealed trait basic
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is for remote access using the Credential Security Support Provider (CredSSP) protocol. */
  @js.native
  sealed trait credSsp
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is anything other than the previous ones. Credentials are returned to the caller as plaintext. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is digest. Credentials are returned to the caller as plaintext. */
  @js.native
  sealed trait digest
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is Kerberos. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait kerberos
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is negotiate, including negotiate extensions. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait negotiate
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /** The authentication protocol is NTLM. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait ntlm
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /* 0 */ val basic: basic with scala.Double = js.native
  /* 5 */ val credSsp: credSsp with scala.Double = js.native
  /* 6 */ val custom: custom with scala.Double = js.native
  /* 1 */ val digest: digest with scala.Double = js.native
  /* 3 */ val kerberos: kerberos with scala.Double = js.native
  /* 4 */ val negotiate: negotiate with scala.Double = js.native
  /* 2 */ val ntlm: ntlm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol with scala.Double
  ] = js.native
}

