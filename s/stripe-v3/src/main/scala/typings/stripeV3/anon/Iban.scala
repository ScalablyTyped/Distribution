package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iban extends js.Object {
  /*
    * An IBAN account number.
    */
  var iban: String
}

object Iban {
  @scala.inline
  def apply(iban: String): Iban = {
    val __obj = js.Dynamic.literal(iban = iban.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iban]
  }
}

