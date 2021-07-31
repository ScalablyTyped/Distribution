package typings.typescriptServices.TypeScript.Services.Formatting

import typings.typescriptServices.FormattingOptions
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
import typings.typescriptServices.TypeScript.SyntaxWalker
import typings.typescriptServices.TypeScript.TextSpan
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

trait IndentationTrackingWalker
  extends StObject
     with SyntaxWalker {
  
  var _indentationNodeContextPool: js.Any
  
  var _lastTriviaWasNewLine: js.Any
  
  var _parent: js.Any
  
  var _position: js.Any
  
  var _snapshot: js.Any
  
  var _textSpan: js.Any
  
  def forceIndentNextToken(tokenStart: Double): Unit
  
  /* private */ def forceRecomputeIndentationOfParent(tokenStart: js.Any, newLineAdded: js.Any): js.Any
  
  def forceSkipIndentingNextToken(tokenStart: Double): Unit
  
  /* private */ def getCommentIndentationAmount(token: js.Any): js.Any
  
  /* private */ def getNodeIndentation(node: js.Any, newLineInsertedByFormatting: js.Any): js.Any
  
  /* private */ def getTokenIndentationAmount(token: js.Any): js.Any
  
  def indentToken(token: ISyntaxToken, indentationAmount: Double, commentIndentationAmount: Double): Unit
  
  def indentationNodeContextPool(): IndentationNodeContextPool
  
  var options: FormattingOptions
  
  def parent(): IndentationNodeContext
  
  def position(): Double
  
  /* private */ def shouldIndentBlockInParent(parent: js.Any): js.Any
  
  def snapshot(): ITextSnapshot
  
  def textSpan(): TextSpan
  
  def visitTokenInSpan(token: ISyntaxToken): Unit
}
object IndentationTrackingWalker {
  
  @scala.inline
  def apply(
    _indentationNodeContextPool: js.Any,
    _lastTriviaWasNewLine: js.Any,
    _parent: js.Any,
    _position: js.Any,
    _snapshot: js.Any,
    _textSpan: js.Any,
    forceIndentNextToken: Double => Unit,
    forceRecomputeIndentationOfParent: (js.Any, js.Any) => js.Any,
    forceSkipIndentingNextToken: Double => Unit,
    getCommentIndentationAmount: js.Any => js.Any,
    getNodeIndentation: (js.Any, js.Any) => js.Any,
    getTokenIndentationAmount: js.Any => js.Any,
    indentToken: (ISyntaxToken, Double, Double) => Unit,
    indentationNodeContextPool: () => IndentationNodeContextPool,
    options: FormattingOptions,
    parent: () => IndentationNodeContext,
    position: () => Double,
    shouldIndentBlockInParent: js.Any => js.Any,
    snapshot: () => ITextSnapshot,
    textSpan: () => TextSpan,
    visitArgumentList: ArgumentListSyntax => js.Any,
    visitArrayLiteralExpression: ArrayLiteralExpressionSyntax => js.Any,
    visitArrayType: ArrayTypeSyntax => js.Any,
    visitBinaryExpression: BinaryExpressionSyntax => js.Any,
    visitBlock: BlockSyntax => js.Any,
    visitBreakStatement: BreakStatementSyntax => js.Any,
    visitCallSignature: CallSignatureSyntax => js.Any,
    visitCaseSwitchClause: CaseSwitchClauseSyntax => js.Any,
    visitCastExpression: CastExpressionSyntax => js.Any,
    visitCatchClause: CatchClauseSyntax => js.Any,
    visitClassDeclaration: ClassDeclarationSyntax => js.Any,
    visitConditionalExpression: ConditionalExpressionSyntax => js.Any,
    visitConstraint: ConstraintSyntax => js.Any,
    visitConstructSignature: ConstructSignatureSyntax => js.Any,
    visitConstructorDeclaration: ConstructorDeclarationSyntax => js.Any,
    visitConstructorType: ConstructorTypeSyntax => js.Any,
    visitContinueStatement: ContinueStatementSyntax => js.Any,
    visitDebuggerStatement: DebuggerStatementSyntax => js.Any,
    visitDefaultSwitchClause: DefaultSwitchClauseSyntax => js.Any,
    visitDeleteExpression: DeleteExpressionSyntax => js.Any,
    visitDoStatement: DoStatementSyntax => js.Any,
    visitElementAccessExpression: ElementAccessExpressionSyntax => js.Any,
    visitElseClause: ElseClauseSyntax => js.Any,
    visitEmptyStatement: EmptyStatementSyntax => js.Any,
    visitEnumDeclaration: EnumDeclarationSyntax => js.Any,
    visitEnumElement: EnumElementSyntax => js.Any,
    visitEqualsValueClause: EqualsValueClauseSyntax => js.Any,
    visitExportAssignment: ExportAssignmentSyntax => js.Any,
    visitExpressionStatement: ExpressionStatementSyntax => js.Any,
    visitExternalModuleReference: ExternalModuleReferenceSyntax => js.Any,
    visitFinallyClause: FinallyClauseSyntax => js.Any,
    visitForInStatement: ForInStatementSyntax => js.Any,
    visitForStatement: ForStatementSyntax => js.Any,
    visitFunctionDeclaration: FunctionDeclarationSyntax => js.Any,
    visitFunctionExpression: FunctionExpressionSyntax => js.Any,
    visitFunctionPropertyAssignment: FunctionPropertyAssignmentSyntax => js.Any,
    visitFunctionType: FunctionTypeSyntax => js.Any,
    visitGenericType: GenericTypeSyntax => js.Any,
    visitGetAccessor: GetAccessorSyntax => js.Any,
    visitHeritageClause: HeritageClauseSyntax => js.Any,
    visitIfStatement: IfStatementSyntax => js.Any,
    visitImportDeclaration: ImportDeclarationSyntax => js.Any,
    visitIndexMemberDeclaration: IndexMemberDeclarationSyntax => js.Any,
    visitIndexSignature: IndexSignatureSyntax => js.Any,
    visitInterfaceDeclaration: InterfaceDeclarationSyntax => js.Any,
    visitInvocationExpression: InvocationExpressionSyntax => js.Any,
    visitLabeledStatement: LabeledStatementSyntax => js.Any,
    visitList: ISyntaxList => Unit,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => js.Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => js.Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => js.Any,
    visitMethodSignature: MethodSignatureSyntax => js.Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => js.Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => js.Any,
    visitNode: SyntaxNode => Unit,
    visitNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => js.Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => js.Any,
    visitObjectType: ObjectTypeSyntax => js.Any,
    visitOmittedExpression: OmittedExpressionSyntax => js.Any,
    visitOptionalNode: SyntaxNode => Unit,
    visitOptionalNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitOptionalToken: js.Any => js.Any,
    visitParameter: ParameterSyntax => js.Any,
    visitParameterList: ParameterListSyntax => js.Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => js.Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => js.Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => js.Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => js.Any,
    visitPropertySignature: PropertySignatureSyntax => js.Any,
    visitQualifiedName: QualifiedNameSyntax => js.Any,
    visitReturnStatement: ReturnStatementSyntax => js.Any,
    visitSeparatedList: ISeparatedSyntaxList => Unit,
    visitSetAccessor: SetAccessorSyntax => js.Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => js.Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => js.Any,
    visitSourceUnit: SourceUnitSyntax => js.Any,
    visitSwitchStatement: SwitchStatementSyntax => js.Any,
    visitThrowStatement: ThrowStatementSyntax => js.Any,
    visitToken: ISyntaxToken => js.Any,
    visitTokenInSpan: ISyntaxToken => Unit,
    visitTryStatement: TryStatementSyntax => js.Any,
    visitTypeAnnotation: TypeAnnotationSyntax => js.Any,
    visitTypeArgumentList: TypeArgumentListSyntax => js.Any,
    visitTypeOfExpression: TypeOfExpressionSyntax => js.Any,
    visitTypeParameter: TypeParameterSyntax => js.Any,
    visitTypeParameterList: TypeParameterListSyntax => js.Any,
    visitTypeQuery: TypeQuerySyntax => js.Any,
    visitVariableDeclaration: VariableDeclarationSyntax => js.Any,
    visitVariableDeclarator: VariableDeclaratorSyntax => js.Any,
    visitVariableStatement: VariableStatementSyntax => js.Any,
    visitVoidExpression: VoidExpressionSyntax => js.Any,
    visitWhileStatement: WhileStatementSyntax => js.Any,
    visitWithStatement: WithStatementSyntax => js.Any
  ): IndentationTrackingWalker = {
    val __obj = js.Dynamic.literal(_indentationNodeContextPool = _indentationNodeContextPool.asInstanceOf[js.Any], _lastTriviaWasNewLine = _lastTriviaWasNewLine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _position = _position.asInstanceOf[js.Any], _snapshot = _snapshot.asInstanceOf[js.Any], _textSpan = _textSpan.asInstanceOf[js.Any], forceIndentNextToken = js.Any.fromFunction1(forceIndentNextToken), forceRecomputeIndentationOfParent = js.Any.fromFunction2(forceRecomputeIndentationOfParent), forceSkipIndentingNextToken = js.Any.fromFunction1(forceSkipIndentingNextToken), getCommentIndentationAmount = js.Any.fromFunction1(getCommentIndentationAmount), getNodeIndentation = js.Any.fromFunction2(getNodeIndentation), getTokenIndentationAmount = js.Any.fromFunction1(getTokenIndentationAmount), indentToken = js.Any.fromFunction3(indentToken), indentationNodeContextPool = js.Any.fromFunction0(indentationNodeContextPool), options = options.asInstanceOf[js.Any], parent = js.Any.fromFunction0(parent), position = js.Any.fromFunction0(position), shouldIndentBlockInParent = js.Any.fromFunction1(shouldIndentBlockInParent), snapshot = js.Any.fromFunction0(snapshot), textSpan = js.Any.fromFunction0(textSpan), visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1(visitOptionalNode), visitOptionalNodeOrToken = js.Any.fromFunction1(visitOptionalNodeOrToken), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTokenInSpan = js.Any.fromFunction1(visitTokenInSpan), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[IndentationTrackingWalker]
  }
  
  @scala.inline
  implicit class IndentationTrackingWalkerMutableBuilder[Self <: IndentationTrackingWalker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceIndentNextToken(value: Double => Unit): Self = StObject.set(x, "forceIndentNextToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForceRecomputeIndentationOfParent(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "forceRecomputeIndentationOfParent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setForceSkipIndentingNextToken(value: Double => Unit): Self = StObject.set(x, "forceSkipIndentingNextToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCommentIndentationAmount(value: js.Any => js.Any): Self = StObject.set(x, "getCommentIndentationAmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeIndentation(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getNodeIndentation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTokenIndentationAmount(value: js.Any => js.Any): Self = StObject.set(x, "getTokenIndentationAmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndentToken(value: (ISyntaxToken, Double, Double) => Unit): Self = StObject.set(x, "indentToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIndentationNodeContextPool(value: () => IndentationNodeContextPool): Self = StObject.set(x, "indentationNodeContextPool", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: FormattingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: () => IndentationNodeContext): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: () => Double): Self = StObject.set(x, "position", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldIndentBlockInParent(value: js.Any => js.Any): Self = StObject.set(x, "shouldIndentBlockInParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSnapshot(value: () => ITextSnapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextSpan(value: () => TextSpan): Self = StObject.set(x, "textSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisitTokenInSpan(value: ISyntaxToken => Unit): Self = StObject.set(x, "visitTokenInSpan", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_indentationNodeContextPool(value: js.Any): Self = StObject.set(x, "_indentationNodeContextPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastTriviaWasNewLine(value: js.Any): Self = StObject.set(x, "_lastTriviaWasNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parent(value: js.Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_position(value: js.Any): Self = StObject.set(x, "_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_snapshot(value: js.Any): Self = StObject.set(x, "_snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textSpan(value: js.Any): Self = StObject.set(x, "_textSpan", value.asInstanceOf[js.Any])
  }
}
