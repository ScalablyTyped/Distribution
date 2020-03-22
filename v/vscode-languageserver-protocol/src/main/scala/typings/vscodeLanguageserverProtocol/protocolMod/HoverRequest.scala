package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import typings.vscodeLanguageserverTypes.mod.Hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  val method: textDocumentSlashhover = js.native
  val `type`: ProtocolRequestType[HoverParams, Hover | Null, scala.Nothing, Unit, HoverRegistrationOptions] = js.native
}

