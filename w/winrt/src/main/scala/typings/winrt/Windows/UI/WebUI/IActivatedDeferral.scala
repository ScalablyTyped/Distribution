package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedDeferral extends js.Object {
  def complete(): Unit
}

object IActivatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): IActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IActivatedDeferral]
  }
}

