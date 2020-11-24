package typings.vscodeLanguageclient.selectionRangeMod

import typings.vscode.mod.SelectionRangeProvider
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeOptions
import typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/selectionRange", "SelectionRangeFeature")
@js.native
class SelectionRangeFeature protected () extends TextDocumentFeature[
      Boolean | SelectionRangeOptions, 
      SelectionRangeRegistrationOptions, 
      SelectionRangeProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}
