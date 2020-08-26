package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinitionClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `TypeDefinitionRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * Since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}

object TypeDefinitionClientCapabilities {
  @scala.inline
  def apply(): TypeDefinitionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDefinitionClientCapabilities]
  }
  @scala.inline
  implicit class TypeDefinitionClientCapabilitiesOps[Self <: TypeDefinitionClientCapabilities] (val x: Self) extends AnyVal {
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

