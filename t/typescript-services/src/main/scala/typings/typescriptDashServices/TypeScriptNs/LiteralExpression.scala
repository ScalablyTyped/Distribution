package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LiteralExpression")
@js.native
class LiteralExpression protected () extends AST {
  def this(_nodeType: SyntaxKind, _text: String, _valueText: String) = this()
  var _nodeType: js.Any = js.native
  var _text: js.Any = js.native
  var _valueText: js.Any = js.native
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean = js.native
  def text(): String = js.native
  def valueText(): String = js.native
}

