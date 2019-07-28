package typings.sweDashValidation.sweDashValidationMod

import typings.sweDashValidation.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cin extends js.Object {
  var corporation: Anon_Id
  var isValid: Boolean
}

object cin {
  @scala.inline
  def apply(corporation: Anon_Id, isValid: Boolean): cin = {
    val __obj = js.Dynamic.literal(corporation = corporation, isValid = isValid)
  
    __obj.asInstanceOf[cin]
  }
}

