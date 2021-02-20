package typings.stripeV3.stripe

import typings.stripeV3.anon.Address
import typings.stripeV3.anon.Authenticated
import typings.stripeV3.anon.Bankcode
import typings.stripeV3.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  var card: js.UndefOr[Card] = js.native
  
  var client_secret: String = js.native
  
  var created: Double = js.native
  
  var currency: String = js.native
  
  var id: String = js.native
  
  var owner: Address = js.native
  
  var redirect: js.UndefOr[Status] = js.native
  
  var sepa_debit: js.UndefOr[Bankcode] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var three_d_secure: js.UndefOr[Authenticated] = js.native
}
object Source {
  
  @scala.inline
  def apply(client_secret: String, created: Double, currency: String, id: String, owner: Address): Source = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Address): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect(value: Status): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    @scala.inline
    def setSepa_debit(value: Bankcode): Self = StObject.set(x, "sepa_debit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepa_debitUndefined: Self = StObject.set(x, "sepa_debit", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThree_d_secure(value: Authenticated): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
  }
}
