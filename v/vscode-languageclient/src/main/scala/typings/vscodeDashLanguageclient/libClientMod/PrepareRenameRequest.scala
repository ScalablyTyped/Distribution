package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.Anon_Placeholder
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    TextDocumentPositionParams, 
    typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range | Anon_Placeholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

