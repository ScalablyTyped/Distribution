package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emitter extends StObject {
  
  /* private */ def canEmitDottedNameMemberAccessExpression(expression: Any): Any = js.native
  
  var captureThisStmtString: String = js.native
  
  def createSourceMapper(
    document: Document,
    jsFileName: String,
    jsFile: TextWriter,
    sourceMapOut: TextWriter,
    resolvePath: js.Function1[/* path */ String, String]
  ): Unit = js.native
  
  /* private */ var currentVariableDeclaration: Any = js.native
  
  /* private */ var declStack: Any = js.native
  
  /* private */ var detachedCommentsElement: Any = js.native
  
  var document: Document = js.native
  
  /* private */ def emit(ast: Any): Any = js.native
  
  /* private */ def emitAccessorBody(funcDecl: Any, parameterList: Any, block: Any): Any = js.native
  
  def emitAccessorMemberDeclaration(funcDecl: AST, name: IASTToken, className: String, isProto: Boolean): Unit = js.native
  
  def emitAmbientVarDecl(varDecl: VariableDeclarator): Unit = js.native
  
  /* private */ def emitAnyArrowFunctionExpression(arrowFunction: Any, funcName: Any, parameters: Any, block: Any, expression: Any): Any = js.native
  
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
  
  /* private */ def emitClassMemberFunctionDeclaration(classDecl: Any, funcDecl: Any): Any = js.native
  
  /* private */ def emitClassMembers(classDecl: Any): Any = js.native
  
  /* private */ def emitCommaSeparatedList(parent: Any, list: Any, buffer: Any, preserveNewLines: Any): Any = js.native
  
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
  
  /* private */ def emitDefaultValueAssignments(parameters: Any): Any = js.native
  
  def emitDeleteExpression(expression: DeleteExpression): Unit = js.native
  
  /* private */ def emitDetachedComments(list: Any): Any = js.native
  
  def emitDoStatement(statement: DoStatement): Unit = js.native
  
  /* private */ def emitDottedNameMemberAccessExpression(expression: Any): Any = js.native
  
  /* private */ def emitDottedNameMemberAccessExpressionRecurse(expression: Any): Any = js.native
  
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
  
  /* private */ def emitFunctionBodyStatements(name: Any, funcDecl: Any, parameterList: Any, block: Any, bodyExpression: Any): Any = js.native
  
  def emitFunctionDeclaration(declaration: FunctionDeclaration): Unit = js.native
  
  def emitFunctionExpression(funcDecl: FunctionExpression): Unit = js.native
  
  /* private */ def emitFunctionParameters(parameters: Any): Any = js.native
  
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
  def emitList(list: ISyntaxList2, useNewLineSeparator: Boolean, startInclusive: Unit, endExclusive: Double): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Unit, startInclusive: Double): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Unit, startInclusive: Double, endExclusive: Double): Unit = js.native
  def emitList(list: ISyntaxList2, useNewLineSeparator: Unit, startInclusive: Unit, endExclusive: Double): Unit = js.native
  
  def emitLiteralExpression(expression: LiteralExpression): Unit = js.native
  
  def emitMemberAccessExpression(expression: MemberAccessExpression): Unit = js.native
  
  /* private */ def emitMemberVariableDeclaration(varDecl: Any): Any = js.native
  
  /* private */ def emitModuleDeclaration(declaration: Any): Any = js.native
  
  /* private */ def emitModuleDeclarationWorker(moduleDecl: Any): Any = js.native
  
  def emitName(name: Identifier, addThis: Boolean): Unit = js.native
  
  def emitNumericLiteral(literal: NumericLiteral): Unit = js.native
  
  def emitObjectCreationExpression(objectCreationExpression: ObjectCreationExpression): Unit = js.native
  
  def emitObjectLiteralExpression(objectLiteral: ObjectLiteralExpression): Unit = js.native
  
  var emitOptions: EmitOptions = js.native
  
  def emitParameter(parameter: Parameter): Unit = js.native
  
  /* private */ def emitParameterList(list: Any): Any = js.native
  
  /* private */ def emitParameterPropertyAndMemberVariableAssignments(): Any = js.native
  
  def emitParenthesizedArrowFunctionExpression(arrowFunction: ParenthesizedArrowFunctionExpression): Unit = js.native
  
  def emitParenthesizedExpression(parenthesizedExpression: ParenthesizedExpression): Unit = js.native
  
  /* private */ def emitPossibleCopyrightHeaders(script: Any): Any = js.native
  
  def emitPostfixUnaryExpression(expression: PostfixUnaryExpression): Unit = js.native
  
  def emitPrefixUnaryExpression(expression: PrefixUnaryExpression): Unit = js.native
  
  def emitPrologue(sourceUnit: SourceUnit): Unit = js.native
  
  def emitQualifiedName(name: QualifiedName): Unit = js.native
  
  def emitRegularExpressionLiteral(literal: RegularExpressionLiteral): Unit = js.native
  
  /* private */ def emitRestParameterInitializer(parameters: Any): Any = js.native
  
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
  def emitSeparatedList(
    list: ISeparatedSyntaxList2,
    useNewLineSeparator: Boolean,
    startInclusive: Unit,
    endExclusive: Double
  ): Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: Unit, startInclusive: Double): Unit = js.native
  def emitSeparatedList(
    list: ISeparatedSyntaxList2,
    useNewLineSeparator: Unit,
    startInclusive: Double,
    endExclusive: Double
  ): Unit = js.native
  def emitSeparatedList(list: ISeparatedSyntaxList2, useNewLineSeparator: Unit, startInclusive: Unit, endExclusive: Double): Unit = js.native
  
  def emitSetAccessor(accessor: SetAccessor): Unit = js.native
  
  def emitSimpleArrowFunctionExpression(arrowFunction: SimpleArrowFunctionExpression): Unit = js.native
  
  def emitSimplePropertyAssignment(property: SimplePropertyAssignment): Unit = js.native
  
  def emitSingleModuleDeclaration(moduleDecl: ModuleDeclaration, moduleName: IASTToken): Unit = js.native
  
  /* private */ def emitSourceUnit(sourceUnit: Any): Any = js.native
  
  def emitSpaceBetweenConstructs(node1: AST, node2: AST): Unit = js.native
  
  var emitState: EmitState = js.native
  
  def emitStringLiteral(literal: StringLiteral): Unit = js.native
  
  def emitSuperExpression(expression: SuperExpression): Unit = js.native
  
  /* private */ def emitSwitchClauseBody(body: Any): Any = js.native
  
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
  
  /* private */ def emitWorker(ast: Any): Any = js.native
  
  var emittingFileName: String = js.native
  
  /* private */ var exportAssignment: Any = js.native
  
  var extendsPrologueEmitted: Boolean = js.native
  
  /* private */ def firstVariableDeclarator(statement: Any): Any = js.native
  
  def getConstantDecl(dotExpr: MemberAccessExpression): PullEnumElementDecl = js.native
  
  /* private */ def getDetachedComments(element: Any): Any = js.native
  
  /* private */ def getEnclosingDecl(): Any = js.native
  
  def getExportAssignment(): ExportAssignment = js.native
  
  /* private */ def getImportDecls(fileName: Any): Any = js.native
  
  /* private */ def getIndentString(): Any = js.native
  
  /* private */ def getModuleDeclToVerifyChildNameCollision(moduleDecl: Any, changeNameIfAnyDeclarationInContext: Any): Any = js.native
  
  def getModuleImportAndDependencyList(sourceUnit: SourceUnit): DependencyList = js.native
  
  /* private */ def getModuleName(moduleDecl: Any, changeNameIfAnyDeclarationInContext: Any): Any = js.native
  
  def getOutputFiles(): js.Array[OutputFile] = js.native
  
  /* private */ def getSymbolForEmit(ast: Any): Any = js.native
  
  var globalThisCapturePrologueEmitted: Boolean = js.native
  
  /* private */ def hasChildNameCollision(moduleName: Any, parentDecl: Any): Any = js.native
  
  var inArrowFunction: Boolean = js.native
  
  /* private */ var inWithBlock: Any = js.native
  
  var indenter: Indenter = js.native
  
  /* private */ def isDirectivePrologueElement(node: Any): Any = js.native
  
  /* private */ def isNotAmbientOrHasInitializer(variableStatement: Any): Any = js.native
  
  /* private */ def isOnSameLine(pos1: Any, pos2: Any): Any = js.native
  
  /* private */ def isPinnedOrTripleSlash(comment: Any): Any = js.native
  
  var moduleName: String = js.native
  
  var outfile: TextWriter = js.native
  
  /* private */ def popDecl(decl: Any): Any = js.native
  
  /* private */ def pushDecl(decl: Any): Any = js.native
  
  def recordSourceMappingEnd(ast: IASTSpan): Unit = js.native
  
  def recordSourceMappingNameEnd(): Unit = js.native
  
  def recordSourceMappingNameStart(name: String): Unit = js.native
  
  def recordSourceMappingStart(ast: IASTSpan): Unit = js.native
  
  /* private */ def requiresExtendsBlock(moduleElements: Any): Any = js.native
  
  /* private */ var semanticInfoChain: Any = js.native
  
  def setContainer(c: Double): Double = js.native
  
  def setDocument(document: Document): Unit = js.native
  
  def setExportAssignment(exportAssignment: ExportAssignment): Unit = js.native
  
  def setSourceMapperNewSourceFile(document: Document): Unit = js.native
  
  def shouldCaptureThis(ast: AST): Boolean = js.native
  
  /* private */ def shouldEmit(ast: Any): Any = js.native
  
  def shouldEmitClassDeclaration(declaration: ClassDeclaration): Boolean = js.native
  
  def shouldEmitEnumDeclaration(declaration: EnumDeclaration): Boolean = js.native
  
  def shouldEmitFunctionDeclaration(declaration: FunctionDeclaration): Boolean = js.native
  
  def shouldEmitImportDeclaration(importDeclAST: ImportDeclaration): Boolean = js.native
  
  def shouldEmitInterfaceDeclaration(declaration: InterfaceDeclaration): Boolean = js.native
  
  def shouldEmitModuleDeclaration(declaration: ModuleDeclaration): Boolean = js.native
  
  def shouldEmitVariableStatement(statement: VariableStatement): Boolean = js.native
  
  /* private */ def shouldQualifySymbolNameWithParentName(symbol: Any): Any = js.native
  
  var sourceMapper: SourceMapper = js.native
  
  /* private */ def symbolIsUsedInItsEnclosingContainer(symbol: Any, dynamic: Any): Any = js.native
  
  var thisClassNode: ClassDeclaration = js.native
  
  def tryEmitConstant(dotExpr: MemberAccessExpression): Boolean = js.native
  
  /* private */ def updateLineAndColumn(s: Any): Any = js.native
  
  def writeCaptureThisStatement(ast: AST): Unit = js.native
  
  def writeLineToOutput(s: String): Unit = js.native
  def writeLineToOutput(s: String, force: Boolean): Unit = js.native
  
  def writeToOutput(s: String): Unit = js.native
  
  def writeToOutputWithSourceMapRecord(s: String, astSpan: IASTSpan): Unit = js.native
}
