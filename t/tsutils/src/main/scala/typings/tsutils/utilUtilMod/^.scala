package typings.tsutils.utilUtilMod

import typings.tsutils.Anon_Name
import typings.tsutils.tsutilsStrings.BACKSLASHn
import typings.tsutils.tsutilsStrings.BACKSLASHrBACKSLASHn
import typings.tsutils.tsutilsStrings.stripInternal
import typings.tsutils.utilControlDashFlowMod.ControlFlowEnd
import typings.tsutils.utilConvertDashAstMod.NodeWrap
import typings.typescript.typescriptMod.ArrowFunction
import typings.typescript.typescriptMod.BindingElement
import typings.typescript.typescriptMod.BindingPattern
import typings.typescript.typescriptMod.BlockLike
import typings.typescript.typescriptMod.CallExpression
import typings.typescript.typescriptMod.ClassElement
import typings.typescript.typescriptMod.CommentRange
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Declaration
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.FunctionExpression
import typings.typescript.typescriptMod.Identifier
import typings.typescript.typescriptMod.JSDoc
import typings.typescript.typescriptMod.LiteralExpression
import typings.typescript.typescriptMod.Modifier
import typings.typescript.typescriptMod.ModifierFlags
import typings.typescript.typescriptMod.ModifiersArray
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeFlags
import typings.typescript.typescriptMod.ObjectFlags
import typings.typescript.typescriptMod.ObjectType
import typings.typescript.typescriptMod.ParameterDeclaration
import typings.typescript.typescriptMod.PropertyName
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.Statement
import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.SymbolFlags
import typings.typescript.typescriptMod.SyntaxKind
import typings.typescript.typescriptMod.Token
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeFlags
import typings.typescript.typescriptMod.VariableDeclaration
import typings.typescript.typescriptMod.VariableDeclarationList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canHaveJsDoc(node: Node): /* is typescript.typescript.HasJSDoc */ Boolean = js.native
  def endsControlFlow(statement: BlockLike): Boolean = js.native
  def endsControlFlow(statement: Statement): Boolean = js.native
  def findImports(sourceFile: SourceFile, kinds: ImportKind): js.Array[LiteralExpression] = js.native
  def findImports(sourceFile: SourceFile, options: ImportOptions): js.Array[LiteralExpression] = js.native
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
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T): js.UndefOr[Token[T]] = js.native
  def getChildOfKind[T /* <: SyntaxKind */](node: Node, kind: T, sourceFile: SourceFile): js.UndefOr[Token[T]] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double): js.UndefOr[CommentRange] = js.native
  def getCommentAtPosition(sourceFile: SourceFile, pos: Double, parent: Node): js.UndefOr[CommentRange] = js.native
  def getControlFlowEnd(statement: BlockLike): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: BlockLike, label: Identifier): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: Statement): ControlFlowEnd = js.native
  def getControlFlowEnd(statement: Statement, label: Identifier): ControlFlowEnd = js.native
  def getDeclarationOfBindingElement(node: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
  def getIIFE(func: ArrowFunction): js.UndefOr[CallExpression] = js.native
  def getIIFE(func: FunctionExpression): js.UndefOr[CallExpression] = js.native
  def getIdentifierText(node: Identifier): String = js.native
  def getJsDoc(node: Node): js.Array[JSDoc] = js.native
  def getJsDoc(node: Node, sourceFile: SourceFile): js.Array[JSDoc] = js.native
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
  def getPropertyName(propertyName: PropertyName): js.UndefOr[String] = js.native
  def getTokenAtPosition(parent: Node, pos: Double): js.UndefOr[Node] = js.native
  def getTokenAtPosition(parent: Node, pos: Double, sourceFile: SourceFile): js.UndefOr[Node] = js.native
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
  def isAmbientModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = js.native
  def isAssignmentKind(kind: SyntaxKind): Boolean = js.native
  def isBlockScopeBoundary(node: Node): Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: VariableDeclaration): Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: VariableDeclarationList): Boolean = js.native
  def isCompilerOptionEnabled(options: CompilerOptions, option: BooleanCompilerOptions): Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(options: CompilerOptions, option: stripInternal): Boolean = js.native
  def isExpressionValueUsed(node: Expression): Boolean = js.native
  def isFunctionScopeBoundary(node: Node): Boolean = js.native
  def isFunctionWithBody(node: Node): /* is typescript.typescript.FunctionLikeDeclaration */ Boolean = js.native
  def isJsDocKind(kind: SyntaxKind): Boolean = js.native
  def isModfierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  def isModifierFlagSet(node: Declaration, flag: ModifierFlags): Boolean = js.native
  def isModifierFlagSet(node: Node, flag: ModifierFlags): Boolean = js.native
  def isNodeFlagSet(node: Node, flag: NodeFlags): Boolean = js.native
  def isNodeKind(kind: SyntaxKind): Boolean = js.native
  def isObjectFlagSet(objectType: ObjectType, flag: ObjectFlags): Boolean = js.native
  def isParameterProperty(node: ParameterDeclaration): Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double): Boolean = js.native
  def isPositionInComment(sourceFile: SourceFile, pos: Double, parent: Node): Boolean = js.native
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
  def isValidIdentifier(text: String): Boolean = js.native
  def isValidNumericLiteral(text: String): Boolean = js.native
  def isValidPropertyAccess(text: String): Boolean = js.native
  def isValidPropertyName(text: String): Boolean = js.native
  def parseJsDocOfNode(node: Node): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean): js.Array[JSDoc] = js.native
  def parseJsDocOfNode(node: Node, considerTrailingComments: Boolean, sourceFile: SourceFile): js.Array[JSDoc] = js.native
}

