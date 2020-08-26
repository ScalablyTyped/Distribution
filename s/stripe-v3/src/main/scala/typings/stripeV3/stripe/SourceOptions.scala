package typings.stripeV3.stripe

import typings.stripeV3.anon.Country
import typings.stripeV3.anon.Iban
import typings.stripeV3.anon.Returnurl
import typings.stripeV3.stripeV3Strings.code_verification
import typings.stripeV3.stripeV3Strings.none
import typings.stripeV3.stripeV3Strings.receiver
import typings.stripeV3.stripeV3Strings.redirect
import typings.stripeV3.stripeV3Strings.reusable
import typings.stripeV3.stripeV3Strings.single_use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceOptions extends js.Object {
  var amount: js.UndefOr[Double] = js.native
  var currency: js.UndefOr[String] = js.native
  var flow: js.UndefOr[redirect | receiver | code_verification | none] = js.native
  var mandate: js.UndefOr[SourceMandate] = js.native
  var metadata: js.UndefOr[js.Object] = js.native
  var owner: js.UndefOr[OwnerInfo] = js.native
  var redirect: js.UndefOr[Returnurl] = js.native
  var sepa_debit: js.UndefOr[Iban] = js.native
  var sofort: js.UndefOr[Country] = js.native
  var statement_descriptor: js.UndefOr[String] = js.native
  var three_d_secure: js.UndefOr[typings.stripeV3.anon.Card] = js.native
  var token: js.UndefOr[String] = js.native
  var `type`: String = js.native
  var usage: js.UndefOr[reusable | single_use] = js.native
}

object SourceOptions {
  @scala.inline
  def apply(`type`: String): SourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptions]
  }
  @scala.inline
  implicit class SourceOptionsOps[Self <: SourceOptions] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlow: Self = this.set("flow", js.undefined)
    @scala.inline
    def setMandate(value: SourceMandate): Self = this.set("mandate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMandate: Self = this.set("mandate", js.undefined)
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOwner(value: OwnerInfo): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRedirect(value: Returnurl): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSepa_debit(value: Iban): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSepa_debit: Self = this.set("sepa_debit", js.undefined)
    @scala.inline
    def setSofort(value: Country): Self = this.set("sofort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSofort: Self = this.set("sofort", js.undefined)
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setThree_d_secure(value: typings.stripeV3.anon.Card): Self = this.set("three_d_secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThree_d_secure: Self = this.set("three_d_secure", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUsage(value: reusable | single_use): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

