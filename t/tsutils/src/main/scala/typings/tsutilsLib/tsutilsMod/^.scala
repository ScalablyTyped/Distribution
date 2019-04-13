package typings
package tsutilsLib.tsutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils", JSImport.Namespace)
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
  def getModifier(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.Modifier] = js.native
  def getModifier(node: typescriptLib.typescriptMod.Node, kind: typescriptLib.typescriptMod.SyntaxKind): js.UndefOr[typescriptLib.typescriptMod.Modifier] = js.native
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
  def hasModifier(kinds: js.UndefOr[typescriptLib.typescriptMod.SyntaxKind]*): scala.Boolean = js.native
  def hasModifier(
    modifiers: typescriptLib.typescriptMod.ModifiersArray,
    kinds: js.UndefOr[typescriptLib.typescriptMod.SyntaxKind]*
  ): scala.Boolean = js.native
  def hasOwnThisReference(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.Expression, options: tsutilsLib.utilUtilMod.SideEffectOptions): scala.Boolean = js.native
  def isAccessorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AccessorDeclaration */ scala.Boolean = js.native
  def isAmbientModuleBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = js.native
  def isArrayBindingPattern(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayBindingPattern */ scala.Boolean = js.native
  def isArrayLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayLiteralExpression */ scala.Boolean = js.native
  def isArrayTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrayTypeNode */ scala.Boolean = js.native
  def isArrowFunction(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ArrowFunction */ scala.Boolean = js.native
  def isAsExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AsExpression */ scala.Boolean = js.native
  def isAssertionExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AssertionExpression */ scala.Boolean = js.native
  def isAssignmentKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isAwaitExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.AwaitExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BinaryExpression */ scala.Boolean = js.native
  def isBindingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BindingElement */ scala.Boolean = js.native
  def isBindingPattern(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BindingPattern */ scala.Boolean = js.native
  def isBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Block */ scala.Boolean = js.native
  def isBlockLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BlockLike */ scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: typescriptLib.typescriptMod.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: typescriptLib.typescriptMod.VariableDeclarationList): scala.Boolean = js.native
  def isBreakOrContinueStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BreakOrContinueStatement */ scala.Boolean = js.native
  def isBreakStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallExpression */ scala.Boolean = js.native
  def isCallLikeExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallLikeExpression */ scala.Boolean = js.native
  def isCallSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CallSignatureDeclaration */ scala.Boolean = js.native
  def isCaseBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseBlock */ scala.Boolean = js.native
  def isCaseClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseClause */ scala.Boolean = js.native
  def isCaseOrDefaultClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CaseOrDefaultClause */ scala.Boolean = js.native
  def isCatchClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CatchClause */ scala.Boolean = js.native
  def isClassDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassExpression */ scala.Boolean = js.native
  def isClassLikeDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ClassLikeDeclaration */ scala.Boolean = js.native
  def isCommaListExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.CommaListExpression */ scala.Boolean = js.native
  def isCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.utilUtilMod.BooleanCompilerOptions
  ): scala.Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.tsutilsLibStrings.stripInternal
  ): scala.Boolean = js.native
  def isComputedPropertyName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ComputedPropertyName */ scala.Boolean = js.native
  def isConditionalExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.ConditionalType */ scala.Boolean = js.native
  def isConditionalTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConditionalTypeNode */ scala.Boolean = js.native
  def isConstructSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructSignatureDeclaration */ scala.Boolean = js.native
  def isConstructorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructorDeclaration */ scala.Boolean = js.native
  def isConstructorTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ConstructorTypeNode */ scala.Boolean = js.native
  def isContinueStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DebuggerStatement */ scala.Boolean = js.native
  def isDecorator(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Decorator */ scala.Boolean = js.native
  def isDefaultClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DefaultClause */ scala.Boolean = js.native
  def isDeleteExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DeleteExpression */ scala.Boolean = js.native
  def isDoStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.DoStatement */ scala.Boolean = js.native
  def isElementAccessExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ElementAccessExpression */ scala.Boolean = js.native
  def isEmptyObjectType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.ObjectType */ scala.Boolean = js.native
  def isEmptyStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EmptyStatement */ scala.Boolean = js.native
  def isEntityName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EntityName */ scala.Boolean = js.native
  def isEntityNameExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EntityNameExpression */ scala.Boolean = js.native
  def isEnumDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EnumDeclaration */ scala.Boolean = js.native
  def isEnumMember(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.EnumMember */ scala.Boolean = js.native
  def isEnumType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.EnumType */ scala.Boolean = js.native
  def isExportAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportAssignment */ scala.Boolean = js.native
  def isExportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportDeclaration */ scala.Boolean = js.native
  def isExportSpecifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Expression */ scala.Boolean = js.native
  def isExpressionStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionValueUsed(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isExpressionWithTypeArguments(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExpressionWithTypeArguments */ scala.Boolean = js.native
  def isExternalModuleReference(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ExternalModuleReference */ scala.Boolean = js.native
  def isFalsyType(`type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isForInOrOfStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForInOrOfStatement */ scala.Boolean = js.native
  def isForInStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ForStatement */ scala.Boolean = js.native
  def isFunctionDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionExpression */ scala.Boolean = js.native
  def isFunctionScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isFunctionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionTypeNode */ scala.Boolean = js.native
  def isFunctionWithBody(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.FunctionLikeDeclaration */ scala.Boolean = js.native
  def isGenericType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.GenericType */ scala.Boolean = js.native
  def isGetAccessorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.GetAccessorDeclaration */ scala.Boolean = js.native
  def isIdentifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.Identifier */ scala.Boolean = js.native
  def isIfStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IfStatement */ scala.Boolean = js.native
  def isImportClause(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportClause */ scala.Boolean = js.native
  def isImportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportDeclaration */ scala.Boolean = js.native
  def isImportEqualsDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportEqualsDeclaration */ scala.Boolean = js.native
  def isImportSpecifier(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportSpecifier */ scala.Boolean = js.native
  def isImportTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ImportTypeNode */ scala.Boolean = js.native
  def isIndexSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IndexSignatureDeclaration */ scala.Boolean = js.native
  def isIndexedAccessType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.IndexedAccessType */ scala.Boolean = js.native
  def isIndexedAccessTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IndexedAccessTypeNode */ scala.Boolean = js.native
  def isIndexedAccessype(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.IndexType */ scala.Boolean = js.native
  def isInferTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.InferTypeNode */ scala.Boolean = js.native
  def isInstantiableType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.InstantiableType */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.InterfaceType */ scala.Boolean = js.native
  def isIntersectionType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.IntersectionType */ scala.Boolean = js.native
  def isIntersectionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IntersectionTypeNode */ scala.Boolean = js.native
  def isIterationStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IterationStatement */ scala.Boolean = js.native
  def isJsDoc(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JSDoc */ scala.Boolean = js.native
  def isJsDocKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isJsxAttribute(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxAttribute */ scala.Boolean = js.native
  def isJsxAttributeLike(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxAttributeLike */ scala.Boolean = js.native
  def isJsxAttributes(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxAttributes */ scala.Boolean = js.native
  def isJsxClosingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxClosingElement */ scala.Boolean = js.native
  def isJsxClosingFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxClosingFragment */ scala.Boolean = js.native
  def isJsxElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxElement */ scala.Boolean = js.native
  def isJsxExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxExpression */ scala.Boolean = js.native
  def isJsxFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxFragment */ scala.Boolean = js.native
  def isJsxFramgment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxFragment */ scala.Boolean = js.native
  def isJsxOpeningElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningElement */ scala.Boolean = js.native
  def isJsxOpeningFragment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningFragment */ scala.Boolean = js.native
  def isJsxOpeningLikeElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxOpeningLikeElement */ scala.Boolean = js.native
  def isJsxSelfClosingElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxSelfClosingElement */ scala.Boolean = js.native
  def isJsxSpreadAttribute(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxSpreadAttribute */ scala.Boolean = js.native
  def isJsxText(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.JsxText */ scala.Boolean = js.native
  def isLabeledStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LabeledStatement */ scala.Boolean = js.native
  def isLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LiteralExpression */ scala.Boolean = js.native
  def isLiteralType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.LiteralType */ scala.Boolean = js.native
  def isLiteralTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LiteralTypeNode */ scala.Boolean = js.native
  def isMappedTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MappedTypeNode */ scala.Boolean = js.native
  def isMetaProperty(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MetaProperty */ scala.Boolean = js.native
  def isMethodDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MethodDeclaration */ scala.Boolean = js.native
  def isMethodSignature(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.MethodSignature */ scala.Boolean = js.native
  def isModfierFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.Declaration, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.ModifierFlags): scala.Boolean = js.native
  def isModuleBlock(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = js.native
  def isModuleDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ModuleDeclaration */ scala.Boolean = js.native
  def isNamedExports(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamedExports */ scala.Boolean = js.native
  def isNamedImports(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamedImports */ scala.Boolean = js.native
  def isNamespaceDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamespaceDeclaration */ scala.Boolean = js.native
  def isNamespaceExportDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamespaceExportDeclaration */ scala.Boolean = js.native
  def isNamespaceImport(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NamespaceImport */ scala.Boolean = js.native
  def isNewExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NewExpression */ scala.Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ scala.Boolean = js.native
  def isNodeFlagSet(node: typescriptLib.typescriptMod.Node, flag: typescriptLib.typescriptMod.NodeFlags): scala.Boolean = js.native
  def isNodeKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isNonNullExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NonNullExpression */ scala.Boolean = js.native
  def isNumericLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.NumericLiteral */ scala.Boolean = js.native
  def isObjectBindingPattern(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectBindingPattern */ scala.Boolean = js.native
  def isObjectFlagSet(objectType: typescriptLib.typescriptMod.ObjectType, flag: typescriptLib.typescriptMod.ObjectFlags): scala.Boolean = js.native
  def isObjectLiteralExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ObjectLiteralExpression */ scala.Boolean = js.native
  def isObjectType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.ObjectType */ scala.Boolean = js.native
  def isOmittedExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.OmittedExpression */ scala.Boolean = js.native
  def isParameterDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParameterDeclaration */ scala.Boolean = js.native
  def isParameterProperty(node: typescriptLib.typescriptMod.ParameterDeclaration): scala.Boolean = js.native
  def isParenthesizedExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ParenthesizedTypeNode */ scala.Boolean = js.native
  def isPositionInComment(sourceFile: typescriptLib.typescriptMod.SourceFile, pos: scala.Double): scala.Boolean = js.native
  def isPositionInComment(
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.Node
  ): scala.Boolean = js.native
  def isPostfixUnaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PostfixUnaryExpression */ scala.Boolean = js.native
  def isPrefixUnaryExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PrefixUnaryExpression */ scala.Boolean = js.native
  def isPropertyAccessExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyAccessExpression */ scala.Boolean = js.native
  def isPropertyAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyAssignment */ scala.Boolean = js.native
  def isPropertyDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertyDeclaration */ scala.Boolean = js.native
  def isPropertySignature(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.PropertySignature */ scala.Boolean = js.native
  def isQualifiedName(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.QualifiedName */ scala.Boolean = js.native
  def isReassignmentTarget(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isRegularExpressionLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.RegularExpressionLiteral */ scala.Boolean = js.native
  def isReturnStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ReturnStatement */ scala.Boolean = js.native
  def isSameLine(sourceFile: typescriptLib.typescriptMod.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.Node): tsutilsLib.utilUtilMod.ScopeBoundary = js.native
  def isSetAccessorDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SetAccessorDeclaration */ scala.Boolean = js.native
  def isShorthandPropertyAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ShorthandPropertyAssignment */ scala.Boolean = js.native
  def isSignatureDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SignatureDeclaration */ scala.Boolean = js.native
  def isSourceFile(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SourceFile */ scala.Boolean = js.native
  def isSpreadAssignment(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SpreadAssignment */ scala.Boolean = js.native
  def isSpreadElement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SpreadElement */ scala.Boolean = js.native
  def isStatementInAmbientContext(node: typescriptLib.typescriptMod.Statement): scala.Boolean = js.native
  def isStrictCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.CompilerOptions,
    option: tsutilsLib.utilUtilMod.StrictCompilerOption
  ): scala.Boolean = js.native
  def isStringLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.StringLiteral */ scala.Boolean = js.native
  def isSubstitutionType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.SubstitutionType */ scala.Boolean = js.native
  def isSwitchStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SwitchStatement */ scala.Boolean = js.native
  def isSymbolFlagSet(symbol: typescriptLib.typescriptMod.Symbol, flag: typescriptLib.typescriptMod.SymbolFlags): scala.Boolean = js.native
  def isSyntaxList(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.SyntaxList */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateExpression */ scala.Boolean = js.native
  def isTemplateLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TemplateLiteral */ scala.Boolean = js.native
  def isTextualLiteral(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.LiteralExpression */ scala.Boolean = js.native
  def isThenableType(checker: typescriptLib.typescriptMod.TypeChecker, node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.TypeChecker,
    node: typescriptLib.typescriptMod.Expression,
    `type`: typescriptLib.typescriptMod.Type
  ): scala.Boolean = js.native
  def isThisParameter(parameter: typescriptLib.typescriptMod.ParameterDeclaration): scala.Boolean = js.native
  def isThrowStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.ThrowStatement */ scala.Boolean = js.native
  def isTokenKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isTryStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TryStatement */ scala.Boolean = js.native
  def isTupleTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TupleTypeNode */ scala.Boolean = js.native
  def isTypeAliasDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeAliasDeclaration */ scala.Boolean = js.native
  def isTypeAssertion(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeAssertion */ scala.Boolean = js.native
  def isTypeAssignableToNumber(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isTypeAssignableToString(checker: typescriptLib.typescriptMod.TypeChecker, `type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isTypeFlagSet(`type`: typescriptLib.typescriptMod.Type, flag: typescriptLib.typescriptMod.TypeFlags): scala.Boolean = js.native
  def isTypeLiteralNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeLiteralNode */ scala.Boolean = js.native
  def isTypeNodeKind(kind: typescriptLib.typescriptMod.SyntaxKind): scala.Boolean = js.native
  def isTypeOfExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeOfExpression */ scala.Boolean = js.native
  def isTypeOperatorNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeOperatorNode */ scala.Boolean = js.native
  def isTypeParameter(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypePredicateNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypePredicateNode */ scala.Boolean = js.native
  def isTypeQueryNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeQueryNode */ scala.Boolean = js.native
  def isTypeReference(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.TypeReference */ scala.Boolean = js.native
  def isTypeReferenceNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.TypeReferenceNode */ scala.Boolean = js.native
  def isTypeVariable(`type`: typescriptLib.typescriptMod.Type): scala.Boolean = js.native
  def isUnionOrIntersectionType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.UnionOrIntersectionType */ scala.Boolean = js.native
  def isUnionType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.UnionType */ scala.Boolean = js.native
  def isUnionTypeNode(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.UnionTypeNode */ scala.Boolean = js.native
  def isUniqueESSymbolType(`type`: typescriptLib.typescriptMod.Type): /* is typescript.typescript.UniqueESSymbolType */ scala.Boolean = js.native
  def isValidIdentifier(text: java.lang.String): scala.Boolean = js.native
  def isValidNumericLiteral(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyAccess(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyName(text: java.lang.String): scala.Boolean = js.native
  def isVariableDeclaration(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarationList(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableDeclarationList */ scala.Boolean = js.native
  def isVariableStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VariableStatement */ scala.Boolean = js.native
  def isVoidExpression(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.VoidExpression */ scala.Boolean = js.native
  def isWhileStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.WithStatement */ scala.Boolean = js.native
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

