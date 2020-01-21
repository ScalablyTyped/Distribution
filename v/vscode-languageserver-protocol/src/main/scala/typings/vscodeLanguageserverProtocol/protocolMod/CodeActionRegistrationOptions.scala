package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with CodeActionOptions

object CodeActionRegistrationOptions {
  @scala.inline
  def apply(codeActionKinds: js.Array[CodeActionKind] = null, documentSelector: DocumentSelector = null): CodeActionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (codeActionKinds != null) __obj.updateDynamic("codeActionKinds")(codeActionKinds.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionRegistrationOptions]
  }
}

