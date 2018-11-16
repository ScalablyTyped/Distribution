package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebTokenRequestPromptType extends js.Object

/** Represents the prompt type of a web token request. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType")
@js.native
object WebTokenRequestPromptType extends js.Object {
  /** The default request type. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestPromptType
  
  /** A request with forced authentication. This will require the user to enter their credentials, regardless of whether they are already logged in. */
  @js.native
  sealed trait forceAuthentication
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestPromptType
  
  val default: default with java.lang.String = js.native
  val forceAuthentication: forceAuthentication with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestPromptType with java.lang.String
  ] = js.native
}

