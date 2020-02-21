package typings.webpack.mod.compilation.normalModuleFactory

import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserHooks extends js.Object {
  var assigned: HookMap[_, _, _]
  var call: HookMap[_, _, _]
  var callAnyMember: HookMap[_, _, _]
  var canRename: HookMap[_, _, _]
  var evaluate: HookMap[_, _, _]
  var evaluateCallExpressionMember: HookMap[_, _, _]
  var evaluateDefinedIdentifier: HookMap[_, _, _]
  var evaluateIdentifier: HookMap[_, _, _]
  var evaluateTypeof: HookMap[_, _, _]
  var export: SyncBailHook[_, _, _, _]
  var exportDeclaration: SyncBailHook[_, _, _, _]
  var exportExpression: SyncBailHook[_, _, _, _]
  var exportImport: SyncBailHook[_, _, _, _]
  var exportImportSpecifier: SyncBailHook[_, _, _, _]
  var exportSpecifier: SyncBailHook[_, _, _, _]
  var expression: HookMap[_, _, _]
  var expressionAnyMember: HookMap[_, _, _]
  var expressionConditionalOperator: SyncBailHook[_, _, _, _]
  var expressionLogicalOperator: SyncBailHook[_, _, _, _]
  var `import`: SyncBailHook[_, _, _, _]
  var importCall: SyncBailHook[_, _, _, _]
  var importSpecifier: SyncBailHook[_, _, _, _]
  var label: HookMap[_, _, _]
  var `new`: HookMap[_, _, _]
  var program: SyncBailHook[_, _, _, _]
  var rename: HookMap[_, _, _]
  var statement: SyncBailHook[_, _, _, _]
  var statementIf: SyncBailHook[_, _, _, _]
  var typeof: HookMap[_, _, _]
  var varDeclaration: SyncBailHook[_, _, _, _]
  var varDeclarationConst: HookMap[_, _, _]
  var varDeclarationLet: HookMap[_, _, _]
  var varDeclarationVar: HookMap[_, _, _]
}

object ParserHooks {
  @scala.inline
  def apply(
    assigned: HookMap[_, _, _],
    call: HookMap[_, _, _],
    callAnyMember: HookMap[_, _, _],
    canRename: HookMap[_, _, _],
    evaluate: HookMap[_, _, _],
    evaluateCallExpressionMember: HookMap[_, _, _],
    evaluateDefinedIdentifier: HookMap[_, _, _],
    evaluateIdentifier: HookMap[_, _, _],
    evaluateTypeof: HookMap[_, _, _],
    export: SyncBailHook[_, _, _, _],
    exportDeclaration: SyncBailHook[_, _, _, _],
    exportExpression: SyncBailHook[_, _, _, _],
    exportImport: SyncBailHook[_, _, _, _],
    exportImportSpecifier: SyncBailHook[_, _, _, _],
    exportSpecifier: SyncBailHook[_, _, _, _],
    expression: HookMap[_, _, _],
    expressionAnyMember: HookMap[_, _, _],
    expressionConditionalOperator: SyncBailHook[_, _, _, _],
    expressionLogicalOperator: SyncBailHook[_, _, _, _],
    `import`: SyncBailHook[_, _, _, _],
    importCall: SyncBailHook[_, _, _, _],
    importSpecifier: SyncBailHook[_, _, _, _],
    label: HookMap[_, _, _],
    `new`: HookMap[_, _, _],
    program: SyncBailHook[_, _, _, _],
    rename: HookMap[_, _, _],
    statement: SyncBailHook[_, _, _, _],
    statementIf: SyncBailHook[_, _, _, _],
    typeof: HookMap[_, _, _],
    varDeclaration: SyncBailHook[_, _, _, _],
    varDeclarationConst: HookMap[_, _, _],
    varDeclarationLet: HookMap[_, _, _],
    varDeclarationVar: HookMap[_, _, _]
  ): ParserHooks = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], callAnyMember = callAnyMember.asInstanceOf[js.Any], canRename = canRename.asInstanceOf[js.Any], evaluate = evaluate.asInstanceOf[js.Any], evaluateCallExpressionMember = evaluateCallExpressionMember.asInstanceOf[js.Any], evaluateDefinedIdentifier = evaluateDefinedIdentifier.asInstanceOf[js.Any], evaluateIdentifier = evaluateIdentifier.asInstanceOf[js.Any], evaluateTypeof = evaluateTypeof.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], exportDeclaration = exportDeclaration.asInstanceOf[js.Any], exportExpression = exportExpression.asInstanceOf[js.Any], exportImport = exportImport.asInstanceOf[js.Any], exportImportSpecifier = exportImportSpecifier.asInstanceOf[js.Any], exportSpecifier = exportSpecifier.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], expressionAnyMember = expressionAnyMember.asInstanceOf[js.Any], expressionConditionalOperator = expressionConditionalOperator.asInstanceOf[js.Any], expressionLogicalOperator = expressionLogicalOperator.asInstanceOf[js.Any], importCall = importCall.asInstanceOf[js.Any], importSpecifier = importSpecifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], statementIf = statementIf.asInstanceOf[js.Any], typeof = typeof.asInstanceOf[js.Any], varDeclaration = varDeclaration.asInstanceOf[js.Any], varDeclarationConst = varDeclarationConst.asInstanceOf[js.Any], varDeclarationLet = varDeclarationLet.asInstanceOf[js.Any], varDeclarationVar = varDeclarationVar.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserHooks]
  }
}

