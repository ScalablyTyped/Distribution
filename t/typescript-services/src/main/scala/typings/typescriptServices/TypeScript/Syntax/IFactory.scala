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

trait IFactory extends js.Object {
  def argumentList(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken
  ): ArgumentListSyntax
  def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax
  def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax
  def binaryExpression(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax
  def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax
  def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax
  def callSignature(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax
  ): CallSignatureSyntax
  def caseSwitchClause(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax
  def castExpression(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax
  def catchClause(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax
  def classDeclaration(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax
  def conditionalExpression(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax
  def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax
  def constructSignature(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax
  def constructorDeclaration(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): ConstructorDeclarationSyntax
  def constructorType(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax
  def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax
  def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax
  def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax
  def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax
  def doStatement(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax
  def elementAccessExpression(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax
  def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax
  def emptyStatement(semicolonToken: ISyntaxToken): EmptyStatementSyntax
  def enumDeclaration(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax
  def enumElement(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax
  def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax
  def exportAssignment(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax
  def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax
  def externalModuleReference(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax
  def finallyClause(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax
  def forInStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax
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
  ): ForStatementSyntax
  def functionDeclaration(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax
  def functionExpression(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax
  def functionPropertyAssignment(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax
  def functionType(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax
  def genericType(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax
  def getAccessor(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax
  def heritageClause(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax
  def ifStatement(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax
  def importDeclaration(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax
  def indexMemberDeclaration(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax
  def indexSignature(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax
  def interfaceDeclaration(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax
  def invocationExpression(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax
  def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax
  def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax
  def memberFunctionDeclaration(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): MemberFunctionDeclarationSyntax
  def memberVariableDeclaration(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax
  def methodSignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax
  def moduleDeclaration(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax
  def moduleNameModuleReference(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax
  def objectCreationExpression(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax
  def objectLiteralExpression(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax
  def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax
  def omittedExpression(): OmittedExpressionSyntax
  def parameter(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): ParameterSyntax
  def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax
  def parenthesizedArrowFunctionExpression(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax
  def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax
  def postfixUnaryExpression(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax
  def prefixUnaryExpression(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax
  def propertySignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax
  def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax
  def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax
  def setAccessor(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax
  def simpleArrowFunctionExpression(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax
  def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax
  def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax
  def switchStatement(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax
  def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax
  def tryStatement(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax
  def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax
  def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax
  def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax
  def typeParameter(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax
  def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax
  def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax
  def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax
  def variableDeclarator(
    propertyName: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): VariableDeclaratorSyntax
  def variableStatement(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax
  def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax
  def whileStatement(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax
  def withStatement(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax
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
}

