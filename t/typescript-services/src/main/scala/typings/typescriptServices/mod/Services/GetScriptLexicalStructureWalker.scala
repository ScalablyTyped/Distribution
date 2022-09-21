package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.ArgumentListSyntax
import typings.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typings.typescriptServices.TypeScript.ArrayTypeSyntax
import typings.typescriptServices.TypeScript.BinaryExpressionSyntax
import typings.typescriptServices.TypeScript.BlockSyntax
import typings.typescriptServices.TypeScript.BreakStatementSyntax
import typings.typescriptServices.TypeScript.CallSignatureSyntax
import typings.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typings.typescriptServices.TypeScript.CastExpressionSyntax
import typings.typescriptServices.TypeScript.CatchClauseSyntax
import typings.typescriptServices.TypeScript.ClassDeclarationSyntax
import typings.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typings.typescriptServices.TypeScript.ConstraintSyntax
import typings.typescriptServices.TypeScript.ConstructSignatureSyntax
import typings.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typings.typescriptServices.TypeScript.ConstructorTypeSyntax
import typings.typescriptServices.TypeScript.ContinueStatementSyntax
import typings.typescriptServices.TypeScript.DebuggerStatementSyntax
import typings.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typings.typescriptServices.TypeScript.DeleteExpressionSyntax
import typings.typescriptServices.TypeScript.DoStatementSyntax
import typings.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typings.typescriptServices.TypeScript.ElseClauseSyntax
import typings.typescriptServices.TypeScript.EmptyStatementSyntax
import typings.typescriptServices.TypeScript.EnumDeclarationSyntax
import typings.typescriptServices.TypeScript.EnumElementSyntax
import typings.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typings.typescriptServices.TypeScript.ExportAssignmentSyntax
import typings.typescriptServices.TypeScript.ExpressionStatementSyntax
import typings.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typings.typescriptServices.TypeScript.FinallyClauseSyntax
import typings.typescriptServices.TypeScript.ForInStatementSyntax
import typings.typescriptServices.TypeScript.ForStatementSyntax
import typings.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typings.typescriptServices.TypeScript.FunctionExpressionSyntax
import typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typings.typescriptServices.TypeScript.FunctionTypeSyntax
import typings.typescriptServices.TypeScript.GenericTypeSyntax
import typings.typescriptServices.TypeScript.GetAccessorSyntax
import typings.typescriptServices.TypeScript.HeritageClauseSyntax
import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.IfStatementSyntax
import typings.typescriptServices.TypeScript.ImportDeclarationSyntax
import typings.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typings.typescriptServices.TypeScript.IndexSignatureSyntax
import typings.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typings.typescriptServices.TypeScript.InvocationExpressionSyntax
import typings.typescriptServices.TypeScript.LabeledStatementSyntax
import typings.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typings.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typings.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typings.typescriptServices.TypeScript.MethodSignatureSyntax
import typings.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typings.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typings.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typings.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typings.typescriptServices.TypeScript.ObjectTypeSyntax
import typings.typescriptServices.TypeScript.OmittedExpressionSyntax
import typings.typescriptServices.TypeScript.ParameterListSyntax
import typings.typescriptServices.TypeScript.ParameterSyntax
import typings.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typings.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typings.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typings.typescriptServices.TypeScript.PropertySignatureSyntax
import typings.typescriptServices.TypeScript.QualifiedNameSyntax
import typings.typescriptServices.TypeScript.ReturnStatementSyntax
import typings.typescriptServices.TypeScript.SetAccessorSyntax
import typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typings.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.SwitchStatementSyntax
import typings.typescriptServices.TypeScript.SyntaxNode
import typings.typescriptServices.TypeScript.ThrowStatementSyntax
import typings.typescriptServices.TypeScript.TryStatementSyntax
import typings.typescriptServices.TypeScript.TypeAnnotationSyntax
import typings.typescriptServices.TypeScript.TypeArgumentListSyntax
import typings.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typings.typescriptServices.TypeScript.TypeParameterListSyntax
import typings.typescriptServices.TypeScript.TypeParameterSyntax
import typings.typescriptServices.TypeScript.TypeQuerySyntax
import typings.typescriptServices.TypeScript.VariableDeclarationSyntax
import typings.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typings.typescriptServices.TypeScript.VariableStatementSyntax
import typings.typescriptServices.TypeScript.VoidExpressionSyntax
import typings.typescriptServices.TypeScript.WhileStatementSyntax
import typings.typescriptServices.TypeScript.WithStatementSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker")
@js.native
open class GetScriptLexicalStructureWalker protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.GetScriptLexicalStructureWalker {
  def this(fileName: String) = this()
  
  /* private */ /* CompleteClass */
  var _position: Any = js.native
  
  /* private */ /* CompleteClass */
  override def addAdditionalSpan(node: Any, key: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def collectItems(items: Any, scope: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def createItem(node: Any, modifiers: Any, kind: Any, name: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def createScope(): Any = js.native
  
  /* private */ /* CompleteClass */
  var currentInterfaceDeclaration: Any = js.native
  
  /* private */ /* CompleteClass */
  var currentMemberVariableDeclaration: Any = js.native
  
  /* private */ /* CompleteClass */
  var currentScope: Any = js.native
  
  /* private */ /* CompleteClass */
  var currentVariableStatement: Any = js.native
  
  /* private */ /* CompleteClass */
  var fileName: Any = js.native
  
  /* private */ /* CompleteClass */
  override def getKindModifiers(modifiers: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getModuleNames(node: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  override def getModuleNamesHelper(name: Any, result: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var kindStack: Any = js.native
  
  /* private */ /* CompleteClass */
  var nameStack: Any = js.native
  
  /* private */ /* CompleteClass */
  var parentScopes: Any = js.native
  
  /* private */ /* CompleteClass */
  override def popScope(): Any = js.native
  
  /* CompleteClass */
  override def position(): Double = js.native
  
  /* private */ /* CompleteClass */
  override def pushNewContainerScope(containerName: Any, kind: Any): Any = js.native
  
  /* CompleteClass */
  override def skip(element: ISyntaxElement): Unit = js.native
  
  /* CompleteClass */
  override def visitArgumentList(node: ArgumentListSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitArrayType(node: ArrayTypeSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitBinaryExpression(node: BinaryExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitBlock(node: BlockSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitBreakStatement(node: BreakStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitCallSignature(node: CallSignatureSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitCastExpression(node: CastExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitCatchClause(node: CatchClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitClassDeclaration(node: ClassDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitConditionalExpression(node: ConditionalExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitConstraint(node: ConstraintSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitConstructSignature(node: ConstructSignatureSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitConstructorType(node: ConstructorTypeSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitContinueStatement(node: ContinueStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitDebuggerStatement(node: DebuggerStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitDeleteExpression(node: DeleteExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitDoStatement(node: DoStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitElseClause(node: ElseClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitEmptyStatement(node: EmptyStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitEnumDeclaration(node: EnumDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitEnumElement(node: EnumElementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitEqualsValueClause(node: EqualsValueClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitExportAssignment(node: ExportAssignmentSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitExpressionStatement(node: ExpressionStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitFinallyClause(node: FinallyClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitForInStatement(node: ForInStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitForStatement(node: ForStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitFunctionExpression(node: FunctionExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitFunctionType(node: FunctionTypeSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitGenericType(node: GenericTypeSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitGetAccessor(node: GetAccessorSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitHeritageClause(node: HeritageClauseSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitIfStatement(node: IfStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitImportDeclaration(node: ImportDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitIndexSignature(node: IndexSignatureSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitInvocationExpression(node: InvocationExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitLabeledStatement(node: LabeledStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitList(list: ISyntaxList): Unit = js.native
  
  /* CompleteClass */
  override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitMethodSignature(node: MethodSignatureSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitModuleDeclaration(node: ModuleDeclarationSyntax): Any = js.native
  
  /* private */ /* CompleteClass */
  override def visitModuleDeclarationWorker(node: Any, names: Any, nameIndex: Any): Any = js.native
  
  /* CompleteClass */
  override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitNode(node: SyntaxNode): Unit = js.native
  
  /* CompleteClass */
  override def visitNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  
  /* CompleteClass */
  override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitObjectType(node: ObjectTypeSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitOmittedExpression(node: OmittedExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitOptionalNode(node: SyntaxNode): Unit = js.native
  
  /* CompleteClass */
  override def visitOptionalNodeOrToken(nodeOrToken: ISyntaxNodeOrToken): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def visitOptionalToken(token: Any): Any = js.native
  
  /* CompleteClass */
  override def visitParameter(node: ParameterSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitParameterList(node: ParameterListSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitPropertySignature(node: PropertySignatureSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitQualifiedName(node: QualifiedNameSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitReturnStatement(node: ReturnStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitSeparatedList(list: ISeparatedSyntaxList): Unit = js.native
  
  /* CompleteClass */
  override def visitSetAccessor(node: SetAccessorSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitSourceUnit(node: SourceUnitSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitSwitchStatement(node: SwitchStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitThrowStatement(node: ThrowStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitToken(token: ISyntaxToken): Any = js.native
  
  /* CompleteClass */
  override def visitTryStatement(node: TryStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeAnnotation(node: TypeAnnotationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeArgumentList(node: TypeArgumentListSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeOfExpression(node: TypeOfExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeParameter(node: TypeParameterSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeParameterList(node: TypeParameterListSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitTypeQuery(node: TypeQuerySyntax): Any = js.native
  
  /* CompleteClass */
  override def visitVariableDeclaration(node: VariableDeclarationSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitVariableDeclarator(node: VariableDeclaratorSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitVariableStatement(node: VariableStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitVoidExpression(node: VoidExpressionSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitWhileStatement(node: WhileStatementSyntax): Any = js.native
  
  /* CompleteClass */
  override def visitWithStatement(node: WithStatementSyntax): Any = js.native
}
object GetScriptLexicalStructureWalker {
  
  @JSImport("typescript-services", "Services.GetScriptLexicalStructureWalker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getListsOfAllScriptLexicalStructure(
    items: js.Array[typings.typescriptServices.TypeScript.Services.NavigateToItem],
    fileName: String,
    unit: SourceUnitSyntax
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getListsOfAllScriptLexicalStructure")(items.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
