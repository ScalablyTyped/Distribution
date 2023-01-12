package typings.winrtUwp.Windows.ApplicationModel.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information detailing the results of an in-app product purchase transaction. */
trait PurchaseResults extends StObject {
  
  /** A unique ID used to identify a specific in-app product within a large catalog. */
  var offerId: String
  
  /** A full receipt that provides a transaction history for the purchase of an in-app product */
  var receiptXml: String
  
  /** The current state of the purchase transaction for an in-app product. */
  var status: ProductPurchaseStatus
  
  /** A unique transaction ID associated with the purchase of a consumable in-app product. */
  var transactionId: String
}
object PurchaseResults {
  
  inline def apply(offerId: String, receiptXml: String, status: ProductPurchaseStatus, transactionId: String): PurchaseResults = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], receiptXml = receiptXml.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchaseResults] (val x: Self) extends AnyVal {
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setReceiptXml(value: String): Self = StObject.set(x, "receiptXml", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ProductPurchaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
