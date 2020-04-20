package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SemanticTokensBuilder")
@js.native
class SemanticTokensBuilder () extends js.Object {
  def this(legend: SemanticTokensLegend) = this()
  /**
  		 * Finish and create a `SemanticTokens` instance.
  		 */
  def build(): SemanticTokens = js.native
  def build(resultId: String): SemanticTokens = js.native
  /**
  		 * Add another token.
  		 *
  		 * @param line The token start line number (absolute value).
  		 * @param char The token start character (absolute value).
  		 * @param length The token length in characters.
  		 * @param tokenType The encoded token type.
  		 * @param tokenModifiers The encoded token modifiers.
  		 */
  def push(line: Double, char: Double, length: Double, tokenType: Double): Unit = js.native
  def push(line: Double, char: Double, length: Double, tokenType: Double, tokenModifiers: Double): Unit = js.native
  /**
  		 * Add another token. Use only when providing a legend.
  		 *
  		 * @param range The range of the token. Must be single-line.
  		 * @param tokenType The token type.
  		 * @param tokenModifiers The token modifiers.
  		 */
  def push(range: Range, tokenType: String): Unit = js.native
  def push(range: Range, tokenType: String, tokenModifiers: js.Array[String]): Unit = js.native
}

