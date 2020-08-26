package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iban extends js.Object {
  /*
    * An IBAN account number.
    */
  var iban: String = js.native
}

object Iban {
  @scala.inline
  def apply(iban: String): Iban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iban]
  }
  @scala.inline
  implicit class IbanOps[Self <: Iban] (val x: Self) extends AnyVal {
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
    def setIban(value: String): Self = this.set("iban", value.asInstanceOf[js.Any])
  }
  
}

