package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    TextDocumentPositionParams, 
    Range | typings.vscodeDashLanguageserverDashProtocol.Anon_Placeholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

