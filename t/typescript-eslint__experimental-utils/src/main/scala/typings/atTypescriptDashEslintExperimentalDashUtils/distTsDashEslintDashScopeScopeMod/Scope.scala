package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod

import org.scalablytyped.runtime.TopLevel
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var block: Node
  var childScopes: js.Array[Scope]
  var functionExpressionScope: Boolean
  var isStrict: Boolean
  var references: js.Array[Reference]
  var set: Map[String, Variable]
  var thisFound: js.UndefOr[Boolean] = js.undefined
  var through: js.Array[Reference]
  var `type`: ScopeType
  var upper: Scope | Null
  var variableScope: Scope
  var variables: js.Array[Variable]
  def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit
  def __close(scopeManager: ScopeManager): Scope
  def __define(node: Node, `def`: Definition): Unit
  def __defineGeneric(name: js.Any, set: js.Any, variables: js.Any, node: js.Any, `def`: Definition): Unit
  def __delegateToUpperScope(ref: js.Any): Unit
  def __detectEval(): Unit
  def __detectThis(): Unit
  def __dynamicCloseRef(ref: js.Any): Unit
  def __globalCloseRef(ref: js.Any): Unit
  def __isClosed(): Boolean
  def __isValidResolution(ref: js.Any, variable: js.Any): Boolean
  def __referencing(
    node: Node,
    assign: Double,
    writeExpr: Node,
    maybeImplicitGlobal: js.Any,
    partial: js.Any,
    init: js.Any
  ): Unit
  def __resolve(ref: js.Any): Boolean
  def __shouldStaticallyClose(scopeManager: ScopeManager): Boolean
  def __shouldStaticallyCloseForGlobal(ref: js.Any): Boolean
  def __staticCloseRef(ref: js.Any): Unit
  /**
    * returns this scope has materialized arguments
    * @method Scope#isArgumentsMaterialized
    * @returns {boolean} arguemnts materialized
    */
  def isArgumentsMaterialized(): Boolean
  /**
    * returns this scope is static
    * @method Scope#isStatic
    * @returns {boolean} static
    */
  def isStatic(): Boolean
  /**
    * returns this scope has materialized `this` reference
    * @method Scope#isThisMaterialized
    * @returns {boolean} this materialized
    */
  def isThisMaterialized(): Boolean
  def isUsedName(name: js.Any): Boolean
  /**
    * returns resolved {Reference}
    * @method Scope#resolve
    * @param {Espree.Identifier} ident - identifier to be resolved.
    * @returns {Reference} reference
    */
  def resolve(ident: Node): Reference
}

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope/Scope", "Scope")
@js.native
object Scope extends TopLevel[ScopeConstructor]

