package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivatedDeferral extends IActivatedDeferral

object ActivatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ActivatedDeferral]
  }
}

