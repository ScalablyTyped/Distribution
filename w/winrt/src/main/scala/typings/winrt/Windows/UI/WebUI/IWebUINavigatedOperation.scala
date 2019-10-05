package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedOperation extends js.Object {
  def getDeferral(): WebUINavigatedDeferral
}

object IWebUINavigatedOperation {
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
}

