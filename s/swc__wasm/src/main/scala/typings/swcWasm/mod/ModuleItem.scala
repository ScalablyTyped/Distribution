package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.ModuleDeclaration
  - typings.swcWasm.mod.Statement
*/
trait ModuleItem extends StObject
object ModuleItem {
  
  inline def BlockStatement(span: Span, stmts: js.Array[Statement]): typings.swcWasm.mod.BlockStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.BlockStatement]
  }
  
  inline def BreakStatement(span: Span): typings.swcWasm.mod.BreakStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.BreakStatement]
  }
  
  inline def ClassDeclaration(
    body: js.Array[ClassMember],
    declare: Boolean,
    identifier: Identifier,
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typings.swcWasm.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ClassDeclaration]
  }
  
  inline def ContinueStatement(span: Span): typings.swcWasm.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ContinueStatement]
  }
  
  inline def DebuggerStatement(span: Span): typings.swcWasm.mod.DebuggerStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.DebuggerStatement]
  }
  
  inline def DoWhileStatement(body: Statement, span: Span, test: Expression): typings.swcWasm.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.DoWhileStatement]
  }
  
  inline def EmptyStatement(span: Span): typings.swcWasm.mod.EmptyStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.EmptyStatement]
  }
  
  inline def ExportAllDeclaration(source: StringLiteral, span: Span): typings.swcWasm.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportAllDeclaration]
  }
  
  inline def ExportDeclaration(declaration: Declaration, span: Span): typings.swcWasm.mod.ExportDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportDeclaration]
  }
  
  inline def ExportDefaultDeclaration(decl: DefaultDecl, span: Span): typings.swcWasm.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportDefaultDeclaration]
  }
  
  inline def ExportDefaultExpression(expression: Expression, span: Span): typings.swcWasm.mod.ExportDefaultExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportDefaultExpression]
  }
  
  inline def ExportNamedDeclaration(span: Span, specifiers: js.Array[ExportSpecifier], typeOnly: Boolean): typings.swcWasm.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ExportNamedDeclaration]
  }
  
  inline def ExpressionStatement(expression: Expression, span: Span): typings.swcWasm.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ExpressionStatement]
  }
  
  inline def ForInStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typings.swcWasm.mod.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ForInStatement]
  }
  
  inline def ForOfStatement(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): typings.swcWasm.mod.ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ForOfStatement]
  }
  
  inline def ForStatement(body: Statement, span: Span): typings.swcWasm.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ForStatement]
  }
  
  inline def FunctionDeclaration(
    async: Boolean,
    declare: Boolean,
    generator: Boolean,
    identifier: Identifier,
    params: js.Array[Param],
    span: Span
  ): typings.swcWasm.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.FunctionDeclaration]
  }
  
  inline def IfStatement(consequent: Statement, span: Span, test: Expression): typings.swcWasm.mod.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.IfStatement]
  }
  
  inline def ImportDeclaration(source: StringLiteral, span: Span, specifiers: js.Array[ImportSpecifier], typeOnly: Boolean): typings.swcWasm.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.ImportDeclaration]
  }
  
  inline def LabeledStatement(body: Statement, label: Identifier, span: Span): typings.swcWasm.mod.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.LabeledStatement]
  }
  
  inline def ReturnStatement(span: Span): typings.swcWasm.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ReturnStatement]
  }
  
  inline def SwitchStatement(cases: js.Array[SwitchCase], discriminant: Expression, span: Span): typings.swcWasm.mod.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.SwitchStatement]
  }
  
  inline def ThrowStatement(argument: Expression, span: Span): typings.swcWasm.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.ThrowStatement]
  }
  
  inline def TryStatement(block: BlockStatement, span: Span): typings.swcWasm.mod.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.TryStatement]
  }
  
  inline def TsEnumDeclaration(declare: Boolean, id: Identifier, isConst: Boolean, members: js.Array[TsEnumMember], span: Span): typings.swcWasm.mod.TsEnumDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConst = isConst.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsEnumDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsEnumDeclaration]
  }
  
  inline def TsExportAssignment(expression: Expression, span: Span): typings.swcWasm.mod.TsExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExportAssignment")
    __obj.asInstanceOf[typings.swcWasm.mod.TsExportAssignment]
  }
  
  inline def TsImportEqualsDeclaration(
    declare: Boolean,
    id: Identifier,
    isExport: Boolean,
    isTypeOnly: Boolean,
    moduleRef: TsModuleReference,
    span: Span
  ): typings.swcWasm.mod.TsImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], isTypeOnly = isTypeOnly.asInstanceOf[js.Any], moduleRef = moduleRef.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportEqualsDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsImportEqualsDeclaration]
  }
  
  inline def TsInterfaceDeclaration(
    body: TsInterfaceBody,
    declare: Boolean,
    `extends`: js.Array[TsExpressionWithTypeArguments],
    id: Identifier,
    span: Span
  ): typings.swcWasm.mod.TsInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInterfaceDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsInterfaceDeclaration]
  }
  
  inline def TsModuleDeclaration(declare: Boolean, global: Boolean, id: TsModuleName, span: Span): typings.swcWasm.mod.TsModuleDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsModuleDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsModuleDeclaration]
  }
  
  inline def TsNamespaceExportDeclaration(id: Identifier, span: Span): typings.swcWasm.mod.TsNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsNamespaceExportDeclaration]
  }
  
  inline def TsTypeAliasDeclaration(declare: Boolean, id: Identifier, span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAliasDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeAliasDeclaration]
  }
  
  inline def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    declare: Boolean,
    kind: VariableDeclarationKind,
    span: Span
  ): typings.swcWasm.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.swcWasm.mod.VariableDeclaration]
  }
  
  inline def WhileStatement(body: Statement, span: Span, test: Expression): typings.swcWasm.mod.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.WhileStatement]
  }
  
  inline def WithStatement(body: Statement, `object`: Expression, span: Span): typings.swcWasm.mod.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.swcWasm.mod.WithStatement]
  }
}
