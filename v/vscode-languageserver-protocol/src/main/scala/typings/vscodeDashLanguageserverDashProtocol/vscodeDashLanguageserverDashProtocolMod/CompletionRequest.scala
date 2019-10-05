package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

