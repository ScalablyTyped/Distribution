package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedDeferral extends js.Object {
  def complete(): scala.Unit
}

object IActivatedDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IActivatedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[IActivatedDeferral]
  }
}

