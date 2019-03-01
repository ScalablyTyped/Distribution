package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionRegistrationOptions
  extends TextDocumentRegistrationOptions
     with CodeActionOptions

object CodeActionRegistrationOptions {
  @scala.inline
  def apply(
    codeActionKinds: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.CodeActionKind
    ] = null,
    documentSelector: DocumentSelector = null
  ): CodeActionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (codeActionKinds != null) __obj.updateDynamic("codeActionKinds")(codeActionKinds)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    __obj.asInstanceOf[CodeActionRegistrationOptions]
  }
}

