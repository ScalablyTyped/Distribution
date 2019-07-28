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
    val __obj = js.Dynamic.literal(merchantArticleId = merchantArticleId, secret = secret, serial = serial)
  
    __obj.asInstanceOf[Anon_MerchantArticleId]
  }
}

