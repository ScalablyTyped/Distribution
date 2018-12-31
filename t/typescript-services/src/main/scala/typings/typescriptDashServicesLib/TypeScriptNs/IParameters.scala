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

