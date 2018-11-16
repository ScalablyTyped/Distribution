package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeParameterSymbol")
@js.native
class PullTypeParameterSymbol protected () extends PullTypeSymbol {
  def this(name: java.lang.String) = this()
  var _constraint: js.Any = js.native
  def getBaseConstraint(semanticInfoChain: SemanticInfoChain): PullTypeSymbol = js.native
  def getConstraint(): PullTypeSymbol = js.native
  /* private */ def getConstraintRecursively(visitedTypeParameters: js.Any): js.Any = js.native
  def getDefaultConstraint(semanticInfoChain: SemanticInfoChain): PullTypeSymbol = js.native
  def setConstraint(constraintType: PullTypeSymbol): scala.Unit = js.native
}

