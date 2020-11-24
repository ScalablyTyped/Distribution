package typings.vscodeLanguageclient.implementationMod

import typings.vscode.mod.ImplementationProvider
import typings.vscodeLanguageclient.clientMod.BaseLanguageClient
import typings.vscodeLanguageclient.clientMod.TextDocumentFeature
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationOptions
import typings.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/implementation", "ImplementationFeature")
@js.native
class ImplementationFeature protected () extends TextDocumentFeature[
      Boolean | ImplementationOptions, 
      ImplementationRegistrationOptions, 
      ImplementationProvider
    ] {
  def this(client: BaseLanguageClient) = this()
}
