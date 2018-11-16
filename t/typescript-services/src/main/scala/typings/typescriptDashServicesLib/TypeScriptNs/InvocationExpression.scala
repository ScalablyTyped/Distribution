package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptDashServicesLib.TypeScriptNs.ICallExpression because Would inherit conflicting mutable fields List(_start, _end))*/
@JSGlobal("TypeScript.InvocationExpression")
@js.native
class InvocationExpression protected () extends AST {
  def this(expression: AST, argumentList: ArgumentList) = this()
  var argumentList: ArgumentList = js.native
  var expression: AST = js.native
  def structuralEquals(ast: InvocationExpression, includingPosition: scala.Boolean): scala.Boolean = js.native
}

