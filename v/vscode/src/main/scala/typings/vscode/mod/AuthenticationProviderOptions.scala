package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationProviderOptions extends StObject {
  
  /**
    * Whether it is possible to be signed into multiple accounts at once with this provider.
    * If not specified, will default to false.
    */
  val supportsMultipleAccounts: js.UndefOr[Boolean] = js.undefined
}
object AuthenticationProviderOptions {
  
  inline def apply(): AuthenticationProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationProviderOptions]
  }
  
  extension [Self <: AuthenticationProviderOptions](x: Self) {
    
    inline def setSupportsMultipleAccounts(value: Boolean): Self = StObject.set(x, "supportsMultipleAccounts", value.asInstanceOf[js.Any])
    
    inline def setSupportsMultipleAccountsUndefined: Self = StObject.set(x, "supportsMultipleAccounts", js.undefined)
  }
}
