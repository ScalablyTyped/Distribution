package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.LiteralExpression")
@js.native
class LiteralExpression protected () extends AST {
  def this(_nodeType: SyntaxKind, _text: java.lang.String, _valueText: java.lang.String) = this()
  var _nodeType: js.Any = js.native
  var _text: js.Any = js.native
  var _valueText: js.Any = js.native
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: scala.Boolean): scala.Boolean = js.native
  def text(): java.lang.String = js.native
  def valueText(): java.lang.String = js.native
}

