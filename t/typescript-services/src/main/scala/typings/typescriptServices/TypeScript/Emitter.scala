package typings.typescriptServices.TypeScript

import typings.typescriptServices.AnonDependencyList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Emitter")
@js.native
class Emitter protected () extends js.Object {
  def this(
    emittingFileName: String,
    outfile: TextWriter,
    emitOptions: EmitOptions,
    semanticInfoChain: SemanticInfoChain
  ) = this()
  var captureThisStmtString: String = js.native
  var currentVariableDeclaration: js.Any = js.native
  var declStack: js.Any = js.native
  var detachedCommentsElement: js.Any = js.native
  var document: Document = js.native
  var emitOptions: EmitOptions = js.native
  var emitState: EmitState = js.native
  var emittingFileName: String = js.native
  var exportAssignment: js.Any = js.native
  var extendsPrologueEmitted: Boolean = js.native
  var globalThisCapturePrologueEmitted: Boolean = js.native
  var inArrowFunction: Boolean = js.native
  var inWithBlock: js.Any = js.native
  var indenter: Indenter = js.native
  var moduleName: String = js.native
  var outfile: TextWriter = js.native
  var semanticInfoChain: js.Any = js.native
  var sourceMapper: SourceMapper = js.native
  var thisClassNode: ClassDeclaration = js.native
  /* private */ def canEmitDottedNameMemberAccessExpression(expression: js.Any): js.Any = js.native
  def createSourceMapper(
    document: Document,
    jsFileName: String,
    jsFile: TextWriter,
    sourceMapOut: TextWriter,
    resolvePath: js.Function1[/* path */ String, String]
  ): Unit = js.native
  /* private */ def emit(ast: js.Any): js.Any = js.native
  /* private */ def emitAccessorBody(funcDecl: js.Any, parameterList: js.Any, block: js.Any): js.Any = js.native
  def emitAccessorMemberDeclaration(funcDecl: AST, name: IASTToken, className: String, isProto: Boolean): Unit = js.native
  def emitAmbientVarDecl(varDecl: VariableDeclarator): Unit = js.native
  /* private */ def emitAnyArrowFunctionExpression(arrowFunction: js.Any, funcName: js.Any, parameters: js.Any, block: js.Any, expression: js.Any): js.Any = js.native
  def emitArrayLiteralExpression(arrayLiteral: ArrayLiteralExpression): Unit = js.native
  def emitBinaryExpression(expression: BinaryExpression): Unit = js.native
  def emitBlock(block: Block): Unit = js.native
  def emitBlockOrStatement(node: AST): Unit = js.native
  def emitBreakStatement(jump: BreakStatement): Unit = js.native
  def emitCaseSwitchClause(clause: CaseSwitchClause): Unit = js.native
  def emitCastExpression(expression: CastExpression): Unit = js.native
  def emitCatchClause(clause: CatchClause): Unit = js.native
  def emitClass(classDecl: ClassDeclaration): Unit = js.native
  def emitClassDeclaration(declaration: ClassDeclaration): Unit = js.native
  /* private */ def emitClassMemberFunctionDeclaration(classDecl: js.Any, funcDecl: js.Any): js.Any = js.native
  /* private */ def emitClassMembers(classDecl: js.Any): js.Any = js.native
  /* private */ def emitCommaSeparatedList(parent: js.Any, list: js.Any, buffer: js.Any, preserveNewLines: js.Any): js.Any = js.native
  def emitComment(comment: Comment, trailing: Boolean, first: Boolean): Unit = js.native
  def emitComments(ast: AST, pre: Boolean): Unit = js.native
  def emitComments(ast: AST, pre: Boolean, onlyPinnedOrTripleSlashComments: Boolean): Unit = js.native
  def emitCommentsArray(comments: js.Array[Comment], trailing: Boolean): Unit = js.native
  def emitConditionalExpression(expression: ConditionalExpression): Unit = js.native
  def emitConstructor(funcDecl: ConstructorDeclaration): Unit = js.native
  def emitConstructorDeclaration(declaration: ConstructorDeclaration): Unit = js.native
  def emitConstructorStatements(funcDecl: ConstructorDeclaration): Unit = js.native
  def emitContinueStatement(jump: ContinueStatement): Unit = js.native
  def emitDebuggerStatement(statement: DebuggerStatement): Unit = js.native
  def emitDefaultSwitchClause(clause: DefaultSwitchClause): Unit = js.native
  /* private */ def emitDefaultValueAssignments(parameters: js.Any): js.Any = js.native
  def emitDeleteExpression(expression: DeleteExpression): Unit = js.native
  /* private */ def emitDetachedComments(list: js.Any): js.Any = js.native
  def emitDoStatement(statement: DoStatement): Unit = js.native
  /* private */ def emitDottedNameMemberAccessExpression(expression: js.Any): js.Any = js.native
  /* private */ def emitDottedNameMemberAccessExpressionRecurse(expression: js.Any): js.Any = js.native
  def emitElementAccessExpression(expression: ElementAccessExpression): Unit = js.native
  def emitElseClause(elseClause: ElseClause): Unit = js.native
  def emitEnum(moduleDecl: EnumDeclaration): Unit = js.native
  def emitEnumDeclaration(declaration: EnumDeclaration): Unit = js.native
  def emitEnumElement(varDecl: EnumElement): Unit = js.native
  def emitEqualsValueClause(clause: EqualsValueClause): Unit = js.native
  def emitExpressionStatement(statement: ExpressionStatement): Unit = js.native
  def emitFinallyClause(clause: FinallyClause): Unit = js.native
  def emitForInStatement(statement: ForInStatement): Unit = js.native
  def emitForStatement(statement: ForStatement): Unit = js.native
  def emitFunction(funcDecl: FunctionDeclaration): Unit = js.native
  /* private */ def emitFunctionBodyStatements(name: js.Any, funcDecl: js.Any, parameterList: js.Any, block: js.Any, bodyExpression: js.Any): js.Any = js.native
  def emitFunctionDeclaration(declaration: FunctionDeclaration): Unit = js.native
  def emitFunctionExpression(funcDecl: FunctionExpression): Unit = js.native
  /* private */ def emitFunctionParameters(parameters: js.Any): js.Any = js.native
  def emitFunctionPropertyAssignment(funcProp: FunctionPropertyAssignment): Unit = js.native
  def emitGenericType(`type`: GenericType): Unit = js.native
  def emitGetAccessor(accessor: GetAccessor): Unit = js.native
  def emitIfStatement(statement: IfStatement): Unit = js.native
  def emitImportDeclaration(importDeclAST: ImportDeclaration): Unit = js.native
  def emitIndent(): Unit = js.native
  def emitInterfaceDeclaration(declaration: InterfaceDeclaration): Unit = js.native
  def emitInvocationExpression(callNode: InvocationExpression): Unit = js.native
  def emitJavascript(ast: AST, startLine: Boolean): Unit = js.native
  def emitLabeledStatement(statement: LabeledStatement): Unit = js.native
  def emitList(list: ISyntaxList2): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Boolean): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Boolean, startInclusive: Double): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Boolean, startInclusive: Double, endExclusive: Double): Unit = js.native
  def emitLiteralExpression(expression: LiteralExpression): Unit = js.native
  def emitMemberAccessExpression(expression: MemberAccessExpression): Unit = js.native
  /* private */ def emitMemberVariableDeclaration(varDecl: js.Any): js.Any = js.native
  /* private */ def emitModuleDeclaration(declaration: js.Any): js.Any = js.native
  /* private */ def emitModuleDeclarationWorker(moduleDecl: js.Any): js.Any = js.native
  def emitName(name: Identifier, addThis: Boolean): Unit = js.native
  def emitNumericLiteral(literal: NumericLiteral): Unit = js.native
  def emitObjectCreationExpression(objectCreationExpression: ObjectCreationExpression): Unit = js.native
  def emitObjectLiteralExpression(objectLiteral: ObjectLiteralExpression): Unit = js.native
  def emitParameter(parameter: Parameter): Unit = js.native
  /* private */ def emitParameterList(list: js.Any): js.Any = js.native
  /* private */ def emitParameterPropertyAndMemberVariableAssignments(): js.Any = js.native
  def emitParenthesizedArrowFunctionExpression(arrowFunction: ParenthesizedArrowFunctionExpression): Unit = js.native
  def emitParenthesizedExpression(parenthesizedExpression: ParenthesizedExpression): Unit = js.native
  /* private */ def emitPossibleCopyrightHeaders(script: js.Any): js.Any = js.native
  def emitPostfixUnaryExpression(expression: PostfixUnaryExpression): Unit = js.native
  def emitPrefixUnaryExpression(expression: PrefixUnaryExpression): Unit = js.native
  def emitPrologue(sourceUnit: SourceUnit): Unit = js.native
  def emitQualifiedName(name: QualifiedName): Unit = js.native
  def emitRegularExpressionLiteral(literal: RegularExpressionLiteral): Unit = js.native
  /* private */ def emitRestParameterInitializer(parameters: js.Any): js.Any = js.native
  def emitReturnStatement(statement: ReturnStatement): Unit = js.native
  def emitScriptElements(sourceUnit: SourceUnit): Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2): Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: Boolean): Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: Boolean, startInclusive: Double): Unit = js.native
  def emitSeparatedList(
    list: ISeparatedSyntaxList2,
    useNewLineSeparator: Boolean,
    startInclusive: Double,
    endExclusive: Double
  ): Unit = js.native
  def emitSetAccessor(accessor: SetAccessor): Unit = js.native
  def emitSimpleArrowFunctionExpression(arrowFunction: SimpleArrowFunctionExpression): Unit = js.native
  def emitSimplePropertyAssignment(property: SimplePropertyAssignment): Unit = js.native
  def emitSingleModuleDeclaration(moduleDecl: ModuleDeclaration, moduleName: IASTToken): Unit = js.native
  /* private */ def emitSourceUnit(sourceUnit: js.Any): js.Any = js.native
  def emitSpaceBetweenConstructs(node1: AST, node2: AST): Unit = js.native
  def emitStringLiteral(literal: StringLiteral): Unit = js.native
  def emitSuperExpression(expression: SuperExpression): Unit = js.native
  /* private */ def emitSwitchClauseBody(body: js.Any): js.Any = js.native
  def emitSwitchStatement(statement: SwitchStatement): Unit = js.native
  def emitThis(): Unit = js.native
  def emitThisExpression(expression: ThisExpression): Unit = js.native
  def emitThrowStatement(statement: ThrowStatement): Unit = js.native
  def emitTryStatement(statement: TryStatement): Unit = js.native
  def emitTypeOfExpression(expression: TypeOfExpression): Unit = js.native
  def emitVarDeclVar(): Unit = js.native
  def emitVariableDeclaration(declaration: VariableDeclaration): Unit = js.native
  def emitVariableDeclarator(varDecl: VariableDeclarator): Unit = js.native
  def emitVariableStatement(statement: VariableStatement): Unit = js.native
  def emitVoidExpression(expression: VoidExpression): Unit = js.native
  def emitWhileStatement(statement: WhileStatement): Unit = js.native
  def emitWithStatement(statement: WithStatement): Unit = js.native
  /* private */ def emitWorker(ast: js.Any): js.Any = js.native
  /* private */ def firstVariableDeclarator(statement: js.Any): js.Any = js.native
  def getConstantDecl(dotExpr: MemberAccessExpression): PullEnumElementDecl = js.native
  /* private */ def getDetachedComments(element: js.Any): js.Any = js.native
  /* private */ def getEnclosingDecl(): js.Any = js.native
  def getExportAssignment(): ExportAssignment = js.native
  /* private */ def getImportDecls(fileName: js.Any): js.Any = js.native
  /* private */ def getIndentString(): js.Any = js.native
  /* private */ def getModuleDeclToVerifyChildNameCollision(moduleDecl: js.Any, changeNameIfAnyDeclarationInContext: js.Any): js.Any = js.native
  def getModuleImportAndDependencyList(sourceUnit: SourceUnit): AnonDependencyList = js.native
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
  def recordSourceMappingEnd(ast: IASTSpan): Unit = js.native
  def recordSourceMappingNameEnd(): Unit = js.native
  def recordSourceMappingNameStart(name: String): Unit = js.native
  def recordSourceMappingStart(ast: IASTSpan): Unit = js.native
  /* private */ def requiresExtendsBlock(moduleElements: js.Any): js.Any = js.native
  def setContainer(c: Double): Double = js.native
  def setDocument(document: Document): Unit = js.native
  def setExportAssignment(exportAssignment: ExportAssignment): Unit = js.native
  def setSourceMapperNewSourceFile(document: Document): Unit = js.native
  def shouldCaptureThis(ast: AST): Boolean = js.native
  /* private */ def shouldEmit(ast: js.Any): js.Any = js.native
  def shouldEmitClassDeclaration(declaration: ClassDeclaration): Boolean = js.native
  def shouldEmitEnumDeclaration(declaration: EnumDeclaration): Boolean = js.native
  def shouldEmitFunctionDeclaration(declaration: FunctionDeclaration): Boolean = js.native
  def shouldEmitImportDeclaration(importDeclAST: ImportDeclaration): Boolean = js.native
  def shouldEmitInterfaceDeclaration(declaration: InterfaceDeclaration): Boolean = js.native
  def shouldEmitModuleDeclaration(declaration: ModuleDeclaration): Boolean = js.native
  def shouldEmitVariableStatement(statement: VariableStatement): Boolean = js.native
  /* private */ def shouldQualifySymbolNameWithParentName(symbol: js.Any): js.Any = js.native
  /* private */ def symbolIsUsedInItsEnclosingContainer(symbol: js.Any): js.Any = js.native
  /* private */ def symbolIsUsedInItsEnclosingContainer(symbol: js.Any, dynamic: js.Any): js.Any = js.native
  def tryEmitConstant(dotExpr: MemberAccessExpression): Boolean = js.native
  /* private */ def updateLineAndColumn(s: js.Any): js.Any = js.native
  def writeCaptureThisStatement(ast: AST): Unit = js.native
  def writeLineToOutput(s: String): Unit = js.native
  def writeLineToOutput(s: String, force: Boolean): Unit = js.native
  def writeToOutput(s: String): Unit = js.native
  def writeToOutputWithSourceMapRecord(s: String, astSpan: IASTSpan): Unit = js.native
}

