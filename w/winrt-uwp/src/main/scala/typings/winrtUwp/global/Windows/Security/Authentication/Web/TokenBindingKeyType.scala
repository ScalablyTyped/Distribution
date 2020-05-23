package typings.winrtUwp.global.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the type of key used for token binding. */
@JSGlobal("Windows.Security.Authentication.Web.TokenBindingKeyType")
@js.native
object TokenBindingKeyType extends js.Object {
  /* 1 */ val ecdsaP256: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.ecdsaP256 with Double = js.native
  /* 0 */ val rsa2048: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.rsa2048 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType with Double
  ] = js.native
}

