package typings.winrt.Windows.Security.Credentials.UI

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
  
}

