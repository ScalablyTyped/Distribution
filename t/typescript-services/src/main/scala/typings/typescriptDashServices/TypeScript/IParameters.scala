package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IParameters extends js.Object {
  var ast: AST
  var length: Double
  def astAt(index: Double): AST
  def identifierAt(index: Double): Identifier
  def initializerAt(index: Double): EqualsValueClause
  def isOptionalAt(index: Double): Boolean
  def lastParameterIsRest(): Boolean
  def typeAt(index: Double): AST
}

object IParameters {
  @scala.inline
  def apply(
    ast: AST,
    astAt: Double => AST,
    identifierAt: Double => Identifier,
    initializerAt: Double => EqualsValueClause,
    isOptionalAt: Double => Boolean,
    lastParameterIsRest: () => Boolean,
    length: Double,
    typeAt: Double => AST
  ): IParameters = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], astAt = js.Any.fromFunction1(astAt), identifierAt = js.Any.fromFunction1(identifierAt), initializerAt = js.Any.fromFunction1(initializerAt), isOptionalAt = js.Any.fromFunction1(isOptionalAt), lastParameterIsRest = js.Any.fromFunction0(lastParameterIsRest), length = length.asInstanceOf[js.Any], typeAt = js.Any.fromFunction1(typeAt))
  
    __obj.asInstanceOf[IParameters]
  }
}

