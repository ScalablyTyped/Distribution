package typings.winrtUwp.Windows.ApplicationModel.Wallet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
@js.native
trait WalletVerb extends StObject {
  
  /** Gets or sets the custom verb name. */
  var name: String = js.native
}
object WalletVerb {
  
  @scala.inline
  def apply(name: String): WalletVerb = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletVerb]
  }
  
  @scala.inline
  implicit class WalletVerbMutableBuilder[Self <: WalletVerb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
