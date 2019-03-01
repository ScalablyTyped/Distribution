package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedEventArgsDeferral extends js.Object {
  var activatedOperation: ActivatedOperation
}

object IActivatedEventArgsDeferral {
  @scala.inline
  def apply(activatedOperation: ActivatedOperation): IActivatedEventArgsDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activatedOperation")(activatedOperation)
    __obj.asInstanceOf[IActivatedEventArgsDeferral]
  }
}

