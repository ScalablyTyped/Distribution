package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequestNs extends js.Object {
  val `type`: RequestType[
    DocumentSymbolParams, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

