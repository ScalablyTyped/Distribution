package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typescriptDashServices.TypeScript.IASTSpan because Already inherited
- typings.typescriptDashServices.TypeScript.ICallExpression because var conflicts: _end, _start. Inlined expression, argumentList */ @JSGlobal("TypeScript.InvocationExpression")
@js.native
class InvocationExpression protected () extends AST {
  def this(expression: AST, argumentList: ArgumentList) = this()
  var argumentList: ArgumentList = js.native
  var expression: AST = js.native
  def structuralEquals(ast: InvocationExpression, includingPosition: Boolean): Boolean = js.native
}

