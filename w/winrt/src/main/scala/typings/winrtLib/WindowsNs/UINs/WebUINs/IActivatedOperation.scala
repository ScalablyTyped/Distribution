package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedOperation extends js.Object {
  def getDeferral(): ActivatedDeferral
}

object IActivatedOperation {
  @scala.inline
  def apply(getDeferral: js.Function0[ActivatedDeferral]): IActivatedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.asInstanceOf[IActivatedOperation]
  }
}

