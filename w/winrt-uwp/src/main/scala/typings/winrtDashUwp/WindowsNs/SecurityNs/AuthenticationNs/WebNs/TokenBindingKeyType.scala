package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs

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
  sealed trait ecdsaP256 extends TokenBindingKeyType
  
  /** RSA-2048. */
  @js.native
  sealed trait rsa2048 extends TokenBindingKeyType
  
  /* 1 */ val ecdsaP256: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType.ecdsaP256 with Double = js.native
  /* 0 */ val rsa2048: typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.TokenBindingKeyType.rsa2048 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenBindingKeyType with Double] = js.native
}

