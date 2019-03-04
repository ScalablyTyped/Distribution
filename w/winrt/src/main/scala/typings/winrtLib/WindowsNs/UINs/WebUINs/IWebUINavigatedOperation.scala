package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedOperation extends js.Object {
  def getDeferral(): WebUINavigatedDeferral
}

object IWebUINavigatedOperation {
  @scala.inline
  def apply(getDeferral: js.Function0[WebUINavigatedDeferral]): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral)
  
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
}

