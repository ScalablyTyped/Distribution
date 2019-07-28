package typings.stripe

import typings.stripe.stripeMod.paymentMethodsNs.IPaymentMethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T /* <: IPaymentMethodType */] extends js.Object {
  var `type`: T
}

object Anon_Type {
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](`type`: T): Anon_Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[T]]
  }
}

