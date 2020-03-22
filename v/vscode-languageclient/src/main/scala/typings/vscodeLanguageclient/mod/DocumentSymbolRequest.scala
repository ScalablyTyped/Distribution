package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentSymbol
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  val method: textDocumentSlashdocumentSymbol = js.native
  /** @deprecated Use DocumentSymbolRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ]
  ] = js.native
  val `type`: ProtocolRequestType[
    DocumentSymbolParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.DocumentSymbol | typings.vscodeLanguageserverTypes.mod.SymbolInformation
    ], 
    Unit, 
    DocumentSymbolRegistrationOptions
  ] = js.native
}

