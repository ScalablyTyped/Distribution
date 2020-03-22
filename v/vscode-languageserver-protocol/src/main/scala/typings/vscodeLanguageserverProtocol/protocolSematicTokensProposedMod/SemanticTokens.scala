package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokens extends js.Object {
  /**
    * The actual tokens. For a detailed description about how the data is
    * structured pls see
    * https://github.com/microsoft/vscode-extension-samples/blob/5ae1f7787122812dcc84e37427ca90af5ee09f14/semantic-tokens-sample/vscode.proposed.d.ts#L71
    */
  var data: js.Array[Double]
  /**
    * An optional result id. If provided and clients support delta updating
    * the client will include the result id in the next semantic token request.
    * A server can then instead of computing all sematic tokens again simply
    * send a delta.
    */
  var resultId: js.UndefOr[String] = js.undefined
}

@JSImport("vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed", "SemanticTokens")
@js.native
object SemanticTokens extends js.Object {
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
}

