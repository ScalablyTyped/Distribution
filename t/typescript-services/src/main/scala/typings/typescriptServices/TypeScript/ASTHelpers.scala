package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: AST): js.Array[Comment] = js.native
  def enumIsElided(declaration: EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: AST, pos: Double): AST = js.native
  def getAstAtPosition(script: AST, pos: Double, useTrailingTriviaAsLimChar: Boolean): AST = js.native
  def getAstAtPosition(script: AST, pos: Double, useTrailingTriviaAsLimChar: Boolean, forceInclusive: Boolean): AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: AST): MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: AST): ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: AST): Parameter = js.native
  def getExtendsHeritageClause(clauses: ISyntaxList2): HeritageClause = js.native
  def getImplementsHeritageClause(clauses: ISyntaxList2): HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: AST): ModuleDeclaration = js.native
  def getModuleNames(name: AST): js.Array[Identifier] = js.native
  def getModuleNames(name: AST, result: js.Array[Identifier]): js.Array[Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: AST): String = js.native
  def getParameterList(ast: AST): ParameterList = js.native
  def getType(ast: AST): AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: VariableDeclarator): js.Array[PullElementFlags] = js.native
  def isCallExpression(ast: AST): Boolean = js.native
  def isCallExpressionTarget(ast: AST): Boolean = js.native
  def isDeclarationAST(ast: AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: AST): Boolean = js.native
  def isIntegerLiteralAST(expression: AST): Boolean = js.native
  def isLastNameOfModule(ast: ModuleDeclaration, astName: AST): Boolean = js.native
  def isNameOfFunction(ast: AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: AST): Boolean = js.native
  def isNameOfMemberFunction(ast: AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: Identifier): IParameters = js.native
  def parametersFromParameter(parameter: Parameter): IParameters = js.native
  def parametersFromParameterList(list: ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: AST): Boolean = js.native
  def scriptIsElided(sourceUnit: SourceUnit): Boolean = js.native
}

