package typings.stripe.mod.resources

import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Issuing")
@js.native
class Issuing protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  var authorizations: Authorizations = js.native
  
  var cardholders: Cardholders = js.native
  
  var cards: IssuingCards = js.native
  
  var disputes: IssuingDisputes = js.native
  
  var transactions: Transactions = js.native
}
