package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebUINavigatedDeferral extends IWebUINavigatedDeferral

object WebUINavigatedDeferral {
  @scala.inline
  def apply(complete: () => Unit): WebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[WebUINavigatedDeferral]
  }
}

