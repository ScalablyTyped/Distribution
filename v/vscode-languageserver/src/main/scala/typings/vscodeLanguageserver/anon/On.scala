package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserver.mod.ServerRequestHandler
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsPartialResult
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait On extends js.Object {
  def on(
    handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Unit
  def onEdits(
    handler: ServerRequestHandler[
      SemanticTokensEditsParams, 
      SemanticTokensEdits | SemanticTokens, 
      SemanticTokensEditsPartialResult, 
      Unit
    ]
  ): Unit
  def onRange(
    handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Unit
}

object On {
  @scala.inline
  def apply(
    on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit,
    onEdits: ServerRequestHandler[
      SemanticTokensEditsParams, 
      SemanticTokensEdits | SemanticTokens, 
      SemanticTokensEditsPartialResult, 
      Unit
    ] => Unit,
    onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
  ): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onEdits = js.Any.fromFunction1(onEdits), onRange = js.Any.fromFunction1(onRange))
    __obj.asInstanceOf[On]
  }
}

