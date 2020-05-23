package typings.xummApi.anon

import typings.xummApi.mod.XrplTransactionType
import typings.xummApi.mod.XummJsonTransaction
import typings.xummApi.mod.XummTransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Createdat extends js.Object {
  var created_at: String
  var expires_at: String
  var expires_in_seconds: Double
  var request_json: XummJsonTransaction
  var tx_destination: String
  var tx_destination_tag: Double | Null
  var tx_type: XummTransactionType | XrplTransactionType
}

object Createdat {
  @scala.inline
  def apply(
    created_at: String,
    expires_at: String,
    expires_in_seconds: Double,
    request_json: XummJsonTransaction,
    tx_destination: String,
    tx_type: XummTransactionType | XrplTransactionType,
    tx_destination_tag: Double = null.asInstanceOf[Double]
  ): Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in_seconds = expires_in_seconds.asInstanceOf[js.Any], request_json = request_json.asInstanceOf[js.Any], tx_destination = tx_destination.asInstanceOf[js.Any], tx_type = tx_type.asInstanceOf[js.Any], tx_destination_tag = tx_destination_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
}

