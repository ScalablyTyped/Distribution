package typings
package sweDashValidationLib.sweDashValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cin extends js.Object {
  var corporation: sweDashValidationLib.Anon_Id
  var isValid: scala.Boolean
}

object cin {
  @scala.inline
  def apply(corporation: sweDashValidationLib.Anon_Id, isValid: scala.Boolean): cin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("corporation")(corporation)
    __obj.updateDynamic("isValid")(isValid)
    __obj.asInstanceOf[cin]
  }
}

