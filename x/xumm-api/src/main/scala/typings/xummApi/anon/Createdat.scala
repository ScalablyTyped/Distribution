package typings.xummApi.anon

import typings.xummApi.mod.XrplTransactionType
import typings.xummApi.mod.XummJsonTransaction
import typings.xummApi.mod.XummTransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Createdat extends js.Object {
  var created_at: String = js.native
  var expires_at: String = js.native
  var expires_in_seconds: Double = js.native
  var request_json: XummJsonTransaction = js.native
  var tx_destination: String = js.native
  var tx_destination_tag: Double | Null = js.native
  var tx_type: XummTransactionType | XrplTransactionType = js.native
}

object Createdat {
  @scala.inline
  def apply(
    created_at: String,
    expires_at: String,
    expires_in_seconds: Double,
    request_json: XummJsonTransaction,
    tx_destination: String,
    tx_type: XummTransactionType | XrplTransactionType
  ): Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in_seconds = expires_in_seconds.asInstanceOf[js.Any], request_json = request_json.asInstanceOf[js.Any], tx_destination = tx_destination.asInstanceOf[js.Any], tx_type = tx_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
  @scala.inline
  implicit class CreatedatOps[Self <: Createdat] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires_in_seconds(value: Double): Self = this.set("expires_in_seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_json(value: XummJsonTransaction): Self = this.set("request_json", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_destination(value: String): Self = this.set("tx_destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_type(value: XummTransactionType | XrplTransactionType): Self = this.set("tx_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_destination_tag(value: Double): Self = this.set("tx_destination_tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx_destination_tagNull: Self = this.set("tx_destination_tag", null)
  }
  
}

