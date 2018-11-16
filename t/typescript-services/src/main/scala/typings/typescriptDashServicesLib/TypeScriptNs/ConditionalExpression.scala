package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ConditionalExpression")
@js.native
class ConditionalExpression protected () extends AST {
  def this(condition: AST, whenTrue: AST, whenFalse: AST) = this()
  var condition: AST = js.native
  var whenFalse: AST = js.native
  var whenTrue: AST = js.native
  def structuralEquals(ast: ConditionalExpression, includingPosition: scala.Boolean): scala.Boolean = js.native
}

