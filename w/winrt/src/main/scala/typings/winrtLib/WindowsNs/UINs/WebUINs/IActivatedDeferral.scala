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
  def apply(complete: () => scala.Unit): IActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IActivatedDeferral]
  }
}

