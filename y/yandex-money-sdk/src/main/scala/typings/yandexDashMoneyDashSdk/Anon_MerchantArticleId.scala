package typings.yandexDashMoneyDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MerchantArticleId extends js.Object {
  var merchantArticleId: String
  var secret: String
  var serial: String
}

object Anon_MerchantArticleId {
  @scala.inline
  def apply(merchantArticleId: String, secret: String, serial: String): Anon_MerchantArticleId = {
    val __obj = js.Dynamic.literal(merchantArticleId = merchantArticleId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MerchantArticleId]
  }
}

