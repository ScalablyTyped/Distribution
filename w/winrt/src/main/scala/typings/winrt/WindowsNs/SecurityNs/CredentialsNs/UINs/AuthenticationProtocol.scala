package typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthenticationProtocol extends js.Object

@JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
@js.native
object AuthenticationProtocol extends js.Object {
  @js.native
  sealed trait basic extends AuthenticationProtocol
  
  @js.native
  sealed trait credSsp extends AuthenticationProtocol
  
  @js.native
  sealed trait custom extends AuthenticationProtocol
  
  @js.native
  sealed trait digest extends AuthenticationProtocol
  
  @js.native
  sealed trait kerberos extends AuthenticationProtocol
  
  @js.native
  sealed trait negotiate extends AuthenticationProtocol
  
  @js.native
  sealed trait ntlm extends AuthenticationProtocol
  
  /* 0 */ val basic: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.basic with Double = js.native
  /* 5 */ val credSsp: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.credSsp with Double = js.native
  /* 6 */ val custom: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.custom with Double = js.native
  /* 1 */ val digest: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.digest with Double = js.native
  /* 3 */ val kerberos: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.kerberos with Double = js.native
  /* 4 */ val negotiate: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.negotiate with Double = js.native
  /* 2 */ val ntlm: typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol.ntlm with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthenticationProtocol with Double] = js.native
}

