package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions

object TypeDefinitionRegistrationOptions {
  @scala.inline
  def apply(
    documentSelector: DocumentSelector = null,
    id: String = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): TypeDefinitionRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionRegistrationOptions]
  }
}

