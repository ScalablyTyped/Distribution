package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Personalidnumber extends js.Object {
  /**
    * The personal_id_number for PII in string form.
    */
  var personal_id_number: String
}

object Personalidnumber {
  @scala.inline
  def apply(personal_id_number: String): Personalidnumber = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Personalidnumber]
  }
}

