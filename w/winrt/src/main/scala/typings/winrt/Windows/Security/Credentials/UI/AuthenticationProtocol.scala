package typings.winrt.Windows.Security.Credentials.UI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuthenticationProtocol with Double] = js.native
  /* 0 */ @js.native
  object basic extends TopLevel[basic with Double]
  
  /* 5 */ @js.native
  object credSsp extends TopLevel[credSsp with Double]
  
  /* 6 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 1 */ @js.native
  object digest extends TopLevel[digest with Double]
  
  /* 3 */ @js.native
  object kerberos extends TopLevel[kerberos with Double]
  
  /* 4 */ @js.native
  object negotiate extends TopLevel[negotiate with Double]
  
  /* 2 */ @js.native
  object ntlm extends TopLevel[ntlm with Double]
  
}

