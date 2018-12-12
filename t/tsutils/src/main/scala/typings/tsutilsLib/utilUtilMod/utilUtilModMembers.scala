package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/util", JSImport.Namespace)
@js.native
object utilUtilModMembers extends js.Object {
  def canHaveJsDoc(node: typescriptLib.typescriptMod.tsNs.Node): /* is HasJSDoc */scala.Boolean = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.BlockLike): scala.Boolean = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.Statement): scala.Boolean = js.native
  def findImports(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, kinds: ImportKind): js.Array[typescriptLib.typescriptMod.tsNs.LiteralExpression] = js.native
  def findImports(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, options: ImportOptions): js.Array[typescriptLib.typescriptMod.tsNs.LiteralExpression] = js.native
  def forEachComment(node: typescriptLib.typescriptMod.tsNs.Node, cb: ForEachCommentCallback): scala.Unit = js.native
  def forEachComment(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: ForEachCommentCallback,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): scala.Unit = js.native
  def forEachDeclaredVariable[T](
    declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList,
    cb: js.Function1[
      /* element */ (typescriptLib.typescriptMod.tsNs.VariableDeclaration | typescriptLib.typescriptMod.tsNs.BindingElement) with tsutilsLib.Anon_Name, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachDestructuringIdentifier[T](
    pattern: typescriptLib.typescriptMod.tsNs.BindingPattern,
    fn: js.Function1[
      /* element */ typescriptLib.typescriptMod.tsNs.BindingElement with tsutilsLib.Anon_Name, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Unit]
  ): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Unit],
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): scala.Unit = js.native
  def forEachTokenWithTrivia(node: typescriptLib.typescriptMod.tsNs.Node, cb: ForEachTokenCallback): scala.Unit = js.native
  def forEachTokenWithTrivia(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: ForEachTokenCallback,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): scala.Unit = js.native
  def getChildOfKind[T /* <: typescriptLib.typescriptMod.tsNs.SyntaxKind */](node: typescriptLib.typescriptMod.tsNs.Node, kind: T): js.UndefOr[typescriptLib.typescriptMod.tsNs.Token[T]] = js.native
  def getChildOfKind[T /* <: typescriptLib.typescriptMod.tsNs.SyntaxKind */](
    node: typescriptLib.typescriptMod.tsNs.Node,
    kind: T,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.Token[T]] = js.native
  def getCommentAtPosition(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, pos: scala.Double): js.UndefOr[typescriptLib.typescriptMod.tsNs.CommentRange] = js.native
  def getCommentAtPosition(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.tsNs.Node
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.CommentRange] = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.tsNs.BlockLike): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(
    statement: typescriptLib.typescriptMod.tsNs.BlockLike,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.tsNs.Statement): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(
    statement: typescriptLib.typescriptMod.tsNs.Statement,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getDeclarationOfBindingElement(node: typescriptLib.typescriptMod.tsNs.BindingElement): typescriptLib.typescriptMod.tsNs.VariableDeclaration | typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def getIIFE(func: typescriptLib.typescriptMod.tsNs.ArrowFunction): js.UndefOr[typescriptLib.typescriptMod.tsNs.CallExpression] = js.native
  def getIIFE(func: typescriptLib.typescriptMod.tsNs.FunctionExpression): js.UndefOr[typescriptLib.typescriptMod.tsNs.CallExpression] = js.native
  def getIdentifierText(node: typescriptLib.typescriptMod.tsNs.Identifier): java.lang.String = js.native
  def getJsDoc(node: typescriptLib.typescriptMod.tsNs.Node): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def getJsDoc(
    node: typescriptLib.typescriptMod.tsNs.Node,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def getLineBreakStyle(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): tsutilsLib.tsutilsLibStrings.BACKSLASHn | tsutilsLib.tsutilsLibStrings.BACKSLASHrBACKSLASHn = js.native
  def getLineRanges(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): js.Array[LineRange] = js.native
  def getModifier(node: typescriptLib.typescriptMod.tsNs.Node, kind: js.Any): js.UndefOr[typescriptLib.typescriptMod.tsNs.Modifier] = js.native
  def getNextStatement(statement: typescriptLib.typescriptMod.tsNs.Statement): js.UndefOr[typescriptLib.typescriptMod.tsNs.Statement] = js.native
  def getNextToken(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getNextToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getPreviousStatement(statement: typescriptLib.typescriptMod.tsNs.Statement): js.UndefOr[typescriptLib.typescriptMod.tsNs.Statement] = js.native
  def getPreviousToken(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getPreviousToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getPropertyName(propertyName: typescriptLib.typescriptMod.tsNs.PropertyName): js.UndefOr[java.lang.String] = js.native
  def getTokenAtPosition(parent: typescriptLib.typescriptMod.tsNs.Node, pos: scala.Double): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getTokenAtPosition(
    parent: typescriptLib.typescriptMod.tsNs.Node,
    pos: scala.Double,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getVariableDeclarationKind(declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList): VariableDeclarationKind = js.native
  def getWrappedNodeAtPosition(wrap: tsutilsLib.utilConvertDashAstMod.NodeWrap, pos: scala.Double): js.UndefOr[tsutilsLib.utilConvertDashAstMod.NodeWrap] = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.tsNs.ClassElement): scala.Boolean = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def hasModifier(kinds: js.Any*): scala.Boolean = js.native
  def hasModifier(modifiers: typescriptLib.typescriptMod.tsNs.ModifiersArray, kinds: js.Any*): scala.Boolean = js.native
  def hasOwnThisReference(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.tsNs.Expression, options: SideEffectOptions): scala.Boolean = js.native
  def isAmbientModuleBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is ModuleBlock */scala.Boolean = js.native
  def isAssignmentKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: typescriptLib.typescriptMod.tsNs.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList): scala.Boolean = js.native
  def isCompilerOptionEnabled(options: typescriptLib.typescriptMod.tsNs.CompilerOptions, option: BooleanCompilerOptions): scala.Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    option: tsutilsLib.tsutilsLibStrings.stripInternal
  ): scala.Boolean = js.native
  def isExpressionValueUsed(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def isFunctionScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isFunctionWithBody(node: typescriptLib.typescriptMod.tsNs.Node): /* is FunctionLikeDeclaration */scala.Boolean = js.native
  def isJsDocKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isModfierFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(
    node: typescriptLib.typescriptMod.tsNs.Declaration,
    flag: typescriptLib.typescriptMod.tsNs.ModifierFlags
  ): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.ModifierFlags): scala.Boolean = js.native
  def isNodeFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.NodeFlags): scala.Boolean = js.native
  def isNodeKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isObjectFlagSet(
    objectType: typescriptLib.typescriptMod.tsNs.ObjectType,
    flag: typescriptLib.typescriptMod.tsNs.ObjectFlags
  ): scala.Boolean = js.native
  def isParameterProperty(node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def isPositionInComment(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, pos: scala.Double): scala.Boolean = js.native
  def isPositionInComment(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.tsNs.Node
  ): scala.Boolean = js.native
  def isReassignmentTarget(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def isSameLine(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): ScopeBoundary = js.native
  def isStatementInAmbientContext(node: typescriptLib.typescriptMod.tsNs.Statement): scala.Boolean = js.native
  def isStrictCompilerOptionEnabled(options: typescriptLib.typescriptMod.tsNs.CompilerOptions, option: StrictCompilerOption): scala.Boolean = js.native
  def isSymbolFlagSet(
    symbol: typescriptLib.typescriptMod.tsNs.Symbol,
    flag: typescriptLib.typescriptMod.tsNs.SymbolFlags
  ): scala.Boolean = js.native
  def isThisParameter(parameter: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def isTokenKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isTypeFlagSet(`type`: typescriptLib.typescriptMod.tsNs.Type, flag: typescriptLib.typescriptMod.tsNs.TypeFlags): scala.Boolean = js.native
  def isTypeNodeKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isValidIdentifier(text: java.lang.String): scala.Boolean = js.native
  def isValidNumericLiteral(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyAccess(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyName(text: java.lang.String): scala.Boolean = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.tsNs.Node): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.tsNs.Node, considerTrailingComments: scala.Boolean): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def parseJsDocOfNode(
    node: typescriptLib.typescriptMod.tsNs.Node,
    considerTrailingComments: scala.Boolean,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
}

