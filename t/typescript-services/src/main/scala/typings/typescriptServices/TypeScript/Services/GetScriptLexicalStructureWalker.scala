package typings.typescriptServices.TypeScript.Services

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
import typings.typescriptServices.TypeScript.PositionTrackingWalker
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

trait GetScriptLexicalStructureWalker
  extends StObject
     with PositionTrackingWalker {
  
  /* private */ def addAdditionalSpan(node: Any, key: Any): Any
  
  /* private */ def collectItems(items: Any, scope: Any): Any
  
  /* private */ def createItem(node: Any, modifiers: Any, kind: Any, name: Any): Any
  
  /* private */ def createScope(): Any
  
  /* private */ var currentInterfaceDeclaration: Any
  
  /* private */ var currentMemberVariableDeclaration: Any
  
  /* private */ var currentScope: Any
  
  /* private */ var currentVariableStatement: Any
  
  /* private */ var fileName: Any
  
  /* private */ def getKindModifiers(modifiers: Any): Any
  
  /* private */ def getModuleNames(node: Any): Any
  
  /* private */ def getModuleNamesHelper(name: Any, result: Any): Any
  
  /* private */ var kindStack: Any
  
  /* private */ var nameStack: Any
  
  /* private */ var parentScopes: Any
  
  /* private */ def popScope(): Any
  
  /* private */ def pushNewContainerScope(containerName: Any, kind: Any): Any
  
  /* private */ def visitModuleDeclarationWorker(node: Any, names: Any, nameIndex: Any): Any
}
object GetScriptLexicalStructureWalker {
  
  inline def apply(
    _position: Any,
    addAdditionalSpan: (Any, Any) => Any,
    collectItems: (Any, Any) => Any,
    createItem: (Any, Any, Any, Any) => Any,
    createScope: () => Any,
    currentInterfaceDeclaration: Any,
    currentMemberVariableDeclaration: Any,
    currentScope: Any,
    currentVariableStatement: Any,
    fileName: Any,
    getKindModifiers: Any => Any,
    getModuleNames: Any => Any,
    getModuleNamesHelper: (Any, Any) => Any,
    kindStack: Any,
    nameStack: Any,
    parentScopes: Any,
    popScope: () => Any,
    position: () => Double,
    pushNewContainerScope: (Any, Any) => Any,
    skip: ISyntaxElement => Unit,
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
    visitModuleDeclarationWorker: (Any, Any, Any) => Any,
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
  ): GetScriptLexicalStructureWalker = {
    val __obj = js.Dynamic.literal(_position = _position.asInstanceOf[js.Any], addAdditionalSpan = js.Any.fromFunction2(addAdditionalSpan), collectItems = js.Any.fromFunction2(collectItems), createItem = js.Any.fromFunction4(createItem), createScope = js.Any.fromFunction0(createScope), currentInterfaceDeclaration = currentInterfaceDeclaration.asInstanceOf[js.Any], currentMemberVariableDeclaration = currentMemberVariableDeclaration.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], currentVariableStatement = currentVariableStatement.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], getKindModifiers = js.Any.fromFunction1(getKindModifiers), getModuleNames = js.Any.fromFunction1(getModuleNames), getModuleNamesHelper = js.Any.fromFunction2(getModuleNamesHelper), kindStack = kindStack.asInstanceOf[js.Any], nameStack = nameStack.asInstanceOf[js.Any], parentScopes = parentScopes.asInstanceOf[js.Any], popScope = js.Any.fromFunction0(popScope), position = js.Any.fromFunction0(position), pushNewContainerScope = js.Any.fromFunction2(pushNewContainerScope), skip = js.Any.fromFunction1(skip), visitArgumentList = js.Any.fromFunction1(visitArgumentList), visitArrayLiteralExpression = js.Any.fromFunction1(visitArrayLiteralExpression), visitArrayType = js.Any.fromFunction1(visitArrayType), visitBinaryExpression = js.Any.fromFunction1(visitBinaryExpression), visitBlock = js.Any.fromFunction1(visitBlock), visitBreakStatement = js.Any.fromFunction1(visitBreakStatement), visitCallSignature = js.Any.fromFunction1(visitCallSignature), visitCaseSwitchClause = js.Any.fromFunction1(visitCaseSwitchClause), visitCastExpression = js.Any.fromFunction1(visitCastExpression), visitCatchClause = js.Any.fromFunction1(visitCatchClause), visitClassDeclaration = js.Any.fromFunction1(visitClassDeclaration), visitConditionalExpression = js.Any.fromFunction1(visitConditionalExpression), visitConstraint = js.Any.fromFunction1(visitConstraint), visitConstructSignature = js.Any.fromFunction1(visitConstructSignature), visitConstructorDeclaration = js.Any.fromFunction1(visitConstructorDeclaration), visitConstructorType = js.Any.fromFunction1(visitConstructorType), visitContinueStatement = js.Any.fromFunction1(visitContinueStatement), visitDebuggerStatement = js.Any.fromFunction1(visitDebuggerStatement), visitDefaultSwitchClause = js.Any.fromFunction1(visitDefaultSwitchClause), visitDeleteExpression = js.Any.fromFunction1(visitDeleteExpression), visitDoStatement = js.Any.fromFunction1(visitDoStatement), visitElementAccessExpression = js.Any.fromFunction1(visitElementAccessExpression), visitElseClause = js.Any.fromFunction1(visitElseClause), visitEmptyStatement = js.Any.fromFunction1(visitEmptyStatement), visitEnumDeclaration = js.Any.fromFunction1(visitEnumDeclaration), visitEnumElement = js.Any.fromFunction1(visitEnumElement), visitEqualsValueClause = js.Any.fromFunction1(visitEqualsValueClause), visitExportAssignment = js.Any.fromFunction1(visitExportAssignment), visitExpressionStatement = js.Any.fromFunction1(visitExpressionStatement), visitExternalModuleReference = js.Any.fromFunction1(visitExternalModuleReference), visitFinallyClause = js.Any.fromFunction1(visitFinallyClause), visitForInStatement = js.Any.fromFunction1(visitForInStatement), visitForStatement = js.Any.fromFunction1(visitForStatement), visitFunctionDeclaration = js.Any.fromFunction1(visitFunctionDeclaration), visitFunctionExpression = js.Any.fromFunction1(visitFunctionExpression), visitFunctionPropertyAssignment = js.Any.fromFunction1(visitFunctionPropertyAssignment), visitFunctionType = js.Any.fromFunction1(visitFunctionType), visitGenericType = js.Any.fromFunction1(visitGenericType), visitGetAccessor = js.Any.fromFunction1(visitGetAccessor), visitHeritageClause = js.Any.fromFunction1(visitHeritageClause), visitIfStatement = js.Any.fromFunction1(visitIfStatement), visitImportDeclaration = js.Any.fromFunction1(visitImportDeclaration), visitIndexMemberDeclaration = js.Any.fromFunction1(visitIndexMemberDeclaration), visitIndexSignature = js.Any.fromFunction1(visitIndexSignature), visitInterfaceDeclaration = js.Any.fromFunction1(visitInterfaceDeclaration), visitInvocationExpression = js.Any.fromFunction1(visitInvocationExpression), visitLabeledStatement = js.Any.fromFunction1(visitLabeledStatement), visitList = js.Any.fromFunction1(visitList), visitMemberAccessExpression = js.Any.fromFunction1(visitMemberAccessExpression), visitMemberFunctionDeclaration = js.Any.fromFunction1(visitMemberFunctionDeclaration), visitMemberVariableDeclaration = js.Any.fromFunction1(visitMemberVariableDeclaration), visitMethodSignature = js.Any.fromFunction1(visitMethodSignature), visitModuleDeclaration = js.Any.fromFunction1(visitModuleDeclaration), visitModuleDeclarationWorker = js.Any.fromFunction3(visitModuleDeclarationWorker), visitModuleNameModuleReference = js.Any.fromFunction1(visitModuleNameModuleReference), visitNode = js.Any.fromFunction1(visitNode), visitNodeOrToken = js.Any.fromFunction1(visitNodeOrToken), visitObjectCreationExpression = js.Any.fromFunction1(visitObjectCreationExpression), visitObjectLiteralExpression = js.Any.fromFunction1(visitObjectLiteralExpression), visitObjectType = js.Any.fromFunction1(visitObjectType), visitOmittedExpression = js.Any.fromFunction1(visitOmittedExpression), visitOptionalNode = js.Any.fromFunction1(visitOptionalNode), visitOptionalNodeOrToken = js.Any.fromFunction1(visitOptionalNodeOrToken), visitOptionalToken = js.Any.fromFunction1(visitOptionalToken), visitParameter = js.Any.fromFunction1(visitParameter), visitParameterList = js.Any.fromFunction1(visitParameterList), visitParenthesizedArrowFunctionExpression = js.Any.fromFunction1(visitParenthesizedArrowFunctionExpression), visitParenthesizedExpression = js.Any.fromFunction1(visitParenthesizedExpression), visitPostfixUnaryExpression = js.Any.fromFunction1(visitPostfixUnaryExpression), visitPrefixUnaryExpression = js.Any.fromFunction1(visitPrefixUnaryExpression), visitPropertySignature = js.Any.fromFunction1(visitPropertySignature), visitQualifiedName = js.Any.fromFunction1(visitQualifiedName), visitReturnStatement = js.Any.fromFunction1(visitReturnStatement), visitSeparatedList = js.Any.fromFunction1(visitSeparatedList), visitSetAccessor = js.Any.fromFunction1(visitSetAccessor), visitSimpleArrowFunctionExpression = js.Any.fromFunction1(visitSimpleArrowFunctionExpression), visitSimplePropertyAssignment = js.Any.fromFunction1(visitSimplePropertyAssignment), visitSourceUnit = js.Any.fromFunction1(visitSourceUnit), visitSwitchStatement = js.Any.fromFunction1(visitSwitchStatement), visitThrowStatement = js.Any.fromFunction1(visitThrowStatement), visitToken = js.Any.fromFunction1(visitToken), visitTryStatement = js.Any.fromFunction1(visitTryStatement), visitTypeAnnotation = js.Any.fromFunction1(visitTypeAnnotation), visitTypeArgumentList = js.Any.fromFunction1(visitTypeArgumentList), visitTypeOfExpression = js.Any.fromFunction1(visitTypeOfExpression), visitTypeParameter = js.Any.fromFunction1(visitTypeParameter), visitTypeParameterList = js.Any.fromFunction1(visitTypeParameterList), visitTypeQuery = js.Any.fromFunction1(visitTypeQuery), visitVariableDeclaration = js.Any.fromFunction1(visitVariableDeclaration), visitVariableDeclarator = js.Any.fromFunction1(visitVariableDeclarator), visitVariableStatement = js.Any.fromFunction1(visitVariableStatement), visitVoidExpression = js.Any.fromFunction1(visitVoidExpression), visitWhileStatement = js.Any.fromFunction1(visitWhileStatement), visitWithStatement = js.Any.fromFunction1(visitWithStatement))
    __obj.asInstanceOf[GetScriptLexicalStructureWalker]
  }
  
  extension [Self <: GetScriptLexicalStructureWalker](x: Self) {
    
    inline def setAddAdditionalSpan(value: (Any, Any) => Any): Self = StObject.set(x, "addAdditionalSpan", js.Any.fromFunction2(value))
    
    inline def setCollectItems(value: (Any, Any) => Any): Self = StObject.set(x, "collectItems", js.Any.fromFunction2(value))
    
    inline def setCreateItem(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "createItem", js.Any.fromFunction4(value))
    
    inline def setCreateScope(value: () => Any): Self = StObject.set(x, "createScope", js.Any.fromFunction0(value))
    
    inline def setCurrentInterfaceDeclaration(value: Any): Self = StObject.set(x, "currentInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    inline def setCurrentMemberVariableDeclaration(value: Any): Self = StObject.set(x, "currentMemberVariableDeclaration", value.asInstanceOf[js.Any])
    
    inline def setCurrentScope(value: Any): Self = StObject.set(x, "currentScope", value.asInstanceOf[js.Any])
    
    inline def setCurrentVariableStatement(value: Any): Self = StObject.set(x, "currentVariableStatement", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: Any): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setGetKindModifiers(value: Any => Any): Self = StObject.set(x, "getKindModifiers", js.Any.fromFunction1(value))
    
    inline def setGetModuleNames(value: Any => Any): Self = StObject.set(x, "getModuleNames", js.Any.fromFunction1(value))
    
    inline def setGetModuleNamesHelper(value: (Any, Any) => Any): Self = StObject.set(x, "getModuleNamesHelper", js.Any.fromFunction2(value))
    
    inline def setKindStack(value: Any): Self = StObject.set(x, "kindStack", value.asInstanceOf[js.Any])
    
    inline def setNameStack(value: Any): Self = StObject.set(x, "nameStack", value.asInstanceOf[js.Any])
    
    inline def setParentScopes(value: Any): Self = StObject.set(x, "parentScopes", value.asInstanceOf[js.Any])
    
    inline def setPopScope(value: () => Any): Self = StObject.set(x, "popScope", js.Any.fromFunction0(value))
    
    inline def setPushNewContainerScope(value: (Any, Any) => Any): Self = StObject.set(x, "pushNewContainerScope", js.Any.fromFunction2(value))
    
    inline def setVisitModuleDeclarationWorker(value: (Any, Any, Any) => Any): Self = StObject.set(x, "visitModuleDeclarationWorker", js.Any.fromFunction3(value))
  }
}
