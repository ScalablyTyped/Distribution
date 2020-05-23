package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iban extends js.Object {
  var iban: js.UndefOr[String] = js.undefined
  var ideal: js.UndefOr[String] = js.undefined
}

object Iban {
  @scala.inline
  def apply(iban: String = null, ideal: String = null): Iban = {
    val __obj = js.Dynamic.literal()
    if (iban != null) __obj.updateDynamic("iban")(iban.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iban]
  }
}

