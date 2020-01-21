package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMerchantArticleId extends js.Object {
  var merchantArticleId: String
  var secret: String
  var serial: String
}

object AnonMerchantArticleId {
  @scala.inline
  def apply(merchantArticleId: String, secret: String, serial: String): AnonMerchantArticleId = {
    val __obj = js.Dynamic.literal(merchantArticleId = merchantArticleId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMerchantArticleId]
  }
}

