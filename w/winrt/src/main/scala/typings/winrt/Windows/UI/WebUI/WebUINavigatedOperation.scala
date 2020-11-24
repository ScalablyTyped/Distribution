package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebUINavigatedOperation extends IWebUINavigatedOperation
object WebUINavigatedOperation {
  
  @scala.inline
  def apply(getDeferral: () => WebUINavigatedDeferral): WebUINavigatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[WebUINavigatedOperation]
  }
}
