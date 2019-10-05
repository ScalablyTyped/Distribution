package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedDeferral extends js.Object {
  def complete(): Unit
}

object IWebUINavigatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): IWebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[IWebUINavigatedDeferral]
  }
}

