package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object CallHierarchyRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, workDoneProgress: js.UndefOr[Boolean] = js.undefined): CallHierarchyRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyRegistrationOptions]
  }
}

