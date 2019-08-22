package typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`1`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`2`
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsNumbers.`3`
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeAnalyzeMod.AnalysisOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.DefinitionConstructor
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorCallback
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManagerOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeChildConstructorWithUpperScope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeConstructor
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeType
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.BindingName
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Identifier
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.PropertyName
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils", "TSESLintScope")
@js.native
object TSESLintScopeNs extends js.Object {
  @js.native
  class BlockScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class CatchScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class ClassScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class DefinitionCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition {
    def this(`type`: String, name: BindingName, node: Node) = this()
    def this(`type`: String, name: PropertyName, node: Node) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Null, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Null, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Null, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Null, kind: String) = this()
    /* CompleteClass */
    override var name: BindingName = js.native
    /* CompleteClass */
    override var node: Node = js.native
    /* CompleteClass */
    override var `type`: String = js.native
  }
  
  @js.native
  class ForScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class FunctionExpressionNameScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class FunctionScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class GlobalScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class ModuleScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class ParameterDefinitionCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition {
    def this(`type`: String, name: BindingName, node: Node) = this()
    def this(`type`: String, name: PropertyName, node: Node) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Double, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Null, index: Null, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Double, kind: String) = this()
    def this(`type`: String, name: BindingName, node: Node, parent: Node, index: Null, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Double, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Null, index: Null, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Double, kind: String) = this()
    def this(`type`: String, name: PropertyName, node: Node, parent: Node, index: Null, kind: String) = this()
    /* CompleteClass */
    override var name: BindingName = js.native
    /* CompleteClass */
    override var node: Node = js.native
    /* CompleteClass */
    override var `type`: String = js.native
  }
  
  @js.native
  class PatternVisitorCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopePatternVisitorMod.PatternVisitor {
    def this(options: PatternVisitorOptions, rootPattern: js.Any, callback: PatternVisitorCallback) = this()
  }
  
  @js.native
  class ReferenceCls ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference {
    /* CompleteClass */
    override var from: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var identifier: Identifier = js.native
    /* CompleteClass */
    override var init: Boolean = js.native
    /* CompleteClass */
    override var resolved: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable | Null = js.native
    /* CompleteClass */
    override var writeExpr: Node | Null = js.native
    /* CompleteClass */
    override def isRead(): Boolean = js.native
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    /* CompleteClass */
    override def isReadWrite(): Boolean = js.native
    /* CompleteClass */
    override def isWrite(): Boolean = js.native
    /* CompleteClass */
    override def isWriteOnly(): Boolean = js.native
  }
  
  @js.native
  class ScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class SwitchScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  @js.native
  class WithScopeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope {
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: Null,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Null,
      isMethodDefinition: Boolean
    ) = this()
    def this(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager,
      `type`: ScopeType,
      upperScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope,
      block: Node,
      isMethodDefinition: Boolean
    ) = this()
    /* CompleteClass */
    override var block: Node = js.native
    /* CompleteClass */
    override var childScopes: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope
      ] = js.native
    /* CompleteClass */
    override var functionExpressionScope: Boolean = js.native
    /* CompleteClass */
    override var isStrict: Boolean = js.native
    /* CompleteClass */
    override var references: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var set: Map[
        String, 
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override var through: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
      ] = js.native
    /* CompleteClass */
    override var `type`: ScopeType = js.native
    /* CompleteClass */
    override var upper: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope | Null = js.native
    /* CompleteClass */
    override var variableScope: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override var variables: js.Array[
        typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
      ] = js.native
    /* CompleteClass */
    override def __addDeclaredVariablesOfNode(variable: js.Any, node: Node): Unit = js.native
    /* CompleteClass */
    override def __close(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope = js.native
    /* CompleteClass */
    override def __define(
      node: Node,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
    /* CompleteClass */
    override def __defineGeneric(
      name: js.Any,
      set: js.Any,
      variables: js.Any,
      node: js.Any,
      `def`: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.Definition
    ): Unit = js.native
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
    override def __shouldStaticallyClose(
      scopeManager: typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ): Boolean = js.native
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
    override def resolve(ident: Node): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference = js.native
  }
  
  val BlockScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.BlockScope
  ]) = js.native
  val CatchScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.CatchScope
  ]) = js.native
  val ClassScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ClassScope
  ]) = js.native
  val Definition: DefinitionConstructor = js.native
  val ForScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ForScope
  ]) = js.native
  val FunctionExpressionNameScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.FunctionExpressionNameScope
  ]) = js.native
  val FunctionScope: ScopeConstructor with (Instantiable4[
    /* scopeManager */ typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager, 
    /* upperScope */ typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.Scope, 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 158 */ js.Any, 
    /* isMethodDefinition */ Boolean, 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.FunctionScope
  ]) = js.native
  val GlobalScope: ScopeConstructor with (Instantiable2[
    /* scopeManager */ typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager, 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 158 */ js.Any, 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.GlobalScope
  ]) = js.native
  val ModuleScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ModuleScope
  ]) = js.native
  val ParameterDefinition: DefinitionConstructor with (Instantiable4[
    /* name */ Node, 
    /* node */ Node, 
    js.UndefOr[Double | Null], 
    js.UndefOr[Boolean], 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.ParameterDefinition
  ]) = js.native
  val Referencer: Instantiable2[
    /* options */ js.Any, 
    /* scopeManager */ typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager, 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferencerMod.Referencer[
      typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
    ]
  ] = js.native
  val Scope: ScopeConstructor = js.native
  val ScopeManager: Instantiable1[
    /* options */ ScopeManagerOptions, 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager
  ] = js.native
  val SwitchScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.SwitchScope
  ]) = js.native
  val Variable: Instantiable0[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeVariableMod.Variable
  ] = js.native
  val WithScope: ScopeConstructor with (ScopeChildConstructorWithUpperScope[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.WithScope
  ]) = js.native
  val version: String = js.native
  def analyze(ast: js.Object): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager = js.native
  def analyze(ast: js.Object, options: AnalysisOptions): typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManager = js.native
  @js.native
  object PatternVisitor
    extends Instantiable3[
          /* options */ PatternVisitorOptions, 
          /* rootPattern */ js.Any, 
          /* callback */ PatternVisitorCallback, 
          typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopePatternVisitorMod.PatternVisitor
        ] {
    def isPattern(node: Node): Boolean = js.native
  }
  
  @js.native
  object Reference
    extends Instantiable0[
          typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeReferenceMod.Reference
        ] {
    var READ: `1` = js.native
    var RW: `3` = js.native
    var WRITE: `2` = js.native
  }
  
}

