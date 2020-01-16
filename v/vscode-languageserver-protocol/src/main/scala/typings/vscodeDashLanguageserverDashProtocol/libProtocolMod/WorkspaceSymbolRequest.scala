package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  val `type`: RequestType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceSymbolParams */ js.Any, 
    js.Array[SymbolInformation] | Null, 
    Unit, 
    Unit
  ] = js.native
}

