package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.anon.WorkDoneProgressBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressClientCapabilities extends js.Object {
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[WorkDoneProgressBoolean] = js.undefined
}

object WorkDoneProgressClientCapabilities {
  @scala.inline
  def apply(window: WorkDoneProgressBoolean = null): WorkDoneProgressClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressClientCapabilities]
  }
}

