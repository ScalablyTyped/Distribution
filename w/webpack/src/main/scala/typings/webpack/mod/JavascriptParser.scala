package typings.webpack.mod

import typings.estree.mod.ArrayExpression
import typings.estree.mod.ArrowFunctionExpression
import typings.estree.mod.AssignmentExpression
import typings.estree.mod.AwaitExpression
import typings.estree.mod.BigIntLiteral
import typings.estree.mod.BinaryExpression
import typings.estree.mod.BlockStatement
import typings.estree.mod.BreakStatement
import typings.estree.mod.ChainExpression
import typings.estree.mod.ClassDeclaration
import typings.estree.mod.ClassExpression
import typings.estree.mod.ConditionalExpression
import typings.estree.mod.ContinueStatement
import typings.estree.mod.DebuggerStatement
import typings.estree.mod.DoWhileStatement
import typings.estree.mod.EmptyStatement
import typings.estree.mod.ExpressionStatement
import typings.estree.mod.ForInStatement
import typings.estree.mod.ForOfStatement
import typings.estree.mod.ForStatement
import typings.estree.mod.FunctionDeclaration
import typings.estree.mod.FunctionExpression
import typings.estree.mod.Identifier
import typings.estree.mod.IfStatement
import typings.estree.mod.ImportExpression
import typings.estree.mod.LabeledStatement
import typings.estree.mod.LogicalExpression
import typings.estree.mod.MemberExpression
import typings.estree.mod.MetaProperty
import typings.estree.mod.NewExpression
import typings.estree.mod.ObjectExpression
import typings.estree.mod.PrivateIdentifier
import typings.estree.mod.RegExpLiteral
import typings.estree.mod.ReturnStatement
import typings.estree.mod.SequenceExpression
import typings.estree.mod.SimpleCallExpression
import typings.estree.mod.SimpleLiteral
import typings.estree.mod.StaticBlock
import typings.estree.mod.SwitchStatement
import typings.estree.mod.TaggedTemplateExpression
import typings.estree.mod.TemplateLiteral
import typings.estree.mod.ThisExpression
import typings.estree.mod.ThrowStatement
import typings.estree.mod.TryStatement
import typings.estree.mod.UnaryExpression
import typings.estree.mod.UpdateExpression
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.WhileStatement
import typings.estree.mod.WithStatement
import typings.estree.mod.YieldExpression
import typings.tapable.mod.AsArray
import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.anon.Errors
import typings.webpack.anon.GetMembers
import typings.webpack.anon.Members
import typings.webpack.anon.Name
import typings.webpack.anon.Options
import typings.webpack.anon.ReadonlyevaluateTypeofHoo
import typings.webpack.webpackStrings.auto
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JavascriptParser extends Parser {
  
  def blockPreWalkClassDeclaration(): Unit = js.native
  def blockPreWalkClassDeclaration(statement: Any): Unit = js.native
  
  def blockPreWalkExportAllDeclaration(): Unit = js.native
  def blockPreWalkExportAllDeclaration(statement: Any): Unit = js.native
  
  def blockPreWalkExportDefaultDeclaration(): Unit = js.native
  def blockPreWalkExportDefaultDeclaration(statement: Any): Unit = js.native
  
  def blockPreWalkExportNamedDeclaration(): Unit = js.native
  def blockPreWalkExportNamedDeclaration(statement: Any): Unit = js.native
  
  def blockPreWalkImportDeclaration(): Unit = js.native
  def blockPreWalkImportDeclaration(statement: Any): Unit = js.native
  
  def blockPreWalkStatement(): Unit = js.native
  def blockPreWalkStatement(statement: Any): Unit = js.native
  
  def blockPreWalkStatements(): Unit = js.native
  def blockPreWalkStatements(statements: Any): Unit = js.native
  
  def blockPreWalkVariableDeclaration(): Unit = js.native
  def blockPreWalkVariableDeclaration(statement: Any): Unit = js.native
  
  def callHooksForExpression(hookMap: Any, expr: Any, args: Any*): Any = js.native
  
  def callHooksForExpressionWithFallback[T, R](
    hookMap: HookMap[SyncBailHook[T, R, UnsetAdditionalOptions]],
    expr: MemberExpression,
    fallback: js.Function3[
      /* arg0 */ String, 
      /* arg1 */ String | ScopeInfo | VariableInfo, 
      /* arg2 */ js.Function0[js.Array[String]], 
      Any
    ],
    defined: js.Function1[/* arg0 */ String, Any],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
  ): R = js.native
  
  def callHooksForInfo[T, R](
    hookMap: HookMap[SyncBailHook[T, R, UnsetAdditionalOptions]],
    info: ExportedVariableInfo,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
  ): R = js.native
  
  def callHooksForInfoWithFallback[T, R](
    hookMap: HookMap[SyncBailHook[T, R, UnsetAdditionalOptions]],
    info: ExportedVariableInfo,
    fallback: js.Function1[/* arg0 */ String, Any],
    defined: js.Function0[Any],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
  ): R = js.native
  
  def callHooksForName[T, R](
    hookMap: HookMap[SyncBailHook[T, R, UnsetAdditionalOptions]],
    name: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
  ): R = js.native
  
  def callHooksForNameWithFallback[T, R](
    hookMap: HookMap[SyncBailHook[T, R, UnsetAdditionalOptions]],
    name: String,
    fallback: js.Function1[/* arg0 */ String, Any],
    defined: js.Function0[Any],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
  ): R = js.native
  
  var comments: Any = js.native
  
  var currentTagData: Any = js.native
  
  def defineVariable(): Unit = js.native
  def defineVariable(name: Any): Unit = js.native
  
  def detectMode(): Unit = js.native
  def detectMode(statements: Any): Unit = js.native
  
  def enterArrayPattern(): Unit = js.native
  def enterArrayPattern(pattern: Any): Unit = js.native
  def enterArrayPattern(pattern: Any, onIdent: Any): Unit = js.native
  def enterArrayPattern(pattern: Unit, onIdent: Any): Unit = js.native
  
  def enterAssignmentPattern(): Unit = js.native
  def enterAssignmentPattern(pattern: Any): Unit = js.native
  def enterAssignmentPattern(pattern: Any, onIdent: Any): Unit = js.native
  def enterAssignmentPattern(pattern: Unit, onIdent: Any): Unit = js.native
  
  def enterDeclaration(): Unit = js.native
  def enterDeclaration(declaration: Any): Unit = js.native
  def enterDeclaration(declaration: Any, onIdent: Any): Unit = js.native
  def enterDeclaration(declaration: Unit, onIdent: Any): Unit = js.native
  
  def enterIdentifier(): Unit = js.native
  def enterIdentifier(pattern: Any): Unit = js.native
  def enterIdentifier(pattern: Any, onIdent: Any): Unit = js.native
  def enterIdentifier(pattern: Unit, onIdent: Any): Unit = js.native
  
  def enterObjectPattern(): Unit = js.native
  def enterObjectPattern(pattern: Any): Unit = js.native
  def enterObjectPattern(pattern: Any, onIdent: Any): Unit = js.native
  def enterObjectPattern(pattern: Unit, onIdent: Any): Unit = js.native
  
  def enterPattern(): Unit = js.native
  def enterPattern(pattern: Any): Unit = js.native
  def enterPattern(pattern: Any, onIdent: Any): Unit = js.native
  def enterPattern(pattern: Unit, onIdent: Any): Unit = js.native
  
  def enterPatterns(): Unit = js.native
  def enterPatterns(patterns: Any): Unit = js.native
  def enterPatterns(patterns: Any, onIdent: Any): Unit = js.native
  def enterPatterns(patterns: Unit, onIdent: Any): Unit = js.native
  
  def enterRestElement(): Unit = js.native
  def enterRestElement(pattern: Any): Unit = js.native
  def enterRestElement(pattern: Any, onIdent: Any): Unit = js.native
  def enterRestElement(pattern: Unit, onIdent: Any): Unit = js.native
  
  def evaluate(source: String): BasicEvaluatedExpression = js.native
  
  def evaluateExpression(expression: Expression): BasicEvaluatedExpression = js.native
  
  def evaluatedVariable(): VariableInfo = js.native
  def evaluatedVariable(tagInfo: Any): VariableInfo = js.native
  
  def extractMemberExpressionChain(expression: MemberExpression): Members = js.native
  
  def getComments(): js.Array[Any] = js.native
  def getComments(range: Any): js.Array[Any] = js.native
  
  def getFreeInfoFromVariable(varName: String): Name = js.native
  
  def getMemberExpressionInfo(expression: MemberExpression, allowedTypes: Double): js.UndefOr[CallExpressionInfo | ExpressionExpressionInfo] = js.native
  
  def getNameForExpression(expression: MemberExpression): GetMembers = js.native
  
  def getRenameIdentifier(): js.UndefOr[String | VariableInfoInterface] = js.native
  def getRenameIdentifier(expr: Any): js.UndefOr[String | VariableInfoInterface] = js.native
  
  def getTagData(): Any = js.native
  def getTagData(name: Any): Any = js.native
  def getTagData(name: Any, tag: Any): Any = js.native
  def getTagData(name: Unit, tag: Any): Any = js.native
  
  def getVariableInfo(name: String): ExportedVariableInfo = js.native
  
  var hooks: ReadonlyevaluateTypeofHoo = js.native
  
  def inBlockScope(): Unit = js.native
  def inBlockScope(fn: Any): Unit = js.native
  
  def inFunctionScope(): Unit = js.native
  def inFunctionScope(hasThis: Any): Unit = js.native
  def inFunctionScope(hasThis: Any, params: Any): Unit = js.native
  def inFunctionScope(hasThis: Any, params: Any, fn: Any): Unit = js.native
  def inFunctionScope(hasThis: Any, params: Unit, fn: Any): Unit = js.native
  def inFunctionScope(hasThis: Unit, params: Any): Unit = js.native
  def inFunctionScope(hasThis: Unit, params: Any, fn: Any): Unit = js.native
  def inFunctionScope(hasThis: Unit, params: Unit, fn: Any): Unit = js.native
  
  def inScope(params: Any, fn: js.Function0[Unit]): Unit = js.native
  
  def isAsiPosition(pos: Double): Boolean = js.native
  
  def isPure(expr: Null, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: Unit, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ArrayExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ArrowFunctionExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: AssignmentExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: AwaitExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: BigIntLiteral, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: BinaryExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ChainExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ClassDeclaration, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ClassExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ConditionalExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: FunctionDeclaration, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: FunctionExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: Identifier, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ImportExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: LogicalExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: MemberExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: MetaProperty, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: NewExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ObjectExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: PrivateIdentifier, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: RegExpLiteral, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: SequenceExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: SimpleCallExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: SimpleLiteral, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: TaggedTemplateExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: TemplateLiteral, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: ThisExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: UnaryExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: UpdateExpression, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: VariableDeclaration, commentsStartPos: Double): Boolean = js.native
  def isPure(expr: YieldExpression, commentsStartPos: Double): Boolean = js.native
  
  def isStatementLevelExpression(): Boolean = js.native
  def isStatementLevelExpression(expr: Any): Boolean = js.native
  
  def isVariableDefined(): Boolean = js.native
  def isVariableDefined(name: Any): Boolean = js.native
  
  def parseCalculatedString(): Any = js.native
  def parseCalculatedString(expression: Any): Any = js.native
  
  def parseCommentOptions(): Errors | Options = js.native
  def parseCommentOptions(range: Any): Errors | Options = js.native
  
  def parseString(): Any = js.native
  def parseString(expression: Any): Any = js.native
  
  def preWalkBlockStatement(): Unit = js.native
  def preWalkBlockStatement(statement: Any): Unit = js.native
  
  def preWalkCatchClause(): Unit = js.native
  def preWalkCatchClause(catchClause: Any): Unit = js.native
  
  def preWalkDoWhileStatement(): Unit = js.native
  def preWalkDoWhileStatement(statement: Any): Unit = js.native
  
  def preWalkForInStatement(): Unit = js.native
  def preWalkForInStatement(statement: Any): Unit = js.native
  
  def preWalkForOfStatement(): Unit = js.native
  def preWalkForOfStatement(statement: Any): Unit = js.native
  
  def preWalkForStatement(): Unit = js.native
  def preWalkForStatement(statement: Any): Unit = js.native
  
  def preWalkFunctionDeclaration(): Unit = js.native
  def preWalkFunctionDeclaration(statement: Any): Unit = js.native
  
  def preWalkIfStatement(): Unit = js.native
  def preWalkIfStatement(statement: Any): Unit = js.native
  
  def preWalkLabeledStatement(): Unit = js.native
  def preWalkLabeledStatement(statement: Any): Unit = js.native
  
  def preWalkStatement(): Unit = js.native
  def preWalkStatement(statement: Any): Unit = js.native
  
  def preWalkStatements(): Unit = js.native
  def preWalkStatements(statements: Any): Unit = js.native
  
  def preWalkSwitchCases(): Unit = js.native
  def preWalkSwitchCases(switchCases: Any): Unit = js.native
  
  def preWalkSwitchStatement(): Unit = js.native
  def preWalkSwitchStatement(statement: Any): Unit = js.native
  
  def preWalkTryStatement(): Unit = js.native
  def preWalkTryStatement(statement: Any): Unit = js.native
  
  def preWalkVariableDeclaration(): Unit = js.native
  def preWalkVariableDeclaration(statement: Any): Unit = js.native
  
  def preWalkWhileStatement(): Unit = js.native
  def preWalkWhileStatement(statement: Any): Unit = js.native
  
  def preWalkWithStatement(): Unit = js.native
  def preWalkWithStatement(statement: Any): Unit = js.native
  
  var prevStatement: Any = js.native
  
  var scope: ScopeInfo = js.native
  
  var semicolons: Any = js.native
  
  def setVariable(name: String, variableInfo: ExportedVariableInfo): Unit = js.native
  
  var sourceType: module | auto | script = js.native
  
  var state: ParserState = js.native
  
  var statementPath: js.Array[
    UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement
  ] = js.native
  
  def tagVariable(): Unit = js.native
  def tagVariable(name: Any): Unit = js.native
  def tagVariable(name: Any, tag: Any): Unit = js.native
  def tagVariable(name: Any, tag: Any, data: Any): Unit = js.native
  def tagVariable(name: Any, tag: Unit, data: Any): Unit = js.native
  def tagVariable(name: Unit, tag: Any): Unit = js.native
  def tagVariable(name: Unit, tag: Any, data: Any): Unit = js.native
  def tagVariable(name: Unit, tag: Unit, data: Any): Unit = js.native
  
  def undefineVariable(): Unit = js.native
  def undefineVariable(name: Any): Unit = js.native
  
  def unsetAsiPosition(pos: Double): Unit = js.native
  
  def walkArrayExpression(): Unit = js.native
  def walkArrayExpression(expression: Any): Unit = js.native
  
  def walkArrayPattern(): Unit = js.native
  def walkArrayPattern(pattern: Any): Unit = js.native
  
  def walkArrowFunctionExpression(): Unit = js.native
  def walkArrowFunctionExpression(expression: Any): Unit = js.native
  
  def walkAssignmentExpression(): Unit = js.native
  def walkAssignmentExpression(expression: Any): Unit = js.native
  
  def walkAssignmentPattern(): Unit = js.native
  def walkAssignmentPattern(pattern: Any): Unit = js.native
  
  def walkAwaitExpression(): Unit = js.native
  def walkAwaitExpression(expression: Any): Unit = js.native
  
  def walkBinaryExpression(): Unit = js.native
  def walkBinaryExpression(expression: Any): Unit = js.native
  
  def walkBlockStatement(): Unit = js.native
  def walkBlockStatement(statement: Any): Unit = js.native
  
  def walkCallExpression(): Unit = js.native
  def walkCallExpression(expression: Any): Unit = js.native
  
  def walkCatchClause(): Unit = js.native
  def walkCatchClause(catchClause: Any): Unit = js.native
  
  def walkChainExpression(expression: ChainExpression): Unit = js.native
  
  def walkClass(classy: ClassDeclaration): Unit = js.native
  def walkClass(classy: ClassExpression): Unit = js.native
  
  def walkClassDeclaration(): Unit = js.native
  def walkClassDeclaration(statement: Any): Unit = js.native
  
  def walkClassExpression(): Unit = js.native
  def walkClassExpression(expression: Any): Unit = js.native
  
  def walkConditionalExpression(): Unit = js.native
  def walkConditionalExpression(expression: Any): Unit = js.native
  
  def walkDoWhileStatement(): Unit = js.native
  def walkDoWhileStatement(statement: Any): Unit = js.native
  
  def walkExportDefaultDeclaration(): Unit = js.native
  def walkExportDefaultDeclaration(statement: Any): Unit = js.native
  
  def walkExportNamedDeclaration(): Unit = js.native
  def walkExportNamedDeclaration(statement: Any): Unit = js.native
  
  def walkExpression(): Unit = js.native
  def walkExpression(expression: Any): Unit = js.native
  
  def walkExpressionStatement(): Unit = js.native
  def walkExpressionStatement(statement: Any): Unit = js.native
  
  def walkExpressions(): Unit = js.native
  def walkExpressions(expressions: Any): Unit = js.native
  
  def walkForInStatement(): Unit = js.native
  def walkForInStatement(statement: Any): Unit = js.native
  
  def walkForOfStatement(): Unit = js.native
  def walkForOfStatement(statement: Any): Unit = js.native
  
  def walkForStatement(): Unit = js.native
  def walkForStatement(statement: Any): Unit = js.native
  
  def walkFunctionDeclaration(): Unit = js.native
  def walkFunctionDeclaration(statement: Any): Unit = js.native
  
  def walkFunctionExpression(): Unit = js.native
  def walkFunctionExpression(expression: Any): Unit = js.native
  
  def walkIdentifier(): Unit = js.native
  def walkIdentifier(expression: Any): Unit = js.native
  
  def walkIfStatement(): Unit = js.native
  def walkIfStatement(statement: Any): Unit = js.native
  
  def walkImportExpression(): Unit = js.native
  def walkImportExpression(expression: Any): Unit = js.native
  
  def walkLabeledStatement(): Unit = js.native
  def walkLabeledStatement(statement: Any): Unit = js.native
  
  def walkLeftRightExpression(): Unit = js.native
  def walkLeftRightExpression(expression: Any): Unit = js.native
  
  def walkLogicalExpression(): Unit = js.native
  def walkLogicalExpression(expression: Any): Unit = js.native
  
  def walkMemberExpression(): Unit = js.native
  def walkMemberExpression(expression: Any): Unit = js.native
  
  def walkMemberExpressionWithExpressionName(): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Any, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Any, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Any, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Unit, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Unit, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Any, rootInfo: Unit, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Any, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Any, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Any, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Unit, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Unit, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Any, name: Unit, rootInfo: Unit, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Any, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Any, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Any, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Unit, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Unit, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Any, rootInfo: Unit, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Any, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Any, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Any, members: Unit, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Unit, members: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Unit, members: Any, onUnhandled: Any): Unit = js.native
  def walkMemberExpressionWithExpressionName(expression: Unit, name: Unit, rootInfo: Unit, members: Unit, onUnhandled: Any): Unit = js.native
  
  def walkMetaProperty(metaProperty: MetaProperty): Unit = js.native
  
  /**
  	 * Walks a statements that is nested within a parent statement
  	 * and can potentially be a non-block statement.
  	 * This enforces the nested statement to never be in ASI position.
  	 */
  def walkNestedStatement(statement: Statement): Unit = js.native
  
  def walkNewExpression(): Unit = js.native
  def walkNewExpression(expression: Any): Unit = js.native
  
  def walkObjectExpression(): Unit = js.native
  def walkObjectExpression(expression: Any): Unit = js.native
  
  def walkObjectPattern(): Unit = js.native
  def walkObjectPattern(pattern: Any): Unit = js.native
  
  def walkPattern(): Unit = js.native
  def walkPattern(pattern: Any): Unit = js.native
  
  def walkProperty(): Unit = js.native
  def walkProperty(prop: Any): Unit = js.native
  
  def walkRestElement(): Unit = js.native
  def walkRestElement(pattern: Any): Unit = js.native
  
  def walkReturnStatement(): Unit = js.native
  def walkReturnStatement(statement: Any): Unit = js.native
  
  def walkSequenceExpression(expression: SequenceExpression): Unit = js.native
  
  def walkSpreadElement(): Unit = js.native
  def walkSpreadElement(expression: Any): Unit = js.native
  
  def walkStatement(): Unit = js.native
  def walkStatement(statement: Any): Unit = js.native
  
  def walkStatements(): Unit = js.native
  def walkStatements(statements: Any): Unit = js.native
  
  def walkSwitchCases(): Unit = js.native
  def walkSwitchCases(switchCases: Any): Unit = js.native
  
  def walkSwitchStatement(): Unit = js.native
  def walkSwitchStatement(statement: Any): Unit = js.native
  
  def walkTaggedTemplateExpression(): Unit = js.native
  def walkTaggedTemplateExpression(expression: Any): Unit = js.native
  
  def walkTemplateLiteral(): Unit = js.native
  def walkTemplateLiteral(expression: Any): Unit = js.native
  
  def walkTerminatingStatement(): Unit = js.native
  def walkTerminatingStatement(statement: Any): Unit = js.native
  
  def walkThisExpression(): Unit = js.native
  def walkThisExpression(expression: Any): Unit = js.native
  
  def walkThrowStatement(): Unit = js.native
  def walkThrowStatement(statement: Any): Unit = js.native
  
  def walkTryStatement(): Unit = js.native
  def walkTryStatement(statement: Any): Unit = js.native
  
  def walkUnaryExpression(): Unit = js.native
  def walkUnaryExpression(expression: Any): Unit = js.native
  
  def walkUpdateExpression(): Unit = js.native
  def walkUpdateExpression(expression: Any): Unit = js.native
  
  def walkVariableDeclaration(): Unit = js.native
  def walkVariableDeclaration(statement: Any): Unit = js.native
  
  def walkWhileStatement(): Unit = js.native
  def walkWhileStatement(statement: Any): Unit = js.native
  
  def walkWithStatement(): Unit = js.native
  def walkWithStatement(statement: Any): Unit = js.native
  
  def walkYieldExpression(): Unit = js.native
  def walkYieldExpression(expression: Any): Unit = js.native
}
