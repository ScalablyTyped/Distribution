package typings.stripe.mod.tokens

import typings.stripe.mod.bankAccounts.IBankAccountHash
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stripe.mod.IObject because Already inherited
- typings.stripe.mod.IResourceObject because Already inherited
- typings.stripe.mod.tokens.ITokenBase because Already inherited
- typings.stripe.mod.tokens.IBankAccountToken because var conflicts: client_ip, created, id, livemode, `object`, `type`, used. Inlined bank_account */ @js.native
trait IToken extends ICardToken {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[IBankAccountHash] = js.native
}

object IToken {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean
  ): IToken = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
  @scala.inline
  implicit class ITokenOps[Self <: IToken] (val x: Self) extends AnyVal {
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
    def setBank_account(value: IBankAccountHash): Self = this.set("bank_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBank_account: Self = this.set("bank_account", js.undefined)
  }
  
}

