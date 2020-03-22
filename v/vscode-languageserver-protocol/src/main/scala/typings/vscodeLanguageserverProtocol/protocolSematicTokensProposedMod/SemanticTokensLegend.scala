package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensLegend extends js.Object {
  /**
    * The token modifiers a server uses.
    */
  var tokenModifiers: js.Array[String]
  /**
    * The token types a server uses.
    */
  var tokenTypes: js.Array[String]
}

object SemanticTokensLegend {
  @scala.inline
  def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): SemanticTokensLegend = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SemanticTokensLegend]
  }
}

