package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiiTokenOptions extends js.Object {
  var personal_id_number: String
}

object PiiTokenOptions {
  @scala.inline
  def apply(personal_id_number: String): PiiTokenOptions = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PiiTokenOptions]
  }
}

