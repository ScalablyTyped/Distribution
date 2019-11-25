package typings.tsutils

import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.SyntaxKind.ImportKeyword
import typings.typescript.typescriptMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.Array[Expression]
  var expression: Token[ImportKeyword] | (Identifier with Anon_Require)
}

object Anon_Arguments {
  @scala.inline
  def apply(arguments: js.Array[Expression], expression: Token[ImportKeyword] | (Identifier with Anon_Require)): Anon_Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arguments]
  }
}

