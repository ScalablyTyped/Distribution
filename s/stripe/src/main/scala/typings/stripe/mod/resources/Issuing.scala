package typings.stripe.mod.resources

import typings.stripe.mod.StripeResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Issuing")
@js.native
class Issuing () extends StripeResource {
  
  var authorizations: Authorizations = js.native
  
  var cardholders: Cardholders = js.native
  
  var cards: IssuingCards = js.native
  
  var disputes: IssuingDisputes = js.native
  
  var transactions: Transactions = js.native
}
