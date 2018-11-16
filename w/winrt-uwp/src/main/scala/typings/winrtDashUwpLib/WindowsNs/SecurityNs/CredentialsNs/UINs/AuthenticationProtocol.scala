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
  
  val basic: basic with java.lang.String = js.native
  val credSsp: credSsp with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val digest: digest with java.lang.String = js.native
  val kerberos: kerberos with java.lang.String = js.native
  val negotiate: negotiate with java.lang.String = js.native
  val ntlm: ntlm with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol with java.lang.String
  ] = js.native
}

