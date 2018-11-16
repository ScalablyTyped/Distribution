package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.CastExpression")
@js.native
class CastExpression protected () extends AST {
  def this(`type`: AST, expression: AST) = this()
  var expression: AST = js.native
  var `type`: AST = js.native
  def structuralEquals(ast: CastExpression, includingPosition: scala.Boolean): scala.Boolean = js.native
}

