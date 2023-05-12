package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvoiceMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.swellJs.typesInvoiceCamelMod.InvoiceCamel because var conflicts: account, account_id, billing, coupon, coupon_code, coupon_id, currency, currency_rate, date_created, date_due, date_payment_retry, date_period_end, date_period_start, date_updated, discount_total, discounts, grand_total, id, item_discount, item_tax, items, notes, number, order, order_id, paid, payment_total, shipping, status, sub_total, subscription_id, tax_included_total, tax_total, taxes, taxes_fixed, unpaid. Inlined  */ trait Invoice
    extends StObject
       with InvoiceSnake
  object Invoice {
    
    inline def apply(): Invoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invoice]
    }
  }
}
