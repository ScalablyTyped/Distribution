package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionRequest")
@js.native
object CompletionRequestNs extends js.Object {
  val `type`: RequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

