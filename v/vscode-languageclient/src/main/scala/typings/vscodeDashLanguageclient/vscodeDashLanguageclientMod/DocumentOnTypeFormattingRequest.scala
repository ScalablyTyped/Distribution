package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentOnTypeFormattingParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentOnTypeFormattingRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[TextEdit] | Null, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}

