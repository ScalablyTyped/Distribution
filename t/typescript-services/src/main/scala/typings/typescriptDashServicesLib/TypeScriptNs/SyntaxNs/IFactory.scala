package typings
package typescriptDashServicesLib.TypeScriptNs.SyntaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFactory extends js.Object {
  def argumentList(
    typeArgumentList: typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    arguments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
  def arrayLiteralExpression(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expressions: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax
  def arrayType(
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax,
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArrayTypeSyntax
  def binaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    left: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    right: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.BinaryExpressionSyntax
  def block(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  def breakStatement(
    breakKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.BreakStatementSyntax
  def callSignature(
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  def caseSwitchClause(
    caseKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax
  def castExpression(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CastExpressionSyntax
  def catchClause(
    catchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax
  def classDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    classKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    classElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ClassDeclarationSyntax
  def conditionalExpression(
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    whenTrue: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    whenFalse: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConditionalExpressionSyntax
  def constraint(
    extendsKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax
  def constructSignature(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstructSignatureSyntax
  def constructorDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    constructorKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax
  def constructorType(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstructorTypeSyntax
  def continueStatement(
    continueKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax
  def debuggerStatement(
    debuggerKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.DebuggerStatementSyntax
  def defaultSwitchClause(
    defaultKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.DefaultSwitchClauseSyntax
  def deleteExpression(
    deleteKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.DeleteExpressionSyntax
  def doStatement(
    doKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    whileKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax
  def elementAccessExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    argumentExpression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ElementAccessExpressionSyntax
  def elseClause(
    elseKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax
  def emptyStatement(semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.EmptyStatementSyntax
  def enumDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    enumKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    enumElements: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.EnumDeclarationSyntax
  def enumElement(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.EnumElementSyntax
  def equalsValueClause(
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    value: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  def exportAssignment(
    exportKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExportAssignmentSyntax
  def expressionStatement(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExpressionStatementSyntax
  def externalModuleReference(
    requireKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    stringLiteral: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExternalModuleReferenceSyntax
  def finallyClause(
    finallyKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax
  def forInStatement(
    forKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    variableDeclaration: typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    left: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    inKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax
  def forStatement(
    forKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    variableDeclaration: typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    initializer: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    firstSemicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    secondSemicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    incrementor: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax
  def functionDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax
  def functionExpression(
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax
  def functionPropertyAssignment(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionPropertyAssignmentSyntax
  def functionType(
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax
  def genericType(
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    typeArgumentList: typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.GenericTypeSyntax
  def getAccessor(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    getKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax
  def heritageClause(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    extendsOrImplementsKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeNames: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.HeritageClauseSyntax
  def ifStatement(
    ifKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    elseClause: typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax
  def importDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    importKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleReference: typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax
  def indexMemberDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    indexSignature: typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax
  def indexSignature(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameter: typescriptDashServicesLib.TypeScriptNs.ParameterSyntax,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax
  def interfaceDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    interfaceKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    body: typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.InterfaceDeclarationSyntax
  def invocationExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    argumentList: typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.InvocationExpressionSyntax
  def labeledStatement(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.LabeledStatementSyntax
  def memberAccessExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    dotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberAccessExpressionSyntax
  def memberFunctionDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax
  def memberVariableDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    variableDeclarator: typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax
  def methodSignature(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax
  def moduleDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    moduleKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    stringLiteral: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax
  def moduleNameModuleReference(moduleName: typescriptDashServicesLib.TypeScriptNs.INameSyntax): typescriptDashServicesLib.TypeScriptNs.ModuleNameModuleReferenceSyntax
  def objectCreationExpression(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    argumentList: typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ObjectCreationExpressionSyntax
  def objectLiteralExpression(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyAssignments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ObjectLiteralExpressionSyntax
  def objectType(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeMembers: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax
  def omittedExpression(): typescriptDashServicesLib.TypeScriptNs.OmittedExpressionSyntax
  def parameter(
    dotDotDotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ParameterSyntax
  def parameterList(
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameters: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax
  def parenthesizedArrowFunctionExpression(
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax
  def parenthesizedExpression(
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParenthesizedExpressionSyntax
  def postfixUnaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    operand: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.PostfixUnaryExpressionSyntax
  def prefixUnaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    operand: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.PrefixUnaryExpressionSyntax
  def propertySignature(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.PropertySignatureSyntax
  def qualifiedName(
    left: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    dotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    right: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.QualifiedNameSyntax
  def returnStatement(
    returnKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ReturnStatementSyntax
  def setAccessor(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    setKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax
  def simpleArrowFunctionExpression(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax
  def simplePropertyAssignment(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SimplePropertyAssignmentSyntax
  def sourceUnit(
    moduleElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    endOfFileToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax
  def switchStatement(
    switchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    switchClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax
  def throwStatement(
    throwKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ThrowStatementSyntax
  def tryStatement(
    tryKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    catchClause: typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax,
    finallyClause: typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax
  def typeAnnotation(
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  def typeArgumentList(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeArguments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax
  def typeOfExpression(
    typeOfKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeOfExpressionSyntax
  def typeParameter(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    constraint: typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax
  def typeParameterList(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameters: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax
  def typeQuery(
    typeOfKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeQuerySyntax
  def variableDeclaration(
    varKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    variableDeclarators: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax
  def variableDeclarator(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax
  def variableStatement(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    variableDeclaration: typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.VariableStatementSyntax
  def voidExpression(
    voidKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.VoidExpressionSyntax
  def whileStatement(
    whileKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.WhileStatementSyntax
  def withStatement(
    withKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.WithStatementSyntax
}

object IFactory {
  @scala.inline
  def apply(
    argumentList: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
    ],
    arrayLiteralExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax
    ],
    arrayType: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ArrayTypeSyntax
    ],
    binaryExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.SyntaxKind, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BinaryExpressionSyntax
    ],
    block: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax
    ],
    breakStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BreakStatementSyntax
    ],
    callSignature: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
    ],
    caseSwitchClause: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax
    ],
    castExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.CastExpressionSyntax
    ],
    catchClause: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax
    ],
    classDeclaration: js.Function8[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ClassDeclarationSyntax
    ],
    conditionalExpression: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ConditionalExpressionSyntax
    ],
    constraint: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax
    ],
    constructSignature: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ConstructSignatureSyntax
    ],
    constructorDeclaration: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax
    ],
    constructorType: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ConstructorTypeSyntax
    ],
    continueStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax
    ],
    debuggerStatement: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.DebuggerStatementSyntax
    ],
    defaultSwitchClause: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.DefaultSwitchClauseSyntax
    ],
    deleteExpression: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.DeleteExpressionSyntax
    ],
    doStatement: js.Function7[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax
    ],
    elementAccessExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ElementAccessExpressionSyntax
    ],
    elseClause: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax
    ],
    emptyStatement: js.Function1[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.EmptyStatementSyntax
    ],
    enumDeclaration: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.EnumDeclarationSyntax
    ],
    enumElement: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.EnumElementSyntax
    ],
    equalsValueClause: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
    ],
    exportAssignment: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ExportAssignmentSyntax
    ],
    expressionStatement: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ExpressionStatementSyntax
    ],
    externalModuleReference: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ExternalModuleReferenceSyntax
    ],
    finallyClause: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax
    ],
    forInStatement: js.Function8[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax
    ],
    forStatement: js.Function10[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax
    ],
    functionDeclaration: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax
    ],
    functionExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax
    ],
    functionPropertyAssignment: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.FunctionPropertyAssignmentSyntax
    ],
    functionType: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax
    ],
    genericType: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.INameSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.GenericTypeSyntax
    ],
    getAccessor: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax
    ],
    heritageClause: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.SyntaxKind, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.HeritageClauseSyntax
    ],
    ifStatement: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax
    ],
    importDeclaration: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax
    ],
    indexMemberDeclaration: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax
    ],
    indexSignature: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ParameterSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax
    ],
    interfaceDeclaration: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.InterfaceDeclarationSyntax
    ],
    invocationExpression: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.InvocationExpressionSyntax
    ],
    labeledStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.LabeledStatementSyntax
    ],
    memberAccessExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.MemberAccessExpressionSyntax
    ],
    memberFunctionDeclaration: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax
    ],
    memberVariableDeclaration: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax
    ],
    methodSignature: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax
    ],
    moduleDeclaration: js.Function7[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.INameSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax
    ],
    moduleNameModuleReference: js.Function1[
      typescriptDashServicesLib.TypeScriptNs.INameSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ModuleNameModuleReferenceSyntax
    ],
    objectCreationExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ObjectCreationExpressionSyntax
    ],
    objectLiteralExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ObjectLiteralExpressionSyntax
    ],
    objectType: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax
    ],
    omittedExpression: js.Function0[typescriptDashServicesLib.TypeScriptNs.OmittedExpressionSyntax],
    parameter: js.Function6[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ParameterSyntax
    ],
    parameterList: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax
    ],
    parenthesizedArrowFunctionExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax
    ],
    parenthesizedExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ParenthesizedExpressionSyntax
    ],
    postfixUnaryExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.SyntaxKind, 
      typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.PostfixUnaryExpressionSyntax
    ],
    prefixUnaryExpression: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.SyntaxKind, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.PrefixUnaryExpressionSyntax
    ],
    propertySignature: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.PropertySignatureSyntax
    ],
    qualifiedName: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.INameSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.QualifiedNameSyntax
    ],
    returnStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ReturnStatementSyntax
    ],
    setAccessor: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax
    ],
    simpleArrowFunctionExpression: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax
    ],
    simplePropertyAssignment: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.SimplePropertyAssignmentSyntax
    ],
    sourceUnit: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax
    ],
    switchStatement: js.Function7[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax
    ],
    throwStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ThrowStatementSyntax
    ],
    tryStatement: js.Function4[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.BlockSyntax, 
      typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax
    ],
    typeAnnotation: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
    ],
    typeArgumentList: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax
    ],
    typeOfExpression: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeOfExpressionSyntax
    ],
    typeParameter: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax
    ],
    typeParameterList: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax
    ],
    typeQuery: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.INameSyntax, 
      typescriptDashServicesLib.TypeScriptNs.TypeQuerySyntax
    ],
    variableDeclaration: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax
    ],
    variableDeclarator: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax
    ],
    variableStatement: js.Function3[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxList, 
      typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.VariableStatementSyntax
    ],
    voidExpression: js.Function2[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.VoidExpressionSyntax
    ],
    whileStatement: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.WhileStatementSyntax
    ],
    withStatement: js.Function5[
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, 
      typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, 
      typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, 
      typescriptDashServicesLib.TypeScriptNs.WithStatementSyntax
    ]
  ): IFactory = {
    val __obj = js.Dynamic.literal(argumentList = argumentList, arrayLiteralExpression = arrayLiteralExpression, arrayType = arrayType, binaryExpression = binaryExpression, block = block, breakStatement = breakStatement, callSignature = callSignature, caseSwitchClause = caseSwitchClause, castExpression = castExpression, catchClause = catchClause, classDeclaration = classDeclaration, conditionalExpression = conditionalExpression, constraint = constraint, constructSignature = constructSignature, constructorDeclaration = constructorDeclaration, constructorType = constructorType, continueStatement = continueStatement, debuggerStatement = debuggerStatement, defaultSwitchClause = defaultSwitchClause, deleteExpression = deleteExpression, doStatement = doStatement, elementAccessExpression = elementAccessExpression, elseClause = elseClause, emptyStatement = emptyStatement, enumDeclaration = enumDeclaration, enumElement = enumElement, equalsValueClause = equalsValueClause, exportAssignment = exportAssignment, expressionStatement = expressionStatement, externalModuleReference = externalModuleReference, finallyClause = finallyClause, forInStatement = forInStatement, forStatement = forStatement, functionDeclaration = functionDeclaration, functionExpression = functionExpression, functionPropertyAssignment = functionPropertyAssignment, functionType = functionType, genericType = genericType, getAccessor = getAccessor, heritageClause = heritageClause, ifStatement = ifStatement, importDeclaration = importDeclaration, indexMemberDeclaration = indexMemberDeclaration, indexSignature = indexSignature, interfaceDeclaration = interfaceDeclaration, invocationExpression = invocationExpression, labeledStatement = labeledStatement, memberAccessExpression = memberAccessExpression, memberFunctionDeclaration = memberFunctionDeclaration, memberVariableDeclaration = memberVariableDeclaration, methodSignature = methodSignature, moduleDeclaration = moduleDeclaration, moduleNameModuleReference = moduleNameModuleReference, objectCreationExpression = objectCreationExpression, objectLiteralExpression = objectLiteralExpression, objectType = objectType, omittedExpression = omittedExpression, parameter = parameter, parameterList = parameterList, parenthesizedArrowFunctionExpression = parenthesizedArrowFunctionExpression, parenthesizedExpression = parenthesizedExpression, postfixUnaryExpression = postfixUnaryExpression, prefixUnaryExpression = prefixUnaryExpression, propertySignature = propertySignature, qualifiedName = qualifiedName, returnStatement = returnStatement, setAccessor = setAccessor, simpleArrowFunctionExpression = simpleArrowFunctionExpression, simplePropertyAssignment = simplePropertyAssignment, sourceUnit = sourceUnit, switchStatement = switchStatement, throwStatement = throwStatement, tryStatement = tryStatement, typeAnnotation = typeAnnotation, typeArgumentList = typeArgumentList, typeOfExpression = typeOfExpression, typeParameter = typeParameter, typeParameterList = typeParameterList, typeQuery = typeQuery, variableDeclaration = variableDeclaration, variableDeclarator = variableDeclarator, variableStatement = variableStatement, voidExpression = voidExpression, whileStatement = whileStatement, withStatement = withStatement)
  
    __obj.asInstanceOf[IFactory]
  }
}

