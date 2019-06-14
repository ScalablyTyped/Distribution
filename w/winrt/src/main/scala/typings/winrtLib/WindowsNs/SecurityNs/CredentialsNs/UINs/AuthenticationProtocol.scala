package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthenticationProtocol extends js.Object

@JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
@js.native
object AuthenticationProtocol extends js.Object {
  @js.native
  sealed trait basic
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait credSsp
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait custom
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait digest
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait kerberos
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait negotiate
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  @js.native
  sealed trait ntlm
    extends winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol
  
  /* 0 */ val basic: basic with scala.Double = js.native
  /* 5 */ val credSsp: credSsp with scala.Double = js.native
  /* 6 */ val custom: custom with scala.Double = js.native
  /* 1 */ val digest: digest with scala.Double = js.native
  /* 3 */ val kerberos: kerberos with scala.Double = js.native
  /* 4 */ val negotiate: negotiate with scala.Double = js.native
  /* 2 */ val ntlm: ntlm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol with scala.Double
  ] = js.native
}

