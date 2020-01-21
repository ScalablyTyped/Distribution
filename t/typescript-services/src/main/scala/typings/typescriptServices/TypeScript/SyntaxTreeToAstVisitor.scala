package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxTreeToAstVisitor")
@js.native
class SyntaxTreeToAstVisitor protected () extends ISyntaxVisitor {
  def this(fileName: String, lineMap: LineMap, compilationSettings: ImmutableCompilationSettings) = this()
  var compilationSettings: js.Any = js.native
  var fileName: js.Any = js.native
  var lineMap: LineMap = js.native
  var position: Double = js.native
  var previousTokenTrailingComments: js.Array[Comment] = js.native
  /* private */ def convertComment(trivia: js.Any, commentStartPosition: js.Any, hasTrailingNewLine: js.Any): js.Any = js.native
  /* private */ def convertComments(triviaList: js.Any, commentStartPosition: js.Any): js.Any = js.native
  /* private */ def convertNodeTrailingComments(node: js.Any, lastToken: js.Any, nodeStart: js.Any): js.Any = js.native
  /* private */ def convertTokenLeadingComments(token: js.Any, commentStartPosition: js.Any): js.Any = js.native
  /* private */ def convertTokenTrailingComments(token: js.Any, commentStartPosition: js.Any): js.Any = js.native
  def createTokenSpan(fullStart: Double, element: ISyntaxToken): ASTSpan = js.native
  /* private */ def mergeComments(comments1: js.Any, comments2: js.Any): js.Any = js.native
  def movePast(element: ISyntaxElement): Unit = js.native
  /* private */ def moveTo(element1: js.Any, element2: js.Any): js.Any = js.native
  /* private */ def setCommentsAndSpan(ast: js.Any, fullStart: js.Any, node: js.Any): js.Any = js.native
  def setSpan(span: AST, fullStart: Double, element: ISyntaxElement): Unit = js.native
  def setSpan(span: AST, fullStart: Double, element: ISyntaxElement, firstToken: ISyntaxToken): Unit = js.native
  def setSpan(
    span: AST,
    fullStart: Double,
    element: ISyntaxElement,
    firstToken: ISyntaxToken,
    lastToken: ISyntaxToken
  ): Unit = js.native
  def setSpanExplicit(span: IASTSpan, start: Double, end: Double): Unit = js.native
  /* CompleteClass */
  override def visitArgumentList(node: ArgumentListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitArrayLiteralExpression(node: ArrayLiteralExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitArrayType(node: ArrayTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBinaryExpression(node: BinaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBlock(node: BlockSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitBreakStatement(node: BreakStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCallSignature(node: CallSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCaseSwitchClause(node: CaseSwitchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCastExpression(node: CastExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitCatchClause(node: CatchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitClassDeclaration(node: ClassDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConditionalExpression(node: ConditionalExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstraint(node: ConstraintSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructSignature(node: ConstructSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructorDeclaration(node: ConstructorDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitConstructorType(node: ConstructorTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitContinueStatement(node: ContinueStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDebuggerStatement(node: DebuggerStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDefaultSwitchClause(node: DefaultSwitchClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDeleteExpression(node: DeleteExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitDoStatement(node: DoStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitElementAccessExpression(node: ElementAccessExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitElseClause(node: ElseClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEmptyStatement(node: EmptyStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEnumDeclaration(node: EnumDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEnumElement(node: EnumElementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitEqualsValueClause(node: EqualsValueClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExportAssignment(node: ExportAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExpressionStatement(node: ExpressionStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitExternalModuleReference(node: ExternalModuleReferenceSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFinallyClause(node: FinallyClauseSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitForInStatement(node: ForInStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitForStatement(node: ForStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionDeclaration(node: FunctionDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionExpression(node: FunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionPropertyAssignment(node: FunctionPropertyAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitFunctionType(node: FunctionTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitGenericType(node: GenericTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitGetAccessor(node: GetAccessorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitHeritageClause(node: HeritageClauseSyntax): js.Any = js.native
  /* private */ def visitIdentifier(token: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitIfStatement(node: IfStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitImportDeclaration(node: ImportDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitIndexMemberDeclaration(node: IndexMemberDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitIndexSignature(node: IndexSignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitInterfaceDeclaration(node: InterfaceDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitInvocationExpression(node: InvocationExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitLabeledStatement(node: LabeledStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMemberAccessExpression(node: MemberAccessExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMemberFunctionDeclaration(node: MemberFunctionDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMemberVariableDeclaration(node: MemberVariableDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitMethodSignature(node: MethodSignatureSyntax): js.Any = js.native
  /* private */ def visitModifiers(modifiers: js.Any): js.Any = js.native
  /* CompleteClass */
  override def visitModuleDeclaration(node: ModuleDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitModuleNameModuleReference(node: ModuleNameModuleReferenceSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitObjectCreationExpression(node: ObjectCreationExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitObjectLiteralExpression(node: ObjectLiteralExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitObjectType(node: ObjectTypeSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitOmittedExpression(node: OmittedExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParameter(node: ParameterSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParameterList(node: ParameterListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParenthesizedArrowFunctionExpression(node: ParenthesizedArrowFunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitParenthesizedExpression(node: ParenthesizedExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPostfixUnaryExpression(node: PostfixUnaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPrefixUnaryExpression(node: PrefixUnaryExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitPropertySignature(node: PropertySignatureSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitQualifiedName(node: QualifiedNameSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitReturnStatement(node: ReturnStatementSyntax): js.Any = js.native
  def visitSeparatedSyntaxList(list: ISeparatedSyntaxList): ISeparatedSyntaxList2 = js.native
  /* CompleteClass */
  override def visitSetAccessor(node: SetAccessorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSimpleArrowFunctionExpression(node: SimpleArrowFunctionExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSimplePropertyAssignment(node: SimplePropertyAssignmentSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSourceUnit(node: SourceUnitSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitSwitchStatement(node: SwitchStatementSyntax): js.Any = js.native
  def visitSyntaxList(node: ISyntaxList): ISyntaxList2 = js.native
  /* CompleteClass */
  override def visitThrowStatement(node: ThrowStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitToken(token: ISyntaxToken): js.Any = js.native
  def visitTokenWorker(token: ISyntaxToken): IASTToken = js.native
  /* CompleteClass */
  override def visitTryStatement(node: TryStatementSyntax): js.Any = js.native
  def visitType(`type`: ITypeSyntax): AST = js.native
  /* CompleteClass */
  override def visitTypeAnnotation(node: TypeAnnotationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeArgumentList(node: TypeArgumentListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeOfExpression(node: TypeOfExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeParameter(node: TypeParameterSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeParameterList(node: TypeParameterListSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitTypeQuery(node: TypeQuerySyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableDeclaration(node: VariableDeclarationSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableDeclarator(node: VariableDeclaratorSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVariableStatement(node: VariableStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitVoidExpression(node: VoidExpressionSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitWhileStatement(node: WhileStatementSyntax): js.Any = js.native
  /* CompleteClass */
  override def visitWithStatement(node: WithStatementSyntax): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.SyntaxTreeToAstVisitor")
@js.native
object SyntaxTreeToAstVisitor extends js.Object {
  def visit(
    syntaxTree: SyntaxTree,
    fileName: String,
    compilationSettings: ImmutableCompilationSettings,
    incrementalAST: Boolean
  ): SourceUnit = js.native
}

