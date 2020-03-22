package typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SemanticTokensBuilder")
@js.native
class SemanticTokensBuilder () extends js.Object {
  def build(): Uint32Array = js.native
  def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
}

