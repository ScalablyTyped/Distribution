package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeLanguageserverProtocol.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgressClientCapabilities extends js.Object {
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[`3`] = js.native
}

object WorkDoneProgressClientCapabilities {
  @scala.inline
  def apply(): WorkDoneProgressClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressClientCapabilities]
  }
  @scala.inline
  implicit class WorkDoneProgressClientCapabilitiesOps[Self <: WorkDoneProgressClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindow(value: `3`): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

