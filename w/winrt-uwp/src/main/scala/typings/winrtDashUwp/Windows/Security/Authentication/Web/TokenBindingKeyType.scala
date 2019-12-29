package typings.winrtDashUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenBindingKeyType with Double] = js.native
  /* 1 */ @js.native
  object ecdsaP256 extends TopLevel[ecdsaP256 with Double]
  
  /* 0 */ @js.native
  object rsa2048 extends TopLevel[rsa2048 with Double]
  
}

