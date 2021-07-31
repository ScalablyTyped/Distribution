package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxInformationMap
  extends StObject
     with SyntaxWalker {
  
  var _currentPosition: js.Any
  
  var _elementToParent: js.Any
  
  var _parentStack: js.Any
  
  var _previousToken: js.Any
  
  var _previousTokenInformation: js.Any
  
  var elementToPosition: js.Any
  
  def end(element: ISyntaxElement): Double
  
  def firstTokenInLineContainingToken(token: ISyntaxToken): ISyntaxToken
  
  def fullStart(element: ISyntaxElement): Double
  
  def isFirstTokenInLine(token: ISyntaxToken): Boolean
  
  /* private */ def isFirstTokenInLineWorker(information: js.Any): js.Any
  
  def parent(element: ISyntaxElement): SyntaxNode
  
  def previousToken(token: ISyntaxToken): ISyntaxToken
  
  def start(element: ISyntaxElement): Double
  
  def tokenInformation(token: ISyntaxToken): ITokenInformation
  
  var tokenToInformation: js.Any
  
  var trackParents: js.Any
  
  var trackPreviousToken: js.Any
}
object SyntaxInformationMap {
  
  @scala.inline
  def apply(
    _currentPosition: js.Any,
    _elementToParent: js.Any,
    _parentStack: js.Any,
    _previousToken: js.Any,
    _previousTokenInformation: js.Any,
    elementToPosition: js.Any,
    end: ISyntaxElement => Double,
    firstTokenInLineContainingToken: ISyntaxToken => ISyntaxToken,
    fullStart: ISyntaxElement => Double,
    isFirstTokenInLine: ISyntaxToken => Boolean,
    isFirstTokenInLineWorker: js.Any => js.Any,
    parent: ISyntaxElement => SyntaxNode,
    previousToken: ISyntaxToken => ISyntaxToken,
    start: ISyntaxElement => Double,
    tokenInformation: ISyntaxToken => ITokenInformation,
    tokenToInformation: js.Any,
    trackParents: js.Any,
    trackPreviousToken: js.Any,
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
  ): SyntaxInformationMap = {
    val __obj = js.Dynamic.literal(_currentPosition = _currentPosition.asInstanceOf[js.Any], _elementToParent = _elementToParent.asInstanceOf[js.Any], _parentStack = _parentStack.asInstanceOf[js.Any], _previousToken = _previousToken.asInstanceOf[js.Any], _previousTokenInformation = _previousTokenInformation.asInstanceOf[js.Any], elementToPosition = elementToPosition.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), firstTokenInLineContainingToken = js.Any.fromFunction1(firstTokenInLineContainingToken), fullStart = js.Any.fromFunction1(fullStart), isFirstTokenInLine = js.Any.fromFunction1(isFirstTokenInLine), isFirstTokenInLineWorker = js.Any.fromFunction1(isFirstTokenInLineWorker), parent = js.Any.fromFunction1(parent), previousToken = js.Any.fromFunction1(previousToken), start = js.Any.fromFunction1(start), tokenInformation = js.Any.fromFunction1(tokenInformation), tokenToInformation = tokenToInformation.asInstanceOf[js.Any], trackParents = trackParents.asInstanceOf[js.Any], trackPreviousToken = trackPreviousToken.asInstanceOf[js.Any], visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1(visitOptionalNode), visitOptionalNodeOrToken = js.Any.fromFunction1(visitOptionalNodeOrToken), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[SyntaxInformationMap]
  }
  
  @scala.inline
  implicit class SyntaxInformationMapMutableBuilder[Self <: SyntaxInformationMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementToPosition(value: js.Any): Self = StObject.set(x, "elementToPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: ISyntaxElement => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstTokenInLineContainingToken(value: ISyntaxToken => ISyntaxToken): Self = StObject.set(x, "firstTokenInLineContainingToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFullStart(value: ISyntaxElement => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFirstTokenInLine(value: ISyntaxToken => Boolean): Self = StObject.set(x, "isFirstTokenInLine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFirstTokenInLineWorker(value: js.Any => js.Any): Self = StObject.set(x, "isFirstTokenInLineWorker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: ISyntaxElement => SyntaxNode): Self = StObject.set(x, "parent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviousToken(value: ISyntaxToken => ISyntaxToken): Self = StObject.set(x, "previousToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: ISyntaxElement => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenInformation(value: ISyntaxToken => ITokenInformation): Self = StObject.set(x, "tokenInformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenToInformation(value: js.Any): Self = StObject.set(x, "tokenToInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackParents(value: js.Any): Self = StObject.set(x, "trackParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackPreviousToken(value: js.Any): Self = StObject.set(x, "trackPreviousToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentPosition(value: js.Any): Self = StObject.set(x, "_currentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_elementToParent(value: js.Any): Self = StObject.set(x, "_elementToParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentStack(value: js.Any): Self = StObject.set(x, "_parentStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_previousToken(value: js.Any): Self = StObject.set(x, "_previousToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_previousTokenInformation(value: js.Any): Self = StObject.set(x, "_previousTokenInformation", value.asInstanceOf[js.Any])
  }
}
