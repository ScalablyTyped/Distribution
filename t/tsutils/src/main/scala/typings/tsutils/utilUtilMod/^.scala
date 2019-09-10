package typings.tsutils.utilUtilMod

import typings.tsutils.Anon_Name
import typings.tsutils.tsutilsStrings.BACKSLASHn
import typings.tsutils.tsutilsStrings.BACKSLASHrBACKSLASHn
import typings.tsutils.tsutilsStrings.stripInternal
import typings.tsutils.utilConvertDashAstMod.NodeWrap
import typings.typescript.typescriptMod.ArrowFunction
import typings.typescript.typescriptMod.AssertionExpression
import typings.typescript.typescriptMod.BindingElement
import typings.typescript.typescriptMod.BindingPattern
import typings.typescript.typescriptMod.CallExpression
import typings.typescript.typescriptMod.CheckJsDirective
import typings.typescript.typescriptMod.ClassElement
import typings.typescript.typescriptMod.CommentRange
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.FunctionExpression
import typings.typescript.typescriptMod.JSDoc
import typings.typescript.typescriptMod.Modifier
import typings.typescript.typescriptMod.ModifierFlags
import typings.typescript.typescriptMod.ModifiersArray
import typings.typescript.typescriptMod.ModuleDeclaration
import typings.typescript.typescriptMod.NoSubstitutionTemplateLiteral
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeFlags
import typings.typescript.typescriptMod.ObjectFlags
import typings.typescript.typescriptMod.ObjectType
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.ScriptTarget
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.Statement
import typings.typescript.typescriptMod.StringLiteral
import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.SymbolFlags
import typings.typescript.typescriptMod.SyntaxKind
import typings.typescript.typescriptMod.Token
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeChecker
import typings.typescript.typescriptMod.TypeFlags
import typings.typescript.typescriptMod.VariableDeclaration
import typings.typescript.typescriptMod.VariableDeclarationList
import typings.typescript.typescriptMod.__String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = js.native
  def commentText(sourceText: String, comment: CommentRange): String = js.native
  def findImportLikeNodes(sourceFile: SourceFile, kinds: ImportKind): js.Array[ImportLike] = js.native
  def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[StringLiteral | NoSubstitutionTemplateLiteral] = js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback, sourceFile: SourceFile): Unit = js.native
  def forEachDeclaredVariable[T](
    declarationList: VariableDeclarationList,
    cb: js.Function1[/* element */ (VariableDeclaration | BindingElement) with Anon_Name, T]
  ): js.UndefOr[T] = js.native
  def forEachDestructuringIdentifier[T](pattern: BindingPattern, fn: js.Function1[/* element */ BindingElement with Anon_Name, T]): js.UndefOr[T] = js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit]): Unit = js.native
  def forEachToken(node: Node, cb: js.Function1[/* node */ Node, Unit], sourceFile: SourceFile): Unit = js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback): Unit = js.native
  def forEachTokenWithTrivia(node: Node, cb: ForEachTokenCallback, sourceFile: SourceFile): Unit = js.native
  def getAccessKind(node: Node): AccessKind = js.native
  def getCheckJsDirective(source: String): js.UndefOr[CheckJsDirective] = js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
  def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = js.native
  def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = js.native
  def getJsDoc(node: Node): js.Array[JSDoc] = js.native
  def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  def getLateBoundPropertyNames(node: Expression, checker: TypeChecker): LateBoundPropertyNames = js.native
  def getLateBoundPropertyNamesOfPropertyName(node: typings.typescript.typescriptMod.PropertyName, checker: TypeChecker): LateBoundPropertyNames = js.native
  def getLineBreakStyle(sourceFile: SourceFile): BACKSLASHn | BACKSLASHrBACKSLASHn = js.native
  def getLineRanges(sourceFile: SourceFile): js.Array[LineRange] = js.native
  @JSName("getModifier")
  def getModifier_kind(
    node: Node,
    kind: /* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any
  ): js.UndefOr[Modifier] = js.native
  def getNextStatement(statement: Statement): js.UndefOr[Statement] = js.native
  def getNextToken(node: Node): js.UndefOr[Node] = js.native
  def getNextToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getPreviousStatement(statement: Statement): js.UndefOr[Statement] = js.native
  def getPreviousToken(node: Node): js.UndefOr[Node] = js.native
  def getPreviousToken(node: Node, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getPropertyName(propertyName: typings.typescript.typescriptMod.PropertyName): js.UndefOr[String] = js.native
  def getPropertyNameOfWellKnownSymbol(node: WellKnownSymbolLiteral): PropertyName = js.native
  def getSingleLateBoundPropertyNameOfPropertyName(node: typings.typescript.typescriptMod.PropertyName, checker: TypeChecker): js.UndefOr[PropertyName] = js.native
  def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile, allowJsDoc: Boolean): js.UndefOr[Node] = js.native
  def getVariableDeclarationKind(declarationList: VariableDeclarationList): VariableDeclarationKind = js.native
  def getWrappedNodeAtPosition(wrap: NodeWrap, pos: Double): js.UndefOr[NodeWrap] = js.native
  def hasAccessModifier(node: ClassElement): Boolean = js.native
  def hasAccessModifier(node: ParameterDeclaration): Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    kinds: (/* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    modifiers: ModifiersArray,
    kinds: (/* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): Boolean = js.native
  def hasOwnThisReference(node: Node): Boolean = js.native
  def hasSideEffects(node: Expression): Boolean = js.native
  def hasSideEffects(node: Expression, options: SideEffectOptions): Boolean = js.native
  def isAmbientModule(node: ModuleDeclaration): Boolean = js.native
  def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  def isAssignmentKind(kind: SyntaxKind): Boolean = js.native
  def isBindableObjectDefinePropertyCall(node: CallExpression): Boolean = js.native
  def isBlockScopeBoundary(node: Node): ScopeBoundary = js.native
  def isBlockScopedDeclarationStatement(statement: Statement): /* is typescript.typescript.DeclarationStatement */ Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = js.native
  def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = js.native
  def isConstAssertion(node: AssertionExpression): Boolean = js.native
  def isExpressionValueUsed(node: Expression): Boolean = js.native
  def isFunctionScopeBoundary(node: Node): ScopeBoundary = js.native
  def isFunctionWithBody(node: Node): Boolean = js.native
  def isInConstContext(node: Expression): Boolean = js.native
  def isInSingleStatementContext(statement: Statement): Boolean = js.native
  def isJsDocKind(kind: SyntaxKind): Boolean = js.native
  def isKeywordKind(kind: SyntaxKind): Boolean = js.native
  def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = js.native
  def isNodeKind(kind: SyntaxKind): Boolean = js.native
  def isNumericPropertyName(name: String): Boolean = js.native
  def isNumericPropertyName(name: __String): Boolean = js.native
  def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = js.native
  def isParameterProperty(node: ParameterDeclaration): Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
  def isReadonlyAssignmentDeclaration(node: CallExpression, checker: TypeChecker): Boolean = js.native
  def isReassignmentTarget(node: Expression): Boolean = js.native
  def isSameLine(sourceFile: SourceFile, pos1: Double, pos2: Double): Boolean = js.native
  def isScopeBoundary(node: Node): ScopeBoundary = js.native
  def isStatementInAmbientContext(node: Statement): Boolean = js.native
  def isStrictCompilerOptionEnabled(options: CompilerOptions, option: StrictCompilerOption): Boolean = js.native
  def isSymbolFlagSet(symbol: Symbol, flag: SymbolFlags): Boolean = js.native
  def isThisParameter(parameter: ParameterDeclaration): Boolean = js.native
  def isTokenKind(kind: SyntaxKind): Boolean = js.native
  def isTypeFlagSet(`type`: Type, flag: TypeFlags): Boolean = js.native
  def isTypeNodeKind(kind: SyntaxKind): Boolean = js.native
  def isTypeScopeBoundary(node: Node): ScopeBoundary = js.native
  def isValidIdentifier(text: String): Boolean = js.native
  def isValidIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidJsxIdentifier(text: String): Boolean = js.native
  def isValidJsxIdentifier(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidNumericLiteral(text: String): Boolean = js.native
  def isValidNumericLiteral(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidPropertyAccess(text: String): Boolean = js.native
  def isValidPropertyAccess(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isValidPropertyName(text: String): Boolean = js.native
  def isValidPropertyName(text: String, languageVersion: ScriptTarget): Boolean = js.native
  def isWellKnownSymbolLiterally(node: Expression): /* is tsutils.tsutils/util/util.WellKnownSymbolLiteral */ Boolean = js.native
  def parseJsDocOfNode(node: Node): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
  def unwrapParentheses(node: Expression): Expression = js.native
}

