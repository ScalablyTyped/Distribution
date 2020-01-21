package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.RequestType
import typings.vscodeLanguageserverTypes.mod.DocumentLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: RequestType[
    DocumentLinkParams, 
    js.Array[DocumentLink] | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

