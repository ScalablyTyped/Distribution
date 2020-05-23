package typings.sweValidation.mod

import typings.sweValidation.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cin extends js.Object {
  var corporation: Id
  var isValid: Boolean
}

object cin {
  @scala.inline
  def apply(corporation: Id, isValid: Boolean): cin = {
    val __obj = js.Dynamic.literal(corporation = corporation.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[cin]
  }
}

