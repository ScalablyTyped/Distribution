package typings
package tsutilsLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canHaveJsDoc(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.HasJSDoc */ scala.Boolean = js.native
  def collectVariableUsage(sourceFile: typescriptLib.typescriptMod.SourceFile): stdLib.Map[typescriptLib.typescriptMod.Identifier, tsutilsLib.utilUsageMod.VariableInfo] = js.native
  def convertAst(sourceFile: typescriptLib.typescriptMod.SourceFile): tsutilsLib.utilConvertDashAstMod.ConvertedAst = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.BlockLike): scala.Boolean = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.Statement): scala.Boolean = js.native
  def findImports(sourceFile: typescriptLib.typescriptMod.SourceFile, kinds: tsutilsLib.utilUtilMod.ImportKind): js.Array[typescriptLib.typescriptMod.LiteralExpression] = js.native
  def findImports(sourceFile: typescriptLib.typescriptMod.SourceFile, options: tsutilsLib.utilUtilMod.ImportOptions): js.Array[typescriptLib.typescriptMod.LiteralExpression] = js.native
  def forEachComment(node: typescriptLib.typescriptMod.Node, cb: tsutilsLib.utilUtilMod.ForEachCommentCallback): scala.Unit = js.native
  def forEachComment(
    node: typescriptLib.typescriptMod.Node,
    cb: tsutilsLib.utilUtilMod.ForEachCommentCallback,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): scala.Unit = js.native
  def forEachDeclaredVariable[T](
    declarationList: typescriptLib.typescriptMod.VariableDeclarationList,
    cb: js.Function1[
      /* element */ (typescriptLib.typescriptMod.VariableDeclaration | typescriptLib.typescriptMod.BindingElement) with tsutilsLib.Anon_Name, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachDestructuringIdentifier[T](
    pattern: typescriptLib.typescriptMod.BindingPattern,
    fn: js.Function1[
      /* element */ typescriptLib.typescriptMod.BindingElement with tsutilsLib.Anon_Name, 
      T
    ]
  ): js.UndefOr[T] = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.Node,
    cb: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.Node,
    cb: js.Function1[/* node */ typescriptLib.typescriptMod.Node, scala.Unit],
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): scala.Unit = js.native
  def forEachTokenWithTrivia(node: typescriptLib.typescriptMod.Node, cb: tsutilsLib.utilUtilMod.ForEachTokenCallback): scala.Unit = js.native
  def forEachTokenWithTrivia(
    node: typescriptLib.typescriptMod.Node,
    cb: tsutilsLib.utilUtilMod.ForEachTokenCallback,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): scala.Unit = js.native
  def getCallSignaturesOfType(`type`: typescriptLib.typescriptMod.Type): js.Array[typescriptLib.typescriptMod.Signature] = js.native
  def getChildOfKind[T /* <: typescriptLib.typescriptMod.SyntaxKind */](node: typescriptLib.typescriptMod.Node, kind: T): js.UndefOr[typescriptLib.typescriptMod.Token[T]] = js.native
  def getChildOfKind[T /* <: typescriptLib.typescriptMod.SyntaxKind */](
    node: typescriptLib.typescriptMod.Node,
    kind: T,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.Token[T]] = js.native
  def getCommentAtPosition(sourceFile: typescriptLib.typescriptMod.SourceFile, pos: scala.Double): js.UndefOr[typescriptLib.typescriptMod.CommentRange] = js.native
  def getCommentAtPosition(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.Node
  ): js.UndefOr[typescriptLib.typescriptMod.CommentRange] = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.BlockLike): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.BlockLike, label: typescriptLib.typescriptMod.Identifier): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.Statement): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getControlFlowEnd(statement: typescriptLib.typescriptMod.Statement, label: typescriptLib.typescriptMod.Identifier): tsutilsLib.utilControlDashFlowMod.ControlFlowEnd = js.native
  def getDeclarationDomain(node: typescriptLib.typescriptMod.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.DeclarationDomain] = js.native
  def getDeclarationOfBindingElement(node: typescriptLib.typescriptMod.BindingElement): typescriptLib.typescriptMod.VariableDeclaration | typescriptLib.typescriptMod.ParameterDeclaration = js.native
  def getIIFE(func: typescriptLib.typescriptMod.ArrowFunction): js.UndefOr[typescriptLib.typescriptMod.CallExpression] = js.native
  def getIIFE(func: typescriptLib.typescriptMod.FunctionExpression): js.UndefOr[typescriptLib.typescriptMod.CallExpression] = js.native
  def getIdentifierText(node: typescriptLib.typescriptMod.Identifier): java.lang.String = js.native
  def getJsDoc(node: typescriptLib.typescriptMod.Node): js.Array[typescriptLib.typescriptMod.JSDoc] = js.native
  def getJsDoc(node: typescriptLib.typescriptMod.Node, sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[typescriptLib.typescriptMod.JSDoc] = js.native
  def getLineBreakStyle(sourceFile: typescriptLib.typescriptMod.SourceFile): tsutilsLib.tsutilsLibStrings.BACKSLASHn | tsutilsLib.tsutilsLibStrings.BACKSLASHrBACKSLASHn = js.native
  def getLineRanges(sourceFile: typescriptLib.typescriptMod.SourceFile): js.Array[tsutilsLib.utilUtilMod.LineRange] = js.native
  @JSName("getModifier")
  def getModifier_kind(
    node: typescriptLib.typescriptMod.Node,
    kind: /* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any
  ): js.UndefOr[typescriptLib.typescriptMod.Modifier] = js.native
  def getNextStatement(statement: typescriptLib.typescriptMod.Statement): js.UndefOr[typescriptLib.typescriptMod.Statement] = js.native
  def getNextToken(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getNextToken(node: typescriptLib.typescriptMod.Node, sourceFile: typescriptLib.typescriptMod.SourceFile): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getPreviousStatement(statement: typescriptLib.typescriptMod.Statement): js.UndefOr[typescriptLib.typescriptMod.Statement] = js.native
  def getPreviousToken(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getPreviousToken(node: typescriptLib.typescriptMod.Node, sourceFile: typescriptLib.typescriptMod.SourceFile): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getPropertyName(propertyName: typescriptLib.typescriptMod.PropertyName): js.UndefOr[java.lang.String] = js.native
  def getTokenAtPosition(parent: typescriptLib.typescriptMod.Node, pos: scala.Double): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getTokenAtPosition(
    parent: typescriptLib.typescriptMod.Node,
    pos: scala.Double,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  def getUsageDomain(node: typescriptLib.typescriptMod.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.UsageDomain] = js.native
  def getVariableDeclarationKind(declarationList: typescriptLib.typescriptMod.VariableDeclarationList): tsutilsLib.utilUtilMod.VariableDeclarationKind = js.native
  def getWrappedNodeAtPosition(wrap: tsutilsLib.utilConvertDashAstMod.NodeWrap, pos: scala.Double): js.UndefOr[tsutilsLib.utilConvertDashAstMod.NodeWrap] = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.ClassElement): scala.Boolean = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.ParameterDeclaration): scala.Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    kinds: (/* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): scala.Boolean = js.native
  @JSName("hasModifier")
  def hasModifier_kind(
    modifiers: typescriptLib.typescriptMod.ModifiersArray,
    kinds: (/* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any)*
  ): scala.Boolean = js.native
  def hasOwnThisReference(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.Expression, options: tsutilsLib.utilUtilMod.SideEffectOptions): scala.Boolean = js.native
  def isAmbientModuleBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = js.native
  def isAssignmentKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: typescriptLib.typescriptMod.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: typescriptLib.typescriptMod.VariableDeclarationList): scala.Boolean = js.native
  def isCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.utilUtilMod.BooleanCompilerOptions
  ): scala.Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.tsutilsLibStrings.stripInternal
  ): scala.Boolean = js.native
  def isEmptyObjectType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.ObjectType */ scala.Boolean = js.native
  def isExpressionValueUsed(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isFalsyType(`type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isFunctionScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isFunctionWithBody(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionLikeDeclaration */ scala.Boolean = js.native
  def isJsDocKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isModfierFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.Declaration, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isNodeFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.NodeFlags): scala.Boolean = js.native
  def isNodeKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isObjectFlagSet(objectType: typescriptLib.typescriptMod.ObjectType, flag: typescriptLib.typescriptMod.ObjectFlags): scala.Boolean = js.native
  def isParameterProperty(node: typescriptLib.typescriptMod.ParameterDeclaration): scala.Boolean = js.native
  def isPositionInComment(sourceFile: typescriptLib.typescriptMod.SourceFile, pos: scala.Double): scala.Boolean = js.native
  def isPositionInComment(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.Node
  ): scala.Boolean = js.native
  def isReassignmentTarget(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isSameLine(sourceFile: typescriptLib.typescriptMod.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.Node): tsutilsLib.utilUtilMod.ScopeBoundary = js.native
  def isStatementInAmbientContext(node: typescriptLib.typescriptMod.Statement): scala.Boolean = js.native
  def isStrictCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.utilUtilMod.StrictCompilerOption
  ): scala.Boolean = js.native
  def isSymbolFlagSet(symbol: typescriptLib.typescriptMod.Symbol, flag: typescriptLib.typescriptMod.SymbolFlags): scala.Boolean = js.native
  def isThenableType(checker: typescriptLib.typescriptMod.TypeChecker, node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.TypeChecker,
    node: typescriptLib.typescriptMod.Expression,
    `type`: typescriptLib.typescriptMod.Type
  ): scala.Boolean = js.native
  def isThisParameter(parameter: typescriptLib.typescriptMod.ParameterDeclaration): scala.Boolean = js.native
  def isTokenKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isTypeAssignableToNumber(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isTypeAssignableToString(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isTypeFlagSet(`type`: typescriptLib.typescriptMod.Type, flag: typescriptLib.typescriptMod.TypeFlags): scala.Boolean = js.native
  def isTypeNodeKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isValidIdentifier(text: java.lang.String): scala.Boolean = js.native
  def isValidNumericLiteral(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyAccess(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyName(text: java.lang.String): scala.Boolean = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.Node): js.Array[typescriptLib.typescriptMod.JSDoc] = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.Node, considerTrailingComments: scala.Boolean): js.Array[typescriptLib.typescriptMod.JSDoc] = js.native
  def parseJsDocOfNode(
    node: typescriptLib.typescriptMod.Node,
    considerTrailingComments: scala.Boolean,
    sourceFile: typescriptLib.typescriptMod.SourceFile
  ): js.Array[typescriptLib.typescriptMod.JSDoc] = js.native
  def removeOptionalityFromType(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): typescriptLib.typescriptMod.Type = js.native
  def unionTypeParts(`type`: typescriptLib.typescriptMod.Type): js.Array[typescriptLib.typescriptMod.Type] = js.native
}

