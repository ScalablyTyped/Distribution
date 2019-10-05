package typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsMod.TSESLintScope

import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeType
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils", "TSESLintScope.ClassScope")
@js.native
class ClassScopeCls protected () extends Scope {
  def this(
    scopeManager: ScopeManager,
    `type`: ScopeType,
    upperScope: Null,
    block: Null,
    isMethodDefinition: Boolean
  ) = this()
  def this(
    scopeManager: ScopeManager,
    `type`: ScopeType,
    upperScope: Null,
    block: Node,
    isMethodDefinition: Boolean
  ) = this()
  def this(
    scopeManager: ScopeManager,
    `type`: ScopeType,
    upperScope: Scope,
    block: Null,
    isMethodDefinition: Boolean
  ) = this()
  def this(
    scopeManager: ScopeManager,
    `type`: ScopeType,
    upperScope: Scope,
    block: Node,
    isMethodDefinition: Boolean
  ) = this()
  /* CompleteClass */
  override var block: Node = js.native
  /* CompleteClass */
  override var childScopes: js.Array[Scope] = js.native
  /* CompleteClass */
  override var functionExpressionScope: Boolean = js.native
  /* CompleteClass */
  override var isStrict: Boolean = js.native
  /* CompleteClass */
  override var references: js.Array[Reference] = js.native
  /* CompleteClass */
  override var set: Map[String, Variable] = js.native
  /* CompleteClass */
  override var through: js.Array[Reference] = js.native
  /* CompleteClass */
  override var `type`: ScopeType = js.native
  /* CompleteClass */
  override var upper: Scope | Null = js.native
  /* CompleteClass */
  override var variableScope: Scope = js.native
  /* CompleteClass */
  override var variables: js.Array[Variable] = js.native
  /* CompleteClass */
  override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
  /* CompleteClass */
  override def __close(scopeManager: ScopeManager): Scope = js.native
  /* CompleteClass */
  override def __define(node: Node, `def`: Definition): Unit = js.native
  /* CompleteClass */
  override def __defineGeneric(name: js.Any, set: js.Any, variables: js.Any, node: js.Any, `def`: Definition): Unit = js.native
  /* CompleteClass */
  override def __delegateToUpperScope(ref: js.Any): Unit = js.native
  /* CompleteClass */
  override def __detectEval(): Unit = js.native
  /* CompleteClass */
  override def __detectThis(): Unit = js.native
  /* CompleteClass */
  override def __dynamicCloseRef(ref: js.Any): Unit = js.native
  /* CompleteClass */
  override def __globalCloseRef(ref: js.Any): Unit = js.native
  /* CompleteClass */
  override def __isClosed(): Boolean = js.native
  /* CompleteClass */
  override def __isValidResolution(ref: js.Any, variable: js.Any): Boolean = js.native
  /* CompleteClass */
  override def __referencing(
    node: Node,
    assign: Double,
    writeExpr: Node,
    maybeImplicitGlobal: js.Any,
    partial: js.Any,
    init: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def __resolve(ref: js.Any): Boolean = js.native
  /* CompleteClass */
  override def __shouldStaticallyClose(scopeManager: ScopeManager): Boolean = js.native
  /* CompleteClass */
  override def __shouldStaticallyCloseForGlobal(ref: js.Any): Boolean = js.native
  /* CompleteClass */
  override def __staticCloseRef(ref: js.Any): Unit = js.native
  /**
    * returns this scope has materialized arguments
    * @method Scope#isArgumentsMaterialized
    * @returns {boolean} arguemnts materialized
    */
  /* CompleteClass */
  override def isArgumentsMaterialized(): Boolean = js.native
  /**
    * returns this scope is static
    * @method Scope#isStatic
    * @returns {boolean} static
    */
  /* CompleteClass */
  override def isStatic(): Boolean = js.native
  /**
    * returns this scope has materialized `this` reference
    * @method Scope#isThisMaterialized
    * @returns {boolean} this materialized
    */
  /* CompleteClass */
  override def isThisMaterialized(): Boolean = js.native
  /* CompleteClass */
  override def isUsedName(name: js.Any): Boolean = js.native
  /**
    * returns resolved {Reference}
    * @method Scope#resolve
    * @param {Espree.Identifier} ident - identifier to be resolved.
    * @returns {Reference} reference
    */
  /* CompleteClass */
  override def resolve(ident: Node): Reference = js.native
}

