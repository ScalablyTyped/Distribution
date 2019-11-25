package typings.stripejs.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripejs.stripejsStrings.success
  - typings.stripejs.stripejsStrings.fail
  - typings.stripejs.stripejsStrings.invalid_payer_name
  - typings.stripejs.stripejsStrings.invalid_payer_phone
  - typings.stripejs.stripejsStrings.invalid_payer_email
  - typings.stripejs.stripejsStrings.invalid_shipping_address
*/
trait completeStatus extends js.Object

object completeStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typings.stripejs.stripejsStrings.fail = this.cast("fail")
  @scala.inline
  def invalid_payer_email: typings.stripejs.stripejsStrings.invalid_payer_email = this.cast("invalid_payer_email")
  @scala.inline
  def invalid_payer_name: typings.stripejs.stripejsStrings.invalid_payer_name = this.cast("invalid_payer_name")
  @scala.inline
  def invalid_payer_phone: typings.stripejs.stripejsStrings.invalid_payer_phone = this.cast("invalid_payer_phone")
  @scala.inline
  def invalid_shipping_address: typings.stripejs.stripejsStrings.invalid_shipping_address = this.cast("invalid_shipping_address")
  @scala.inline
  def success: typings.stripejs.stripejsStrings.success = this.cast("success")
}

