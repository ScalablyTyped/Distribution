package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionClientCapabilities extends js.Object {
  /**
    * Whether definition supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * @since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}

object DefinitionClientCapabilities {
  @scala.inline
  def apply(): DefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionClientCapabilities]
  }
  @scala.inline
  implicit class DefinitionClientCapabilitiesOps[Self <: DefinitionClientCapabilities] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setLinkSupport(value: Boolean): Self = this.set("linkSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkSupport: Self = this.set("linkSupport", js.undefined)
  }
  
}

