package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionClientCapabilities extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    *
    * @since 3.8.0
    */
  var codeActionLiteralSupport: js.UndefOr[CodeActionKind] = js.native
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * Whether code action supports the `isPreferred` property.
    * @since 3.15.0
    */
  var isPreferredSupport: js.UndefOr[Boolean] = js.native
}

object CodeActionClientCapabilities {
  @scala.inline
  def apply(): CodeActionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeActionClientCapabilities]
  }
  @scala.inline
  implicit class CodeActionClientCapabilitiesOps[Self <: CodeActionClientCapabilities] (val x: Self) extends AnyVal {
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
    def setCodeActionLiteralSupport(value: CodeActionKind): Self = this.set("codeActionLiteralSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeActionLiteralSupport: Self = this.set("codeActionLiteralSupport", js.undefined)
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    @scala.inline
    def setIsPreferredSupport(value: Boolean): Self = this.set("isPreferredSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPreferredSupport: Self = this.set("isPreferredSupport", js.undefined)
  }
  
}

