package typings.vscodeLanguageclient.callHierarchyProposedMod

import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOptions
import typings.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/callHierarchy.proposed", "CallHierarchyFeature")
@js.native
class CallHierarchyFeature protected () extends TextDocumentFeature[
      Boolean | CallHierarchyOptions, 
      CallHierarchyRegistrationOptions, 
      CallHierarchyProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}

