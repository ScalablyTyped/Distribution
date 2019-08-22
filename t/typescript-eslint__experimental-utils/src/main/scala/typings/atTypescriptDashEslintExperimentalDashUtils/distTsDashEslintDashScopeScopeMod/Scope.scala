package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod

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
class ScopeCls protected () extends Scope {
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

object Scope {
  @scala.inline
  def apply(
    __addDeclaredVariablesOfNode: (js.Any, Node) => Unit,
    __close: ScopeManager => Scope,
    __define: (Node, Definition) => Unit,
    __defineGeneric: (js.Any, js.Any, js.Any, js.Any, Definition) => Unit,
    __delegateToUpperScope: js.Any => Unit,
    __detectEval: () => Unit,
    __detectThis: () => Unit,
    __dynamicCloseRef: js.Any => Unit,
    __globalCloseRef: js.Any => Unit,
    __isClosed: () => Boolean,
    __isValidResolution: (js.Any, js.Any) => Boolean,
    __referencing: (Node, Double, Node, js.Any, js.Any, js.Any) => Unit,
    __resolve: js.Any => Boolean,
    __shouldStaticallyClose: ScopeManager => Boolean,
    __shouldStaticallyCloseForGlobal: js.Any => Boolean,
    __staticCloseRef: js.Any => Unit,
    block: Node,
    childScopes: js.Array[Scope],
    functionExpressionScope: Boolean,
    isArgumentsMaterialized: () => Boolean,
    isStatic: () => Boolean,
    isStrict: Boolean,
    isThisMaterialized: () => Boolean,
    isUsedName: js.Any => Boolean,
    references: js.Array[Reference],
    resolve: Node => Reference,
    set: Map[String, Variable],
    through: js.Array[Reference],
    `type`: ScopeType,
    variableScope: Scope,
    variables: js.Array[Variable],
    thisFound: js.UndefOr[Boolean] = js.undefined,
    upper: Scope = null
  ): Scope = {
    val __obj = js.Dynamic.literal(__addDeclaredVariablesOfNode = js.Any.fromFunction2(__addDeclaredVariablesOfNode), __close = js.Any.fromFunction1(__close), __define = js.Any.fromFunction2(__define), __defineGeneric = js.Any.fromFunction5(__defineGeneric), __delegateToUpperScope = js.Any.fromFunction1(__delegateToUpperScope), __detectEval = js.Any.fromFunction0(__detectEval), __detectThis = js.Any.fromFunction0(__detectThis), __dynamicCloseRef = js.Any.fromFunction1(__dynamicCloseRef), __globalCloseRef = js.Any.fromFunction1(__globalCloseRef), __isClosed = js.Any.fromFunction0(__isClosed), __isValidResolution = js.Any.fromFunction2(__isValidResolution), __referencing = js.Any.fromFunction6(__referencing), __resolve = js.Any.fromFunction1(__resolve), __shouldStaticallyClose = js.Any.fromFunction1(__shouldStaticallyClose), __shouldStaticallyCloseForGlobal = js.Any.fromFunction1(__shouldStaticallyCloseForGlobal), __staticCloseRef = js.Any.fromFunction1(__staticCloseRef), block = block, childScopes = childScopes, functionExpressionScope = functionExpressionScope, isArgumentsMaterialized = js.Any.fromFunction0(isArgumentsMaterialized), isStatic = js.Any.fromFunction0(isStatic), isStrict = isStrict, isThisMaterialized = js.Any.fromFunction0(isThisMaterialized), isUsedName = js.Any.fromFunction1(isUsedName), references = references, resolve = js.Any.fromFunction1(resolve), set = set, through = through, variableScope = variableScope, variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(thisFound)) __obj.updateDynamic("thisFound")(thisFound)
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[Scope]
  }
}

