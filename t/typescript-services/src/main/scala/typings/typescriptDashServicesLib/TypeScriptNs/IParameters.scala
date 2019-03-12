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
    astAt: scala.Double => AST,
    identifierAt: scala.Double => Identifier,
    initializerAt: scala.Double => EqualsValueClause,
    isOptionalAt: scala.Double => scala.Boolean,
    lastParameterIsRest: () => scala.Boolean,
    length: scala.Double,
    typeAt: scala.Double => AST
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast, astAt = js.Any.fromFunction1(astAt), identifierAt = js.Any.fromFunction1(identifierAt), initializerAt = js.Any.fromFunction1(initializerAt), isOptionalAt = js.Any.fromFunction1(isOptionalAt), lastParameterIsRest = js.Any.fromFunction0(lastParameterIsRest), length = length, typeAt = js.Any.fromFunction1(typeAt))
  
    __obj.asInstanceOf[IParameters]
  }
}

