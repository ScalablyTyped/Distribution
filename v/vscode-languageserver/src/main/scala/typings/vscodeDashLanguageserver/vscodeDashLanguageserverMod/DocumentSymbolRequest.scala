package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentSymbolParams */ js.Any, 
    (js.Array[
      typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbol | typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

