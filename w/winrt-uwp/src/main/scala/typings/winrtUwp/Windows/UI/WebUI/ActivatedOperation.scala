package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages an app activation operation. */
trait ActivatedOperation extends js.Object {
  /**
    * Requests that the completion of app activation be delayed.
    * @return The activation deferral object.
    */
  def getDeferral(): ActivatedDeferral
}

object ActivatedOperation {
  @scala.inline
  def apply(getDeferral: () => ActivatedDeferral): ActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ActivatedOperation]
  }
}

