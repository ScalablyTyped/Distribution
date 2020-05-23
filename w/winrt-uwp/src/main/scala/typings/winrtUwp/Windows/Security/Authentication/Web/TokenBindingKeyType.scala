package typings.winrtUwp.Windows.Security.Authentication.Web

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
  
}

