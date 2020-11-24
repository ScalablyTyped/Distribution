package typings.winrtUwp.global.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
@JSGlobal("Windows.Services.Store.StorePurchaseProperties")
@js.native
/** Initializes a new instance of the StorePurchaseProperties class. */
class StorePurchaseProperties ()
  extends typings.winrtUwp.Windows.Services.Store.StorePurchaseProperties {
  /** Initializes a new instance of the StorePurchaseProperties class. This overload provides the option to specify the product name that is displayed to the user during the purchase.
    * @param name The product name that is displayed to the user during the purchase.
    */
  def this(name: String) = this()
}
