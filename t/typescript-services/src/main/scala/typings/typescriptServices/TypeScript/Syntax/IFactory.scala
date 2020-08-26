package typings.typescriptServices.TypeScript.Syntax

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
import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.IMemberExpressionSyntax
import typings.typescriptServices.TypeScript.IModuleReferenceSyntax
import typings.typescriptServices.TypeScript.INameSyntax
import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.IStatementSyntax
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ITypeSyntax
import typings.typescriptServices.TypeScript.IUnaryExpressionSyntax
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
import typings.typescriptServices.TypeScript.SyntaxKind
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactory extends js.Object {
  def argumentList(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken
  ): ArgumentListSyntax = js.native
  def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax = js.native
  def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax = js.native
  def binaryExpression(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax = js.native
  def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax = js.native
  def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax = js.native
  def callSignature(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax
  ): CallSignatureSyntax = js.native
  def caseSwitchClause(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax = js.native
  def castExpression(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax = js.native
  def catchClause(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax = js.native
  def classDeclaration(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax = js.native
  def conditionalExpression(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax = js.native
  def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
  def constructSignature(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax = js.native
  def constructorDeclaration(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): ConstructorDeclarationSyntax = js.native
  def constructorType(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax = js.native
  def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax = js.native
  def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax = js.native
  def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax = js.native
  def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax = js.native
  def doStatement(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax = js.native
  def elementAccessExpression(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax = js.native
  def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax = js.native
  def emptyStatement(semicolonToken: ISyntaxToken): EmptyStatementSyntax = js.native
  def enumDeclaration(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax = js.native
  def enumElement(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax = js.native
  def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax = js.native
  def exportAssignment(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax = js.native
  def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax = js.native
  def externalModuleReference(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax = js.native
  def finallyClause(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax = js.native
  def forInStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  def forStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForStatementSyntax = js.native
  def functionDeclaration(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax = js.native
  def functionExpression(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax = js.native
  def functionPropertyAssignment(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def functionType(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax = js.native
  def genericType(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax = js.native
  def getAccessor(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax = js.native
  def heritageClause(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
  def ifStatement(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax = js.native
  def importDeclaration(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax = js.native
  def indexMemberDeclaration(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax = js.native
  def indexSignature(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax = js.native
  def interfaceDeclaration(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax = js.native
  def invocationExpression(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax = js.native
  def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def memberFunctionDeclaration(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): MemberFunctionDeclarationSyntax = js.native
  def memberVariableDeclaration(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax = js.native
  def methodSignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax = js.native
  def moduleDeclaration(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax = js.native
  def moduleNameModuleReference(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
  def objectCreationExpression(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def objectLiteralExpression(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax = js.native
  def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax = js.native
  def omittedExpression(): OmittedExpressionSyntax = js.native
  def parameter(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): ParameterSyntax = js.native
  def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax = js.native
  def parenthesizedArrowFunctionExpression(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax = js.native
  def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax = js.native
  def postfixUnaryExpression(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax = js.native
  def prefixUnaryExpression(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax = js.native
  def propertySignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
  def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax = js.native
  def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def setAccessor(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax = js.native
  def simpleArrowFunctionExpression(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax = js.native
  def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax = js.native
  def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  def switchStatement(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax = js.native
  def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def tryStatement(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax = js.native
  def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax = js.native
  def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax = js.native
  def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def typeParameter(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax = js.native
  def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax = js.native
  def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax = js.native
  def variableDeclarator(
    propertyName: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): VariableDeclaratorSyntax = js.native
  def variableStatement(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax = js.native
  def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax = js.native
  def whileStatement(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  def withStatement(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax = js.native
}

object IFactory {
  @scala.inline
  def apply(
    argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax,
    arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax,
    arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax,
    binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax,
    block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax,
    breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax,
    callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax,
    caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax,
    castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax,
    catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax,
    classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax,
    conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax,
    constraint: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax,
    constructSignature: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax,
    constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax,
    constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax,
    continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax,
    debuggerStatement: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax,
    defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax,
    deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax,
    doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax,
    elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax,
    elseClause: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax,
    emptyStatement: ISyntaxToken => EmptyStatementSyntax,
    enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax,
    enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax,
    equalsValueClause: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax,
    exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax,
    expressionStatement: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax,
    externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax,
    finallyClause: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax,
    forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax,
    forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax,
    functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax,
    functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax,
    functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax,
    functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax,
    genericType: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax,
    getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax,
    heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax,
    ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax,
    importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax,
    indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax,
    indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax,
    interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax,
    invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax,
    labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax,
    memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax,
    memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax,
    memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax,
    methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax,
    moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax,
    moduleNameModuleReference: INameSyntax => ModuleNameModuleReferenceSyntax,
    objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax,
    objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax,
    objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax,
    omittedExpression: () => OmittedExpressionSyntax,
    parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax,
    parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax,
    parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax,
    parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax,
    postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax,
    prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax,
    propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax,
    qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax,
    returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax,
    setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax,
    simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax,
    simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax,
    sourceUnit: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax,
    switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax,
    throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax,
    tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax,
    typeAnnotation: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax,
    typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax,
    typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax,
    typeParameter: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax,
    typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax,
    typeQuery: (ISyntaxToken, INameSyntax) => TypeQuerySyntax,
    variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax,
    variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax,
    variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax,
    voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax,
    whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax,
    withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
  ): IFactory = {
    val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
    __obj.asInstanceOf[IFactory]
  }
  @scala.inline
  implicit class IFactoryOps[Self <: IFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentList(
      value: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArgumentListSyntax
    ): Self = this.set("argumentList", js.Any.fromFunction4(value))
    @scala.inline
    def setArrayLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ArrayLiteralExpressionSyntax): Self = this.set("arrayLiteralExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setArrayType(value: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => ArrayTypeSyntax): Self = this.set("arrayType", js.Any.fromFunction3(value))
    @scala.inline
    def setBinaryExpression(value: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => BinaryExpressionSyntax): Self = this.set("binaryExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setBlock(value: (ISyntaxToken, ISyntaxList, ISyntaxToken) => BlockSyntax): Self = this.set("block", js.Any.fromFunction3(value))
    @scala.inline
    def setBreakStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => BreakStatementSyntax): Self = this.set("breakStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setCallSignature(value: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallSignatureSyntax): Self = this.set("callSignature", js.Any.fromFunction3(value))
    @scala.inline
    def setCaseSwitchClause(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CaseSwitchClauseSyntax): Self = this.set("caseSwitchClause", js.Any.fromFunction4(value))
    @scala.inline
    def setCastExpression(value: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CastExpressionSyntax): Self = this.set("castExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setCatchClause(
      value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CatchClauseSyntax
    ): Self = this.set("catchClause", js.Any.fromFunction6(value))
    @scala.inline
    def setClassDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => ClassDeclarationSyntax
    ): Self = this.set("classDeclaration", js.Any.fromFunction8(value))
    @scala.inline
    def setConditionalExpression(
      value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => ConditionalExpressionSyntax
    ): Self = this.set("conditionalExpression", js.Any.fromFunction5(value))
    @scala.inline
    def setConstraint(value: (ISyntaxToken, ITypeSyntax) => ConstraintSyntax): Self = this.set("constraint", js.Any.fromFunction2(value))
    @scala.inline
    def setConstructSignature(value: (ISyntaxToken, CallSignatureSyntax) => ConstructSignatureSyntax): Self = this.set("constructSignature", js.Any.fromFunction2(value))
    @scala.inline
    def setConstructorDeclaration(
      value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => ConstructorDeclarationSyntax
    ): Self = this.set("constructorDeclaration", js.Any.fromFunction5(value))
    @scala.inline
    def setConstructorType(
      value: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => ConstructorTypeSyntax
    ): Self = this.set("constructorType", js.Any.fromFunction5(value))
    @scala.inline
    def setContinueStatement(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => ContinueStatementSyntax): Self = this.set("continueStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setDebuggerStatement(value: (ISyntaxToken, ISyntaxToken) => DebuggerStatementSyntax): Self = this.set("debuggerStatement", js.Any.fromFunction2(value))
    @scala.inline
    def setDefaultSwitchClause(value: (ISyntaxToken, ISyntaxToken, ISyntaxList) => DefaultSwitchClauseSyntax): Self = this.set("defaultSwitchClause", js.Any.fromFunction3(value))
    @scala.inline
    def setDeleteExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => DeleteExpressionSyntax): Self = this.set("deleteExpression", js.Any.fromFunction2(value))
    @scala.inline
    def setDoStatement(
      value: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => DoStatementSyntax
    ): Self = this.set("doStatement", js.Any.fromFunction7(value))
    @scala.inline
    def setElementAccessExpression(
      value: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ElementAccessExpressionSyntax
    ): Self = this.set("elementAccessExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setElseClause(value: (ISyntaxToken, IStatementSyntax) => ElseClauseSyntax): Self = this.set("elseClause", js.Any.fromFunction2(value))
    @scala.inline
    def setEmptyStatement(value: ISyntaxToken => EmptyStatementSyntax): Self = this.set("emptyStatement", js.Any.fromFunction1(value))
    @scala.inline
    def setEnumDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => EnumDeclarationSyntax
    ): Self = this.set("enumDeclaration", js.Any.fromFunction6(value))
    @scala.inline
    def setEnumElement(value: (ISyntaxToken, EqualsValueClauseSyntax) => EnumElementSyntax): Self = this.set("enumElement", js.Any.fromFunction2(value))
    @scala.inline
    def setEqualsValueClause(value: (ISyntaxToken, IExpressionSyntax) => EqualsValueClauseSyntax): Self = this.set("equalsValueClause", js.Any.fromFunction2(value))
    @scala.inline
    def setExportAssignment(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExportAssignmentSyntax): Self = this.set("exportAssignment", js.Any.fromFunction4(value))
    @scala.inline
    def setExpressionStatement(value: (IExpressionSyntax, ISyntaxToken) => ExpressionStatementSyntax): Self = this.set("expressionStatement", js.Any.fromFunction2(value))
    @scala.inline
    def setExternalModuleReference(value: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => ExternalModuleReferenceSyntax): Self = this.set("externalModuleReference", js.Any.fromFunction4(value))
    @scala.inline
    def setFinallyClause(value: (ISyntaxToken, BlockSyntax) => FinallyClauseSyntax): Self = this.set("finallyClause", js.Any.fromFunction2(value))
    @scala.inline
    def setForInStatement(
      value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForInStatementSyntax
    ): Self = this.set("forInStatement", js.Any.fromFunction8(value))
    @scala.inline
    def setForStatement(
      value: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => ForStatementSyntax
    ): Self = this.set("forStatement", js.Any.fromFunction10(value))
    @scala.inline
    def setFunctionDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => FunctionDeclarationSyntax
    ): Self = this.set("functionDeclaration", js.Any.fromFunction6(value))
    @scala.inline
    def setFunctionExpression(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionExpressionSyntax): Self = this.set("functionExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setFunctionPropertyAssignment(value: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => FunctionPropertyAssignmentSyntax): Self = this.set("functionPropertyAssignment", js.Any.fromFunction3(value))
    @scala.inline
    def setFunctionType(
      value: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => FunctionTypeSyntax
    ): Self = this.set("functionType", js.Any.fromFunction4(value))
    @scala.inline
    def setGenericType(value: (INameSyntax, TypeArgumentListSyntax) => GenericTypeSyntax): Self = this.set("genericType", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAccessor(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => GetAccessorSyntax
    ): Self = this.set("getAccessor", js.Any.fromFunction6(value))
    @scala.inline
    def setHeritageClause(value: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => HeritageClauseSyntax): Self = this.set("heritageClause", js.Any.fromFunction3(value))
    @scala.inline
    def setIfStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => IfStatementSyntax
    ): Self = this.set("ifStatement", js.Any.fromFunction6(value))
    @scala.inline
    def setImportDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => ImportDeclarationSyntax
    ): Self = this.set("importDeclaration", js.Any.fromFunction6(value))
    @scala.inline
    def setIndexMemberDeclaration(value: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => IndexMemberDeclarationSyntax): Self = this.set("indexMemberDeclaration", js.Any.fromFunction3(value))
    @scala.inline
    def setIndexSignature(value: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => IndexSignatureSyntax): Self = this.set("indexSignature", js.Any.fromFunction4(value))
    @scala.inline
    def setInterfaceDeclaration(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => InterfaceDeclarationSyntax
    ): Self = this.set("interfaceDeclaration", js.Any.fromFunction6(value))
    @scala.inline
    def setInvocationExpression(value: (IMemberExpressionSyntax, ArgumentListSyntax) => InvocationExpressionSyntax): Self = this.set("invocationExpression", js.Any.fromFunction2(value))
    @scala.inline
    def setLabeledStatement(value: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => LabeledStatementSyntax): Self = this.set("labeledStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setMemberAccessExpression(value: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => MemberAccessExpressionSyntax): Self = this.set("memberAccessExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setMemberFunctionDeclaration(
      value: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => MemberFunctionDeclarationSyntax
    ): Self = this.set("memberFunctionDeclaration", js.Any.fromFunction5(value))
    @scala.inline
    def setMemberVariableDeclaration(value: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => MemberVariableDeclarationSyntax): Self = this.set("memberVariableDeclaration", js.Any.fromFunction3(value))
    @scala.inline
    def setMethodSignature(value: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => MethodSignatureSyntax): Self = this.set("methodSignature", js.Any.fromFunction3(value))
    @scala.inline
    def setModuleDeclaration(
      value: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => ModuleDeclarationSyntax
    ): Self = this.set("moduleDeclaration", js.Any.fromFunction7(value))
    @scala.inline
    def setModuleNameModuleReference(value: INameSyntax => ModuleNameModuleReferenceSyntax): Self = this.set("moduleNameModuleReference", js.Any.fromFunction1(value))
    @scala.inline
    def setObjectCreationExpression(
      value: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => ObjectCreationExpressionSyntax
    ): Self = this.set("objectCreationExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setObjectLiteralExpression(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectLiteralExpressionSyntax): Self = this.set("objectLiteralExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setObjectType(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ObjectTypeSyntax): Self = this.set("objectType", js.Any.fromFunction3(value))
    @scala.inline
    def setOmittedExpression(value: () => OmittedExpressionSyntax): Self = this.set("omittedExpression", js.Any.fromFunction0(value))
    @scala.inline
    def setParameter(
      value: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => ParameterSyntax
    ): Self = this.set("parameter", js.Any.fromFunction6(value))
    @scala.inline
    def setParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => ParameterListSyntax): Self = this.set("parameterList", js.Any.fromFunction3(value))
    @scala.inline
    def setParenthesizedArrowFunctionExpression(
      value: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => ParenthesizedArrowFunctionExpressionSyntax
    ): Self = this.set("parenthesizedArrowFunctionExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setParenthesizedExpression(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ParenthesizedExpressionSyntax): Self = this.set("parenthesizedExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setPostfixUnaryExpression(value: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => PostfixUnaryExpressionSyntax): Self = this.set("postfixUnaryExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setPrefixUnaryExpression(value: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => PrefixUnaryExpressionSyntax): Self = this.set("prefixUnaryExpression", js.Any.fromFunction3(value))
    @scala.inline
    def setPropertySignature(value: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => PropertySignatureSyntax): Self = this.set("propertySignature", js.Any.fromFunction3(value))
    @scala.inline
    def setQualifiedName(value: (INameSyntax, ISyntaxToken, ISyntaxToken) => QualifiedNameSyntax): Self = this.set("qualifiedName", js.Any.fromFunction3(value))
    @scala.inline
    def setReturnStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ReturnStatementSyntax): Self = this.set("returnStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setSetAccessor(
      value: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => SetAccessorSyntax
    ): Self = this.set("setAccessor", js.Any.fromFunction5(value))
    @scala.inline
    def setSimpleArrowFunctionExpression(
      value: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => SimpleArrowFunctionExpressionSyntax
    ): Self = this.set("simpleArrowFunctionExpression", js.Any.fromFunction4(value))
    @scala.inline
    def setSimplePropertyAssignment(value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => SimplePropertyAssignmentSyntax): Self = this.set("simplePropertyAssignment", js.Any.fromFunction3(value))
    @scala.inline
    def setSourceUnit(value: (ISyntaxList, ISyntaxToken) => SourceUnitSyntax): Self = this.set("sourceUnit", js.Any.fromFunction2(value))
    @scala.inline
    def setSwitchStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => SwitchStatementSyntax
    ): Self = this.set("switchStatement", js.Any.fromFunction7(value))
    @scala.inline
    def setThrowStatement(value: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => ThrowStatementSyntax): Self = this.set("throwStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setTryStatement(value: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => TryStatementSyntax): Self = this.set("tryStatement", js.Any.fromFunction4(value))
    @scala.inline
    def setTypeAnnotation(value: (ISyntaxToken, ITypeSyntax) => TypeAnnotationSyntax): Self = this.set("typeAnnotation", js.Any.fromFunction2(value))
    @scala.inline
    def setTypeArgumentList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeArgumentListSyntax): Self = this.set("typeArgumentList", js.Any.fromFunction3(value))
    @scala.inline
    def setTypeOfExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => TypeOfExpressionSyntax): Self = this.set("typeOfExpression", js.Any.fromFunction2(value))
    @scala.inline
    def setTypeParameter(value: (ISyntaxToken, ConstraintSyntax) => TypeParameterSyntax): Self = this.set("typeParameter", js.Any.fromFunction2(value))
    @scala.inline
    def setTypeParameterList(value: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => TypeParameterListSyntax): Self = this.set("typeParameterList", js.Any.fromFunction3(value))
    @scala.inline
    def setTypeQuery(value: (ISyntaxToken, INameSyntax) => TypeQuerySyntax): Self = this.set("typeQuery", js.Any.fromFunction2(value))
    @scala.inline
    def setVariableDeclaration(value: (ISyntaxToken, ISeparatedSyntaxList) => VariableDeclarationSyntax): Self = this.set("variableDeclaration", js.Any.fromFunction2(value))
    @scala.inline
    def setVariableDeclarator(value: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => VariableDeclaratorSyntax): Self = this.set("variableDeclarator", js.Any.fromFunction3(value))
    @scala.inline
    def setVariableStatement(value: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => VariableStatementSyntax): Self = this.set("variableStatement", js.Any.fromFunction3(value))
    @scala.inline
    def setVoidExpression(value: (ISyntaxToken, IUnaryExpressionSyntax) => VoidExpressionSyntax): Self = this.set("voidExpression", js.Any.fromFunction2(value))
    @scala.inline
    def setWhileStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WhileStatementSyntax
    ): Self = this.set("whileStatement", js.Any.fromFunction5(value))
    @scala.inline
    def setWithStatement(
      value: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => WithStatementSyntax
    ): Self = this.set("withStatement", js.Any.fromFunction5(value))
  }
  
}

