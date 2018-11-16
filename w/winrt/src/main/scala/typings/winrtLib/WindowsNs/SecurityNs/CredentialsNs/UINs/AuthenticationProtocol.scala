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
  
  val basic: basic with java.lang.String = js.native
  val credSsp: credSsp with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val digest: digest with java.lang.String = js.native
  val kerberos: kerberos with java.lang.String = js.native
  val negotiate: negotiate with java.lang.String = js.native
  val ntlm: ntlm with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs.AuthenticationProtocol with java.lang.String
  ] = js.native
}

