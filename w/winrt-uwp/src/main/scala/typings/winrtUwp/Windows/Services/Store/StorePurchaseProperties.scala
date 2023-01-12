package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
trait StorePurchaseProperties extends StObject {
  
  /** Gets or sets a JSON-formatted string that contains extended data to pass with the purchase request to the Windows Store. */
  var extendedJsonData: String
  
  /** Gets or sets the product name that is displayed to the user during the purchase. The specified name appears in the title bar of the purchase UI. */
  var name: String
}
object StorePurchaseProperties {
  
  inline def apply(extendedJsonData: String, name: String): StorePurchaseProperties = {
    val __obj = js.Dynamic.literal(extendedJsonData = extendedJsonData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorePurchaseProperties] (val x: Self) extends AnyVal {
    
    inline def setExtendedJsonData(value: String): Self = StObject.set(x, "extendedJsonData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
