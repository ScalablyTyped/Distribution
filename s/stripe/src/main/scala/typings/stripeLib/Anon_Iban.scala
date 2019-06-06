package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iban extends js.Object {
  var iban: js.UndefOr[java.lang.String] = js.undefined
  var ideal: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Iban {
  @scala.inline
  def apply(iban: java.lang.String = null, ideal: java.lang.String = null): Anon_Iban = {
    val __obj = js.Dynamic.literal()
    if (iban != null) __obj.updateDynamic("iban")(iban)
    if (ideal != null) __obj.updateDynamic("ideal")(ideal)
    __obj.asInstanceOf[Anon_Iban]
  }
}

