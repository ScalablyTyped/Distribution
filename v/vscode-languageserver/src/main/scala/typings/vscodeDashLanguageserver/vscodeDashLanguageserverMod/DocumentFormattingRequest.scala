package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentFormattingParams, 
    js.Array[TextEdit] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

