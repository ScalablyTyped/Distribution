package typings.stripeV3.stripe

import typings.stripeV3.anon.Address
import typings.stripeV3.anon.Authenticated
import typings.stripeV3.anon.Bankcode
import typings.stripeV3.anon.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
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
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: Address): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: Card): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setRedirect(value: Status): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSepa_debit(value: Bankcode): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepa_debit: Self = this.set("sepa_debit", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setThree_d_secure(value: Authenticated): Self = this.set("three_d_secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThree_d_secure: Self = this.set("three_d_secure", js.undefined)
  }
  
}

