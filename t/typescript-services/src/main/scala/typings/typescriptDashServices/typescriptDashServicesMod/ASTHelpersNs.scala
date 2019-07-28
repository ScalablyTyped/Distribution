package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IASTSpan
import typings.typescriptDashServices.TypeScriptNs.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ASTHelpers")
@js.native
object ASTHelpersNs extends js.Object {
  def docComments(ast: typings.typescriptDashServices.TypeScriptNs.AST): js.Array[typings.typescriptDashServices.TypeScriptNs.Comment] = js.native
  def enumIsElided(declaration: typings.typescriptDashServices.TypeScriptNs.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typings.typescriptDashServices.TypeScriptNs.AST, pos: Double): typings.typescriptDashServices.TypeScriptNs.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptDashServices.TypeScriptNs.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.AST = js.native
  def getAstAtPosition(
    script: typings.typescriptDashServices.TypeScriptNs.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.Parameter = js.native
  def getExtendsHeritageClause(clauses: typings.typescriptDashServices.TypeScriptNs.ISyntaxList2): typings.typescriptDashServices.TypeScriptNs.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typings.typescriptDashServices.TypeScriptNs.ISyntaxList2): typings.typescriptDashServices.TypeScriptNs.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.ModuleDeclaration = js.native
  def getModuleNames(name: typings.typescriptDashServices.TypeScriptNs.AST): js.Array[typings.typescriptDashServices.TypeScriptNs.Identifier] = js.native
  def getModuleNames(
    name: typings.typescriptDashServices.TypeScriptNs.AST,
    result: js.Array[typings.typescriptDashServices.TypeScriptNs.Identifier]
  ): js.Array[typings.typescriptDashServices.TypeScriptNs.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typings.typescriptDashServices.TypeScriptNs.AST): String = js.native
  def getParameterList(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.ParameterList = js.native
  def getType(ast: typings.typescriptDashServices.TypeScriptNs.AST): typings.typescriptDashServices.TypeScriptNs.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typings.typescriptDashServices.TypeScriptNs.VariableDeclarator): js.Array[typings.typescriptDashServices.TypeScriptNs.PullElementFlags] = js.native
  def isCallExpression(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isDeclarationAST(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typings.typescriptDashServices.TypeScriptNs.ModuleDeclaration,
    astName: typings.typescriptDashServices.TypeScriptNs.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typings.typescriptDashServices.TypeScriptNs.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typings.typescriptDashServices.TypeScriptNs.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typings.typescriptDashServices.TypeScriptNs.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typings.typescriptDashServices.TypeScriptNs.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typings.typescriptDashServices.TypeScriptNs.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnit): Boolean = js.native
}

