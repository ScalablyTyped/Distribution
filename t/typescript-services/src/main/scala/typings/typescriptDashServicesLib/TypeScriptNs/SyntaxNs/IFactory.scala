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
    argumentList: (typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax,
    arrayLiteralExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax,
    arrayType: (typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ArrayTypeSyntax,
    binaryExpression: (typescriptDashServicesLib.TypeScriptNs.SyntaxKind, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.BinaryExpressionSyntax,
    block: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    breakStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.BreakStatementSyntax,
    callSignature: (typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax) => typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    caseSwitchClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList) => typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax,
    castExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ITypeSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.CastExpressionSyntax,
    catchClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax,
    classDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ClassDeclarationSyntax,
    conditionalExpression: (typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.ConditionalExpressionSyntax,
    constraint: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ITypeSyntax) => typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax,
    constructSignature: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax) => typescriptDashServicesLib.TypeScriptNs.ConstructSignatureSyntax,
    constructorDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax,
    constructorType: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ITypeSyntax) => typescriptDashServicesLib.TypeScriptNs.ConstructorTypeSyntax,
    continueStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax,
    debuggerStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.DebuggerStatementSyntax,
    defaultSwitchClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList) => typescriptDashServicesLib.TypeScriptNs.DefaultSwitchClauseSyntax,
    deleteExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.DeleteExpressionSyntax,
    doStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax,
    elementAccessExpression: (typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ElementAccessExpressionSyntax,
    elseClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax,
    emptyStatement: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken => typescriptDashServicesLib.TypeScriptNs.EmptyStatementSyntax,
    enumDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.EnumDeclarationSyntax,
    enumElement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax) => typescriptDashServicesLib.TypeScriptNs.EnumElementSyntax,
    equalsValueClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax,
    exportAssignment: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ExportAssignmentSyntax,
    expressionStatement: (typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ExpressionStatementSyntax,
    externalModuleReference: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ExternalModuleReferenceSyntax,
    finallyClause: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax,
    forInStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax,
    forStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax,
    functionDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax,
    functionExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax,
    functionPropertyAssignment: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.FunctionPropertyAssignmentSyntax,
    functionType: (typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ITypeSyntax) => typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax,
    genericType: (typescriptDashServicesLib.TypeScriptNs.INameSyntax, typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax) => typescriptDashServicesLib.TypeScriptNs.GenericTypeSyntax,
    getAccessor: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax,
    heritageClause: (typescriptDashServicesLib.TypeScriptNs.SyntaxKind, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList) => typescriptDashServicesLib.TypeScriptNs.HeritageClauseSyntax,
    ifStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax, typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax) => typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax,
    importDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax,
    indexMemberDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax,
    indexSignature: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ParameterSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax) => typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax,
    interfaceDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax) => typescriptDashServicesLib.TypeScriptNs.InterfaceDeclarationSyntax,
    invocationExpression: (typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax) => typescriptDashServicesLib.TypeScriptNs.InvocationExpressionSyntax,
    labeledStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.LabeledStatementSyntax,
    memberAccessExpression: (typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.MemberAccessExpressionSyntax,
    memberFunctionDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax,
    memberVariableDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax,
    methodSignature: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax) => typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax,
    moduleDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.INameSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax,
    moduleNameModuleReference: typescriptDashServicesLib.TypeScriptNs.INameSyntax => typescriptDashServicesLib.TypeScriptNs.ModuleNameModuleReferenceSyntax,
    objectCreationExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax) => typescriptDashServicesLib.TypeScriptNs.ObjectCreationExpressionSyntax,
    objectLiteralExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ObjectLiteralExpressionSyntax,
    objectType: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax,
    omittedExpression: () => typescriptDashServicesLib.TypeScriptNs.OmittedExpressionSyntax,
    parameter: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax) => typescriptDashServicesLib.TypeScriptNs.ParameterSyntax,
    parameterList: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    parenthesizedArrowFunctionExpression: (typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax,
    parenthesizedExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ParenthesizedExpressionSyntax,
    postfixUnaryExpression: (typescriptDashServicesLib.TypeScriptNs.SyntaxKind, typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.PostfixUnaryExpressionSyntax,
    prefixUnaryExpression: (typescriptDashServicesLib.TypeScriptNs.SyntaxKind, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.PrefixUnaryExpressionSyntax,
    propertySignature: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax) => typescriptDashServicesLib.TypeScriptNs.PropertySignatureSyntax,
    qualifiedName: (typescriptDashServicesLib.TypeScriptNs.INameSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.QualifiedNameSyntax,
    returnStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ReturnStatementSyntax,
    setAccessor: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax, typescriptDashServicesLib.TypeScriptNs.BlockSyntax) => typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax,
    simpleArrowFunctionExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax,
    simplePropertyAssignment: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.SimplePropertyAssignmentSyntax,
    sourceUnit: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
    switchStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax,
    throwStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.ThrowStatementSyntax,
    tryStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.BlockSyntax, typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax, typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax) => typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax,
    typeAnnotation: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ITypeSyntax) => typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    typeArgumentList: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax,
    typeOfExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.TypeOfExpressionSyntax,
    typeParameter: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax) => typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax,
    typeParameterList: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    typeQuery: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.INameSyntax) => typescriptDashServicesLib.TypeScriptNs.TypeQuerySyntax,
    variableDeclaration: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList) => typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    variableDeclarator: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax, typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax) => typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax,
    variableStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxList, typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken) => typescriptDashServicesLib.TypeScriptNs.VariableStatementSyntax,
    voidExpression: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax) => typescriptDashServicesLib.TypeScriptNs.VoidExpressionSyntax,
    whileStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.WhileStatementSyntax,
    withStatement: (typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax, typescriptDashServicesLib.TypeScriptNs.ISyntaxToken, typescriptDashServicesLib.TypeScriptNs.IStatementSyntax) => typescriptDashServicesLib.TypeScriptNs.WithStatementSyntax
  ): IFactory = {
    val __obj = js.Dynamic.literal(argumentList = js.Any.fromFunction4(argumentList), arrayLiteralExpression = js.Any.fromFunction3(arrayLiteralExpression), arrayType = js.Any.fromFunction3(arrayType), binaryExpression = js.Any.fromFunction4(binaryExpression), block = js.Any.fromFunction3(block), breakStatement = js.Any.fromFunction3(breakStatement), callSignature = js.Any.fromFunction3(callSignature), caseSwitchClause = js.Any.fromFunction4(caseSwitchClause), castExpression = js.Any.fromFunction4(castExpression), catchClause = js.Any.fromFunction6(catchClause), classDeclaration = js.Any.fromFunction8(classDeclaration), conditionalExpression = js.Any.fromFunction5(conditionalExpression), constraint = js.Any.fromFunction2(constraint), constructSignature = js.Any.fromFunction2(constructSignature), constructorDeclaration = js.Any.fromFunction5(constructorDeclaration), constructorType = js.Any.fromFunction5(constructorType), continueStatement = js.Any.fromFunction3(continueStatement), debuggerStatement = js.Any.fromFunction2(debuggerStatement), defaultSwitchClause = js.Any.fromFunction3(defaultSwitchClause), deleteExpression = js.Any.fromFunction2(deleteExpression), doStatement = js.Any.fromFunction7(doStatement), elementAccessExpression = js.Any.fromFunction4(elementAccessExpression), elseClause = js.Any.fromFunction2(elseClause), emptyStatement = js.Any.fromFunction1(emptyStatement), enumDeclaration = js.Any.fromFunction6(enumDeclaration), enumElement = js.Any.fromFunction2(enumElement), equalsValueClause = js.Any.fromFunction2(equalsValueClause), exportAssignment = js.Any.fromFunction4(exportAssignment), expressionStatement = js.Any.fromFunction2(expressionStatement), externalModuleReference = js.Any.fromFunction4(externalModuleReference), finallyClause = js.Any.fromFunction2(finallyClause), forInStatement = js.Any.fromFunction8(forInStatement), forStatement = js.Any.fromFunction10(forStatement), functionDeclaration = js.Any.fromFunction6(functionDeclaration), functionExpression = js.Any.fromFunction4(functionExpression), functionPropertyAssignment = js.Any.fromFunction3(functionPropertyAssignment), functionType = js.Any.fromFunction4(functionType), genericType = js.Any.fromFunction2(genericType), getAccessor = js.Any.fromFunction6(getAccessor), heritageClause = js.Any.fromFunction3(heritageClause), ifStatement = js.Any.fromFunction6(ifStatement), importDeclaration = js.Any.fromFunction6(importDeclaration), indexMemberDeclaration = js.Any.fromFunction3(indexMemberDeclaration), indexSignature = js.Any.fromFunction4(indexSignature), interfaceDeclaration = js.Any.fromFunction6(interfaceDeclaration), invocationExpression = js.Any.fromFunction2(invocationExpression), labeledStatement = js.Any.fromFunction3(labeledStatement), memberAccessExpression = js.Any.fromFunction3(memberAccessExpression), memberFunctionDeclaration = js.Any.fromFunction5(memberFunctionDeclaration), memberVariableDeclaration = js.Any.fromFunction3(memberVariableDeclaration), methodSignature = js.Any.fromFunction3(methodSignature), moduleDeclaration = js.Any.fromFunction7(moduleDeclaration), moduleNameModuleReference = js.Any.fromFunction1(moduleNameModuleReference), objectCreationExpression = js.Any.fromFunction3(objectCreationExpression), objectLiteralExpression = js.Any.fromFunction3(objectLiteralExpression), objectType = js.Any.fromFunction3(objectType), omittedExpression = js.Any.fromFunction0(omittedExpression), parameter = js.Any.fromFunction6(parameter), parameterList = js.Any.fromFunction3(parameterList), parenthesizedArrowFunctionExpression = js.Any.fromFunction4(parenthesizedArrowFunctionExpression), parenthesizedExpression = js.Any.fromFunction3(parenthesizedExpression), postfixUnaryExpression = js.Any.fromFunction3(postfixUnaryExpression), prefixUnaryExpression = js.Any.fromFunction3(prefixUnaryExpression), propertySignature = js.Any.fromFunction3(propertySignature), qualifiedName = js.Any.fromFunction3(qualifiedName), returnStatement = js.Any.fromFunction3(returnStatement), setAccessor = js.Any.fromFunction5(setAccessor), simpleArrowFunctionExpression = js.Any.fromFunction4(simpleArrowFunctionExpression), simplePropertyAssignment = js.Any.fromFunction3(simplePropertyAssignment), sourceUnit = js.Any.fromFunction2(sourceUnit), switchStatement = js.Any.fromFunction7(switchStatement), throwStatement = js.Any.fromFunction3(throwStatement), tryStatement = js.Any.fromFunction4(tryStatement), typeAnnotation = js.Any.fromFunction2(typeAnnotation), typeArgumentList = js.Any.fromFunction3(typeArgumentList), typeOfExpression = js.Any.fromFunction2(typeOfExpression), typeParameter = js.Any.fromFunction2(typeParameter), typeParameterList = js.Any.fromFunction3(typeParameterList), typeQuery = js.Any.fromFunction2(typeQuery), variableDeclaration = js.Any.fromFunction2(variableDeclaration), variableDeclarator = js.Any.fromFunction3(variableDeclarator), variableStatement = js.Any.fromFunction3(variableStatement), voidExpression = js.Any.fromFunction2(voidExpression), whileStatement = js.Any.fromFunction5(whileStatement), withStatement = js.Any.fromFunction5(withStatement))
  
    __obj.asInstanceOf[IFactory]
  }
}

