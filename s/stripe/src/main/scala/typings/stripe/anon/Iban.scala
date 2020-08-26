package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iban extends js.Object {
  var iban: js.UndefOr[String] = js.native
  var ideal: js.UndefOr[String] = js.native
}

object Iban {
  @scala.inline
  def apply(): Iban = {
    val __obj = js.Dynamic.literal()
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
    @scala.inline
    def deleteIban: Self = this.set("iban", js.undefined)
    @scala.inline
    def setIdeal(value: String): Self = this.set("ideal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdeal: Self = this.set("ideal", js.undefined)
  }
  
}

