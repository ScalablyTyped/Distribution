package typings
package tsutilsLib.tsutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils", JSImport.Namespace)
@js.native
object tsutilsModMembers extends js.Object {
  def canHaveJsDoc(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.HasJSDoc */ scala.Boolean = js.native
  def collectVariableUsage(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): stdLib.Map[typescriptLib.typescriptMod.tsNs.Identifier, tsutilsLib.utilUsageMod.VariableInfo] = js.native
  def convertAst(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): tsutilsLib.utilConvertDashAstMod.ConvertedAst = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.BlockLike): scala.Boolean = js.native
  def endsControlFlow(statement: typescriptLib.typescriptMod.tsNs.Statement): scala.Boolean = js.native
  def findImports(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, kinds: tsutilsLib.utilUtilMod.ImportKind): js.Array[typescriptLib.typescriptMod.tsNs.LiteralExpression] = js.native
  def findImports(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    options: tsutilsLib.utilUtilMod.ImportOptions
  ): js.Array[typescriptLib.typescriptMod.tsNs.LiteralExpression] = js.native
  def forEachComment(node: typescriptLib.typescriptMod.tsNs.Node, cb: tsutilsLib.utilUtilMod.ForEachCommentCallback): scala.Unit = js.native
  def forEachComment(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: tsutilsLib.utilUtilMod.ForEachCommentCallback,
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
  def forEachTokenWithTrivia(node: typescriptLib.typescriptMod.tsNs.Node, cb: tsutilsLib.utilUtilMod.ForEachTokenCallback): scala.Unit = js.native
  def forEachTokenWithTrivia(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: tsutilsLib.utilUtilMod.ForEachTokenCallback,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): scala.Unit = js.native
  def getCallSignaturesOfType(`type`: typescriptLib.typescriptMod.tsNs.Type): js.Array[typescriptLib.typescriptMod.tsNs.Signature] = js.native
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
  def getDeclarationDomain(node: typescriptLib.typescriptMod.tsNs.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.DeclarationDomain] = js.native
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
  def getLineRanges(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): js.Array[tsutilsLib.utilUtilMod.LineRange] = js.native
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
  def getUsageDomain(node: typescriptLib.typescriptMod.tsNs.Identifier): js.UndefOr[tsutilsLib.utilUsageMod.UsageDomain] = js.native
  def getVariableDeclarationKind(declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList): tsutilsLib.utilUtilMod.VariableDeclarationKind = js.native
  def getWrappedNodeAtPosition(wrap: tsutilsLib.utilConvertDashAstMod.NodeWrap, pos: scala.Double): js.UndefOr[tsutilsLib.utilConvertDashAstMod.NodeWrap] = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.tsNs.ClassElement): scala.Boolean = js.native
  def hasAccessModifier(node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def hasModifier(kinds: js.Any*): scala.Boolean = js.native
  def hasModifier(modifiers: typescriptLib.typescriptMod.tsNs.ModifiersArray, kinds: js.Any*): scala.Boolean = js.native
  def hasOwnThisReference(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def hasSideEffects(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def hasSideEffects(
    node: typescriptLib.typescriptMod.tsNs.Expression,
    options: tsutilsLib.utilUtilMod.SideEffectOptions
  ): scala.Boolean = js.native
  def isAccessorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AccessorDeclaration */ scala.Boolean = js.native
  def isAmbientModuleBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ModuleBlock */ scala.Boolean = js.native
  def isArrayBindingPattern(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayBindingPattern */ scala.Boolean = js.native
  def isArrayLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayLiteralExpression */ scala.Boolean = js.native
  def isArrayTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayTypeNode */ scala.Boolean = js.native
  def isArrowFunction(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrowFunction */ scala.Boolean = js.native
  def isAsExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AsExpression */ scala.Boolean = js.native
  def isAssertionExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AssertionExpression */ scala.Boolean = js.native
  def isAssignmentKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isAwaitExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AwaitExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BinaryExpression */ scala.Boolean = js.native
  def isBindingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BindingElement */ scala.Boolean = js.native
  def isBindingPattern(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BindingPattern */ scala.Boolean = js.native
  def isBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Block */ scala.Boolean = js.native
  def isBlockLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BlockLike */ scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isBlockScopedVariableDeclaration(declaration: typescriptLib.typescriptMod.tsNs.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariableDeclarationList(declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList): scala.Boolean = js.native
  def isBreakOrContinueStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BreakOrContinueStatement */ scala.Boolean = js.native
  def isBreakStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallExpression */ scala.Boolean = js.native
  def isCallLikeExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallLikeExpression */ scala.Boolean = js.native
  def isCallSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallSignatureDeclaration */ scala.Boolean = js.native
  def isCaseBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseBlock */ scala.Boolean = js.native
  def isCaseClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseClause */ scala.Boolean = js.native
  def isCaseOrDefaultClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseOrDefaultClause */ scala.Boolean = js.native
  def isCatchClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CatchClause */ scala.Boolean = js.native
  def isClassDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassExpression */ scala.Boolean = js.native
  def isClassLikeDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassLikeDeclaration */ scala.Boolean = js.native
  def isCommaListExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CommaListExpression */ scala.Boolean = js.native
  def isCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    option: tsutilsLib.utilUtilMod.BooleanCompilerOptions
  ): scala.Boolean = js.native
  @JSName("isCompilerOptionEnabled")
  def isCompilerOptionEnabled_stripInternal(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    option: tsutilsLib.tsutilsLibStrings.stripInternal
  ): scala.Boolean = js.native
  def isComputedPropertyName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ComputedPropertyName */ scala.Boolean = js.native
  def isConditionalExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.ConditionalType */ scala.Boolean = js.native
  def isConditionalTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConditionalTypeNode */ scala.Boolean = js.native
  def isConstructSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructSignatureDeclaration */ scala.Boolean = js.native
  def isConstructorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructorDeclaration */ scala.Boolean = js.native
  def isConstructorTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructorTypeNode */ scala.Boolean = js.native
  def isContinueStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DebuggerStatement */ scala.Boolean = js.native
  def isDecorator(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Decorator */ scala.Boolean = js.native
  def isDefaultClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DefaultClause */ scala.Boolean = js.native
  def isDeleteExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DeleteExpression */ scala.Boolean = js.native
  def isDoStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DoStatement */ scala.Boolean = js.native
  def isElementAccessExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ElementAccessExpression */ scala.Boolean = js.native
  def isEmptyObjectType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.ObjectType */ scala.Boolean = js.native
  def isEmptyStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EmptyStatement */ scala.Boolean = js.native
  def isEntityName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EntityName */ scala.Boolean = js.native
  def isEntityNameExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EntityNameExpression */ scala.Boolean = js.native
  def isEnumDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EnumDeclaration */ scala.Boolean = js.native
  def isEnumMember(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EnumMember */ scala.Boolean = js.native
  def isEnumType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.EnumType */ scala.Boolean = js.native
  def isExportAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportAssignment */ scala.Boolean = js.native
  def isExportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportDeclaration */ scala.Boolean = js.native
  def isExportSpecifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Expression */ scala.Boolean = js.native
  def isExpressionStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionValueUsed(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def isExpressionWithTypeArguments(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExpressionWithTypeArguments */ scala.Boolean = js.native
  def isExternalModuleReference(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExternalModuleReference */ scala.Boolean = js.native
  def isFalsyType(`type`: typescriptLib.typescriptMod.tsNs.Type): scala.Boolean = js.native
  def isForInOrOfStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForInOrOfStatement */ scala.Boolean = js.native
  def isForInStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForStatement */ scala.Boolean = js.native
  def isFunctionDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionExpression */ scala.Boolean = js.native
  def isFunctionScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isFunctionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionTypeNode */ scala.Boolean = js.native
  def isFunctionWithBody(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionLikeDeclaration */ scala.Boolean = js.native
  def isGenericType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.GenericType */ scala.Boolean = js.native
  def isGetAccessorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.GetAccessorDeclaration */ scala.Boolean = js.native
  def isIdentifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Identifier */ scala.Boolean = js.native
  def isIfStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IfStatement */ scala.Boolean = js.native
  def isImportClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportClause */ scala.Boolean = js.native
  def isImportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportDeclaration */ scala.Boolean = js.native
  def isImportEqualsDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportEqualsDeclaration */ scala.Boolean = js.native
  def isImportSpecifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportSpecifier */ scala.Boolean = js.native
  def isImportTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportTypeNode */ scala.Boolean = js.native
  def isIndexSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IndexSignatureDeclaration */ scala.Boolean = js.native
  def isIndexedAccessType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.IndexedAccessType */ scala.Boolean = js.native
  def isIndexedAccessTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IndexedAccessTypeNode */ scala.Boolean = js.native
  def isIndexedAccessype(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.IndexType */ scala.Boolean = js.native
  def isInferTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.InferTypeNode */ scala.Boolean = js.native
  def isInstantiableType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.InstantiableType */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.InterfaceType */ scala.Boolean = js.native
  def isIntersectionType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.IntersectionType */ scala.Boolean = js.native
  def isIntersectionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IntersectionTypeNode */ scala.Boolean = js.native
  def isIterationStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IterationStatement */ scala.Boolean = js.native
  def isJsDoc(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDoc */ scala.Boolean = js.native
  def isJsDocKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isJsxAttribute(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxAttribute */ scala.Boolean = js.native
  def isJsxAttributeLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxAttributeLike */ scala.Boolean = js.native
  def isJsxAttributes(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxAttributes */ scala.Boolean = js.native
  def isJsxClosingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxClosingElement */ scala.Boolean = js.native
  def isJsxClosingFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxClosingFragment */ scala.Boolean = js.native
  def isJsxElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxElement */ scala.Boolean = js.native
  def isJsxExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxExpression */ scala.Boolean = js.native
  def isJsxFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxFragment */ scala.Boolean = js.native
  def isJsxFramgment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxFragment */ scala.Boolean = js.native
  def isJsxOpeningElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningElement */ scala.Boolean = js.native
  def isJsxOpeningFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningFragment */ scala.Boolean = js.native
  def isJsxOpeningLikeElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningLikeElement */ scala.Boolean = js.native
  def isJsxSelfClosingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxSelfClosingElement */ scala.Boolean = js.native
  def isJsxSpreadAttribute(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxSpreadAttribute */ scala.Boolean = js.native
  def isJsxText(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxText */ scala.Boolean = js.native
  def isLabeledStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LabeledStatement */ scala.Boolean = js.native
  def isLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LiteralExpression */ scala.Boolean = js.native
  def isLiteralType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.LiteralType */ scala.Boolean = js.native
  def isLiteralTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LiteralTypeNode */ scala.Boolean = js.native
  def isMappedTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MappedTypeNode */ scala.Boolean = js.native
  def isMetaProperty(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MetaProperty */ scala.Boolean = js.native
  def isMethodDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MethodDeclaration */ scala.Boolean = js.native
  def isMethodSignature(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MethodSignature */ scala.Boolean = js.native
  def isModfierFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.ModifierFlags): scala.Boolean = js.native
  def isModifierFlagSet(
    node: typescriptLib.typescriptMod.tsNs.Declaration,
    flag: typescriptLib.typescriptMod.tsNs.ModifierFlags
  ): scala.Boolean = js.native
  def isModifierFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.ModifierFlags): scala.Boolean = js.native
  def isModuleBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ModuleBlock */ scala.Boolean = js.native
  def isModuleDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ModuleDeclaration */ scala.Boolean = js.native
  def isNamedExports(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamedExports */ scala.Boolean = js.native
  def isNamedImports(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamedImports */ scala.Boolean = js.native
  def isNamespaceDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamespaceDeclaration */ scala.Boolean = js.native
  def isNamespaceExportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamespaceExportDeclaration */ scala.Boolean = js.native
  def isNamespaceImport(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamespaceImport */ scala.Boolean = js.native
  def isNewExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NewExpression */ scala.Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NoSubstitutionTemplateLiteral */ scala.Boolean = js.native
  def isNodeFlagSet(node: typescriptLib.typescriptMod.tsNs.Node, flag: typescriptLib.typescriptMod.tsNs.NodeFlags): scala.Boolean = js.native
  def isNodeKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isNonNullExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NonNullExpression */ scala.Boolean = js.native
  def isNumericLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NumericLiteral */ scala.Boolean = js.native
  def isObjectBindingPattern(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectBindingPattern */ scala.Boolean = js.native
  def isObjectFlagSet(
    objectType: typescriptLib.typescriptMod.tsNs.ObjectType,
    flag: typescriptLib.typescriptMod.tsNs.ObjectFlags
  ): scala.Boolean = js.native
  def isObjectLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectLiteralExpression */ scala.Boolean = js.native
  def isObjectType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.ObjectType */ scala.Boolean = js.native
  def isOmittedExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.OmittedExpression */ scala.Boolean = js.native
  def isParameterDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParameterDeclaration */ scala.Boolean = js.native
  def isParameterProperty(node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def isParenthesizedExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParenthesizedTypeNode */ scala.Boolean = js.native
  def isPositionInComment(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, pos: scala.Double): scala.Boolean = js.native
  def isPositionInComment(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    pos: scala.Double,
    parent: typescriptLib.typescriptMod.tsNs.Node
  ): scala.Boolean = js.native
  def isPostfixUnaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PostfixUnaryExpression */ scala.Boolean = js.native
  def isPrefixUnaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PrefixUnaryExpression */ scala.Boolean = js.native
  def isPropertyAccessExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyAccessExpression */ scala.Boolean = js.native
  def isPropertyAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyAssignment */ scala.Boolean = js.native
  def isPropertyDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyDeclaration */ scala.Boolean = js.native
  def isPropertySignature(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertySignature */ scala.Boolean = js.native
  def isQualifiedName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.QualifiedName */ scala.Boolean = js.native
  def isReassignmentTarget(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def isRegularExpressionLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.RegularExpressionLiteral */ scala.Boolean = js.native
  def isReturnStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ReturnStatement */ scala.Boolean = js.native
  def isSameLine(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile, pos1: scala.Double, pos2: scala.Double): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): tsutilsLib.utilUtilMod.ScopeBoundary = js.native
  def isSetAccessorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SetAccessorDeclaration */ scala.Boolean = js.native
  def isShorthandPropertyAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ShorthandPropertyAssignment */ scala.Boolean = js.native
  def isSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SignatureDeclaration */ scala.Boolean = js.native
  def isSourceFile(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SourceFile */ scala.Boolean = js.native
  def isSpreadAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SpreadAssignment */ scala.Boolean = js.native
  def isSpreadElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SpreadElement */ scala.Boolean = js.native
  def isStatementInAmbientContext(node: typescriptLib.typescriptMod.tsNs.Statement): scala.Boolean = js.native
  def isStrictCompilerOptionEnabled(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    option: tsutilsLib.utilUtilMod.StrictCompilerOption
  ): scala.Boolean = js.native
  def isStringLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.StringLiteral */ scala.Boolean = js.native
  def isSubstitutionType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.SubstitutionType */ scala.Boolean = js.native
  def isSwitchStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SwitchStatement */ scala.Boolean = js.native
  def isSymbolFlagSet(
    symbol: typescriptLib.typescriptMod.tsNs.Symbol,
    flag: typescriptLib.typescriptMod.tsNs.SymbolFlags
  ): scala.Boolean = js.native
  def isSyntaxList(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SyntaxList */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateExpression */ scala.Boolean = js.native
  def isTemplateLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateLiteral */ scala.Boolean = js.native
  def isTextualLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LiteralExpression */ scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    node: typescriptLib.typescriptMod.tsNs.Expression
  ): scala.Boolean = js.native
  def isThenableType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    node: typescriptLib.typescriptMod.tsNs.Expression,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def isThisParameter(parameter: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): scala.Boolean = js.native
  def isThrowStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ThrowStatement */ scala.Boolean = js.native
  def isTokenKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isTryStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TryStatement */ scala.Boolean = js.native
  def isTupleTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TupleTypeNode */ scala.Boolean = js.native
  def isTypeAliasDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeAliasDeclaration */ scala.Boolean = js.native
  def isTypeAssertion(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeAssertion */ scala.Boolean = js.native
  def isTypeAssignableToNumber(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def isTypeAssignableToString(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): scala.Boolean = js.native
  def isTypeFlagSet(`type`: typescriptLib.typescriptMod.tsNs.Type, flag: typescriptLib.typescriptMod.tsNs.TypeFlags): scala.Boolean = js.native
  def isTypeLiteralNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeLiteralNode */ scala.Boolean = js.native
  def isTypeNodeKind(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): scala.Boolean = js.native
  def isTypeOfExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeOfExpression */ scala.Boolean = js.native
  def isTypeOperatorNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeOperatorNode */ scala.Boolean = js.native
  def isTypeParameter(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypePredicateNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypePredicateNode */ scala.Boolean = js.native
  def isTypeQueryNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeQueryNode */ scala.Boolean = js.native
  def isTypeReference(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.TypeReference */ scala.Boolean = js.native
  def isTypeReferenceNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeReferenceNode */ scala.Boolean = js.native
  def isTypeVariable(`type`: typescriptLib.typescriptMod.tsNs.Type): scala.Boolean = js.native
  def isUnionOrIntersectionType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.UnionOrIntersectionType */ scala.Boolean = js.native
  def isUnionType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.UnionType */ scala.Boolean = js.native
  def isUnionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.UnionTypeNode */ scala.Boolean = js.native
  def isUniqueESSymbolType(`type`: typescriptLib.typescriptMod.tsNs.Type): /* is typescript.typescript.ts.UniqueESSymbolType */ scala.Boolean = js.native
  def isValidIdentifier(text: java.lang.String): scala.Boolean = js.native
  def isValidNumericLiteral(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyAccess(text: java.lang.String): scala.Boolean = js.native
  def isValidPropertyName(text: java.lang.String): scala.Boolean = js.native
  def isVariableDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarationList(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableDeclarationList */ scala.Boolean = js.native
  def isVariableStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableStatement */ scala.Boolean = js.native
  def isVoidExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VoidExpression */ scala.Boolean = js.native
  def isWhileStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.WithStatement */ scala.Boolean = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.tsNs.Node): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def parseJsDocOfNode(node: typescriptLib.typescriptMod.tsNs.Node, considerTrailingComments: scala.Boolean): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def parseJsDocOfNode(
    node: typescriptLib.typescriptMod.tsNs.Node,
    considerTrailingComments: scala.Boolean,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.Array[typescriptLib.typescriptMod.tsNs.JSDoc] = js.native
  def removeOptionalityFromType(
    checker: typescriptLib.typescriptMod.tsNs.TypeChecker,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): typescriptLib.typescriptMod.tsNs.Type = js.native
  def unionTypeParts(`type`: typescriptLib.typescriptMod.tsNs.Type): js.Array[typescriptLib.typescriptMod.tsNs.Type] = js.native
}

