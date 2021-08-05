package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a license that is associated with an in-app product. */
trait ProductLicense extends StObject {
  
  /** Gets the current expiration date and time of the in-app product license. */
  var expirationDate: Date
  
  /** Indicates if the in-app product license is currently active. */
  var isActive: Boolean
  
  /** Indicates if the in-app product is consumable. A consumable product is a product that can be purchased, used, and purchased again. */
  var isConsumable: Boolean
  
  /** Gets the ID of an in-app product. This ID is used by the app to get info about the product or feature that is enabled when the customer buys it through an in-app purchase. */
  var productId: String
}
object ProductLicense {
  
  inline def apply(expirationDate: Date, isActive: Boolean, isConsumable: Boolean, productId: String): ProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isConsumable = isConsumable.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductLicense]
  }
  
  extension [Self <: ProductLicense](x: Self) {
    
    inline def setExpirationDate(value: Date): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsConsumable(value: Boolean): Self = StObject.set(x, "isConsumable", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
