package typings.winrtUwp.Windows.Security.Credentials.UI

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
  sealed trait basic extends AuthenticationProtocol
  
  /** The authentication protocol is for remote access using the Credential Security Support Provider (CredSSP) protocol. */
  @js.native
  sealed trait credSsp extends AuthenticationProtocol
  
  /** The authentication protocol is anything other than the previous ones. Credentials are returned to the caller as plaintext. */
  @js.native
  sealed trait custom extends AuthenticationProtocol
  
  /** The authentication protocol is digest. Credentials are returned to the caller as plaintext. */
  @js.native
  sealed trait digest extends AuthenticationProtocol
  
  /** The authentication protocol is Kerberos. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait kerberos extends AuthenticationProtocol
  
  /** The authentication protocol is negotiate, including negotiate extensions. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait negotiate extends AuthenticationProtocol
  
  /** The authentication protocol is NTLM. Credentials are transformed before being returned to the caller. */
  @js.native
  sealed trait ntlm extends AuthenticationProtocol
  
}

