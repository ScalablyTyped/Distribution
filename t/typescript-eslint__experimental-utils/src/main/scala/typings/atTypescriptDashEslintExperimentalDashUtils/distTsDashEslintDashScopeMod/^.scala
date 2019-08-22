package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeAnalyzeMod.AnalysisOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeDefinitionMod.DefinitionConstructor
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod.ScopeManagerOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeChildConstructorWithUpperScope
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeMod.ScopeConstructor
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

