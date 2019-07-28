package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentHighlightRequest")
@js.native
object DocumentHighlightRequestNs extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    js.Array[DocumentHighlight] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

