package typings
package typescriptDashServicesLib.TypeScriptNs.SyntaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Syntax.StrictModeFactory")
@js.native
class StrictModeFactory () extends IFactory {
  /* CompleteClass */
  override def argumentList(
    typeArgumentList: typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    arguments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax = js.native
  /* CompleteClass */
  override def arrayLiteralExpression(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expressions: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArrayLiteralExpressionSyntax = js.native
  /* CompleteClass */
  override def arrayType(
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax,
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ArrayTypeSyntax = js.native
  /* CompleteClass */
  override def binaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    left: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    right: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.BinaryExpressionSyntax = js.native
  /* CompleteClass */
  override def block(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.BlockSyntax = js.native
  /* CompleteClass */
  override def breakStatement(
    breakKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.BreakStatementSyntax = js.native
  /* CompleteClass */
  override def callSignature(
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax = js.native
  /* CompleteClass */
  override def caseSwitchClause(
    caseKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.CaseSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def castExpression(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CastExpressionSyntax = js.native
  /* CompleteClass */
  override def catchClause(
    catchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax = js.native
  /* CompleteClass */
  override def classDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    classKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    classElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ClassDeclarationSyntax = js.native
  /* CompleteClass */
  override def conditionalExpression(
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    whenTrue: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    whenFalse: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConditionalExpressionSyntax = js.native
  /* CompleteClass */
  override def constraint(
    extendsKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax = js.native
  /* CompleteClass */
  override def constructSignature(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstructSignatureSyntax = js.native
  /* CompleteClass */
  override def constructorDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    constructorKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ConstructorDeclarationSyntax = js.native
  /* CompleteClass */
  override def constructorType(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ConstructorTypeSyntax = js.native
  /* CompleteClass */
  override def continueStatement(
    continueKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ContinueStatementSyntax = js.native
  /* CompleteClass */
  override def debuggerStatement(
    debuggerKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.DebuggerStatementSyntax = js.native
  /* CompleteClass */
  override def defaultSwitchClause(
    defaultKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.DefaultSwitchClauseSyntax = js.native
  /* CompleteClass */
  override def deleteExpression(
    deleteKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.DeleteExpressionSyntax = js.native
  /* CompleteClass */
  override def doStatement(
    doKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    whileKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.DoStatementSyntax = js.native
  /* CompleteClass */
  override def elementAccessExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    argumentExpression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ElementAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def elseClause(
    elseKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax = js.native
  /* CompleteClass */
  override def emptyStatement(semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken): typescriptDashServicesLib.TypeScriptNs.EmptyStatementSyntax = js.native
  /* CompleteClass */
  override def enumDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    enumKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    enumElements: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.EnumDeclarationSyntax = js.native
  /* CompleteClass */
  override def enumElement(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.EnumElementSyntax = js.native
  /* CompleteClass */
  override def equalsValueClause(
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    value: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax = js.native
  /* CompleteClass */
  override def exportAssignment(
    exportKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExportAssignmentSyntax = js.native
  /* CompleteClass */
  override def expressionStatement(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExpressionStatementSyntax = js.native
  /* CompleteClass */
  override def externalModuleReference(
    requireKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    stringLiteral: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ExternalModuleReferenceSyntax = js.native
  /* CompleteClass */
  override def finallyClause(
    finallyKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax = js.native
  /* CompleteClass */
  override def forInStatement(
    forKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    variableDeclaration: typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    left: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    inKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ForInStatementSyntax = js.native
  /* CompleteClass */
  override def forStatement(
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
  ): typescriptDashServicesLib.TypeScriptNs.ForStatementSyntax = js.native
  /* CompleteClass */
  override def functionDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.FunctionDeclarationSyntax = js.native
  /* CompleteClass */
  override def functionExpression(
    functionKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def functionPropertyAssignment(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionPropertyAssignmentSyntax = js.native
  /* CompleteClass */
  override def functionType(
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.FunctionTypeSyntax = js.native
  /* CompleteClass */
  override def genericType(
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    typeArgumentList: typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.GenericTypeSyntax = js.native
  /* CompleteClass */
  override def getAccessor(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    getKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.GetAccessorSyntax = js.native
  /* CompleteClass */
  override def heritageClause(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    extendsOrImplementsKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeNames: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.HeritageClauseSyntax = js.native
  /* CompleteClass */
  override def ifStatement(
    ifKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax,
    elseClause: typescriptDashServicesLib.TypeScriptNs.ElseClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IfStatementSyntax = js.native
  /* CompleteClass */
  override def importDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    importKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleReference: typescriptDashServicesLib.TypeScriptNs.IModuleReferenceSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ImportDeclarationSyntax = js.native
  /* CompleteClass */
  override def indexMemberDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    indexSignature: typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.IndexMemberDeclarationSyntax = js.native
  /* CompleteClass */
  override def indexSignature(
    openBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameter: typescriptDashServicesLib.TypeScriptNs.ParameterSyntax,
    closeBracketToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.IndexSignatureSyntax = js.native
  /* CompleteClass */
  override def interfaceDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    interfaceKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameterList: typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    body: typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.InterfaceDeclarationSyntax = js.native
  /* CompleteClass */
  override def invocationExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    argumentList: typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.InvocationExpressionSyntax = js.native
  /* CompleteClass */
  override def labeledStatement(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.LabeledStatementSyntax = js.native
  /* CompleteClass */
  override def memberAccessExpression(
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    dotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberAccessExpressionSyntax = js.native
  /* CompleteClass */
  override def memberFunctionDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberFunctionDeclarationSyntax = js.native
  /* CompleteClass */
  override def memberVariableDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    variableDeclarator: typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.MemberVariableDeclarationSyntax = js.native
  /* CompleteClass */
  override def methodSignature(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax
  ): typescriptDashServicesLib.TypeScriptNs.MethodSignatureSyntax = js.native
  /* CompleteClass */
  override def moduleDeclaration(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    moduleKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    stringLiteral: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    moduleElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ModuleDeclarationSyntax = js.native
  /* CompleteClass */
  override def moduleNameModuleReference(moduleName: typescriptDashServicesLib.TypeScriptNs.INameSyntax): typescriptDashServicesLib.TypeScriptNs.ModuleNameModuleReferenceSyntax = js.native
  /* CompleteClass */
  override def objectCreationExpression(
    newKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    argumentList: typescriptDashServicesLib.TypeScriptNs.ArgumentListSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ObjectCreationExpressionSyntax = js.native
  /* CompleteClass */
  override def objectLiteralExpression(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyAssignments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ObjectLiteralExpressionSyntax = js.native
  /* CompleteClass */
  override def objectType(
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeMembers: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ObjectTypeSyntax = js.native
  /* CompleteClass */
  override def omittedExpression(): typescriptDashServicesLib.TypeScriptNs.OmittedExpressionSyntax = js.native
  /* CompleteClass */
  override def parameter(
    dotDotDotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ParameterSyntax = js.native
  /* CompleteClass */
  override def parameterList(
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameters: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax = js.native
  /* CompleteClass */
  override def parenthesizedArrowFunctionExpression(
    callSignature: typescriptDashServicesLib.TypeScriptNs.CallSignatureSyntax,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.ParenthesizedArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def parenthesizedExpression(
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ParenthesizedExpressionSyntax = js.native
  /* CompleteClass */
  override def postfixUnaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    operand: typescriptDashServicesLib.TypeScriptNs.IMemberExpressionSyntax,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.PostfixUnaryExpressionSyntax = js.native
  /* CompleteClass */
  override def prefixUnaryExpression(
    kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
    operatorToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    operand: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.PrefixUnaryExpressionSyntax = js.native
  /* CompleteClass */
  override def propertySignature(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    questionToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax
  ): typescriptDashServicesLib.TypeScriptNs.PropertySignatureSyntax = js.native
  /* CompleteClass */
  override def qualifiedName(
    left: typescriptDashServicesLib.TypeScriptNs.INameSyntax,
    dotToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    right: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.QualifiedNameSyntax = js.native
  /* CompleteClass */
  override def returnStatement(
    returnKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ReturnStatementSyntax = js.native
  /* CompleteClass */
  override def setAccessor(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    setKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    parameterList: typescriptDashServicesLib.TypeScriptNs.ParameterListSyntax,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SetAccessorSyntax = js.native
  /* CompleteClass */
  override def simpleArrowFunctionExpression(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    equalsGreaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SimpleArrowFunctionExpressionSyntax = js.native
  /* CompleteClass */
  override def simplePropertyAssignment(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.SimplePropertyAssignmentSyntax = js.native
  /* CompleteClass */
  override def sourceUnit(
    moduleElements: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    endOfFileToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax = js.native
  /* CompleteClass */
  override def switchStatement(
    switchKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    switchClauses: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    closeBraceToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.SwitchStatementSyntax = js.native
  /* CompleteClass */
  override def throwStatement(
    throwKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.ThrowStatementSyntax = js.native
  /* CompleteClass */
  override def tryStatement(
    tryKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    block: typescriptDashServicesLib.TypeScriptNs.BlockSyntax,
    catchClause: typescriptDashServicesLib.TypeScriptNs.CatchClauseSyntax,
    finallyClause: typescriptDashServicesLib.TypeScriptNs.FinallyClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TryStatementSyntax = js.native
  /* CompleteClass */
  override def typeAnnotation(
    colonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    `type`: typescriptDashServicesLib.TypeScriptNs.ITypeSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax = js.native
  /* CompleteClass */
  override def typeArgumentList(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeArguments: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeArgumentListSyntax = js.native
  /* CompleteClass */
  override def typeOfExpression(
    typeOfKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeOfExpressionSyntax = js.native
  /* CompleteClass */
  override def typeParameter(
    identifier: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    constraint: typescriptDashServicesLib.TypeScriptNs.ConstraintSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeParameterSyntax = js.native
  /* CompleteClass */
  override def typeParameterList(
    lessThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeParameters: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList,
    greaterThanToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.TypeParameterListSyntax = js.native
  /* CompleteClass */
  override def typeQuery(
    typeOfKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    name: typescriptDashServicesLib.TypeScriptNs.INameSyntax
  ): typescriptDashServicesLib.TypeScriptNs.TypeQuerySyntax = js.native
  /* CompleteClass */
  override def variableDeclaration(
    varKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    variableDeclarators: typescriptDashServicesLib.TypeScriptNs.ISeparatedSyntaxList
  ): typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax = js.native
  /* CompleteClass */
  override def variableDeclarator(
    propertyName: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    typeAnnotation: typescriptDashServicesLib.TypeScriptNs.TypeAnnotationSyntax,
    equalsValueClause: typescriptDashServicesLib.TypeScriptNs.EqualsValueClauseSyntax
  ): typescriptDashServicesLib.TypeScriptNs.VariableDeclaratorSyntax = js.native
  /* CompleteClass */
  override def variableStatement(
    modifiers: typescriptDashServicesLib.TypeScriptNs.ISyntaxList,
    variableDeclaration: typescriptDashServicesLib.TypeScriptNs.VariableDeclarationSyntax,
    semicolonToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken
  ): typescriptDashServicesLib.TypeScriptNs.VariableStatementSyntax = js.native
  /* CompleteClass */
  override def voidExpression(
    voidKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    expression: typescriptDashServicesLib.TypeScriptNs.IUnaryExpressionSyntax
  ): typescriptDashServicesLib.TypeScriptNs.VoidExpressionSyntax = js.native
  /* CompleteClass */
  override def whileStatement(
    whileKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.WhileStatementSyntax = js.native
  /* CompleteClass */
  override def withStatement(
    withKeyword: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    openParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    condition: typescriptDashServicesLib.TypeScriptNs.IExpressionSyntax,
    closeParenToken: typescriptDashServicesLib.TypeScriptNs.ISyntaxToken,
    statement: typescriptDashServicesLib.TypeScriptNs.IStatementSyntax
  ): typescriptDashServicesLib.TypeScriptNs.WithStatementSyntax = js.native
}

