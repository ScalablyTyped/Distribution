package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
trait WalletVerb extends StObject {
  
  /** Gets or sets the custom verb name. */
  var name: String
}
object WalletVerb {
  
  inline def apply(name: String): WalletVerb = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletVerb]
  }
  
  extension [Self <: WalletVerb](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
