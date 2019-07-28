package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iban extends js.Object {
  var iban: js.UndefOr[String] = js.undefined
  var ideal: js.UndefOr[String] = js.undefined
}

object Anon_Iban {
  @scala.inline
  def apply(iban: String = null, ideal: String = null): Anon_Iban = {
    val __obj = js.Dynamic.literal()
    if (iban != null) __obj.updateDynamic("iban")(iban)
    if (ideal != null) __obj.updateDynamic("ideal")(ideal)
    __obj.asInstanceOf[Anon_Iban]
  }
}

