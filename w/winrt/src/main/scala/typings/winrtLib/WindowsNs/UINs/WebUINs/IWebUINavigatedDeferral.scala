package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedDeferral extends js.Object {
  def complete(): scala.Unit
}

object IWebUINavigatedDeferral {
  @scala.inline
  def apply(complete: js.Function0[scala.Unit]): IWebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[IWebUINavigatedDeferral]
  }
}

