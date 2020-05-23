package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bankcode extends js.Object {
  var bank_code: String | Null
  var country: String | Null
  var fingerprint: String
  var last4: String
  var mandate_reference: String
}

object Bankcode {
  @scala.inline
  def apply(
    fingerprint: String,
    last4: String,
    mandate_reference: String,
    bank_code: String = null,
    country: String = null
  ): Bankcode = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], mandate_reference = mandate_reference.asInstanceOf[js.Any], bank_code = bank_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bankcode]
  }
}

