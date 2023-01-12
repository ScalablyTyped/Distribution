package typings.stripe.anon

import typings.stripe.mod.Stripe.Issuing.AuthorizationsResource
import typings.stripe.mod.Stripe.Issuing.CardholdersResource
import typings.stripe.mod.Stripe.Issuing.CardsResource
import typings.stripe.mod.Stripe.Issuing.DisputesResource
import typings.stripe.mod.Stripe.Issuing.TransactionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizations extends StObject {
  
  var authorizations: AuthorizationsResource
  
  var cardholders: CardholdersResource
  
  var cards: CardsResource
  
  var disputes: DisputesResource
  
  var transactions: TransactionsResource
}
object Authorizations {
  
  inline def apply(
    authorizations: AuthorizationsResource,
    cardholders: CardholdersResource,
    cards: CardsResource,
    disputes: DisputesResource,
    transactions: TransactionsResource
  ): Authorizations = {
    val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], cardholders = cardholders.asInstanceOf[js.Any], cards = cards.asInstanceOf[js.Any], disputes = disputes.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Authorizations] (val x: Self) extends AnyVal {
    
    inline def setAuthorizations(value: AuthorizationsResource): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
    
    inline def setCardholders(value: CardholdersResource): Self = StObject.set(x, "cardholders", value.asInstanceOf[js.Any])
    
    inline def setCards(value: CardsResource): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setDisputes(value: DisputesResource): Self = StObject.set(x, "disputes", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: TransactionsResource): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
  }
}
