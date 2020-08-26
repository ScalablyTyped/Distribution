package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidChangeWatchedFilesClientCapabilities extends js.Object {
  /**
    * Did change watched files notification supports dynamic registration. Please note
    * that the current protocol doesn't support static configuration for file changes
    * from the server side.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}

object DidChangeWatchedFilesClientCapabilities {
  @scala.inline
  def apply(): DidChangeWatchedFilesClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DidChangeWatchedFilesClientCapabilities]
  }
  @scala.inline
  implicit class DidChangeWatchedFilesClientCapabilitiesOps[Self <: DidChangeWatchedFilesClientCapabilities] (val x: Self) extends AnyVal {
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
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
  }
  
}

