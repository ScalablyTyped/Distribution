package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains pricing info for a product listing in the Windows Store. */
trait StorePrice extends StObject {
  
  /** Gets the ISO 4217 currency code for the market of the current user. */
  var currencyCode: String
  
  /** Gets the base price for the product with the appropriate formatting for the market of the current user. */
  var formattedBasePrice: String
  
  /** Gets the purchase price for the product with the appropriate formatting for the market of the current user. */
  var formattedPrice: String
  
  /** Gets the recurring price for the product with the appropriate formatting for the market of the current user, if recurring billing is enabled for this product. */
  var formattedRecurrencePrice: String
  
  /** Gets a value that indicates whether the product is on sale. */
  var isOnSale: Boolean
  
  /** Gets the end date for the sale period for the product, if the product is on sale. */
  var saleEndDate: js.Date
}
object StorePrice {
  
  inline def apply(
    currencyCode: String,
    formattedBasePrice: String,
    formattedPrice: String,
    formattedRecurrencePrice: String,
    isOnSale: Boolean,
    saleEndDate: js.Date
  ): StorePrice = {
    val __obj = js.Dynamic.literal(currencyCode = currencyCode.asInstanceOf[js.Any], formattedBasePrice = formattedBasePrice.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], formattedRecurrencePrice = formattedRecurrencePrice.asInstanceOf[js.Any], isOnSale = isOnSale.asInstanceOf[js.Any], saleEndDate = saleEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePrice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorePrice] (val x: Self) extends AnyVal {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setFormattedBasePrice(value: String): Self = StObject.set(x, "formattedBasePrice", value.asInstanceOf[js.Any])
    
    inline def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    inline def setFormattedRecurrencePrice(value: String): Self = StObject.set(x, "formattedRecurrencePrice", value.asInstanceOf[js.Any])
    
    inline def setIsOnSale(value: Boolean): Self = StObject.set(x, "isOnSale", value.asInstanceOf[js.Any])
    
    inline def setSaleEndDate(value: js.Date): Self = StObject.set(x, "saleEndDate", value.asInstanceOf[js.Any])
  }
}
