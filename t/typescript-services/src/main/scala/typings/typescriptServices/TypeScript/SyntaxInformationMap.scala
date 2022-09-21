package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxInformationMap
  extends StObject
     with SyntaxWalker {
  
  /* private */ var _currentPosition: Any
  
  /* private */ var _elementToParent: Any
  
  /* private */ var _parentStack: Any
  
  /* private */ var _previousToken: Any
  
  /* private */ var _previousTokenInformation: Any
  
  /* private */ var elementToPosition: Any
  
  def end(element: ISyntaxElement): Double
  
  def firstTokenInLineContainingToken(token: ISyntaxToken): ISyntaxToken
  
  def fullStart(element: ISyntaxElement): Double
  
  def isFirstTokenInLine(token: ISyntaxToken): Boolean
  
  /* private */ def isFirstTokenInLineWorker(information: Any): Any
  
  def parent(element: ISyntaxElement): SyntaxNode
  
  def previousToken(token: ISyntaxToken): ISyntaxToken
  
  def start(element: ISyntaxElement): Double
  
  def tokenInformation(token: ISyntaxToken): ITokenInformation
  
  /* private */ var tokenToInformation: Any
  
  /* private */ var trackParents: Any
  
  /* private */ var trackPreviousToken: Any
}
object SyntaxInformationMap {
  
  inline def apply(
    _currentPosition: Any,
    _elementToParent: Any,
    _parentStack: Any,
    _previousToken: Any,
    _previousTokenInformation: Any,
    elementToPosition: Any,
    end: ISyntaxElement => Double,
    firstTokenInLineContainingToken: ISyntaxToken => ISyntaxToken,
    fullStart: ISyntaxElement => Double,
    isFirstTokenInLine: ISyntaxToken => Boolean,
    isFirstTokenInLineWorker: Any => Any,
    parent: ISyntaxElement => SyntaxNode,
    previousToken: ISyntaxToken => ISyntaxToken,
    start: ISyntaxElement => Double,
    tokenInformation: ISyntaxToken => ITokenInformation,
    tokenToInformation: Any,
    trackParents: Any,
    trackPreviousToken: Any,
    visitArgumentList: ArgumentListSyntax => Any,
    visitArrayLiteralExpression: ArrayLiteralExpressionSyntax => Any,
    visitArrayType: ArrayTypeSyntax => Any,
    visitBinaryExpression: BinaryExpressionSyntax => Any,
    visitBlock: BlockSyntax => Any,
    visitBreakStatement: BreakStatementSyntax => Any,
    visitCallSignature: CallSignatureSyntax => Any,
    visitCaseSwitchClause: CaseSwitchClauseSyntax => Any,
    visitCastExpression: CastExpressionSyntax => Any,
    visitCatchClause: CatchClauseSyntax => Any,
    visitClassDeclaration: ClassDeclarationSyntax => Any,
    visitConditionalExpression: ConditionalExpressionSyntax => Any,
    visitConstraint: ConstraintSyntax => Any,
    visitConstructSignature: ConstructSignatureSyntax => Any,
    visitConstructorDeclaration: ConstructorDeclarationSyntax => Any,
    visitConstructorType: ConstructorTypeSyntax => Any,
    visitContinueStatement: ContinueStatementSyntax => Any,
    visitDebuggerStatement: DebuggerStatementSyntax => Any,
    visitDefaultSwitchClause: DefaultSwitchClauseSyntax => Any,
    visitDeleteExpression: DeleteExpressionSyntax => Any,
    visitDoStatement: DoStatementSyntax => Any,
    visitElementAccessExpression: ElementAccessExpressionSyntax => Any,
    visitElseClause: ElseClauseSyntax => Any,
    visitEmptyStatement: EmptyStatementSyntax => Any,
    visitEnumDeclaration: EnumDeclarationSyntax => Any,
    visitEnumElement: EnumElementSyntax => Any,
    visitEqualsValueClause: EqualsValueClauseSyntax => Any,
    visitExportAssignment: ExportAssignmentSyntax => Any,
    visitExpressionStatement: ExpressionStatementSyntax => Any,
    visitExternalModuleReference: ExternalModuleReferenceSyntax => Any,
    visitFinallyClause: FinallyClauseSyntax => Any,
    visitForInStatement: ForInStatementSyntax => Any,
    visitForStatement: ForStatementSyntax => Any,
    visitFunctionDeclaration: FunctionDeclarationSyntax => Any,
    visitFunctionExpression: FunctionExpressionSyntax => Any,
    visitFunctionPropertyAssignment: FunctionPropertyAssignmentSyntax => Any,
    visitFunctionType: FunctionTypeSyntax => Any,
    visitGenericType: GenericTypeSyntax => Any,
    visitGetAccessor: GetAccessorSyntax => Any,
    visitHeritageClause: HeritageClauseSyntax => Any,
    visitIfStatement: IfStatementSyntax => Any,
    visitImportDeclaration: ImportDeclarationSyntax => Any,
    visitIndexMemberDeclaration: IndexMemberDeclarationSyntax => Any,
    visitIndexSignature: IndexSignatureSyntax => Any,
    visitInterfaceDeclaration: InterfaceDeclarationSyntax => Any,
    visitInvocationExpression: InvocationExpressionSyntax => Any,
    visitLabeledStatement: LabeledStatementSyntax => Any,
    visitList: ISyntaxList => Unit,
    visitMemberAccessExpression: MemberAccessExpressionSyntax => Any,
    visitMemberFunctionDeclaration: MemberFunctionDeclarationSyntax => Any,
    visitMemberVariableDeclaration: MemberVariableDeclarationSyntax => Any,
    visitMethodSignature: MethodSignatureSyntax => Any,
    visitModuleDeclaration: ModuleDeclarationSyntax => Any,
    visitModuleNameModuleReference: ModuleNameModuleReferenceSyntax => Any,
    visitNode: SyntaxNode => Unit,
    visitNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitObjectCreationExpression: ObjectCreationExpressionSyntax => Any,
    visitObjectLiteralExpression: ObjectLiteralExpressionSyntax => Any,
    visitObjectType: ObjectTypeSyntax => Any,
    visitOmittedExpression: OmittedExpressionSyntax => Any,
    visitOptionalNode: SyntaxNode => Unit,
    visitOptionalNodeOrToken: ISyntaxNodeOrToken => Unit,
    visitOptionalToken: Any => Any,
    visitParameter: ParameterSyntax => Any,
    visitParameterList: ParameterListSyntax => Any,
    visitParenthesizedArrowFunctionExpression: ParenthesizedArrowFunctionExpressionSyntax => Any,
    visitParenthesizedExpression: ParenthesizedExpressionSyntax => Any,
    visitPostfixUnaryExpression: PostfixUnaryExpressionSyntax => Any,
    visitPrefixUnaryExpression: PrefixUnaryExpressionSyntax => Any,
    visitPropertySignature: PropertySignatureSyntax => Any,
    visitQualifiedName: QualifiedNameSyntax => Any,
    visitReturnStatement: ReturnStatementSyntax => Any,
    visitSeparatedList: ISeparatedSyntaxList => Unit,
    visitSetAccessor: SetAccessorSyntax => Any,
    visitSimpleArrowFunctionExpression: SimpleArrowFunctionExpressionSyntax => Any,
    visitSimplePropertyAssignment: SimplePropertyAssignmentSyntax => Any,
    visitSourceUnit: SourceUnitSyntax => Any,
    visitSwitchStatement: SwitchStatementSyntax => Any,
    visitThrowStatement: ThrowStatementSyntax => Any,
    visitToken: ISyntaxToken => Any,
    visitTryStatement: TryStatementSyntax => Any,
    visitTypeAnnotation: TypeAnnotationSyntax => Any,
    visitTypeArgumentList: TypeArgumentListSyntax => Any,
    visitTypeOfExpression: TypeOfExpressionSyntax => Any,
    visitTypeParameter: TypeParameterSyntax => Any,
    visitTypeParameterList: TypeParameterListSyntax => Any,
    visitTypeQuery: TypeQuerySyntax => Any,
    visitVariableDeclaration: VariableDeclarationSyntax => Any,
    visitVariableDeclarator: VariableDeclaratorSyntax => Any,
    visitVariableStatement: VariableStatementSyntax => Any,
    visitVoidExpression: VoidExpressionSyntax => Any,
    visitWhileStatement: WhileStatementSyntax => Any,
    visitWithStatement: WithStatementSyntax => Any
  ): SyntaxInformationMap = {
    val __obj = js.Dynamic.literal(_currentPosition = _currentPosition.asInstanceOf[js.Any], _elementToParent = _elementToParent.asInstanceOf[js.Any], _parentStack = _parentStack.asInstanceOf[js.Any], _previousToken = _previousToken.asInstanceOf[js.Any], _previousTokenInformation = _previousTokenInformation.asInstanceOf[js.Any], elementToPosition = elementToPosition.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), firstTokenInLineContainingToken = js.Any.fromFunction1(firstTokenInLineContainingToken), fullStart = js.Any.fromFunction1(fullStart), isFirstTokenInLine = js.Any.fromFunction1(isFirstTokenInLine), isFirstTokenInLineWorker = js.Any.fromFunction1(isFirstTokenInLineWorker), parent = js.Any.fromFunction1(parent), previousToken = js.Any.fromFunction1(previousToken), start = js.Any.fromFunction1(start), tokenInformation = js.Any.fromFunction1(tokenInformation), tokenToInformation = tokenToInformation.asInstanceOf[js.Any], trackParents = trackParents.asInstanceOf[js.Any], trackPreviousToken = trackPreviousToken.asInstanceOf[js.Any], visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1(visitOptionalNode), visitOptionalNodeOrToken = js.Any.fromFunction1(visitOptionalNodeOrToken), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[SyntaxInformationMap]
  }
  
  extension [Self <: SyntaxInformationMap](x: Self) {
    
    inline def setElementToPosition(value: Any): Self = StObject.set(x, "elementToPosition", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: ISyntaxElement => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setFirstTokenInLineContainingToken(value: ISyntaxToken => ISyntaxToken): Self = StObject.set(x, "firstTokenInLineContainingToken", js.Any.fromFunction1(value))
    
    inline def setFullStart(value: ISyntaxElement => Double): Self = StObject.set(x, "fullStart", js.Any.fromFunction1(value))
    
    inline def setIsFirstTokenInLine(value: ISyntaxToken => Boolean): Self = StObject.set(x, "isFirstTokenInLine", js.Any.fromFunction1(value))
    
    inline def setIsFirstTokenInLineWorker(value: Any => Any): Self = StObject.set(x, "isFirstTokenInLineWorker", js.Any.fromFunction1(value))
    
    inline def setParent(value: ISyntaxElement => SyntaxNode): Self = StObject.set(x, "parent", js.Any.fromFunction1(value))
    
    inline def setPreviousToken(value: ISyntaxToken => ISyntaxToken): Self = StObject.set(x, "previousToken", js.Any.fromFunction1(value))
    
    inline def setStart(value: ISyntaxElement => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setTokenInformation(value: ISyntaxToken => ITokenInformation): Self = StObject.set(x, "tokenInformation", js.Any.fromFunction1(value))
    
    inline def setTokenToInformation(value: Any): Self = StObject.set(x, "tokenToInformation", value.asInstanceOf[js.Any])
    
    inline def setTrackParents(value: Any): Self = StObject.set(x, "trackParents", value.asInstanceOf[js.Any])
    
    inline def setTrackPreviousToken(value: Any): Self = StObject.set(x, "trackPreviousToken", value.asInstanceOf[js.Any])
    
    inline def set_currentPosition(value: Any): Self = StObject.set(x, "_currentPosition", value.asInstanceOf[js.Any])
    
    inline def set_elementToParent(value: Any): Self = StObject.set(x, "_elementToParent", value.asInstanceOf[js.Any])
    
    inline def set_parentStack(value: Any): Self = StObject.set(x, "_parentStack", value.asInstanceOf[js.Any])
    
    inline def set_previousToken(value: Any): Self = StObject.set(x, "_previousToken", value.asInstanceOf[js.Any])
    
    inline def set_previousTokenInformation(value: Any): Self = StObject.set(x, "_previousTokenInformation", value.asInstanceOf[js.Any])
  }
}
