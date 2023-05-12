package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swellJs.typesAccountCamelMod.AccountCamel because var conflicts: addresses, balance, billing, cards, date_created, date_first_order, date_last_order, date_updated, email, email_optin, first_name, group, id, last_name, metadata, name, order_count, order_value, orders, password, password_reset_url, phone, shipping, subscriptions, `type`, vat_number. Inlined  */ trait Account
  extends StObject
     with AccountSnake
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
}
