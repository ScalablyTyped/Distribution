package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TokenBindingKeyType extends js.Object

/** Gets the type of key used for token binding. */
@JSGlobal("Windows.Security.Authentication.Web.TokenBindingKeyType")
@js.native
object TokenBindingKeyType extends js.Object {
  /** ECDsaP256. */
  @js.native
  sealed trait ecdsaP256
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType
  
  /** RSA-2048. */
  @js.native
  sealed trait rsa2048
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType
  
  val ecdsaP256: ecdsaP256 with java.lang.String = js.native
  val rsa2048: rsa2048 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType with java.lang.String
  ] = js.native
}

