package typings.stripe.anon

import typings.stripe.mod.paymentMethods.IPaymentMethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeT[T /* <: IPaymentMethodType */] extends js.Object {
  var `type`: T
}

object TypeT {
  @scala.inline
  def apply[/* <: typings.stripe.mod.paymentMethods.IPaymentMethodType */ T](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
}

