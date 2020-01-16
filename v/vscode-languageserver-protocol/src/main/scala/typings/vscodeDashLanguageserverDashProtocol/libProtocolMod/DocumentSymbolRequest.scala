package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  val `type`: RequestType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentSymbolParams */ js.Any, 
    (js.Array[DocumentSymbol | SymbolInformation]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

