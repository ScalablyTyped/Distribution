package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var bank_account: js.UndefOr[BankAccount] = js.native
  var card: js.UndefOr[Card] = js.native
  var client_ip: String = js.native
  var created: Double = js.native
  var id: String = js.native
  var livemode: Boolean = js.native
  var `object`: String = js.native
  var `type`: String = js.native
  var used: Boolean = js.native
}

object Token {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean
  ): Token = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setClient_ip(value: String): Self = this.set("client_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed(value: Boolean): Self = this.set("used", value.asInstanceOf[js.Any])
    @scala.inline
    def setBank_account(value: BankAccount): Self = this.set("bank_account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBank_account: Self = this.set("bank_account", js.undefined)
    @scala.inline
    def setCard(value: Card): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
  }
  
}

