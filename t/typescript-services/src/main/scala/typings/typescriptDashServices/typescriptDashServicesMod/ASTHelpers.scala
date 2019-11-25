package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.IASTSpan
import typings.typescriptDashServices.TypeScript.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: typings.typescriptDashServices.TypeScript.AST): js.Array[typings.typescriptDashServices.TypeScript.Comment] = js.native
  def enumIsElided(declaration: typings.typescriptDashServices.TypeScript.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typings.typescriptDashServices.TypeScript.AST, pos: Double): typings.typescriptDashServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptDashServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptDashServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptDashServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptDashServices.TypeScript.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.Parameter = js.native
  def getExtendsHeritageClause(clauses: typings.typescriptDashServices.TypeScript.ISyntaxList2): typings.typescriptDashServices.TypeScript.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typings.typescriptDashServices.TypeScript.ISyntaxList2): typings.typescriptDashServices.TypeScript.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.ModuleDeclaration = js.native
  def getModuleNames(name: typings.typescriptDashServices.TypeScript.AST): js.Array[typings.typescriptDashServices.TypeScript.Identifier] = js.native
  def getModuleNames(
    name: typings.typescriptDashServices.TypeScript.AST,
    result: js.Array[typings.typescriptDashServices.TypeScript.Identifier]
  ): js.Array[typings.typescriptDashServices.TypeScript.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typings.typescriptDashServices.TypeScript.AST): String = js.native
  def getParameterList(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.ParameterList = js.native
  def getType(ast: typings.typescriptDashServices.TypeScript.AST): typings.typescriptDashServices.TypeScript.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptDashServices.TypeScript.VariableDeclarator): js.Array[typings.typescriptDashServices.TypeScript.PullElementFlags] = js.native
  def isCallExpression(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isDeclarationAST(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typings.typescriptDashServices.TypeScript.ModuleDeclaration,
    astName: typings.typescriptDashServices.TypeScript.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typings.typescriptDashServices.TypeScript.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typings.typescriptDashServices.TypeScript.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typings.typescriptDashServices.TypeScript.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typings.typescriptDashServices.TypeScript.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typings.typescriptDashServices.TypeScript.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typings.typescriptDashServices.TypeScript.SourceUnit): Boolean = js.native
}

