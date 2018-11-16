package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Emitter")
@js.native
class Emitter protected () extends js.Object {
  def this(emittingFileName: java.lang.String, outfile: TextWriter, emitOptions: EmitOptions, semanticInfoChain: SemanticInfoChain) = this()
  var captureThisStmtString: java.lang.String = js.native
  var currentVariableDeclaration: js.Any = js.native
  var declStack: js.Any = js.native
  var detachedCommentsElement: js.Any = js.native
  var document: Document = js.native
  var emitOptions: EmitOptions = js.native
  var emitState: EmitState = js.native
  var emittingFileName: java.lang.String = js.native
  var exportAssignment: js.Any = js.native
  var extendsPrologueEmitted: scala.Boolean = js.native
  var globalThisCapturePrologueEmitted: scala.Boolean = js.native
  var inArrowFunction: scala.Boolean = js.native
  var inWithBlock: js.Any = js.native
  var indenter: Indenter = js.native
  var moduleName: java.lang.String = js.native
  var outfile: TextWriter = js.native
  var semanticInfoChain: js.Any = js.native
  var sourceMapper: SourceMapper = js.native
  var thisClassNode: ClassDeclaration = js.native
  /* private */ def canEmitDottedNameMemberAccessExpression(expression: js.Any): js.Any = js.native
  def createSourceMapper(
    document: Document,
    jsFileName: java.lang.String,
    jsFile: TextWriter,
    sourceMapOut: TextWriter,
    resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]
  ): scala.Unit = js.native
  /* private */ def emit(ast: js.Any): js.Any = js.native
  /* private */ def emitAccessorBody(funcDecl: js.Any, parameterList: js.Any, block: js.Any): js.Any = js.native
  def emitAccessorMemberDeclaration(funcDecl: AST, name: IASTToken, className: java.lang.String, isProto: scala.Boolean): scala.Unit = js.native
  def emitAmbientVarDecl(varDecl: VariableDeclarator): scala.Unit = js.native
  /* private */ def emitAnyArrowFunctionExpression(arrowFunction: js.Any, funcName: js.Any, parameters: js.Any, block: js.Any, expression: js.Any): js.Any = js.native
  def emitArrayLiteralExpression(arrayLiteral: ArrayLiteralExpression): scala.Unit = js.native
  def emitBinaryExpression(expression: BinaryExpression): scala.Unit = js.native
  def emitBlock(block: Block): scala.Unit = js.native
  def emitBlockOrStatement(node: AST): scala.Unit = js.native
  def emitBreakStatement(jump: BreakStatement): scala.Unit = js.native
  def emitCaseSwitchClause(clause: CaseSwitchClause): scala.Unit = js.native
  def emitCastExpression(expression: CastExpression): scala.Unit = js.native
  def emitCatchClause(clause: CatchClause): scala.Unit = js.native
  def emitClass(classDecl: ClassDeclaration): scala.Unit = js.native
  def emitClassDeclaration(declaration: ClassDeclaration): scala.Unit = js.native
  /* private */ def emitClassMemberFunctionDeclaration(classDecl: js.Any, funcDecl: js.Any): js.Any = js.native
  /* private */ def emitClassMembers(classDecl: js.Any): js.Any = js.native
  /* private */ def emitCommaSeparatedList(parent: js.Any, list: js.Any, buffer: js.Any, preserveNewLines: js.Any): js.Any = js.native
  def emitComment(comment: Comment, trailing: scala.Boolean, first: scala.Boolean): scala.Unit = js.native
  def emitComments(ast: AST, pre: scala.Boolean): scala.Unit = js.native
  def emitComments(ast: AST, pre: scala.Boolean, onlyPinnedOrTripleSlashComments: scala.Boolean): scala.Unit = js.native
  def emitCommentsArray(comments: js.Array[Comment], trailing: scala.Boolean): scala.Unit = js.native
  def emitConditionalExpression(expression: ConditionalExpression): scala.Unit = js.native
  def emitConstructor(funcDecl: ConstructorDeclaration): scala.Unit = js.native
  def emitConstructorDeclaration(declaration: ConstructorDeclaration): scala.Unit = js.native
  def emitConstructorStatements(funcDecl: ConstructorDeclaration): scala.Unit = js.native
  def emitContinueStatement(jump: ContinueStatement): scala.Unit = js.native
  def emitDebuggerStatement(statement: DebuggerStatement): scala.Unit = js.native
  def emitDefaultSwitchClause(clause: DefaultSwitchClause): scala.Unit = js.native
  /* private */ def emitDefaultValueAssignments(parameters: js.Any): js.Any = js.native
  def emitDeleteExpression(expression: DeleteExpression): scala.Unit = js.native
  /* private */ def emitDetachedComments(list: js.Any): js.Any = js.native
  def emitDoStatement(statement: DoStatement): scala.Unit = js.native
  /* private */ def emitDottedNameMemberAccessExpression(expression: js.Any): js.Any = js.native
  /* private */ def emitDottedNameMemberAccessExpressionRecurse(expression: js.Any): js.Any = js.native
  def emitElementAccessExpression(expression: ElementAccessExpression): scala.Unit = js.native
  def emitElseClause(elseClause: ElseClause): scala.Unit = js.native
  def emitEnum(moduleDecl: EnumDeclaration): scala.Unit = js.native
  def emitEnumDeclaration(declaration: EnumDeclaration): scala.Unit = js.native
  def emitEnumElement(varDecl: EnumElement): scala.Unit = js.native
  def emitEqualsValueClause(clause: EqualsValueClause): scala.Unit = js.native
  def emitExpressionStatement(statement: ExpressionStatement): scala.Unit = js.native
  def emitFinallyClause(clause: FinallyClause): scala.Unit = js.native
  def emitForInStatement(statement: ForInStatement): scala.Unit = js.native
  def emitForStatement(statement: ForStatement): scala.Unit = js.native
  def emitFunction(funcDecl: FunctionDeclaration): scala.Unit = js.native
  /* private */ def emitFunctionBodyStatements(name: js.Any, funcDecl: js.Any, parameterList: js.Any, block: js.Any, bodyExpression: js.Any): js.Any = js.native
  def emitFunctionDeclaration(declaration: FunctionDeclaration): scala.Unit = js.native
  def emitFunctionExpression(funcDecl: FunctionExpression): scala.Unit = js.native
  /* private */ def emitFunctionParameters(parameters: js.Any): js.Any = js.native
  def emitFunctionPropertyAssignment(funcProp: FunctionPropertyAssignment): scala.Unit = js.native
  def emitGenericType(`type`: GenericType): scala.Unit = js.native
  def emitGetAccessor(accessor: GetAccessor): scala.Unit = js.native
  def emitIfStatement(statement: IfStatement): scala.Unit = js.native
  def emitImportDeclaration(importDeclAST: ImportDeclaration): scala.Unit = js.native
  def emitIndent(): scala.Unit = js.native
  def emitInterfaceDeclaration(declaration: InterfaceDeclaration): scala.Unit = js.native
  def emitInvocationExpression(callNode: InvocationExpression): scala.Unit = js.native
  def emitJavascript(ast: AST, startLine: scala.Boolean): scala.Unit = js.native
  def emitLabeledStatement(statement: LabeledStatement): scala.Unit = js.native
  def emitList(list: ISyntaxList2): scala.Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: scala.Boolean): scala.Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: scala.Boolean, startInclusive: scala.Double): scala.Unit = js.native
  def emitList(
    list: ISyntaxList2,
    useNewLineSeparator: scala.Boolean,
    startInclusive: scala.Double,
    endExclusive: scala.Double
  ): scala.Unit = js.native
  def emitLiteralExpression(expression: LiteralExpression): scala.Unit = js.native
  def emitMemberAccessExpression(expression: MemberAccessExpression): scala.Unit = js.native
  /* private */ def emitMemberVariableDeclaration(varDecl: js.Any): js.Any = js.native
  /* private */ def emitModuleDeclaration(declaration: js.Any): js.Any = js.native
  /* private */ def emitModuleDeclarationWorker(moduleDecl: js.Any): js.Any = js.native
  def emitName(name: Identifier, addThis: scala.Boolean): scala.Unit = js.native
  def emitNumericLiteral(literal: NumericLiteral): scala.Unit = js.native
  def emitObjectCreationExpression(objectCreationExpression: ObjectCreationExpression): scala.Unit = js.native
  def emitObjectLiteralExpression(objectLiteral: ObjectLiteralExpression): scala.Unit = js.native
  def emitParameter(parameter: Parameter): scala.Unit = js.native
  /* private */ def emitParameterList(list: js.Any): js.Any = js.native
  /* private */ def emitParameterPropertyAndMemberVariableAssignments(): js.Any = js.native
  def emitParenthesizedArrowFunctionExpression(arrowFunction: ParenthesizedArrowFunctionExpression): scala.Unit = js.native
  def emitParenthesizedExpression(parenthesizedExpression: ParenthesizedExpression): scala.Unit = js.native
  /* private */ def emitPossibleCopyrightHeaders(script: js.Any): js.Any = js.native
  def emitPostfixUnaryExpression(expression: PostfixUnaryExpression): scala.Unit = js.native
  def emitPrefixUnaryExpression(expression: PrefixUnaryExpression): scala.Unit = js.native
  def emitPrologue(sourceUnit: SourceUnit): scala.Unit = js.native
  def emitQualifiedName(name: QualifiedName): scala.Unit = js.native
  def emitRegularExpressionLiteral(literal: RegularExpressionLiteral): scala.Unit = js.native
  /* private */ def emitRestParameterInitializer(parameters: js.Any): js.Any = js.native
  def emitReturnStatement(statement: ReturnStatement): scala.Unit = js.native
  def emitScriptElements(sourceUnit: SourceUnit): scala.Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2): scala.Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: scala.Boolean): scala.Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: scala.Boolean, startInclusive: scala.Double): scala.Unit = js.native
  def emitSeparatedList(
    list: ISeparatedSyntaxList2,
    useNewLineSeparator: scala.Boolean,
    startInclusive: scala.Double,
    endExclusive: scala.Double
  ): scala.Unit = js.native
  def emitSetAccessor(accessor: SetAccessor): scala.Unit = js.native
  def emitSimpleArrowFunctionExpression(arrowFunction: SimpleArrowFunctionExpression): scala.Unit = js.native
  def emitSimplePropertyAssignment(property: SimplePropertyAssignment): scala.Unit = js.native
  def emitSingleModuleDeclaration(moduleDecl: ModuleDeclaration, moduleName: IASTToken): scala.Unit = js.native
  /* private */ def emitSourceUnit(sourceUnit: js.Any): js.Any = js.native
  def emitSpaceBetweenConstructs(node1: AST, node2: AST): scala.Unit = js.native
  def emitStringLiteral(literal: StringLiteral): scala.Unit = js.native
  def emitSuperExpression(expression: SuperExpression): scala.Unit = js.native
  /* private */ def emitSwitchClauseBody(body: js.Any): js.Any = js.native
  def emitSwitchStatement(statement: SwitchStatement): scala.Unit = js.native
  def emitThis(): scala.Unit = js.native
  def emitThisExpression(expression: ThisExpression): scala.Unit = js.native
  def emitThrowStatement(statement: ThrowStatement): scala.Unit = js.native
  def emitTryStatement(statement: TryStatement): scala.Unit = js.native
  def emitTypeOfExpression(expression: TypeOfExpression): scala.Unit = js.native
  def emitVarDeclVar(): scala.Unit = js.native
  def emitVariableDeclaration(declaration: VariableDeclaration): scala.Unit = js.native
  def emitVariableDeclarator(varDecl: VariableDeclarator): scala.Unit = js.native
  def emitVariableStatement(statement: VariableStatement): scala.Unit = js.native
  def emitVoidExpression(expression: VoidExpression): scala.Unit = js.native
  def emitWhileStatement(statement: WhileStatement): scala.Unit = js.native
  def emitWithStatement(statement: WithStatement): scala.Unit = js.native
  /* private */ def emitWorker(ast: js.Any): js.Any = js.native
  /* private */ def firstVariableDeclarator(statement: js.Any): js.Any = js.native
  def getConstantDecl(dotExpr: MemberAccessExpression): PullEnumElementDecl = js.native
  /* private */ def getDetachedComments(element: js.Any): js.Any = js.native
  /* private */ def getEnclosingDecl(): js.Any = js.native
  def getExportAssignment(): ExportAssignment = js.native
  /* private */ def getImportDecls(fileName: js.Any): js.Any = js.native
  /* private */ def getIndentString(): js.Any = js.native
  /* private */ def getModuleDeclToVerifyChildNameCollision(moduleDecl: js.Any, changeNameIfAnyDeclarationInContext: js.Any): js.Any = js.native
  def getModuleImportAndDependencyList(sourceUnit: SourceUnit): typescriptDashServicesLib.Anon_ImportList = js.native
  /* private */ def getModuleName(moduleDecl: js.Any): js.Any = js.native
  /* private */ def getModuleName(moduleDecl: js.Any, changeNameIfAnyDeclarationInContext: js.Any): js.Any = js.native
  def getOutputFiles(): js.Array[OutputFile] = js.native
  /* private */ def getSymbolForEmit(ast: js.Any): js.Any = js.native
  /* private */ def hasChildNameCollision(moduleName: js.Any, parentDecl: js.Any): js.Any = js.native
  /* private */ def isDirectivePrologueElement(node: js.Any): js.Any = js.native
  /* private */ def isNotAmbientOrHasInitializer(variableStatement: js.Any): js.Any = js.native
  /* private */ def isOnSameLine(pos1: js.Any, pos2: js.Any): js.Any = js.native
  /* private */ def isPinnedOrTripleSlash(comment: js.Any): js.Any = js.native
  /* private */ def popDecl(decl: js.Any): js.Any = js.native
  /* private */ def pushDecl(decl: js.Any): js.Any = js.native
  def recordSourceMappingEnd(ast: IASTSpan): scala.Unit = js.native
  def recordSourceMappingNameEnd(): scala.Unit = js.native
  def recordSourceMappingNameStart(name: java.lang.String): scala.Unit = js.native
  def recordSourceMappingStart(ast: IASTSpan): scala.Unit = js.native
  /* private */ def requiresExtendsBlock(moduleElements: js.Any): js.Any = js.native
  def setContainer(c: scala.Double): scala.Double = js.native
  def setDocument(document: Document): scala.Unit = js.native
  def setExportAssignment(exportAssignment: ExportAssignment): scala.Unit = js.native
  def setSourceMapperNewSourceFile(document: Document): scala.Unit = js.native
  def shouldCaptureThis(ast: AST): scala.Boolean = js.native
  /* private */ def shouldEmit(ast: js.Any): js.Any = js.native
  def shouldEmitClassDeclaration(declaration: ClassDeclaration): scala.Boolean = js.native
  def shouldEmitEnumDeclaration(declaration: EnumDeclaration): scala.Boolean = js.native
  def shouldEmitFunctionDeclaration(declaration: FunctionDeclaration): scala.Boolean = js.native
  def shouldEmitImportDeclaration(importDeclAST: ImportDeclaration): scala.Boolean = js.native
  def shouldEmitInterfaceDeclaration(declaration: InterfaceDeclaration): scala.Boolean = js.native
  def shouldEmitModuleDeclaration(declaration: ModuleDeclaration): scala.Boolean = js.native
  def shouldEmitVariableStatement(statement: VariableStatement): scala.Boolean = js.native
  /* private */ def shouldQualifySymbolNameWithParentName(symbol: js.Any): js.Any = js.native
  /* private */ def symbolIsUsedInItsEnclosingContainer(symbol: js.Any): js.Any = js.native
  /* private */ def symbolIsUsedInItsEnclosingContainer(symbol: js.Any, dynamic: js.Any): js.Any = js.native
  def tryEmitConstant(dotExpr: MemberAccessExpression): scala.Boolean = js.native
  /* private */ def updateLineAndColumn(s: js.Any): js.Any = js.native
  def writeCaptureThisStatement(ast: AST): scala.Unit = js.native
  def writeLineToOutput(s: java.lang.String): scala.Unit = js.native
  def writeLineToOutput(s: java.lang.String, force: scala.Boolean): scala.Unit = js.native
  def writeToOutput(s: java.lang.String): scala.Unit = js.native
  def writeToOutputWithSourceMapRecord(s: java.lang.String, astSpan: IASTSpan): scala.Unit = js.native
}

