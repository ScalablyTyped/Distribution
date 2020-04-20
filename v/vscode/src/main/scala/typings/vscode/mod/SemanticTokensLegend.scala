package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SemanticTokensLegend")
@js.native
class SemanticTokensLegend protected () extends js.Object {
  def this(tokenTypes: js.Array[String]) = this()
  def this(tokenTypes: js.Array[String], tokenModifiers: js.Array[String]) = this()
  /**
  		 * The possible token modifiers.
  		 */
  val tokenModifiers: js.Array[String] = js.native
  /**
  		 * The possible token types.
  		 */
  val tokenTypes: js.Array[String] = js.native
}

