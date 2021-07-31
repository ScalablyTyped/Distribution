package typings.stripe.mod.resources

import typings.stripe.mod.Stripe
import typings.stripe.mod.StripeResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Checkout")
@js.native
class Checkout protected () extends StripeResource {
  def this(stripe: Stripe, urlData: js.Any) = this()
  
  var sessions: Sessions = js.native
}
