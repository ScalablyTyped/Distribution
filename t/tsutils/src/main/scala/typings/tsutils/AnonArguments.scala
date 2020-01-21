package typings.tsutils

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArguments extends js.Object {
  var arguments: js.Array[Expression]
  var expression: Token[ImportKeyword] | (Identifier with AnonRequire)
}

object AnonArguments {
  @scala.inline
  def apply(arguments: js.Array[Expression], expression: Token[ImportKeyword] | (Identifier with AnonRequire)): AnonArguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArguments]
  }
}

