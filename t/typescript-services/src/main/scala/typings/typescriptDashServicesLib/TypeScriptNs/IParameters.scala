package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParameters extends js.Object {
  var ast: AST
  var length: scala.Double
  def astAt(index: scala.Double): AST
  def identifierAt(index: scala.Double): Identifier
  def initializerAt(index: scala.Double): EqualsValueClause
  def isOptionalAt(index: scala.Double): scala.Boolean
  def lastParameterIsRest(): scala.Boolean
  def typeAt(index: scala.Double): AST
}

object IParameters {
  @scala.inline
  def apply(
    ast: AST,
    astAt: js.Function1[scala.Double, AST],
    identifierAt: js.Function1[scala.Double, Identifier],
    initializerAt: js.Function1[scala.Double, EqualsValueClause],
    isOptionalAt: js.Function1[scala.Double, scala.Boolean],
    lastParameterIsRest: js.Function0[scala.Boolean],
    length: scala.Double,
    typeAt: js.Function1[scala.Double, AST]
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast, astAt = astAt, identifierAt = identifierAt, initializerAt = initializerAt, isOptionalAt = isOptionalAt, lastParameterIsRest = lastParameterIsRest, length = length, typeAt = typeAt)
  
    __obj.asInstanceOf[IParameters]
  }
}

