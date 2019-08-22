package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.ScopeNs

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.ClassName
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.FunctionName
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.ImplicitGlobalVariable
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.ImportBinding
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.Parameter
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.TDZ
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ArrowFunctionExpression
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.CatchClause
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ClassDeclaration
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ClassExpression
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.FunctionDeclaration
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.FunctionExpression
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ImportDeclaration
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ImportDefaultSpecifier
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ImportNamespaceSpecifier
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.ImportSpecifier
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Program
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.VariableDeclaration
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionType extends js.Object {
  var node: js.UndefOr[
    js.Any | ArrowFunctionExpression | CatchClause | ClassDeclaration | ClassExpression | FunctionDeclaration | FunctionExpression | ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier | Program | VariableDeclarator
  ] = js.undefined
  var parent: js.UndefOr[ImportDeclaration | Null | VariableDeclaration] = js.undefined
  var `type`: js.UndefOr[
    typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.CatchClause | ClassName | FunctionName | ImplicitGlobalVariable | ImportBinding | Parameter | TDZ | typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.Variable
  ] = js.undefined
}

object DefinitionType {
  @scala.inline
  def apply(
    node: CatchClause = null,
    parent: Null = null,
    `type`: typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.CatchClause = null
  ): DefinitionType = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefinitionType]
  }
}

