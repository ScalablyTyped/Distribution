package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenBindingKeyType extends StObject
/** Gets the type of key used for token binding. */
@JSGlobal("Windows.Security.Authentication.Web.TokenBindingKeyType")
@js.native
object TokenBindingKeyType extends StObject {
  
  /** ECDsaP256. */
  @js.native
  sealed trait ecdsaP256 extends TokenBindingKeyType
  
  /** RSA-2048. */
  @js.native
  sealed trait rsa2048 extends TokenBindingKeyType
}
